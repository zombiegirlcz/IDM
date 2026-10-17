package gcm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class h3 {
    private static final /* synthetic */ h3[] $VALUES;
    public static final h3 ERROR;
    public static final h3 NO_RESOLUTION;
    public static final h3 SUCCESS;

    static {
        h3 h3Var = new h3("NO_RESOLUTION", 0);
        NO_RESOLUTION = h3Var;
        h3 h3Var2 = new h3("SUCCESS", 1);
        SUCCESS = h3Var2;
        h3 h3Var3 = new h3("ERROR", 2);
        ERROR = h3Var3;
        $VALUES = new h3[]{h3Var, h3Var2, h3Var3};
    }

    public static h3 valueOf(String str) {
        return (h3) Enum.valueOf(h3.class, str);
    }

    public static h3[] values() {
        return (h3[]) $VALUES.clone();
    }
}
