package p35;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class k0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k0[] $VALUES;
    public static final k0 INTEREST_FREE_PERIOD;
    public static final k0 INTEREST_ONLY_WITHOUT_TERM_EXTENSION;
    public static final k0 PROLONGATION;
    public static final k0 REPAYMENT_DEFERRAL;
    public static final k0 ZERO_LOAN_AMOUNT;

    @NotNull
    private final String type;

    static {
        k0 k0Var = new k0("ZERO_LOAN_AMOUNT", 0, "ZERO_LOAN_AMOUNT");
        ZERO_LOAN_AMOUNT = k0Var;
        k0 k0Var2 = new k0("REPAYMENT_DEFERRAL", 1, "REPAYMENT_DEFERRAL");
        REPAYMENT_DEFERRAL = k0Var2;
        k0 k0Var3 = new k0("PROLONGATION", 2, "PROLONGATION");
        PROLONGATION = k0Var3;
        k0 k0Var4 = new k0("INTEREST_ONLY_WITHOUT_TERM_EXTENSION", 3, "INTEREST_ONLY_WITHOUT_TERM_EXTENSION");
        INTEREST_ONLY_WITHOUT_TERM_EXTENSION = k0Var4;
        k0 k0Var5 = new k0("INTEREST_FREE_PERIOD", 4, "INTEREST_FREE_PERIOD");
        INTEREST_FREE_PERIOD = k0Var5;
        k0[] k0VarArr = {k0Var, k0Var2, k0Var3, k0Var4, k0Var5};
        $VALUES = k0VarArr;
        $ENTRIES = vc.s.n(k0VarArr);
    }

    public k0(String str, int i, String str2) {
        this.type = str2;
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) $VALUES.clone();
    }
}
