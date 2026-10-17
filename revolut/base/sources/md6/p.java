package md6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p ASFT;
    public static final p DISCOVER_ALL_TYPES;
    public static final p EXPERIENCES;
    public static final p GIFT_CARDS;
    public static final p LOUNGES;
    public static final p MILES;
    public static final p REV_POINTS;
    public static final p SHOPS;
    public static final p STAYS;

    static {
        p pVar = new p("ASFT", 0);
        ASFT = pVar;
        p pVar2 = new p("EXPERIENCES", 1);
        EXPERIENCES = pVar2;
        p pVar3 = new p("GIFT_CARDS", 2);
        GIFT_CARDS = pVar3;
        p pVar4 = new p("LOUNGES", 3);
        LOUNGES = pVar4;
        p pVar5 = new p("MILES", 4);
        MILES = pVar5;
        p pVar6 = new p("REV_POINTS", 5);
        REV_POINTS = pVar6;
        p pVar7 = new p("SHOPS", 6);
        SHOPS = pVar7;
        p pVar8 = new p("STAYS", 7);
        STAYS = pVar8;
        p pVar9 = new p("DISCOVER_ALL_TYPES", 8);
        DISCOVER_ALL_TYPES = pVar9;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9};
        $VALUES = pVarArr;
        $ENTRIES = vc.s.n(pVarArr);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
