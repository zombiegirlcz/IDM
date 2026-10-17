package lc0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n CARD;
    public static final n SELFIE_AND_CARD;
    public static final n SELFIE_WITH_CARD;

    static {
        n nVar = new n("CARD", 0);
        CARD = nVar;
        n nVar2 = new n("SELFIE_WITH_CARD", 1);
        SELFIE_WITH_CARD = nVar2;
        n nVar3 = new n("SELFIE_AND_CARD", 2);
        SELFIE_AND_CARD = nVar3;
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
