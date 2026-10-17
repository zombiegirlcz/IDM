package q35;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class i0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i0[] $VALUES;
    public static final i0 DisbursalInProgress;
    public static final i0 LoanAlreadyCancelled;
    public static final i0 LoanInactive;
    public static final i0 LoanNotInCooldownPeriod;
    public static final i0 NotSupported;
    public static final i0 ToggledOff;

    static {
        i0 i0Var = new i0("LoanInactive", 0);
        LoanInactive = i0Var;
        i0 i0Var2 = new i0("NotSupported", 1);
        NotSupported = i0Var2;
        i0 i0Var3 = new i0("ToggledOff", 2);
        ToggledOff = i0Var3;
        i0 i0Var4 = new i0("LoanAlreadyCancelled", 3);
        LoanAlreadyCancelled = i0Var4;
        i0 i0Var5 = new i0("LoanNotInCooldownPeriod", 4);
        LoanNotInCooldownPeriod = i0Var5;
        i0 i0Var6 = new i0("DisbursalInProgress", 5);
        DisbursalInProgress = i0Var6;
        i0[] i0VarArr = {i0Var, i0Var2, i0Var3, i0Var4, i0Var5, i0Var6};
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
