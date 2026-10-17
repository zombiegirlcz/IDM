package com.fasterxml.jackson.core;

/* JADX INFO: loaded from: classes16.dex */
public enum r implements j9.i {
    DUPLICATE_PROPERTIES,
    SCALARS_AS_OBJECTS,
    UNTYPED_SCALARS;

    private final boolean _defaultState = false;
    private final int _mask = 1 << ordinal();

    r() {
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
