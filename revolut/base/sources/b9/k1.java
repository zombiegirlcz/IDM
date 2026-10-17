package b9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class k1 {
    private static final /* synthetic */ k1[] $VALUES;
    public static final k1 LTR;
    public static final k1 RTL;

    static {
        k1 k1Var = new k1("LTR", 0);
        LTR = k1Var;
        k1 k1Var2 = new k1("RTL", 1);
        RTL = k1Var2;
        $VALUES = new k1[]{k1Var, k1Var2};
    }

    public static k1 valueOf(String str) {
        return (k1) Enum.valueOf(k1.class, str);
    }

    public static k1[] values() {
        return (k1[]) $VALUES.clone();
    }
}
