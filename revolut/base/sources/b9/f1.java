package b9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class f1 {
    private static final /* synthetic */ f1[] $VALUES;
    public static final f1 Butt;
    public static final f1 Round;
    public static final f1 Square;

    static {
        f1 f1Var = new f1("Butt", 0);
        Butt = f1Var;
        f1 f1Var2 = new f1("Round", 1);
        Round = f1Var2;
        f1 f1Var3 = new f1("Square", 2);
        Square = f1Var3;
        $VALUES = new f1[]{f1Var, f1Var2, f1Var3};
    }

    public static f1 valueOf(String str) {
        return (f1) Enum.valueOf(f1.class, str);
    }

    public static f1[] values() {
        return (f1[]) $VALUES.clone();
    }
}
