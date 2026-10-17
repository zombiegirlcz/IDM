package yp0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n FACTOR_100;
    public static final n FACTOR_40;
    public static final n FACTOR_50;
    public static final n FACTOR_60;
    public static final n FACTOR_80;

    static {
        n nVar = new n("FACTOR_40", 0);
        FACTOR_40 = nVar;
        n nVar2 = new n("FACTOR_50", 1);
        FACTOR_50 = nVar2;
        n nVar3 = new n("FACTOR_60", 2);
        FACTOR_60 = nVar3;
        n nVar4 = new n("FACTOR_80", 3);
        FACTOR_80 = nVar4;
        n nVar5 = new n("FACTOR_100", 4);
        FACTOR_100 = nVar5;
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
