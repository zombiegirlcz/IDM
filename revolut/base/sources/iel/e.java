package iel;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e BANKRUPTCY;
    public static final e CALL;
    public static final e COMPANY_MEETING;
    public static final e COUPON;
    public static final e DIVIDENDS;
    public static final e EX_DIVIDEND;
    public static final e LISTING_CHANGE;
    public static final e MARKET_HOLIDAY;
    public static final e MERGER;
    public static final e PRINCIPAL;
    public static final e SPINOFF;
    public static final e STOCK_SPLIT;
    public static final e SYMBOL_CHANGE;

    static {
        e eVar = new e("EX_DIVIDEND", 0);
        EX_DIVIDEND = eVar;
        e eVar2 = new e("DIVIDENDS", 1);
        DIVIDENDS = eVar2;
        e eVar3 = new e("MARKET_HOLIDAY", 2);
        MARKET_HOLIDAY = eVar3;
        e eVar4 = new e("LISTING_CHANGE", 3);
        LISTING_CHANGE = eVar4;
        e eVar5 = new e("STOCK_SPLIT", 4);
        STOCK_SPLIT = eVar5;
        e eVar6 = new e("SYMBOL_CHANGE", 5);
        SYMBOL_CHANGE = eVar6;
        e eVar7 = new e("COMPANY_MEETING", 6);
        COMPANY_MEETING = eVar7;
        e eVar8 = new e("MERGER", 7);
        MERGER = eVar8;
        e eVar9 = new e("SPINOFF", 8);
        SPINOFF = eVar9;
        e eVar10 = new e("BANKRUPTCY", 9);
        BANKRUPTCY = eVar10;
        e eVar11 = new e("COUPON", 10);
        COUPON = eVar11;
        e eVar12 = new e("CALL", 11);
        CALL = eVar12;
        e eVar13 = new e("PRINCIPAL", 12);
        PRINCIPAL = eVar13;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13};
        $VALUES = eVarArr;
        $ENTRIES = vc.s.n(eVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
