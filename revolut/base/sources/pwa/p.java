package pwa;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p ADD_MONEY;
    public static final p BUSINESS_SIGN_UP;
    public static final p BUSINESS_VERIFIED;
    public static final p BUY_STOCKS;
    public static final p COMPLETE_DIRECT_DEBIT;
    public static final p MAKE_PURCHASES;
    public static final p MERCHANT_SALE;
    public static final p ONBOARD_CRYPTO;
    public static final p ONBOARD_TRADING_ACCOUNT;
    public static final p ORDER_CARD;
    public static final p PRO_ADD_MONEY_TO_ACCOUNT;
    public static final p PRO_CARD_PAYMENT;
    public static final p PRO_ORDER_CARD;
    public static final p PRO_SIGN_UP;
    public static final p PURCHASE_CRYPTO;
    public static final p SIGN_UP;
    public static final p UNKNOWN;
    public static final p UNLOCK_CRYPTO;

    static {
        p pVar = new p("SIGN_UP", 0);
        SIGN_UP = pVar;
        p pVar2 = new p("ADD_MONEY", 1);
        ADD_MONEY = pVar2;
        p pVar3 = new p("ORDER_CARD", 2);
        ORDER_CARD = pVar3;
        p pVar4 = new p("MAKE_PURCHASES", 3);
        MAKE_PURCHASES = pVar4;
        p pVar5 = new p("UNLOCK_CRYPTO", 4);
        UNLOCK_CRYPTO = pVar5;
        p pVar6 = new p("PURCHASE_CRYPTO", 5);
        PURCHASE_CRYPTO = pVar6;
        p pVar7 = new p("ONBOARD_CRYPTO", 6);
        ONBOARD_CRYPTO = pVar7;
        p pVar8 = new p("COMPLETE_DIRECT_DEBIT", 7);
        COMPLETE_DIRECT_DEBIT = pVar8;
        p pVar9 = new p("PRO_SIGN_UP", 8);
        PRO_SIGN_UP = pVar9;
        p pVar10 = new p("PRO_ADD_MONEY_TO_ACCOUNT", 9);
        PRO_ADD_MONEY_TO_ACCOUNT = pVar10;
        p pVar11 = new p("PRO_ORDER_CARD", 10);
        PRO_ORDER_CARD = pVar11;
        p pVar12 = new p("PRO_CARD_PAYMENT", 11);
        PRO_CARD_PAYMENT = pVar12;
        p pVar13 = new p("MERCHANT_SALE", 12);
        MERCHANT_SALE = pVar13;
        p pVar14 = new p("BUSINESS_SIGN_UP", 13);
        BUSINESS_SIGN_UP = pVar14;
        p pVar15 = new p("BUSINESS_VERIFIED", 14);
        BUSINESS_VERIFIED = pVar15;
        p pVar16 = new p("BUY_STOCKS", 15);
        BUY_STOCKS = pVar16;
        p pVar17 = new p("ONBOARD_TRADING_ACCOUNT", 16);
        ONBOARD_TRADING_ACCOUNT = pVar17;
        p pVar18 = new p("UNKNOWN", 17);
        UNKNOWN = pVar18;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9, pVar10, pVar11, pVar12, pVar13, pVar14, pVar15, pVar16, pVar17, pVar18};
        $VALUES = pVarArr;
        $ENTRIES = s.n(pVarArr);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
