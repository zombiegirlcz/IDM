package d9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class g0 {
    private static final /* synthetic */ g0[] $VALUES;
    public static final g0 AUTO;
    public static final g0 READ_ONLY;
    public static final g0 READ_WRITE;
    public static final g0 WRITE_ONLY;

    static {
        g0 g0Var = new g0("AUTO", 0);
        AUTO = g0Var;
        g0 g0Var2 = new g0("READ_ONLY", 1);
        READ_ONLY = g0Var2;
        g0 g0Var3 = new g0("WRITE_ONLY", 2);
        WRITE_ONLY = g0Var3;
        g0 g0Var4 = new g0("READ_WRITE", 3);
        READ_WRITE = g0Var4;
        $VALUES = new g0[]{g0Var, g0Var2, g0Var3, g0Var4};
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) $VALUES.clone();
    }
}
