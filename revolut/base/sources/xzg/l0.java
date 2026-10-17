package xzg;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class l0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l0[] $VALUES;
    public static final l0 FIVE_YEARS;
    public static final l0 ONE_DAY;
    public static final l0 ONE_MONTH;
    public static final l0 ONE_WEEK;
    public static final l0 ONE_YEAR;

    static {
        l0 l0Var = new l0("ONE_DAY", 0);
        ONE_DAY = l0Var;
        l0 l0Var2 = new l0("ONE_WEEK", 1);
        ONE_WEEK = l0Var2;
        l0 l0Var3 = new l0("ONE_MONTH", 2);
        ONE_MONTH = l0Var3;
        l0 l0Var4 = new l0("ONE_YEAR", 3);
        ONE_YEAR = l0Var4;
        l0 l0Var5 = new l0("FIVE_YEARS", 4);
        FIVE_YEARS = l0Var5;
        l0[] l0VarArr = {l0Var, l0Var2, l0Var3, l0Var4, l0Var5};
        $VALUES = l0VarArr;
        $ENTRIES = vc.s.n(l0VarArr);
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) $VALUES.clone();
    }
}
