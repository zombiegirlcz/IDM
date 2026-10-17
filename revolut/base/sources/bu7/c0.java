package bu7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c0[] $VALUES;
    public static final c0 CLAIMS_ELIGIBILITY_STATEMENT;
    public static final c0 GUIDE_TO_BENEFIT;
    public static final c0 INSURANCE_POLICY;
    public static final c0 INSURANCE_STATEMENT;
    public static final c0 POLICY_WORDING;
    public static final c0 SUITABILITY_STATEMENT;

    static {
        c0 c0Var = new c0("GUIDE_TO_BENEFIT", 0);
        GUIDE_TO_BENEFIT = c0Var;
        c0 c0Var2 = new c0("INSURANCE_POLICY", 1);
        INSURANCE_POLICY = c0Var2;
        c0 c0Var3 = new c0("INSURANCE_STATEMENT", 2);
        INSURANCE_STATEMENT = c0Var3;
        c0 c0Var4 = new c0("POLICY_WORDING", 3);
        POLICY_WORDING = c0Var4;
        c0 c0Var5 = new c0("SUITABILITY_STATEMENT", 4);
        SUITABILITY_STATEMENT = c0Var5;
        c0 c0Var6 = new c0("CLAIMS_ELIGIBILITY_STATEMENT", 5);
        CLAIMS_ELIGIBILITY_STATEMENT = c0Var6;
        c0[] c0VarArr = {c0Var, c0Var2, c0Var3, c0Var4, c0Var5, c0Var6};
        $VALUES = c0VarArr;
        $ENTRIES = vc.s.n(c0VarArr);
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) $VALUES.clone();
    }
}
