package wog;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ACCOUNTS_SWITCH;
    public static final a ACCOUNTS_WIDGET;
    public static final a ANALYTICS;
    public static final a ANONYMOUS_PAYMENT_LINKS;
    public static final a ATMS;
    public static final a BILL_ACCOUNTS;
    public static final a CARDS;
    public static final a CRYPTO_RECEIVE_ACTION;
    public static final a CRYPTO_SEND_ACTION;
    public static final a CRYPTO_WITHDRAWALS;
    public static final a DONATIONS;
    public static final a GROUPS;
    public static final a JUNIOR;
    public static final a MONEY_REQUESTS;
    public static final a POCKETS;
    public static final a PRICING_PLANS;
    public static final a RATES_ALERTS;
    public static final a RATES_WATCHLIST;
    public static final a RECURRING_PAYMENTS;
    public static final a REFERRALS;
    public static final a REV_POINTS;
    public static final a REWARDS;
    public static final a SPLIT_BILLS;
    public static final a SUBSCRIPTIONS;
    public static final a TOP_UPS;
    public static final a TRANSACTION_CATEGORIES;
    public static final a TRANSACTION_LINKS;

    static {
        a aVar = new a("POCKETS", 0);
        POCKETS = aVar;
        a aVar2 = new a("TRANSACTION_CATEGORIES", 1);
        TRANSACTION_CATEGORIES = aVar2;
        a aVar3 = new a("TRANSACTION_LINKS", 2);
        TRANSACTION_LINKS = aVar3;
        a aVar4 = new a("TOP_UPS", 3);
        TOP_UPS = aVar4;
        a aVar5 = new a("SPLIT_BILLS", 4);
        SPLIT_BILLS = aVar5;
        a aVar6 = new a("GROUPS", 5);
        GROUPS = aVar6;
        a aVar7 = new a("BILL_ACCOUNTS", 6);
        BILL_ACCOUNTS = aVar7;
        a aVar8 = new a("MONEY_REQUESTS", 7);
        MONEY_REQUESTS = aVar8;
        a aVar9 = new a("CARDS", 8);
        CARDS = aVar9;
        a aVar10 = new a("RECURRING_PAYMENTS", 9);
        RECURRING_PAYMENTS = aVar10;
        a aVar11 = new a("JUNIOR", 10);
        JUNIOR = aVar11;
        a aVar12 = new a("ANALYTICS", 11);
        ANALYTICS = aVar12;
        a aVar13 = new a("PRICING_PLANS", 12);
        PRICING_PLANS = aVar13;
        a aVar14 = new a("REFERRALS", 13);
        REFERRALS = aVar14;
        a aVar15 = new a("RATES_ALERTS", 14);
        RATES_ALERTS = aVar15;
        a aVar16 = new a("RATES_WATCHLIST", 15);
        RATES_WATCHLIST = aVar16;
        a aVar17 = new a("SUBSCRIPTIONS", 16);
        SUBSCRIPTIONS = aVar17;
        a aVar18 = new a("CRYPTO_WITHDRAWALS", 17);
        CRYPTO_WITHDRAWALS = aVar18;
        a aVar19 = new a("REWARDS", 18);
        REWARDS = aVar19;
        a aVar20 = new a("ANONYMOUS_PAYMENT_LINKS", 19);
        ANONYMOUS_PAYMENT_LINKS = aVar20;
        a aVar21 = new a("ATMS", 20);
        ATMS = aVar21;
        a aVar22 = new a("ACCOUNTS_WIDGET", 21);
        ACCOUNTS_WIDGET = aVar22;
        a aVar23 = new a("REV_POINTS", 22);
        REV_POINTS = aVar23;
        a aVar24 = new a("DONATIONS", 23);
        DONATIONS = aVar24;
        a aVar25 = new a("ACCOUNTS_SWITCH", 24);
        ACCOUNTS_SWITCH = aVar25;
        a aVar26 = new a("CRYPTO_SEND_ACTION", 25);
        CRYPTO_SEND_ACTION = aVar26;
        a aVar27 = new a("CRYPTO_RECEIVE_ACTION", 26);
        CRYPTO_RECEIVE_ACTION = aVar27;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
