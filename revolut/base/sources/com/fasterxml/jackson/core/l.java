package com.fasterxml.jackson.core;

import java.io.Closeable;

/* JADX INFO: loaded from: classes16.dex */
public abstract class l implements Closeable {
    static {
        r39.a.c(r.values());
    }

    public final JsonParseException d(Object obj2, String str) {
        return new JsonParseException(this, String.format(str, obj2));
    }
}
