package i55;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g CHANGE_LOAN_REPAYMENT_DATE;
    public static final g SETTLE_CREDIT_ACCOUNT;

    static {
        g gVar = new g("SETTLE_CREDIT_ACCOUNT", 0);
        SETTLE_CREDIT_ACCOUNT = gVar;
        g gVar2 = new g("CHANGE_LOAN_REPAYMENT_DATE", 1);
        CHANGE_LOAN_REPAYMENT_DATE = gVar2;
        g[] gVarArr = {gVar, gVar2};
        $VALUES = gVarArr;
        $ENTRIES = vc.s.n(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
