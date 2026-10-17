package kg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    private static final /* synthetic */ d0[] $VALUES;
    public static final d0 ALLOW;
    public static final d0 BLOCK_ALL;
    public static final d0 BLOCK_INACCESSIBLE;
    public static final d0 INDECISIVE;

    static {
        d0 d0Var = new d0("ALLOW", 0);
        ALLOW = d0Var;
        d0 d0Var2 = new d0("INDECISIVE", 1);
        INDECISIVE = d0Var2;
        d0 d0Var3 = new d0("BLOCK_INACCESSIBLE", 2);
        BLOCK_INACCESSIBLE = d0Var3;
        d0 d0Var4 = new d0("BLOCK_ALL", 3);
        BLOCK_ALL = d0Var4;
        $VALUES = new d0[]{d0Var, d0Var2, d0Var3, d0Var4};
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) $VALUES.clone();
    }
}
