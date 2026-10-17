package h19;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c AIRPORT_SECURITY_FAST_TRACK;
    public static final c AIRPORT_TRANSFERS;
    public static final c DONATIONS;
    public static final c ESIM;
    public static final c EXPERIENCES;
    public static final c FLIGHTS;
    public static final c GIFT_CARDS;
    public static final c INSURANCE;
    public static final c LOUNGES;
    public static final c LUGGAGE_STORAGE;
    public static final c MILES;
    public static final c POINTS_POCKET;
    public static final c SHOPS;
    public static final c STATIONS;
    public static final c STAYS;
    public static final c TRANSPORT;

    static {
        c cVar = new c("MILES", 0);
        MILES = cVar;
        c cVar2 = new c("STAYS", 1);
        STAYS = cVar2;
        c cVar3 = new c("EXPERIENCES", 2);
        EXPERIENCES = cVar3;
        c cVar4 = new c("ESIM", 3);
        ESIM = cVar4;
        c cVar5 = new c("SHOPS", 4);
        SHOPS = cVar5;
        c cVar6 = new c("LOUNGES", 5);
        LOUNGES = cVar6;
        c cVar7 = new c("AIRPORT_SECURITY_FAST_TRACK", 6);
        AIRPORT_SECURITY_FAST_TRACK = cVar7;
        c cVar8 = new c("DONATIONS", 7);
        DONATIONS = cVar8;
        c cVar9 = new c("INSURANCE", 8);
        INSURANCE = cVar9;
        c cVar10 = new c("GIFT_CARDS", 9);
        GIFT_CARDS = cVar10;
        c cVar11 = new c("POINTS_POCKET", 10);
        POINTS_POCKET = cVar11;
        c cVar12 = new c("TRANSPORT", 11);
        TRANSPORT = cVar12;
        c cVar13 = new c("FLIGHTS", 12);
        FLIGHTS = cVar13;
        c cVar14 = new c("AIRPORT_TRANSFERS", 13);
        AIRPORT_TRANSFERS = cVar14;
        c cVar15 = new c("LUGGAGE_STORAGE", 14);
        LUGGAGE_STORAGE = cVar15;
        c cVar16 = new c("STATIONS", 15);
        STATIONS = cVar16;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
