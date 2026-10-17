package d9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class z0 {
    private static final /* synthetic */ z0[] $VALUES;
    public static final z0 AS_EMPTY;
    public static final z0 DEFAULT;
    public static final z0 FAIL;
    public static final z0 SET;
    public static final z0 SKIP;

    static {
        z0 z0Var = new z0("SET", 0);
        SET = z0Var;
        z0 z0Var2 = new z0("SKIP", 1);
        SKIP = z0Var2;
        z0 z0Var3 = new z0("FAIL", 2);
        FAIL = z0Var3;
        z0 z0Var4 = new z0("AS_EMPTY", 3);
        AS_EMPTY = z0Var4;
        z0 z0Var5 = new z0("DEFAULT", 4);
        DEFAULT = z0Var5;
        $VALUES = new z0[]{z0Var, z0Var2, z0Var3, z0Var4, z0Var5};
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) $VALUES.clone();
    }
}
