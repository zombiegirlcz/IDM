package com.google.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class q4 {
    private static final /* synthetic */ q4[] $VALUES;
    public static final q4 ASCENDING;
    public static final q4 DESCENDING;

    static {
        q4 q4Var = new q4("ASCENDING", 0);
        ASCENDING = q4Var;
        q4 q4Var2 = new q4("DESCENDING", 1);
        DESCENDING = q4Var2;
        $VALUES = new q4[]{q4Var, q4Var2};
    }

    public static q4 valueOf(String str) {
        return (q4) Enum.valueOf(q4.class, str);
    }

    public static q4[] values() {
        return (q4[]) $VALUES.clone();
    }
}
