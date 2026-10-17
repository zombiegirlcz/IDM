package b9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class g {
    private static final /* synthetic */ g[] $VALUES;
    public static final g CHILD;
    public static final g DESCENDANT;
    public static final g FOLLOWS;

    static {
        g gVar = new g("DESCENDANT", 0);
        DESCENDANT = gVar;
        g gVar2 = new g("CHILD", 1);
        CHILD = gVar2;
        g gVar3 = new g("FOLLOWS", 2);
        FOLLOWS = gVar3;
        $VALUES = new g[]{gVar, gVar2, gVar3};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
