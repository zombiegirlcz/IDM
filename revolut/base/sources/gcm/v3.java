package gcm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class v3 {
    private static final /* synthetic */ v3[] $VALUES;
    public static final v3 BODY;
    public static final v3 HEADER;

    static {
        v3 v3Var = new v3("HEADER", 0);
        HEADER = v3Var;
        v3 v3Var2 = new v3("BODY", 1);
        BODY = v3Var2;
        $VALUES = new v3[]{v3Var, v3Var2};
    }

    public static v3 valueOf(String str) {
        return (v3) Enum.valueOf(v3.class, str);
    }

    public static v3[] values() {
        return (v3[]) $VALUES.clone();
    }
}
