package com.fasterxml.jackson.core;

/* JADX INFO: loaded from: classes16.dex */
public enum d implements j9.i {
    INTERN_FIELD_NAMES,
    CANONICALIZE_FIELD_NAMES,
    FAIL_ON_SYMBOL_HASH_OVERFLOW,
    USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING;

    private final boolean _defaultState = true;

    d() {
    }

    public static int b() {
        int mask = 0;
        for (d dVar : values()) {
            if (dVar._defaultState) {
                mask |= dVar.getMask();
            }
        }
        return mask;
    }

    @Override // j9.i
    public final boolean a() {
        return this._defaultState;
    }

    @Override // j9.i
    public final int getMask() {
        return 1 << ordinal();
    }
}
