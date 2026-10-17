package q35;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class w {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w CarLoan;
    public static final w ConsumerLoan;
    public static final w CreditCard;
    public static final w CreditLine;
    public static final w Leasing;
    public static final w Mortgage;
    public static final w Overdraft;
    public static final w PersonalLoan;
    public static final w RefurbishmentLoan;
    public static final w SecuredLoan;

    static {
        w wVar = new w("PersonalLoan", 0);
        PersonalLoan = wVar;
        w wVar2 = new w("SecuredLoan", 1);
        SecuredLoan = wVar2;
        w wVar3 = new w("ConsumerLoan", 2);
        ConsumerLoan = wVar3;
        w wVar4 = new w("Leasing", 3);
        Leasing = wVar4;
        w wVar5 = new w("RefurbishmentLoan", 4);
        RefurbishmentLoan = wVar5;
        w wVar6 = new w("CarLoan", 5);
        CarLoan = wVar6;
        w wVar7 = new w("Mortgage", 6);
        Mortgage = wVar7;
        w wVar8 = new w("CreditCard", 7);
        CreditCard = wVar8;
        w wVar9 = new w("CreditLine", 8);
        CreditLine = wVar9;
        w wVar10 = new w("Overdraft", 9);
        Overdraft = wVar10;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4, wVar5, wVar6, wVar7, wVar8, wVar9, wVar10};
        $VALUES = wVarArr;
        $ENTRIES = vc.s.n(wVarArr);
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }
}
