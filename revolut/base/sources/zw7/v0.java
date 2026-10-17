package zw7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class v0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v0[] $VALUES;
    public static final v0 MISSING_COVERAGE;
    public static final v0 OTHER;
    public static final v0 PASS_AWAY;
    public static final v0 POOR_APP_EXP;
    public static final v0 POOR_SUPPORT_EXP;
    public static final v0 PRICING_HIGH;

    static {
        v0 v0Var = new v0("PRICING_HIGH", 0);
        PRICING_HIGH = v0Var;
        v0 v0Var2 = new v0("POOR_SUPPORT_EXP", 1);
        POOR_SUPPORT_EXP = v0Var2;
        v0 v0Var3 = new v0("MISSING_COVERAGE", 2);
        MISSING_COVERAGE = v0Var3;
        v0 v0Var4 = new v0("PASS_AWAY", 3);
        PASS_AWAY = v0Var4;
        v0 v0Var5 = new v0("POOR_APP_EXP", 4);
        POOR_APP_EXP = v0Var5;
        v0 v0Var6 = new v0("OTHER", 5);
        OTHER = v0Var6;
        v0[] v0VarArr = {v0Var, v0Var2, v0Var3, v0Var4, v0Var5, v0Var6};
        $VALUES = v0VarArr;
        $ENTRIES = vc.s.n(v0VarArr);
    }

    public static v0 valueOf(String str) {
        return (v0) Enum.valueOf(v0.class, str);
    }

    public static v0[] values() {
        return (v0[]) $VALUES.clone();
    }
}
