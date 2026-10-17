package n35;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h FullRepayment;
    public static final h PartialHealthy;
    public static final h PartialOutstanding;
    public static final h PartialOutstandingOverdue;
    public static final h PartialOverdue;

    static {
        h hVar = new h("PartialHealthy", 0);
        PartialHealthy = hVar;
        h hVar2 = new h("PartialOutstanding", 1);
        PartialOutstanding = hVar2;
        h hVar3 = new h("PartialOverdue", 2);
        PartialOverdue = hVar3;
        h hVar4 = new h("PartialOutstandingOverdue", 3);
        PartialOutstandingOverdue = hVar4;
        h hVar5 = new h("FullRepayment", 4);
        FullRepayment = hVar5;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
