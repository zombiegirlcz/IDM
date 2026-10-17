package com.google.crypto.tink.shaded.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class w1 {
    private static final /* synthetic */ w1[] $VALUES;
    public static final w1 ASCENDING;
    public static final w1 DESCENDING;

    static {
        w1 w1Var = new w1("ASCENDING", 0);
        ASCENDING = w1Var;
        w1 w1Var2 = new w1("DESCENDING", 1);
        DESCENDING = w1Var2;
        $VALUES = new w1[]{w1Var, w1Var2};
    }

    public static w1 valueOf(String str) {
        return (w1) Enum.valueOf(w1.class, str);
    }

    public static w1[] values() {
        return (w1[]) $VALUES.clone();
    }
}
