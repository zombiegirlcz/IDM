package b9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class i1 {
    private static final /* synthetic */ i1[] $VALUES;
    public static final i1 End;
    public static final i1 Middle;
    public static final i1 Start;

    static {
        i1 i1Var = new i1("Start", 0);
        Start = i1Var;
        i1 i1Var2 = new i1("Middle", 1);
        Middle = i1Var2;
        i1 i1Var3 = new i1("End", 2);
        End = i1Var3;
        $VALUES = new i1[]{i1Var, i1Var2, i1Var3};
    }

    public static i1 valueOf(String str) {
        return (i1) Enum.valueOf(i1.class, str);
    }

    public static i1[] values() {
        return (i1[]) $VALUES.clone();
    }
}
