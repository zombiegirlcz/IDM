package pwc;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h CARD_AND_CACHE_WITHDRAWALS;
    public static final h CARD_PAYMENTS;
    public static final h DEFAULT;
    public static final h TRANSFERS;

    static {
        h hVar = new h("DEFAULT", 0);
        DEFAULT = hVar;
        h hVar2 = new h("TRANSFERS", 1);
        TRANSFERS = hVar2;
        h hVar3 = new h("CARD_AND_CACHE_WITHDRAWALS", 2);
        CARD_AND_CACHE_WITHDRAWALS = hVar3;
        h hVar4 = new h("CARD_PAYMENTS", 3);
        CARD_PAYMENTS = hVar4;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4};
        $VALUES = hVarArr;
        $ENTRIES = vc.s.n(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
