package io3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l BLOCKING;
    public static final l COLLATERAL;
    public static final l COLLATERAL_PROXY;
    public static final l CREDIT;
    public static final l CRYPTO_EXCHANGE;
    public static final l CURRENT;
    public static final l INHERITANCE;
    public static final l INSTALMENT;
    public static final l INVESTMENT;
    public static final l LOCKED_GIFT;
    public static final l MERCHANT;
    public static final l REVX_FIAT;
    public static final l SALARY_ADVANCE;
    public static final l SAVINGS;
    public static final l SAVINGS_EXTERNAL;
    public static final l SAVINGS_INTEREST_BEARING;
    public static final l STAKING;
    public static final l STAKING_PROXY;
    public static final l TAX_ADV_PROXY;
    public static final l TRADING;
    public static final l UNKNOWN;
    public static final l VESTING;

    static {
        l lVar = new l("CURRENT", 0);
        CURRENT = lVar;
        l lVar2 = new l("SAVINGS", 1);
        SAVINGS = lVar2;
        l lVar3 = new l("SAVINGS_EXTERNAL", 2);
        SAVINGS_EXTERNAL = lVar3;
        l lVar4 = new l("STAKING", 3);
        STAKING = lVar4;
        l lVar5 = new l("STAKING_PROXY", 4);
        STAKING_PROXY = lVar5;
        l lVar6 = new l("REVX_FIAT", 5);
        REVX_FIAT = lVar6;
        l lVar7 = new l("INVESTMENT", 6);
        INVESTMENT = lVar7;
        l lVar8 = new l("TAX_ADV_PROXY", 7);
        TAX_ADV_PROXY = lVar8;
        l lVar9 = new l("CREDIT", 8);
        CREDIT = lVar9;
        l lVar10 = new l("MERCHANT", 9);
        MERCHANT = lVar10;
        l lVar11 = new l("INSTALMENT", 10);
        INSTALMENT = lVar11;
        l lVar12 = new l("VESTING", 11);
        VESTING = lVar12;
        l lVar13 = new l("BLOCKING", 12);
        BLOCKING = lVar13;
        l lVar14 = new l("SAVINGS_INTEREST_BEARING", 13);
        SAVINGS_INTEREST_BEARING = lVar14;
        l lVar15 = new l("TRADING", 14);
        TRADING = lVar15;
        l lVar16 = new l("SALARY_ADVANCE", 15);
        SALARY_ADVANCE = lVar16;
        l lVar17 = new l("CRYPTO_EXCHANGE", 16);
        CRYPTO_EXCHANGE = lVar17;
        l lVar18 = new l("COLLATERAL", 17);
        COLLATERAL = lVar18;
        l lVar19 = new l("COLLATERAL_PROXY", 18);
        COLLATERAL_PROXY = lVar19;
        l lVar20 = new l("LOCKED_GIFT", 19);
        LOCKED_GIFT = lVar20;
        l lVar21 = new l("INHERITANCE", 20);
        INHERITANCE = lVar21;
        l lVar22 = new l("UNKNOWN", 21);
        UNKNOWN = lVar22;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar11, lVar12, lVar13, lVar14, lVar15, lVar16, lVar17, lVar18, lVar19, lVar20, lVar21, lVar22};
        $VALUES = lVarArr;
        $ENTRIES = s.n(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
