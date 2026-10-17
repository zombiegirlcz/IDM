package com.google.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public abstract class p4 {
    private static final /* synthetic */ p4[] $VALUES;
    public static final p4 LAZY;
    public static final p4 LOOSE;
    public static final p4 STRICT;

    static {
        p4 p4Var = new p4() { // from class: com.google.protobuf.m4
            @Override // com.google.protobuf.p4
            public final Object a(t tVar) {
                return tVar.C();
            }
        };
        LOOSE = p4Var;
        p4 p4Var2 = new p4() { // from class: com.google.protobuf.n4
            @Override // com.google.protobuf.p4
            public final Object a(t tVar) {
                return tVar.D();
            }
        };
        STRICT = p4Var2;
        p4 p4Var3 = new p4() { // from class: com.google.protobuf.o4
            @Override // com.google.protobuf.p4
            public final Object a(t tVar) {
                return tVar.m();
            }
        };
        LAZY = p4Var3;
        $VALUES = new p4[]{p4Var, p4Var2, p4Var3};
    }

    public static p4 valueOf(String str) {
        return (p4) Enum.valueOf(p4.class, str);
    }

    public static p4[] values() {
        return (p4[]) $VALUES.clone();
    }

    public abstract Object a(t tVar);
}
