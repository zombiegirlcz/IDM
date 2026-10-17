package com.fasterxml.jackson.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class k {
    private static final /* synthetic */ k[] $VALUES;
    public static final k BIG_DECIMAL;
    public static final k BIG_INTEGER;
    public static final k DOUBLE;
    public static final k FLOAT;
    public static final k INT;
    public static final k LONG;

    static {
        k kVar = new k("INT", 0);
        INT = kVar;
        k kVar2 = new k("LONG", 1);
        LONG = kVar2;
        k kVar3 = new k("BIG_INTEGER", 2);
        BIG_INTEGER = kVar3;
        k kVar4 = new k("FLOAT", 3);
        FLOAT = kVar4;
        k kVar5 = new k("DOUBLE", 4);
        DOUBLE = kVar5;
        k kVar6 = new k("BIG_DECIMAL", 5);
        BIG_DECIMAL = kVar6;
        $VALUES = new k[]{kVar, kVar2, kVar3, kVar4, kVar5, kVar6};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
