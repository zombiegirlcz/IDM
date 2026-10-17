package com.fasterxml.jackson.dataformat.cbor;

import j9.i;

/* JADX INFO: loaded from: classes16.dex */
public enum c implements i {
    WRITE_MINIMAL_INTS(true),
    WRITE_TYPE_HEADER(false),
    LENIENT_UTF_ENCODING(false);

    protected final boolean _defaultState;
    protected final int _mask = 1 << ordinal();

    c(boolean z) {
        this._defaultState = z;
    }

    @Override // j9.i
    public final boolean a() {
        return this._defaultState;
    }

    @Override // j9.i
    public final int getMask() {
        return this._mask;
    }
}
