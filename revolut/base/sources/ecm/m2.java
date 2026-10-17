package ecm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class m2 {
    private static final /* synthetic */ m2[] $VALUES;
    public static final m2 CUSTOM_MANAGERS;
    public static final m2 FAKE;
    public static final m2 MTLS;

    static {
        m2 m2Var = new m2("FAKE", 0);
        FAKE = m2Var;
        m2 m2Var2 = new m2("MTLS", 1);
        MTLS = m2Var2;
        m2 m2Var3 = new m2("CUSTOM_MANAGERS", 2);
        CUSTOM_MANAGERS = m2Var3;
        $VALUES = new m2[]{m2Var, m2Var2, m2Var3};
    }

    public static m2 valueOf(String str) {
        return (m2) Enum.valueOf(m2.class, str);
    }

    public static m2[] values() {
        return (m2[]) $VALUES.clone();
    }
}
