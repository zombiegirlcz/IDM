package com.fasterxml.jackson.core;

/* JADX INFO: loaded from: classes16.dex */
public enum s implements j9.i {
    CAN_WRITE_BINARY_NATIVELY,
    CAN_WRITE_FORMATTED_NUMBERS;

    private final boolean _defaultState = false;
    private final int _mask = 1 << ordinal();

    s() {
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
