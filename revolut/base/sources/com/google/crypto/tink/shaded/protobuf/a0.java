package com.google.crypto.tink.shaded.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class a0 {
    private static final /* synthetic */ a0[] $VALUES;
    public static final a0 BUILD_MESSAGE_INFO;
    public static final a0 GET_DEFAULT_INSTANCE;
    public static final a0 GET_MEMOIZED_IS_INITIALIZED;
    public static final a0 GET_PARSER;
    public static final a0 NEW_BUILDER;
    public static final a0 NEW_MUTABLE_INSTANCE;
    public static final a0 SET_MEMOIZED_IS_INITIALIZED;

    static {
        a0 a0Var = new a0("GET_MEMOIZED_IS_INITIALIZED", 0);
        GET_MEMOIZED_IS_INITIALIZED = a0Var;
        a0 a0Var2 = new a0("SET_MEMOIZED_IS_INITIALIZED", 1);
        SET_MEMOIZED_IS_INITIALIZED = a0Var2;
        a0 a0Var3 = new a0("BUILD_MESSAGE_INFO", 2);
        BUILD_MESSAGE_INFO = a0Var3;
        a0 a0Var4 = new a0("NEW_MUTABLE_INSTANCE", 3);
        NEW_MUTABLE_INSTANCE = a0Var4;
        a0 a0Var5 = new a0("NEW_BUILDER", 4);
        NEW_BUILDER = a0Var5;
        a0 a0Var6 = new a0("GET_DEFAULT_INSTANCE", 5);
        GET_DEFAULT_INSTANCE = a0Var6;
        a0 a0Var7 = new a0("GET_PARSER", 6);
        GET_PARSER = a0Var7;
        $VALUES = new a0[]{a0Var, a0Var2, a0Var3, a0Var4, a0Var5, a0Var6, a0Var7};
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }
}
