package bnm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a CEILING;
    public static final a ROUND;
    public static final a TRUNCATE;

    static {
        a aVar = new a("TRUNCATE", 0);
        TRUNCATE = aVar;
        a aVar2 = new a("ROUND", 1);
        ROUND = aVar2;
        a aVar3 = new a("CEILING", 2);
        CEILING = aVar3;
        $VALUES = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
