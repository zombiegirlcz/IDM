package ecm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class g0 {
    private static final /* synthetic */ g0[] $VALUES;
    public static final g0 CT_ERROR;
    public static final g0 CT_INFO;
    public static final g0 CT_UNKNOWN;
    public static final g0 CT_WARNING;

    static {
        g0 g0Var = new g0("CT_UNKNOWN", 0);
        CT_UNKNOWN = g0Var;
        g0 g0Var2 = new g0("CT_INFO", 1);
        CT_INFO = g0Var2;
        g0 g0Var3 = new g0("CT_WARNING", 2);
        CT_WARNING = g0Var3;
        g0 g0Var4 = new g0("CT_ERROR", 3);
        CT_ERROR = g0Var4;
        $VALUES = new g0[]{g0Var, g0Var2, g0Var3, g0Var4};
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) $VALUES.clone();
    }
}
