package ecm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class b2 {
    private static final /* synthetic */ b2[] $VALUES;
    public static final b2 INTEGRITY;
    public static final b2 NONE;
    public static final b2 PRIVACY_AND_INTEGRITY;

    static {
        b2 b2Var = new b2("NONE", 0);
        NONE = b2Var;
        b2 b2Var2 = new b2("INTEGRITY", 1);
        INTEGRITY = b2Var2;
        b2 b2Var3 = new b2("PRIVACY_AND_INTEGRITY", 2);
        PRIVACY_AND_INTEGRITY = b2Var3;
        $VALUES = new b2[]{b2Var, b2Var2, b2Var3};
    }

    public static b2 valueOf(String str) {
        return (b2) Enum.valueOf(b2.class, str);
    }

    public static b2[] values() {
        return (b2[]) $VALUES.clone();
    }
}
