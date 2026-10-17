package xck;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n NOT_ELIGIBLE;
    public static final n NOT_OPTED_IN;
    public static final n OPTED_OUT;
    public static final n PREPARING_REVEAL;
    public static final n READY_TO_REVEAL;
    public static final n UNKNOWN;
    public static final n WAITING_TO_REVEAL;

    static {
        n nVar = new n("NOT_OPTED_IN", 0);
        NOT_OPTED_IN = nVar;
        n nVar2 = new n("WAITING_TO_REVEAL", 1);
        WAITING_TO_REVEAL = nVar2;
        n nVar3 = new n("READY_TO_REVEAL", 2);
        READY_TO_REVEAL = nVar3;
        n nVar4 = new n("PREPARING_REVEAL", 3);
        PREPARING_REVEAL = nVar4;
        n nVar5 = new n("NOT_ELIGIBLE", 4);
        NOT_ELIGIBLE = nVar5;
        n nVar6 = new n("OPTED_OUT", 5);
        OPTED_OUT = nVar6;
        n nVar7 = new n("UNKNOWN", 6);
        UNKNOWN = nVar7;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7};
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
