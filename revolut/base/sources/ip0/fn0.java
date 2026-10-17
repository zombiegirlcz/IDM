package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class fn0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ fn0[] $VALUES;
    public static final fn0 BUSINESS;
    public static final fn0 RETAIL;

    static {
        fn0 fn0Var = new fn0("RETAIL", 0);
        RETAIL = fn0Var;
        fn0 fn0Var2 = new fn0("BUSINESS", 1);
        BUSINESS = fn0Var2;
        fn0[] fn0VarArr = {fn0Var, fn0Var2};
        $VALUES = fn0VarArr;
        $ENTRIES = vc.s.n(fn0VarArr);
    }

    public static fn0 valueOf(String str) {
        return (fn0) Enum.valueOf(fn0.class, str);
    }

    public static fn0[] values() {
        return (fn0[]) $VALUES.clone();
    }
}
