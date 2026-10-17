package d9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class c1 {
    private static final /* synthetic */ c1[] $VALUES;
    public static final c1 DEFAULT;
    public static final c1 FALSE;
    public static final c1 TRUE;

    static {
        c1 c1Var = new c1("TRUE", 0);
        TRUE = c1Var;
        c1 c1Var2 = new c1("FALSE", 1);
        FALSE = c1Var2;
        c1 c1Var3 = new c1("DEFAULT", 2);
        DEFAULT = c1Var3;
        $VALUES = new c1[]{c1Var, c1Var2, c1Var3};
    }

    public static c1 valueOf(String str) {
        return (c1) Enum.valueOf(c1.class, str);
    }

    public static c1[] values() {
        return (c1[]) $VALUES.clone();
    }
}
