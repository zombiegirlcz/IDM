package m7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class a0 {
    private static final /* synthetic */ a0[] $VALUES;
    public static final a0 INDEX;
    public static final a0 PERCENT;

    static {
        a0 a0Var = new a0("PERCENT", 0);
        PERCENT = a0Var;
        a0 a0Var2 = new a0("INDEX", 1);
        INDEX = a0Var2;
        $VALUES = new a0[]{a0Var, a0Var2};
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }
}
