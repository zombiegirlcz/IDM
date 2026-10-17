package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.StreamWriteException;

/* JADX INFO: loaded from: classes16.dex */
public class JsonGenerationException extends StreamWriteException {
    public JsonGenerationException(String str, h hVar) {
        super(str, null, null);
        this.f26172b = hVar;
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    public final Object b() {
        return this.f26172b;
    }
}
