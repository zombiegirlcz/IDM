package cv3;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class y {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ y[] $VALUES;
    public static final y EDIT_CALCULATOR;
    public static final y EDIT_CREDITS_TO_REFINANCE;
    public static final y EDIT_CREDITS_TO_REFINANCE_AND_CALCULATOR;
    public static final y EDIT_INSURANCE_TYPE;
    public static final y EDIT_REPAYMENT_DAY;
    public static final y EDIT_REPAYMENT_TYPE;

    @NotNull
    private final String value;

    static {
        y yVar = new y("EDIT_CALCULATOR", 0, "editCalculator");
        EDIT_CALCULATOR = yVar;
        y yVar2 = new y("EDIT_REPAYMENT_TYPE", 1, "editRepaymentType");
        EDIT_REPAYMENT_TYPE = yVar2;
        y yVar3 = new y("EDIT_INSURANCE_TYPE", 2, "editInsuranceType");
        EDIT_INSURANCE_TYPE = yVar3;
        y yVar4 = new y("EDIT_CREDITS_TO_REFINANCE", 3, "editCreditsToRefinance");
        EDIT_CREDITS_TO_REFINANCE = yVar4;
        y yVar5 = new y("EDIT_REPAYMENT_DAY", 4, "editRepaymentDay");
        EDIT_REPAYMENT_DAY = yVar5;
        y yVar6 = new y("EDIT_CREDITS_TO_REFINANCE_AND_CALCULATOR", 5, "editCreditsToRefinanceAndCalculator");
        EDIT_CREDITS_TO_REFINANCE_AND_CALCULATOR = yVar6;
        y[] yVarArr = {yVar, yVar2, yVar3, yVar4, yVar5, yVar6};
        $VALUES = yVarArr;
        $ENTRIES = vc.s.n(yVarArr);
    }

    public y(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) $VALUES.clone();
    }

    public final String b() {
        return this.value;
    }
}
