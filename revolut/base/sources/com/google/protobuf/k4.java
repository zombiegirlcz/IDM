package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public class k4 {
    private static final /* synthetic */ k4[] $VALUES;
    public static final k4 BOOL;
    public static final k4 BYTES;
    public static final k4 DOUBLE;
    public static final k4 ENUM;
    public static final k4 FIXED32;
    public static final k4 FIXED64;
    public static final k4 FLOAT;
    public static final k4 GROUP;
    public static final k4 INT32;
    public static final k4 INT64;
    public static final k4 MESSAGE;
    public static final k4 SFIXED32;
    public static final k4 SFIXED64;
    public static final k4 SINT32;
    public static final k4 SINT64;
    public static final k4 STRING;
    public static final k4 UINT32;
    public static final k4 UINT64;
    private final l4 javaType;
    private final int wireType;

    static {
        k4 k4Var = new k4("DOUBLE", 0, l4.DOUBLE, 1);
        DOUBLE = k4Var;
        k4 k4Var2 = new k4("FLOAT", 1, l4.FLOAT, 5);
        FLOAT = k4Var2;
        l4 l4Var = l4.LONG;
        k4 k4Var3 = new k4("INT64", 2, l4Var, 0);
        INT64 = k4Var3;
        k4 k4Var4 = new k4("UINT64", 3, l4Var, 0);
        UINT64 = k4Var4;
        l4 l4Var2 = l4.INT;
        k4 k4Var5 = new k4("INT32", 4, l4Var2, 0);
        INT32 = k4Var5;
        k4 k4Var6 = new k4("FIXED64", 5, l4Var, 1);
        FIXED64 = k4Var6;
        k4 k4Var7 = new k4("FIXED32", 6, l4Var2, 5);
        FIXED32 = k4Var7;
        k4 k4Var8 = new k4("BOOL", 7, l4.BOOLEAN, 0);
        BOOL = k4Var8;
        g4 g4Var = new g4("STRING", 8, l4.STRING, 2);
        STRING = g4Var;
        l4 l4Var3 = l4.MESSAGE;
        h4 h4Var = new h4("GROUP", 9, l4Var3, 3);
        GROUP = h4Var;
        i4 i4Var = new i4("MESSAGE", 10, l4Var3, 2);
        MESSAGE = i4Var;
        j4 j4Var = new j4("BYTES", 11, l4.BYTE_STRING, 2);
        BYTES = j4Var;
        k4 k4Var9 = new k4("UINT32", 12, l4Var2, 0);
        UINT32 = k4Var9;
        k4 k4Var10 = new k4("ENUM", 13, l4.ENUM, 0);
        ENUM = k4Var10;
        k4 k4Var11 = new k4("SFIXED32", 14, l4Var2, 5);
        SFIXED32 = k4Var11;
        k4 k4Var12 = new k4("SFIXED64", 15, l4Var, 1);
        SFIXED64 = k4Var12;
        k4 k4Var13 = new k4("SINT32", 16, l4Var2, 0);
        SINT32 = k4Var13;
        k4 k4Var14 = new k4("SINT64", 17, l4Var, 0);
        SINT64 = k4Var14;
        $VALUES = new k4[]{k4Var, k4Var2, k4Var3, k4Var4, k4Var5, k4Var6, k4Var7, k4Var8, g4Var, h4Var, i4Var, j4Var, k4Var9, k4Var10, k4Var11, k4Var12, k4Var13, k4Var14};
    }

    public k4(String str, int i, l4 l4Var, int i2) {
        this.javaType = l4Var;
        this.wireType = i2;
    }

    public static k4 valueOf(String str) {
        return (k4) Enum.valueOf(k4.class, str);
    }

    public static k4[] values() {
        return (k4[]) $VALUES.clone();
    }

    public final l4 a() {
        return this.javaType;
    }

    public final int b() {
        return this.wireType;
    }

    public boolean c() {
        return !(this instanceof g4);
    }
}
