package cv3;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class a0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a0[] $VALUES;
    public static final a0 AMOUNT;
    public static final a0 CREDITS_TO_REFINANCE;
    public static final a0 DURATION;
    public static final a0 INSURANCE;
    public static final a0 REPAYMENT_DAY;
    public static final a0 REPAYMENT_TYPE;

    @NotNull
    private final String value;

    static {
        a0 a0Var = new a0("REPAYMENT_TYPE", 0, "repaymentType");
        REPAYMENT_TYPE = a0Var;
        a0 a0Var2 = new a0("AMOUNT", 1, "amountRequested");
        AMOUNT = a0Var2;
        a0 a0Var3 = new a0("DURATION", 2, "durationRequested");
        DURATION = a0Var3;
        a0 a0Var4 = new a0("REPAYMENT_DAY", 3, "repaymentDayRequested");
        REPAYMENT_DAY = a0Var4;
        a0 a0Var5 = new a0("CREDITS_TO_REFINANCE", 4, "credits");
        CREDITS_TO_REFINANCE = a0Var5;
        a0 a0Var6 = new a0("INSURANCE", 5, "insuranceOptionRequested");
        INSURANCE = a0Var6;
        a0[] a0VarArr = {a0Var, a0Var2, a0Var3, a0Var4, a0Var5, a0Var6};
        $VALUES = a0VarArr;
        $ENTRIES = vc.s.n(a0VarArr);
    }

    public a0(String str, int i, String str2) {
        this.value = str2;
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
