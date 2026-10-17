package gcm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class b0 {
    private static final /* synthetic */ b0[] $VALUES;
    public static final b0 DROPPED;
    public static final b0 MISCARRIED;
    public static final b0 PROCESSED;
    public static final b0 REFUSED;

    static {
        b0 b0Var = new b0("PROCESSED", 0);
        PROCESSED = b0Var;
        b0 b0Var2 = new b0("REFUSED", 1);
        REFUSED = b0Var2;
        b0 b0Var3 = new b0("DROPPED", 2);
        DROPPED = b0Var3;
        b0 b0Var4 = new b0("MISCARRIED", 3);
        MISCARRIED = b0Var4;
        $VALUES = new b0[]{b0Var, b0Var2, b0Var3, b0Var4};
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) $VALUES.clone();
    }
}
