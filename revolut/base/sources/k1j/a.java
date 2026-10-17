package k1j;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a COMMODITIES;
    public static final a COMMODITIES_NON_EXISTING_CURRENCY;
    public static final a CREDIT_CARDS;
    public static final a CRYPTO;
    public static final a CRYPTO_NON_EXISTING_CURRENCY;
    public static final a DEFI;
    public static final a EXTERNAL_POCKETS;
    public static final a FUTURES_COLLATERAL;
    public static final a JOINT_ACCOUNT;
    public static final a JOINT_NON_EXISTING_CURRENCY;
    public static final a JOINT_SAVINGS;
    public static final a JOINT_TRADING_ACCOUNTS;
    public static final a JOINT_VAULTS;
    public static final a NON_EXISTING_CURRENCY;
    public static final a POCKETS;
    public static final a PRO;
    public static final a PRO_NON_EXISTING_CURRENCY;
    public static final a PRO_VAULTS;
    public static final a REVOLUT_X_FIAT;
    public static final a REV_POINTS;
    public static final a REV_POINTS_POCKETS;
    public static final a SAVINGS;
    public static final a SPOT_MARGIN_COLLATERAL;
    public static final a TEEN_POCKETS;
    public static final a TEEN_VAULTS;
    public static final a TRADING_ACCOUNTS;
    public static final a VAULTS;
    public static final a YOUTH_POCKETS;
    public static final a YOUTH_SAVINGS;
    public static final a YOUTH_VAULTS;

    static {
        a aVar = new a("POCKETS", 0);
        POCKETS = aVar;
        a aVar2 = new a("NON_EXISTING_CURRENCY", 1);
        NON_EXISTING_CURRENCY = aVar2;
        a aVar3 = new a("JOINT_ACCOUNT", 2);
        JOINT_ACCOUNT = aVar3;
        a aVar4 = new a("JOINT_VAULTS", 3);
        JOINT_VAULTS = aVar4;
        a aVar5 = new a("JOINT_SAVINGS", 4);
        JOINT_SAVINGS = aVar5;
        a aVar6 = new a("JOINT_NON_EXISTING_CURRENCY", 5);
        JOINT_NON_EXISTING_CURRENCY = aVar6;
        a aVar7 = new a("CRYPTO", 6);
        CRYPTO = aVar7;
        a aVar8 = new a("CRYPTO_NON_EXISTING_CURRENCY", 7);
        CRYPTO_NON_EXISTING_CURRENCY = aVar8;
        a aVar9 = new a("DEFI", 8);
        DEFI = aVar9;
        a aVar10 = new a("COMMODITIES", 9);
        COMMODITIES = aVar10;
        a aVar11 = new a("COMMODITIES_NON_EXISTING_CURRENCY", 10);
        COMMODITIES_NON_EXISTING_CURRENCY = aVar11;
        a aVar12 = new a("VAULTS", 11);
        VAULTS = aVar12;
        a aVar13 = new a("CREDIT_CARDS", 12);
        CREDIT_CARDS = aVar13;
        a aVar14 = new a("PRO", 13);
        PRO = aVar14;
        a aVar15 = new a("PRO_NON_EXISTING_CURRENCY", 14);
        PRO_NON_EXISTING_CURRENCY = aVar15;
        a aVar16 = new a("PRO_VAULTS", 15);
        PRO_VAULTS = aVar16;
        a aVar17 = new a("EXTERNAL_POCKETS", 16);
        EXTERNAL_POCKETS = aVar17;
        a aVar18 = new a("SAVINGS", 17);
        SAVINGS = aVar18;
        a aVar19 = new a("REV_POINTS", 18);
        REV_POINTS = aVar19;
        a aVar20 = new a("REV_POINTS_POCKETS", 19);
        REV_POINTS_POCKETS = aVar20;
        a aVar21 = new a("YOUTH_POCKETS", 20);
        YOUTH_POCKETS = aVar21;
        a aVar22 = new a("YOUTH_VAULTS", 21);
        YOUTH_VAULTS = aVar22;
        a aVar23 = new a("YOUTH_SAVINGS", 22);
        YOUTH_SAVINGS = aVar23;
        a aVar24 = new a("TEEN_POCKETS", 23);
        TEEN_POCKETS = aVar24;
        a aVar25 = new a("TEEN_VAULTS", 24);
        TEEN_VAULTS = aVar25;
        a aVar26 = new a("TRADING_ACCOUNTS", 25);
        TRADING_ACCOUNTS = aVar26;
        a aVar27 = new a("JOINT_TRADING_ACCOUNTS", 26);
        JOINT_TRADING_ACCOUNTS = aVar27;
        a aVar28 = new a("REVOLUT_X_FIAT", 27);
        REVOLUT_X_FIAT = aVar28;
        a aVar29 = new a("SPOT_MARGIN_COLLATERAL", 28);
        SPOT_MARGIN_COLLATERAL = aVar29;
        a aVar30 = new a("FUTURES_COLLATERAL", 29);
        FUTURES_COLLATERAL = aVar30;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29, aVar30};
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
