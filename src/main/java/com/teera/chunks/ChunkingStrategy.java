package com.teera.chunks;

import java.util.ArrayList;
import java.util.Collection;

import static com.teera.chunks.ChunkingStrategyFactory.CHUNK_SIZE;

public class ChunkingStrategy
{
    public Collection<String> chunking(String contents)
    {
        // Интерпретатор: если опознан знак ###, добавляется новый лист
        Collection<String> chunks = new ArrayList<>();

        if (contents.length() <= CHUNK_SIZE) chunks.add(contents);

        for (int start = 0; start < contents.length() - CHUNK_SIZE; start += CHUNK_SIZE)
        {
            chunks.add(contents.substring(start, start + CHUNK_SIZE));
        }

        return chunks;
    }
}