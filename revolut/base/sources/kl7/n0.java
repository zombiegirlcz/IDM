package kl7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class n0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n0[] $VALUES;
    public static final n0 CONVICTIONS;
    public static final n0 CURRENT_INSURANCE_EXPIRED_30_OR_MORE;
    public static final n0 DISQUALIFICATIONS;
    public static final n0 DRIVER_DISABILITY;
    public static final n0 INCREASED_EXCESS_AND_REDUCED_COVER_LEVEL;
    public static final n0 NO_OR_RECENT_RESIDENCY_IRELAND;
    public static final n0 REFUSED_CAR_INSURANCE;

    static {
        n0 n0Var = new n0("DISQUALIFICATIONS", 0);
        DISQUALIFICATIONS = n0Var;
        n0 n0Var2 = new n0("CONVICTIONS", 1);
        CONVICTIONS = n0Var2;
        n0 n0Var3 = new n0("REFUSED_CAR_INSURANCE", 2);
        REFUSED_CAR_INSURANCE = n0Var3;
        n0 n0Var4 = new n0("INCREASED_EXCESS_AND_REDUCED_COVER_LEVEL", 3);
        INCREASED_EXCESS_AND_REDUCED_COVER_LEVEL = n0Var4;
        n0 n0Var5 = new n0("DRIVER_DISABILITY", 4);
        DRIVER_DISABILITY = n0Var5;
        n0 n0Var6 = new n0("NO_OR_RECENT_RESIDENCY_IRELAND", 5);
        NO_OR_RECENT_RESIDENCY_IRELAND = n0Var6;
        n0 n0Var7 = new n0("CURRENT_INSURANCE_EXPIRED_30_OR_MORE", 6);
        CURRENT_INSURANCE_EXPIRED_30_OR_MORE = n0Var7;
        n0[] n0VarArr = {n0Var, n0Var2, n0Var3, n0Var4, n0Var5, n0Var6, n0Var7};
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
