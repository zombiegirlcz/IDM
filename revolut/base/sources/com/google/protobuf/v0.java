package com.google.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {
    private static final /* synthetic */ v0[] $VALUES;
    public static final v0 BUILD_MESSAGE_INFO;
    public static final v0 GET_DEFAULT_INSTANCE;
    public static final v0 GET_MEMOIZED_IS_INITIALIZED;
    public static final v0 GET_PARSER;
    public static final v0 NEW_BUILDER;
    public static final v0 NEW_MUTABLE_INSTANCE;
    public static final v0 SET_MEMOIZED_IS_INITIALIZED;

    static {
        v0 v0Var = new v0("GET_MEMOIZED_IS_INITIALIZED", 0);
        GET_MEMOIZED_IS_INITIALIZED = v0Var;
        v0 v0Var2 = new v0("SET_MEMOIZED_IS_INITIALIZED", 1);
        SET_MEMOIZED_IS_INITIALIZED = v0Var2;
        v0 v0Var3 = new v0("BUILD_MESSAGE_INFO", 2);
        BUILD_MESSAGE_INFO = v0Var3;
        v0 v0Var4 = new v0("NEW_MUTABLE_INSTANCE", 3);
        NEW_MUTABLE_INSTANCE = v0Var4;
        v0 v0Var5 = new v0("NEW_BUILDER", 4);
        NEW_BUILDER = v0Var5;
        v0 v0Var6 = new v0("GET_DEFAULT_INSTANCE", 5);
        GET_DEFAULT_INSTANCE = v0Var6;
        v0 v0Var7 = new v0("GET_PARSER", 6);
        GET_PARSER = v0Var7;
        $VALUES = new v0[]{v0Var, v0Var2, v0Var3, v0Var4, v0Var5, v0Var6, v0Var7};
    }

    public static v0 valueOf(String str) {
        return (v0) Enum.valueOf(v0.class, str);
    }

    public static v0[] values() {
        return (v0[]) $VALUES.clone();
    }
}
