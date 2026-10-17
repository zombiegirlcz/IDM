package d7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class b0 {
    private static final /* synthetic */ b0[] $VALUES;
    public static final b0 MergePathsApi19;
    public final int minRequiredSdkVersion = 19;

    static {
        b0 b0Var = new b0();
        MergePathsApi19 = b0Var;
        $VALUES = new b0[]{b0Var};
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) $VALUES.clone();
    }
}
