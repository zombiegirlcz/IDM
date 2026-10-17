package kg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class e0 {
    private static final /* synthetic */ e0[] $VALUES;
    public static final e0 LEGACY_STRICT;
    public static final e0 LENIENT;
    public static final e0 STRICT;

    static {
        e0 e0Var = new e0("LENIENT", 0);
        LENIENT = e0Var;
        e0 e0Var2 = new e0("LEGACY_STRICT", 1);
        LEGACY_STRICT = e0Var2;
        e0 e0Var3 = new e0("STRICT", 2);
        STRICT = e0Var3;
        $VALUES = new e0[]{e0Var, e0Var2, e0Var3};
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) $VALUES.clone();
    }
}
