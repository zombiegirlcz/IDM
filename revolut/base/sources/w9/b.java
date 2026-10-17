package w9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b Array;
    public static final b Binary;
    public static final b Boolean;
    public static final b Collection;
    public static final b DateTime;
    public static final b Enum;
    public static final b Float;
    public static final b Integer;
    public static final b Map;
    public static final b OtherScalar;
    public static final b POJO;
    public static final b Textual;
    public static final b Untyped;

    static {
        b bVar = new b("Array", 0);
        Array = bVar;
        b bVar2 = new b("Collection", 1);
        Collection = bVar2;
        b bVar3 = new b("Map", 2);
        Map = bVar3;
        b bVar4 = new b("POJO", 3);
        POJO = bVar4;
        b bVar5 = new b("Untyped", 4);
        Untyped = bVar5;
        b bVar6 = new b("Integer", 5);
        Integer = bVar6;
        b bVar7 = new b("Float", 6);
        Float = bVar7;
        b bVar8 = new b("Boolean", 7);
        Boolean = bVar8;
        b bVar9 = new b("Enum", 8);
        Enum = bVar9;
        b bVar10 = new b("Textual", 9);
        Textual = bVar10;
        b bVar11 = new b("Binary", 10);
        Binary = bVar11;
        b bVar12 = new b("DateTime", 11);
        DateTime = bVar12;
        b bVar13 = new b("OtherScalar", 12);
        OtherScalar = bVar13;
        $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
