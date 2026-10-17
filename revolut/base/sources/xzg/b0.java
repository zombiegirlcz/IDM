package xzg;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class b0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b0[] $VALUES;
    public static final b0 ONE_DAY;
    public static final b0 ONE_MONTH;
    public static final b0 ONE_WEEK;
    public static final b0 ONE_YEAR;

    static {
        b0 b0Var = new b0("ONE_DAY", 0);
        ONE_DAY = b0Var;
        b0 b0Var2 = new b0("ONE_WEEK", 1);
        ONE_WEEK = b0Var2;
        b0 b0Var3 = new b0("ONE_MONTH", 2);
        ONE_MONTH = b0Var3;
        b0 b0Var4 = new b0("ONE_YEAR", 3);
        ONE_YEAR = b0Var4;
        b0[] b0VarArr = {b0Var, b0Var2, b0Var3, b0Var4};
        $VALUES = b0VarArr;
        $ENTRIES = vc.s.n(b0VarArr);
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) $VALUES.clone();
    }
}
