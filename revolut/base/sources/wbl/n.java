package wbl;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n IN_PREPARATION;
    public static final n READY;
    public static final n UNKNOWN;

    static {
        n nVar = new n("READY", 0);
        READY = nVar;
        n nVar2 = new n("IN_PREPARATION", 1);
        IN_PREPARATION = nVar2;
        n nVar3 = new n("UNKNOWN", 2);
        UNKNOWN = nVar3;
        n[] nVarArr = {nVar, nVar2, nVar3};
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
