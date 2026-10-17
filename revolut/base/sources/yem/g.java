package yem;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class g {
    private static final /* synthetic */ g[] $VALUES;
    public static final g INVALID_COUNTRY_CODE;
    public static final g INVALID_LENGTH;
    public static final g IS_POSSIBLE;
    public static final g IS_POSSIBLE_LOCAL_ONLY;
    public static final g TOO_LONG;
    public static final g TOO_SHORT;

    static {
        g gVar = new g("IS_POSSIBLE", 0);
        IS_POSSIBLE = gVar;
        g gVar2 = new g("IS_POSSIBLE_LOCAL_ONLY", 1);
        IS_POSSIBLE_LOCAL_ONLY = gVar2;
        g gVar3 = new g("INVALID_COUNTRY_CODE", 2);
        INVALID_COUNTRY_CODE = gVar3;
        g gVar4 = new g("TOO_SHORT", 3);
        TOO_SHORT = gVar4;
        g gVar5 = new g("INVALID_LENGTH", 4);
        INVALID_LENGTH = gVar5;
        g gVar6 = new g("TOO_LONG", 5);
        TOO_LONG = gVar6;
        $VALUES = new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
