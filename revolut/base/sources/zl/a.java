package zl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a COLOR;
    public static final a DROP;
    public static final a FILL;
    public static final a NONE;
    public static final a SCALE;
    public static final a SCALE_DOWN;
    public static final a SLIDE;
    public static final a SWAP;
    public static final a THIN_WORM;
    public static final a WORM;

    static {
        a aVar = new a("NONE", 0);
        NONE = aVar;
        a aVar2 = new a("COLOR", 1);
        COLOR = aVar2;
        a aVar3 = new a("SCALE", 2);
        SCALE = aVar3;
        a aVar4 = new a("WORM", 3);
        WORM = aVar4;
        a aVar5 = new a("SLIDE", 4);
        SLIDE = aVar5;
        a aVar6 = new a("FILL", 5);
        FILL = aVar6;
        a aVar7 = new a("THIN_WORM", 6);
        THIN_WORM = aVar7;
        a aVar8 = new a("DROP", 7);
        DROP = aVar8;
        a aVar9 = new a("SWAP", 8);
        SWAP = aVar9;
        a aVar10 = new a("SCALE_DOWN", 9);
        SCALE_DOWN = aVar10;
        $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
