package iel;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j BANKRUPTCY;
    public static final j BOND_COUPON;
    public static final j CASH_DIVIDEND;
    public static final j EARLY_REDEMPTION;
    public static final j EARNINGS_CALL;
    public static final j EX_DIVIDEND;
    public static final j INTEREST_PAYMENT;
    public static final j LISTING_STATUS_CHANGE;
    public static final j MARKET_HOLIDAY;
    public static final j MATURITY_REDEMPTION;
    public static final j MERGER;
    public static final j SPINOFF;
    public static final j STOCK_DIVIDEND;
    public static final j STOCK_SPLIT;
    public static final j SYMBOL_CHANGE;
    public static final j UNKNOWN;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f160788id;

    static {
        j jVar = new j("MARKET_HOLIDAY", 0, "MARKET_HOLIDAY");
        MARKET_HOLIDAY = jVar;
        j jVar2 = new j("CASH_DIVIDEND", 1, "CASH_DIVIDEND");
        CASH_DIVIDEND = jVar2;
        j jVar3 = new j("STOCK_DIVIDEND", 2, "STOCK_DIVIDEND");
        STOCK_DIVIDEND = jVar3;
        j jVar4 = new j("STOCK_SPLIT", 3, "STOCK_SPLIT");
        STOCK_SPLIT = jVar4;
        j jVar5 = new j("LISTING_STATUS_CHANGE", 4, "LISTING_STATUS_CHANGE");
        LISTING_STATUS_CHANGE = jVar5;
        j jVar6 = new j("SYMBOL_CHANGE", 5, "SYMBOL_CHANGE");
        SYMBOL_CHANGE = jVar6;
        j jVar7 = new j("EARNINGS_CALL", 6, "EARNINGS_CALL");
        EARNINGS_CALL = jVar7;
        j jVar8 = new j("EX_DIVIDEND", 7, "EX_DIVIDEND");
        EX_DIVIDEND = jVar8;
        j jVar9 = new j("MERGER", 8, "MERGER");
        MERGER = jVar9;
        j jVar10 = new j("SPINOFF", 9, "DEMERGER");
        SPINOFF = jVar10;
        j jVar11 = new j("BANKRUPTCY", 10, "BANKRUPTCY");
        BANKRUPTCY = jVar11;
        j jVar12 = new j("BOND_COUPON", 11, "BOND_COUPON");
        BOND_COUPON = jVar12;
        j jVar13 = new j("INTEREST_PAYMENT", 12, "INTEREST_PAYMENT");
        INTEREST_PAYMENT = jVar13;
        j jVar14 = new j("EARLY_REDEMPTION", 13, "EARLY_REDEMPTION");
        EARLY_REDEMPTION = jVar14;
        j jVar15 = new j("MATURITY_REDEMPTION", 14, "MATURITY_REDEMPTION");
        MATURITY_REDEMPTION = jVar15;
        j jVar16 = new j("UNKNOWN", 15, "UNKNOWN");
        UNKNOWN = jVar16;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, jVar10, jVar11, jVar12, jVar13, jVar14, jVar15, jVar16};
        $VALUES = jVarArr;
        $ENTRIES = vc.s.n(jVarArr);
    }

    public j(String str, int i, String str2) {
        this.f160788id = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f160788id;
    }
}
