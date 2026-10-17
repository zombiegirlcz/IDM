package rei;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n CORE;
    public static final n LOYALTY;
    public static final n UNKNOWN;

    static {
        n nVar = new n("CORE", 0);
        CORE = nVar;
        n nVar2 = new n("LOYALTY", 1);
        LOYALTY = nVar2;
        n nVar3 = new n("UNKNOWN", 2);
        UNKNOWN = nVar3;
        n[] nVarArr = {nVar, nVar2, nVar3};
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
