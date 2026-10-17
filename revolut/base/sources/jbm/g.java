package jbm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class g {
    private static final /* synthetic */ g[] $VALUES;
    public static final g COUNT_BASED;
    public static final g TIME_BASED;

    static {
        g gVar = new g("TIME_BASED", 0);
        TIME_BASED = gVar;
        g gVar2 = new g("COUNT_BASED", 1);
        COUNT_BASED = gVar2;
        $VALUES = new g[]{gVar, gVar2};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
