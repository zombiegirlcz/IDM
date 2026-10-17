package zw7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n IPID;
    public static final n POLICY_WORDING;
    public static final n STATEMENT_OF_INSURANCE;
    public static final n TERMS_CONDITIONS;
    public static final n UNKNOWN;

    static {
        n nVar = new n("STATEMENT_OF_INSURANCE", 0);
        STATEMENT_OF_INSURANCE = nVar;
        n nVar2 = new n("IPID", 1);
        IPID = nVar2;
        n nVar3 = new n("POLICY_WORDING", 2);
        POLICY_WORDING = nVar3;
        n nVar4 = new n("TERMS_CONDITIONS", 3);
        TERMS_CONDITIONS = nVar4;
        n nVar5 = new n("UNKNOWN", 4);
        UNKNOWN = nVar5;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5};
        $VALUES = nVarArr;
        $ENTRIES = vc.s.n(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
