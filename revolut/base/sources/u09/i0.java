package u09;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class i0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i0[] $VALUES;
    public static final i0 INCENTIVE_ENDED;
    public static final i0 PAID;
    public static final i0 PAYABLE;
    public static final i0 PENDING;
    public static final i0 UNINITIALIZED;

    static {
        i0 i0Var = new i0("UNINITIALIZED", 0);
        UNINITIALIZED = i0Var;
        i0 i0Var2 = new i0("PAYABLE", 1);
        PAYABLE = i0Var2;
        i0 i0Var3 = new i0("PENDING", 2);
        PENDING = i0Var3;
        i0 i0Var4 = new i0("PAID", 3);
        PAID = i0Var4;
        i0 i0Var5 = new i0("INCENTIVE_ENDED", 4);
        INCENTIVE_ENDED = i0Var5;
        i0[] i0VarArr = {i0Var, i0Var2, i0Var3, i0Var4, i0Var5};
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
