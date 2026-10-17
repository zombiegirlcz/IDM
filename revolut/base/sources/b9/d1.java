package b9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class d1 {
    private static final /* synthetic */ d1[] $VALUES;
    public static final d1 EvenOdd;
    public static final d1 NonZero;

    static {
        d1 d1Var = new d1("NonZero", 0);
        NonZero = d1Var;
        d1 d1Var2 = new d1("EvenOdd", 1);
        EvenOdd = d1Var2;
        $VALUES = new d1[]{d1Var, d1Var2};
    }

    public static d1 valueOf(String str) {
        return (d1) Enum.valueOf(d1.class, str);
    }

    public static d1[] values() {
        return (d1[]) $VALUES.clone();
    }
}
