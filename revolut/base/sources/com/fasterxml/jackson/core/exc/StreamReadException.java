package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.i;
import com.fasterxml.jackson.core.l;
import com.fasterxml.jackson.dataformat.cbor.e;
import f9.c;

/* JADX INFO: loaded from: classes16.dex */
public abstract class StreamReadException extends JsonProcessingException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient l f26171b;

    /* JADX WARN: Illegal instructions before constructor call */
    public StreamReadException(l lVar, String str) {
        i iVar;
        if (lVar == null) {
            iVar = null;
        } else {
            e eVar = (e) lVar;
            long j2 = eVar.f26198h + ((long) eVar.f);
            iVar = new i((c) eVar.d.f132797c, j2, -1L, (int) j2);
        }
        super(str, iVar, null);
        this.f26171b = lVar;
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public l b() {
        return this.f26171b;
    }
}
