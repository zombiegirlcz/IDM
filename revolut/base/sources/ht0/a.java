package ht0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a DEFAULT;
    public static final a REV_10_REFRESH;

    static {
        a aVar = new a("DEFAULT", 0);
        DEFAULT = aVar;
        a aVar2 = new a("REV_10_REFRESH", 1);
        REV_10_REFRESH = aVar2;
        $VALUES = new a[]{aVar, aVar2};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
