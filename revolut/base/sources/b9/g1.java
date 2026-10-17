package b9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class g1 {
    private static final /* synthetic */ g1[] $VALUES;
    public static final g1 Bevel;
    public static final g1 Miter;
    public static final g1 Round;

    static {
        g1 g1Var = new g1("Miter", 0);
        Miter = g1Var;
        g1 g1Var2 = new g1("Round", 1);
        Round = g1Var2;
        g1 g1Var3 = new g1("Bevel", 2);
        Bevel = g1Var3;
        $VALUES = new g1[]{g1Var, g1Var2, g1Var3};
    }

    public static g1 valueOf(String str) {
        return (g1) Enum.valueOf(g1.class, str);
    }

    public static g1[] values() {
        return (g1[]) $VALUES.clone();
    }
}
