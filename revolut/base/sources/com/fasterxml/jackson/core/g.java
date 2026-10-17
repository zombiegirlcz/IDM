package com.fasterxml.jackson.core;

/* JADX INFO: loaded from: classes16.dex */
public enum g {
    AUTO_CLOSE_TARGET(true),
    AUTO_CLOSE_JSON_CONTENT(true),
    FLUSH_PASSED_TO_STREAM(true),
    QUOTE_FIELD_NAMES(true),
    QUOTE_NON_NUMERIC_NUMBERS(true),
    ESCAPE_NON_ASCII(false),
    WRITE_NUMBERS_AS_STRINGS(false),
    WRITE_BIGDECIMAL_AS_PLAIN(false),
    STRICT_DUPLICATE_DETECTION(false),
    IGNORE_UNKNOWN(false);

    private final boolean _defaultState;
    private final int _mask = 1 << ordinal();

    g(boolean z) {
        this._defaultState = z;
    }

    public static int a() {
        int i = 0;
        for (g gVar : values()) {
            if (gVar._defaultState) {
                i |= gVar._mask;
            }
        }
        return i;
    }

    public final boolean b(int i) {
        return (i & this._mask) != 0;
    }

    public final int c() {
        return this._mask;
    }
}
