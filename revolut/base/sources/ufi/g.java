package ufi;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g ALL_INCLUSIVE;
    public static final g CAMPING;
    public static final g CRUISE;
    public static final g GUEST_HOUSE;
    public static final g HOLIDAY_RENTAL;
    public static final g HOSTEL;
    public static final g HOTEL;
    public static final g INN;
    public static final g MOTEL;
    public static final g RESORT;
    public static final g TOWN_HOUSE;
    public static final g UNKNOWN;

    static {
        g gVar = new g("HOLIDAY_RENTAL", 0);
        HOLIDAY_RENTAL = gVar;
        g gVar2 = new g("HOTEL", 1);
        HOTEL = gVar2;
        g gVar3 = new g("GUEST_HOUSE", 2);
        GUEST_HOUSE = gVar3;
        g gVar4 = new g("RESORT", 3);
        RESORT = gVar4;
        g gVar5 = new g("ALL_INCLUSIVE", 4);
        ALL_INCLUSIVE = gVar5;
        g gVar6 = new g("HOSTEL", 5);
        HOSTEL = gVar6;
        g gVar7 = new g("INN", 6);
        INN = gVar7;
        g gVar8 = new g("CRUISE", 7);
        CRUISE = gVar8;
        g gVar9 = new g("MOTEL", 8);
        MOTEL = gVar9;
        g gVar10 = new g("CAMPING", 9);
        CAMPING = gVar10;
        g gVar11 = new g("TOWN_HOUSE", 10);
        TOWN_HOUSE = gVar11;
        g gVar12 = new g("UNKNOWN", 11);
        UNKNOWN = gVar12;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, gVar12};
        $VALUES = gVarArr;
        $ENTRIES = s.n(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
