package b9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class h1 {
    private static final /* synthetic */ h1[] $VALUES;
    public static final h1 auto;
    public static final h1 optimizeQuality;
    public static final h1 optimizeSpeed;

    static {
        h1 h1Var = new h1("auto", 0);
        auto = h1Var;
        h1 h1Var2 = new h1("optimizeQuality", 1);
        optimizeQuality = h1Var2;
        h1 h1Var3 = new h1("optimizeSpeed", 2);
        optimizeSpeed = h1Var3;
        $VALUES = new h1[]{h1Var, h1Var2, h1Var3};
    }

    public static h1 valueOf(String str) {
        return (h1) Enum.valueOf(h1.class, str);
    }

    public static h1[] values() {
        return (h1[]) $VALUES.clone();
    }
}
