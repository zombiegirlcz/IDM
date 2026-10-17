package b9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class l1 {
    private static final /* synthetic */ l1[] $VALUES;
    public static final l1 NonScalingStroke;
    public static final l1 None;

    static {
        l1 l1Var = new l1("None", 0);
        None = l1Var;
        l1 l1Var2 = new l1("NonScalingStroke", 1);
        NonScalingStroke = l1Var2;
        $VALUES = new l1[]{l1Var, l1Var2};
    }

    public static l1 valueOf(String str) {
        return (l1) Enum.valueOf(l1.class, str);
    }

    public static l1[] values() {
        return (l1[]) $VALUES.clone();
    }
}
