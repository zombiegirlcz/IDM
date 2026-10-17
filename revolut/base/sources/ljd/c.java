package ljd;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ACCESSORIES;
    public static final c BEAUTY;
    public static final c DIGITAL;
    public static final c DINING;
    public static final c EATS;
    public static final c ELECTRONICS;
    public static final c ENTERTAINMENT;
    public static final c ESSENTIALS;
    public static final c FASHION;
    public static final c HOME;
    public static final c LUXURY;
    public static final c MARKETPLACES;
    public static final c SHOPPING;
    public static final c SPORTS;
    public static final c TRAVEL;
    public static final c WELLNESS;

    static {
        c cVar = new c("ENTERTAINMENT", 0);
        ENTERTAINMENT = cVar;
        c cVar2 = new c("EATS", 1);
        EATS = cVar2;
        c cVar3 = new c("DINING", 2);
        DINING = cVar3;
        c cVar4 = new c("HOME", 3);
        HOME = cVar4;
        c cVar5 = new c("SHOPPING", 4);
        SHOPPING = cVar5;
        c cVar6 = new c("TRAVEL", 5);
        TRAVEL = cVar6;
        c cVar7 = new c("WELLNESS", 6);
        WELLNESS = cVar7;
        c cVar8 = new c("ESSENTIALS", 7);
        ESSENTIALS = cVar8;
        c cVar9 = new c("FASHION", 8);
        FASHION = cVar9;
        c cVar10 = new c("ELECTRONICS", 9);
        ELECTRONICS = cVar10;
        c cVar11 = new c("BEAUTY", 10);
        BEAUTY = cVar11;
        c cVar12 = new c("LUXURY", 11);
        LUXURY = cVar12;
        c cVar13 = new c("MARKETPLACES", 12);
        MARKETPLACES = cVar13;
        c cVar14 = new c("SPORTS", 13);
        SPORTS = cVar14;
        c cVar15 = new c("DIGITAL", 14);
        DIGITAL = cVar15;
        c cVar16 = new c("ACCESSORIES", 15);
        ACCESSORIES = cVar16;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
