package bti;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n ACTIVE;
    public static final n CREATED;
    public static final n FAILED;
    public static final n REDEEMED;
    public static final n UNAVAILABLE;
    public static final n UNKNOWN;

    static {
        n nVar = new n("CREATED", 0);
        CREATED = nVar;
        n nVar2 = new n("UNAVAILABLE", 1);
        UNAVAILABLE = nVar2;
        n nVar3 = new n("ACTIVE", 2);
        ACTIVE = nVar3;
        n nVar4 = new n("REDEEMED", 3);
        REDEEMED = nVar4;
        n nVar5 = new n("FAILED", 4);
        FAILED = nVar5;
        n nVar6 = new n("UNKNOWN", 5);
        UNKNOWN = nVar6;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6};
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
