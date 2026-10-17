package d7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {
    private static final /* synthetic */ m0[] $VALUES;
    public static final m0 AUTOMATIC;
    public static final m0 HARDWARE;
    public static final m0 SOFTWARE;

    static {
        m0 m0Var = new m0("AUTOMATIC", 0);
        AUTOMATIC = m0Var;
        m0 m0Var2 = new m0("HARDWARE", 1);
        HARDWARE = m0Var2;
        m0 m0Var3 = new m0("SOFTWARE", 2);
        SOFTWARE = m0Var3;
        $VALUES = new m0[]{m0Var, m0Var2, m0Var3};
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) $VALUES.clone();
    }
}
