package qg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b BEGIN_ARRAY;
    public static final b BEGIN_OBJECT;
    public static final b BOOLEAN;
    public static final b END_ARRAY;
    public static final b END_DOCUMENT;
    public static final b END_OBJECT;
    public static final b NAME;
    public static final b NULL;
    public static final b NUMBER;
    public static final b STRING;

    static {
        b bVar = new b("BEGIN_ARRAY", 0);
        BEGIN_ARRAY = bVar;
        b bVar2 = new b("END_ARRAY", 1);
        END_ARRAY = bVar2;
        b bVar3 = new b("BEGIN_OBJECT", 2);
        BEGIN_OBJECT = bVar3;
        b bVar4 = new b("END_OBJECT", 3);
        END_OBJECT = bVar4;
        b bVar5 = new b("NAME", 4);
        NAME = bVar5;
        b bVar6 = new b("STRING", 5);
        STRING = bVar6;
        b bVar7 = new b("NUMBER", 6);
        NUMBER = bVar7;
        b bVar8 = new b("BOOLEAN", 7);
        BOOLEAN = bVar8;
        b bVar9 = new b("NULL", 8);
        NULL = bVar9;
        b bVar10 = new b("END_DOCUMENT", 9);
        END_DOCUMENT = bVar10;
        $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
