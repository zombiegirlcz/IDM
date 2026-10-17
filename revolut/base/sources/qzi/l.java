package qzi;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l ACCOMMODATION;
    public static final l ADVERTISING;
    public static final l CARD;
    public static final l CASH;
    public static final l CASHBACK;
    public static final l CHILD_ALLOWANCE;
    public static final l CREDIT;

    @NotNull
    public static final k Companion;
    public static final l DONATION;
    public static final l EDUCATION;
    public static final l ENTERTAINMENT;
    public static final l FEE;
    public static final l FINANCIAL;
    public static final l FUEL;
    public static final l FURNITURE;
    public static final l GENERAL;
    public static final l GIFT;
    public static final l GOVERNMENT;
    public static final l GROCERIES;
    public static final l HARDWARE;
    public static final l HEALTH;
    public static final l INSURANCE;
    public static final l INTEREST;
    public static final l INVESTMENT;
    public static final l LOAN;
    public static final l NET_SALES;
    public static final l OVERALL;
    public static final l REFUND;
    public static final l RESTAURANTS;
    public static final l SALARY;
    public static final l SAVINGS;
    public static final l SERVICES;
    public static final l SHOPPING;
    public static final l SOFTWARE;
    public static final l TOPUP;
    public static final l TRANSFERS;
    public static final l TRANSPORT;
    public static final l TRAVEL;
    public static final l UTILITIES;
    public static final l WEALTH;

    static {
        l lVar = new l("GROCERIES", 0);
        GROCERIES = lVar;
        l lVar2 = new l("SHOPPING", 1);
        SHOPPING = lVar2;
        l lVar3 = new l("RESTAURANTS", 2);
        RESTAURANTS = lVar3;
        l lVar4 = new l("TRANSPORT", 3);
        TRANSPORT = lVar4;
        l lVar5 = new l("TRAVEL", 4);
        TRAVEL = lVar5;
        l lVar6 = new l("ENTERTAINMENT", 5);
        ENTERTAINMENT = lVar6;
        l lVar7 = new l("HEALTH", 6);
        HEALTH = lVar7;
        l lVar8 = new l("SERVICES", 7);
        SERVICES = lVar8;
        l lVar9 = new l("GENERAL", 8);
        GENERAL = lVar9;
        l lVar10 = new l("UTILITIES", 9);
        UTILITIES = lVar10;
        l lVar11 = new l("CASH", 10);
        CASH = lVar11;
        l lVar12 = new l("TRANSFERS", 11);
        TRANSFERS = lVar12;
        l lVar13 = new l("INSURANCE", 12);
        INSURANCE = lVar13;
        l lVar14 = new l("WEALTH", 13);
        WEALTH = lVar14;
        l lVar15 = new l("OVERALL", 14);
        OVERALL = lVar15;
        l lVar16 = new l("REFUND", 15);
        REFUND = lVar16;
        l lVar17 = new l("CASHBACK", 16);
        CASHBACK = lVar17;
        l lVar18 = new l("CHILD_ALLOWANCE", 17);
        CHILD_ALLOWANCE = lVar18;
        l lVar19 = new l("INVESTMENT", 18);
        INVESTMENT = lVar19;
        l lVar20 = new l("LOAN", 19);
        LOAN = lVar20;
        l lVar21 = new l("CREDIT", 20);
        CREDIT = lVar21;
        l lVar22 = new l("SAVINGS", 21);
        SAVINGS = lVar22;
        l lVar23 = new l("DONATION", 22);
        DONATION = lVar23;
        l lVar24 = new l("SALARY", 23);
        SALARY = lVar24;
        l lVar25 = new l("GIFT", 24);
        GIFT = lVar25;
        l lVar26 = new l("TOPUP", 25);
        TOPUP = lVar26;
        l lVar27 = new l("NET_SALES", 26);
        NET_SALES = lVar27;
        l lVar28 = new l("INTEREST", 27);
        INTEREST = lVar28;
        l lVar29 = new l("FEE", 28);
        FEE = lVar29;
        l lVar30 = new l("CARD", 29);
        CARD = lVar30;
        l lVar31 = new l("ACCOMMODATION", 30);
        ACCOMMODATION = lVar31;
        l lVar32 = new l("FINANCIAL", 31);
        FINANCIAL = lVar32;
        l lVar33 = new l("FURNITURE", 32);
        FURNITURE = lVar33;
        l lVar34 = new l("HARDWARE", 33);
        HARDWARE = lVar34;
        l lVar35 = new l("FUEL", 34);
        FUEL = lVar35;
        l lVar36 = new l("SOFTWARE", 35);
        SOFTWARE = lVar36;
        l lVar37 = new l("ADVERTISING", 36);
        ADVERTISING = lVar37;
        l lVar38 = new l("EDUCATION", 37);
        EDUCATION = lVar38;
        l lVar39 = new l("GOVERNMENT", 38);
        GOVERNMENT = lVar39;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar11, lVar12, lVar13, lVar14, lVar15, lVar16, lVar17, lVar18, lVar19, lVar20, lVar21, lVar22, lVar23, lVar24, lVar25, lVar26, lVar27, lVar28, lVar29, lVar30, lVar31, lVar32, lVar33, lVar34, lVar35, lVar36, lVar37, lVar38, lVar39};
        $VALUES = lVarArr;
        $ENTRIES = s.n(lVarArr);
        Companion = new k();
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
