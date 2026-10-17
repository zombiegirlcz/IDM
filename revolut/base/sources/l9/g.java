package l9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class g {
    private static final /* synthetic */ g[] $VALUES;
    public static final g ALWAYS;
    public static final g DEFAULT_INCLUSION;
    public static final g NON_DEFAULT;
    public static final g NON_EMPTY;
    public static final g NON_NULL;

    static {
        g gVar = new g("ALWAYS", 0);
        ALWAYS = gVar;
        g gVar2 = new g("NON_NULL", 1);
        NON_NULL = gVar2;
        g gVar3 = new g("NON_DEFAULT", 2);
        NON_DEFAULT = gVar3;
        g gVar4 = new g("NON_EMPTY", 3);
        NON_EMPTY = gVar4;
        g gVar5 = new g("DEFAULT_INCLUSION", 4);
        DEFAULT_INCLUSION = gVar5;
        $VALUES = new g[]{gVar, gVar2, gVar3, gVar4, gVar5};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
