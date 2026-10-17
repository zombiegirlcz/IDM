package pcd;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class i0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i0[] $VALUES;
    public static final i0 AWAITING_CUSTOMER;
    public static final i0 AWAITING_VERIFICATION;

    static {
        i0 i0Var = new i0("AWAITING_CUSTOMER", 0);
        AWAITING_CUSTOMER = i0Var;
        i0 i0Var2 = new i0("AWAITING_VERIFICATION", 1);
        AWAITING_VERIFICATION = i0Var2;
        i0[] i0VarArr = {i0Var, i0Var2};
        $VALUES = i0VarArr;
        $ENTRIES = vc.s.n(i0VarArr);
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) $VALUES.clone();
    }
}
