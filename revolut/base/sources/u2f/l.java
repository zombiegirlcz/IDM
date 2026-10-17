package u2f;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l GIFT_CARDS;
    public static final l PARTNER_POINTS;
    public static final l REV_PAY;
    public static final l UNKNOWN;

    static {
        l lVar = new l("PARTNER_POINTS", 0);
        PARTNER_POINTS = lVar;
        l lVar2 = new l("REV_PAY", 1);
        REV_PAY = lVar2;
        l lVar3 = new l("GIFT_CARDS", 2);
        GIFT_CARDS = lVar3;
        l lVar4 = new l("UNKNOWN", 3);
        UNKNOWN = lVar4;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4};
        $VALUES = lVarArr;
        $ENTRIES = vc.s.n(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
