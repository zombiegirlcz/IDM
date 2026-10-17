package gcm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class w0 {
    private static final /* synthetic */ w0[] $VALUES;
    public static final w0 INSTANCE;

    static {
        w0 w0Var = new w0("INSTANCE", 0);
        INSTANCE = w0Var;
        $VALUES = new w0[]{w0Var};
    }

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) $VALUES.clone();
    }
}
