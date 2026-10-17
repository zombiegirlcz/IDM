package sr6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n ACTIVE;
    public static final n CANCELLED;
    public static final n COMPLETED;
    public static final n DRAFT;
    public static final n EXPIRED;
    public static final n PAID;
    public static final n PROCESSING;
    public static final n SENT;

    static {
        n nVar = new n("DRAFT", 0);
        DRAFT = nVar;
        n nVar2 = new n("SENT", 1);
        SENT = nVar2;
        n nVar3 = new n("PROCESSING", 2);
        PROCESSING = nVar3;
        n nVar4 = new n("PAID", 3);
        PAID = nVar4;
        n nVar5 = new n("CANCELLED", 4);
        CANCELLED = nVar5;
        n nVar6 = new n("ACTIVE", 5);
        ACTIVE = nVar6;
        n nVar7 = new n("COMPLETED", 6);
        COMPLETED = nVar7;
        n nVar8 = new n("EXPIRED", 7);
        EXPIRED = nVar8;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8};
        $VALUES = nVarArr;
        $ENTRIES = s.n(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
