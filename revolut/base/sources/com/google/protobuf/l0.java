package com.google.protobuf;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {
    private static final /* synthetic */ l0[] $VALUES;
    public static final l0 BOOL;
    public static final l0 BOOL_LIST;
    public static final l0 BOOL_LIST_PACKED;
    public static final l0 BYTES;
    public static final l0 BYTES_LIST;
    public static final l0 DOUBLE;
    public static final l0 DOUBLE_LIST;
    public static final l0 DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final l0 ENUM;
    public static final l0 ENUM_LIST;
    public static final l0 ENUM_LIST_PACKED;
    public static final l0 FIXED32;
    public static final l0 FIXED32_LIST;
    public static final l0 FIXED32_LIST_PACKED;
    public static final l0 FIXED64;
    public static final l0 FIXED64_LIST;
    public static final l0 FIXED64_LIST_PACKED;
    public static final l0 FLOAT;
    public static final l0 FLOAT_LIST;
    public static final l0 FLOAT_LIST_PACKED;
    public static final l0 GROUP;
    public static final l0 GROUP_LIST;
    public static final l0 INT32;
    public static final l0 INT32_LIST;
    public static final l0 INT32_LIST_PACKED;
    public static final l0 INT64;
    public static final l0 INT64_LIST;
    public static final l0 INT64_LIST_PACKED;
    public static final l0 MAP;
    public static final l0 MESSAGE;
    public static final l0 MESSAGE_LIST;
    public static final l0 SFIXED32;
    public static final l0 SFIXED32_LIST;
    public static final l0 SFIXED32_LIST_PACKED;
    public static final l0 SFIXED64;
    public static final l0 SFIXED64_LIST;
    public static final l0 SFIXED64_LIST_PACKED;
    public static final l0 SINT32;
    public static final l0 SINT32_LIST;
    public static final l0 SINT32_LIST_PACKED;
    public static final l0 SINT64;
    public static final l0 SINT64_LIST;
    public static final l0 SINT64_LIST_PACKED;
    public static final l0 STRING;
    public static final l0 STRING_LIST;
    public static final l0 UINT32;
    public static final l0 UINT32_LIST;
    public static final l0 UINT32_LIST_PACKED;
    public static final l0 UINT64;
    public static final l0 UINT64_LIST;
    public static final l0 UINT64_LIST_PACKED;
    private static final l0[] VALUES;
    private final k0 collection;
    private final Class<?> elementType;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f49744id;
    private final k1 javaType;
    private final boolean primitiveScalar;

    static {
        k0 k0Var = k0.SCALAR;
        k1 k1Var = k1.DOUBLE;
        l0 l0Var = new l0("DOUBLE", 0, 0, k0Var, k1Var);
        DOUBLE = l0Var;
        k1 k1Var2 = k1.FLOAT;
        l0 l0Var2 = new l0("FLOAT", 1, 1, k0Var, k1Var2);
        FLOAT = l0Var2;
        k1 k1Var3 = k1.LONG;
        l0 l0Var3 = new l0("INT64", 2, 2, k0Var, k1Var3);
        INT64 = l0Var3;
        l0 l0Var4 = new l0("UINT64", 3, 3, k0Var, k1Var3);
        UINT64 = l0Var4;
        k1 k1Var4 = k1.INT;
        l0 l0Var5 = new l0("INT32", 4, 4, k0Var, k1Var4);
        INT32 = l0Var5;
        l0 l0Var6 = new l0("FIXED64", 5, 5, k0Var, k1Var3);
        FIXED64 = l0Var6;
        l0 l0Var7 = new l0("FIXED32", 6, 6, k0Var, k1Var4);
        FIXED32 = l0Var7;
        k1 k1Var5 = k1.BOOLEAN;
        l0 l0Var8 = new l0("BOOL", 7, 7, k0Var, k1Var5);
        BOOL = l0Var8;
        k1 k1Var6 = k1.STRING;
        l0 l0Var9 = new l0("STRING", 8, 8, k0Var, k1Var6);
        STRING = l0Var9;
        k1 k1Var7 = k1.MESSAGE;
        l0 l0Var10 = new l0("MESSAGE", 9, 9, k0Var, k1Var7);
        MESSAGE = l0Var10;
        k1 k1Var8 = k1.BYTE_STRING;
        l0 l0Var11 = new l0("BYTES", 10, 10, k0Var, k1Var8);
        BYTES = l0Var11;
        l0 l0Var12 = new l0("UINT32", 11, 11, k0Var, k1Var4);
        UINT32 = l0Var12;
        k1 k1Var9 = k1.ENUM;
        l0 l0Var13 = new l0("ENUM", 12, 12, k0Var, k1Var9);
        ENUM = l0Var13;
        l0 l0Var14 = new l0("SFIXED32", 13, 13, k0Var, k1Var4);
        SFIXED32 = l0Var14;
        l0 l0Var15 = new l0("SFIXED64", 14, 14, k0Var, k1Var3);
        SFIXED64 = l0Var15;
        l0 l0Var16 = new l0("SINT32", 15, 15, k0Var, k1Var4);
        SINT32 = l0Var16;
        l0 l0Var17 = new l0("SINT64", 16, 16, k0Var, k1Var3);
        SINT64 = l0Var17;
        l0 l0Var18 = new l0("GROUP", 17, 17, k0Var, k1Var7);
        GROUP = l0Var18;
        k0 k0Var2 = k0.VECTOR;
        l0 l0Var19 = new l0("DOUBLE_LIST", 18, 18, k0Var2, k1Var);
        DOUBLE_LIST = l0Var19;
        l0 l0Var20 = new l0("FLOAT_LIST", 19, 19, k0Var2, k1Var2);
        FLOAT_LIST = l0Var20;
        l0 l0Var21 = new l0("INT64_LIST", 20, 20, k0Var2, k1Var3);
        INT64_LIST = l0Var21;
        l0 l0Var22 = new l0("UINT64_LIST", 21, 21, k0Var2, k1Var3);
        UINT64_LIST = l0Var22;
        l0 l0Var23 = new l0("INT32_LIST", 22, 22, k0Var2, k1Var4);
        INT32_LIST = l0Var23;
        l0 l0Var24 = new l0("FIXED64_LIST", 23, 23, k0Var2, k1Var3);
        FIXED64_LIST = l0Var24;
        l0 l0Var25 = new l0("FIXED32_LIST", 24, 24, k0Var2, k1Var4);
        FIXED32_LIST = l0Var25;
        l0 l0Var26 = new l0("BOOL_LIST", 25, 25, k0Var2, k1Var5);
        BOOL_LIST = l0Var26;
        l0 l0Var27 = new l0("STRING_LIST", 26, 26, k0Var2, k1Var6);
        STRING_LIST = l0Var27;
        l0 l0Var28 = new l0("MESSAGE_LIST", 27, 27, k0Var2, k1Var7);
        MESSAGE_LIST = l0Var28;
        l0 l0Var29 = new l0("BYTES_LIST", 28, 28, k0Var2, k1Var8);
        BYTES_LIST = l0Var29;
        l0 l0Var30 = new l0("UINT32_LIST", 29, 29, k0Var2, k1Var4);
        UINT32_LIST = l0Var30;
        l0 l0Var31 = new l0("ENUM_LIST", 30, 30, k0Var2, k1Var9);
        ENUM_LIST = l0Var31;
        l0 l0Var32 = new l0("SFIXED32_LIST", 31, 31, k0Var2, k1Var4);
        SFIXED32_LIST = l0Var32;
        l0 l0Var33 = new l0("SFIXED64_LIST", 32, 32, k0Var2, k1Var3);
        SFIXED64_LIST = l0Var33;
        l0 l0Var34 = new l0("SINT32_LIST", 33, 33, k0Var2, k1Var4);
        SINT32_LIST = l0Var34;
        l0 l0Var35 = new l0("SINT64_LIST", 34, 34, k0Var2, k1Var3);
        SINT64_LIST = l0Var35;
        k0 k0Var3 = k0.PACKED_VECTOR;
        l0 l0Var36 = new l0("DOUBLE_LIST_PACKED", 35, 35, k0Var3, k1Var);
        DOUBLE_LIST_PACKED = l0Var36;
        l0 l0Var37 = new l0("FLOAT_LIST_PACKED", 36, 36, k0Var3, k1Var2);
        FLOAT_LIST_PACKED = l0Var37;
        l0 l0Var38 = new l0("INT64_LIST_PACKED", 37, 37, k0Var3, k1Var3);
        INT64_LIST_PACKED = l0Var38;
        l0 l0Var39 = new l0("UINT64_LIST_PACKED", 38, 38, k0Var3, k1Var3);
        UINT64_LIST_PACKED = l0Var39;
        l0 l0Var40 = new l0("INT32_LIST_PACKED", 39, 39, k0Var3, k1Var4);
        INT32_LIST_PACKED = l0Var40;
        l0 l0Var41 = new l0("FIXED64_LIST_PACKED", 40, 40, k0Var3, k1Var3);
        FIXED64_LIST_PACKED = l0Var41;
        l0 l0Var42 = new l0("FIXED32_LIST_PACKED", 41, 41, k0Var3, k1Var4);
        FIXED32_LIST_PACKED = l0Var42;
        l0 l0Var43 = new l0("BOOL_LIST_PACKED", 42, 42, k0Var3, k1Var5);
        BOOL_LIST_PACKED = l0Var43;
        l0 l0Var44 = new l0("UINT32_LIST_PACKED", 43, 43, k0Var3, k1Var4);
        UINT32_LIST_PACKED = l0Var44;
        l0 l0Var45 = new l0("ENUM_LIST_PACKED", 44, 44, k0Var3, k1Var9);
        ENUM_LIST_PACKED = l0Var45;
        l0 l0Var46 = new l0("SFIXED32_LIST_PACKED", 45, 45, k0Var3, k1Var4);
        SFIXED32_LIST_PACKED = l0Var46;
        l0 l0Var47 = new l0("SFIXED64_LIST_PACKED", 46, 46, k0Var3, k1Var3);
        SFIXED64_LIST_PACKED = l0Var47;
        l0 l0Var48 = new l0("SINT32_LIST_PACKED", 47, 47, k0Var3, k1Var4);
        SINT32_LIST_PACKED = l0Var48;
        l0 l0Var49 = new l0("SINT64_LIST_PACKED", 48, 48, k0Var3, k1Var3);
        SINT64_LIST_PACKED = l0Var49;
        l0 l0Var50 = new l0("GROUP_LIST", 49, 49, k0Var2, k1Var7);
        GROUP_LIST = l0Var50;
        l0 l0Var51 = new l0("MAP", 50, 50, k0.MAP, k1.VOID);
        MAP = l0Var51;
        $VALUES = new l0[]{l0Var, l0Var2, l0Var3, l0Var4, l0Var5, l0Var6, l0Var7, l0Var8, l0Var9, l0Var10, l0Var11, l0Var12, l0Var13, l0Var14, l0Var15, l0Var16, l0Var17, l0Var18, l0Var19, l0Var20, l0Var21, l0Var22, l0Var23, l0Var24, l0Var25, l0Var26, l0Var27, l0Var28, l0Var29, l0Var30, l0Var31, l0Var32, l0Var33, l0Var34, l0Var35, l0Var36, l0Var37, l0Var38, l0Var39, l0Var40, l0Var41, l0Var42, l0Var43, l0Var44, l0Var45, l0Var46, l0Var47, l0Var48, l0Var49, l0Var50, l0Var51};
        EMPTY_TYPES = new Type[0];
        l0[] l0VarArrValues = values();
        VALUES = new l0[l0VarArrValues.length];
        for (l0 l0Var52 : l0VarArrValues) {
            VALUES[l0Var52.f49744id] = l0Var52;
        }
    }

    public l0(String str, int i, int i2, k0 k0Var, k1 k1Var) {
        int i3;
        this.f49744id = i2;
        this.collection = k0Var;
        this.javaType = k1Var;
        int i5 = j0.f49736a[k0Var.ordinal()];
        if (i5 == 1 || i5 == 2) {
            this.elementType = k1Var.a();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (k0Var != k0.SCALAR || (i3 = j0.f49737b[k1Var.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : true;
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) $VALUES.clone();
    }

    public final int a() {
        return this.f49744id;
    }
}
