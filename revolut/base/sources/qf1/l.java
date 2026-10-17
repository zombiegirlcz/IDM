package qf1;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l CREDIT_CARD;
    public static final l CURRENCY;
    public static final l ESIM;
    public static final l INTERNATIONAL_TRANSFER;
    public static final l INVEST;
    public static final l JOINT;
    public static final l LINKED;
    public static final l LOAN;
    public static final l PLANS;
    public static final l POCKET;
    public static final l PRO;
    public static final l REFERRALS;
    public static final l SALARIED;
    public static final l SAVINGS;
    public static final l YOUTH;

    static {
        l lVar = new l("SAVINGS", 0);
        SAVINGS = lVar;
        l lVar2 = new l("CREDIT_CARD", 1);
        CREDIT_CARD = lVar2;
        l lVar3 = new l("INVEST", 2);
        INVEST = lVar3;
        l lVar4 = new l("LOAN", 3);
        LOAN = lVar4;
        l lVar5 = new l("JOINT", 4);
        JOINT = lVar5;
        l lVar6 = new l("YOUTH", 5);
        YOUTH = lVar6;
        l lVar7 = new l("CURRENCY", 6);
        CURRENCY = lVar7;
        l lVar8 = new l("POCKET", 7);
        POCKET = lVar8;
        l lVar9 = new l("LINKED", 8);
        LINKED = lVar9;
        l lVar10 = new l("PRO", 9);
        PRO = lVar10;
        l lVar11 = new l("INTERNATIONAL_TRANSFER", 10);
        INTERNATIONAL_TRANSFER = lVar11;
        l lVar12 = new l("ESIM", 11);
        ESIM = lVar12;
        l lVar13 = new l("PLANS", 12);
        PLANS = lVar13;
        l lVar14 = new l("SALARIED", 13);
        SALARIED = lVar14;
        l lVar15 = new l("REFERRALS", 14);
        REFERRALS = lVar15;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar11, lVar12, lVar13, lVar14, lVar15};
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
