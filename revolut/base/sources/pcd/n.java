package pcd;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n CARD_MANDATE;
    public static final n EXTERNAL;
    public static final n EXTERNAL_MANDATE;
    public static final n INTERNAL;
    public static final n MANUAL_CARD_MANDATE;
    public static final n UNKNOWN;

    static {
        n nVar = new n("EXTERNAL_MANDATE", 0);
        EXTERNAL_MANDATE = nVar;
        n nVar2 = new n("EXTERNAL", 1);
        EXTERNAL = nVar2;
        n nVar3 = new n("INTERNAL", 2);
        INTERNAL = nVar3;
        n nVar4 = new n("CARD_MANDATE", 3);
        CARD_MANDATE = nVar4;
        n nVar5 = new n("MANUAL_CARD_MANDATE", 4);
        MANUAL_CARD_MANDATE = nVar5;
        n nVar6 = new n("UNKNOWN", 5);
        UNKNOWN = nVar6;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6};
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
