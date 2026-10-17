package d9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class o {
    private static final /* synthetic */ o[] $VALUES;
    public static final o ANY;
    public static final o ARRAY;
    public static final o BINARY;
    public static final o BOOLEAN;
    public static final o NATURAL;
    public static final o NUMBER;
    public static final o NUMBER_FLOAT;
    public static final o NUMBER_INT;
    public static final o OBJECT;
    public static final o SCALAR;
    public static final o STRING;

    static {
        o oVar = new o("ANY", 0);
        ANY = oVar;
        o oVar2 = new o("NATURAL", 1);
        NATURAL = oVar2;
        o oVar3 = new o("SCALAR", 2);
        SCALAR = oVar3;
        o oVar4 = new o("ARRAY", 3);
        ARRAY = oVar4;
        o oVar5 = new o("OBJECT", 4);
        OBJECT = oVar5;
        o oVar6 = new o("NUMBER", 5);
        NUMBER = oVar6;
        o oVar7 = new o("NUMBER_FLOAT", 6);
        NUMBER_FLOAT = oVar7;
        o oVar8 = new o("NUMBER_INT", 7);
        NUMBER_INT = oVar8;
        o oVar9 = new o("STRING", 8);
        STRING = oVar9;
        o oVar10 = new o("BOOLEAN", 9);
        BOOLEAN = oVar10;
        o oVar11 = new o("BINARY", 10);
        BINARY = oVar11;
        $VALUES = new o[]{oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8, oVar9, oVar10, oVar11};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }

    public final boolean a() {
        return this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT;
    }
}
