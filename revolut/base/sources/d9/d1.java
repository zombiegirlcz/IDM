package d9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class d1 {
    private static final /* synthetic */ d1[] $VALUES;
    public static final d1 ALL;
    public static final d1 CREATOR;
    public static final d1 FIELD;
    public static final d1 GETTER;
    public static final d1 IS_GETTER;
    public static final d1 NONE;
    public static final d1 SETTER;

    static {
        d1 d1Var = new d1("GETTER", 0);
        GETTER = d1Var;
        d1 d1Var2 = new d1("SETTER", 1);
        SETTER = d1Var2;
        d1 d1Var3 = new d1("CREATOR", 2);
        CREATOR = d1Var3;
        d1 d1Var4 = new d1("FIELD", 3);
        FIELD = d1Var4;
        d1 d1Var5 = new d1("IS_GETTER", 4);
        IS_GETTER = d1Var5;
        d1 d1Var6 = new d1("NONE", 5);
        NONE = d1Var6;
        d1 d1Var7 = new d1("ALL", 6);
        ALL = d1Var7;
        $VALUES = new d1[]{d1Var, d1Var2, d1Var3, d1Var4, d1Var5, d1Var6, d1Var7};
    }

    public static d1 valueOf(String str) {
        return (d1) Enum.valueOf(d1.class, str);
    }

    public static d1[] values() {
        return (d1[]) $VALUES.clone();
    }
}
