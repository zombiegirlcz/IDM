package m9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d Array;
    public static final d Binary;
    public static final d Boolean;
    public static final d EmptyArray;
    public static final d EmptyObject;
    public static final d EmptyString;
    public static final d Float;
    public static final d Integer;
    public static final d Object;
    public static final d String;

    static {
        d dVar = new d("Array", 0);
        Array = dVar;
        d dVar2 = new d("Object", 1);
        Object = dVar2;
        d dVar3 = new d("Integer", 2);
        Integer = dVar3;
        d dVar4 = new d("Float", 3);
        Float = dVar4;
        d dVar5 = new d("Boolean", 4);
        Boolean = dVar5;
        d dVar6 = new d("String", 5);
        String = dVar6;
        d dVar7 = new d("Binary", 6);
        Binary = dVar7;
        d dVar8 = new d("EmptyArray", 7);
        EmptyArray = dVar8;
        d dVar9 = new d("EmptyObject", 8);
        EmptyObject = dVar9;
        d dVar10 = new d("EmptyString", 9);
        EmptyString = dVar10;
        $VALUES = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
