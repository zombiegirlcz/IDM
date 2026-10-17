package com.google.protobuf;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.Serializable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {
    private static final /* synthetic */ k1[] $VALUES;
    public static final k1 BOOLEAN;
    public static final k1 BYTE_STRING;
    public static final k1 DOUBLE;
    public static final k1 ENUM;
    public static final k1 FLOAT;
    public static final k1 INT;
    public static final k1 LONG;
    public static final k1 MESSAGE;
    public static final k1 STRING;
    public static final k1 VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        k1 k1Var = new k1("VOID", 0, Void.class, Void.class, null);
        VOID = k1Var;
        Class cls = Integer.TYPE;
        k1 k1Var2 = new k1("INT", 1, cls, Integer.class, 0);
        INT = k1Var2;
        k1 k1Var3 = new k1("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = k1Var3;
        k1 k1Var4 = new k1("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(BitmapDescriptorFactory.HUE_RED));
        FLOAT = k1Var4;
        k1 k1Var5 = new k1("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = k1Var5;
        k1 k1Var6 = new k1("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = k1Var6;
        k1 k1Var7 = new k1("STRING", 6, String.class, String.class, "");
        STRING = k1Var7;
        k1 k1Var8 = new k1("BYTE_STRING", 7, p.class, p.class, p.f49757b);
        BYTE_STRING = k1Var8;
        k1 k1Var9 = new k1("ENUM", 8, cls, Integer.class, null);
        ENUM = k1Var9;
        k1 k1Var10 = new k1("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = k1Var10;
        $VALUES = new k1[]{k1Var, k1Var2, k1Var3, k1Var4, k1Var5, k1Var6, k1Var7, k1Var8, k1Var9, k1Var10};
    }

    public k1(String str, int i, Class cls, Class cls2, Serializable serializable) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = serializable;
    }

    public static k1 valueOf(String str) {
        return (k1) Enum.valueOf(k1.class, str);
    }

    public static k1[] values() {
        return (k1[]) $VALUES.clone();
    }

    public final Class a() {
        return this.boxedType;
    }
}
