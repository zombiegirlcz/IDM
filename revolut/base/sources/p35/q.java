package p35;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q ACH;
    public static final q DIRECT_DEBIT;
    public static final q UNKNOWN;

    static {
        q qVar = new q("DIRECT_DEBIT", 0);
        DIRECT_DEBIT = qVar;
        q qVar2 = new q("ACH", 1);
        ACH = qVar2;
        q qVar3 = new q("UNKNOWN", 2);
        UNKNOWN = qVar3;
        q[] qVarArr = {qVar, qVar2, qVar3};
        $VALUES = qVarArr;
        $ENTRIES = vc.s.n(qVarArr);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
