package klf;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class n0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n0[] $VALUES;
    public static final n0 FIAT;
    public static final n0 REV_POINTS;

    static {
        n0 n0Var = new n0("REV_POINTS", 0);
        REV_POINTS = n0Var;
        n0 n0Var2 = new n0("FIAT", 1);
        FIAT = n0Var2;
        n0[] n0VarArr = {n0Var, n0Var2};
        $VALUES = n0VarArr;
        $ENTRIES = vc.s.n(n0VarArr);
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) $VALUES.clone();
    }
}
