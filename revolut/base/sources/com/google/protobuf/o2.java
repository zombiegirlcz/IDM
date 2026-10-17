package com.google.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o2 {
    private static final /* synthetic */ o2[] $VALUES;
    public static final o2 EDITIONS;
    public static final o2 PROTO2;
    public static final o2 PROTO3;

    static {
        o2 o2Var = new o2("PROTO2", 0);
        PROTO2 = o2Var;
        o2 o2Var2 = new o2("PROTO3", 1);
        PROTO3 = o2Var2;
        o2 o2Var3 = new o2("EDITIONS", 2);
        EDITIONS = o2Var3;
        $VALUES = new o2[]{o2Var, o2Var2, o2Var3};
    }

    public static o2 valueOf(String str) {
        return (o2) Enum.valueOf(o2.class, str);
    }

    public static o2[] values() {
        return (o2[]) $VALUES.clone();
    }
}
