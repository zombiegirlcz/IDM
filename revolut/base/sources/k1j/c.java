package k1j;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CREDIT_CARDS;
    public static final c DEFI;
    public static final c EXTERNAL_POCKETS;
    public static final c FUTURES_COLLATERAL;
    public static final c JOINT_ACCOUNT;
    public static final c JOINT_SAVINGS;
    public static final c JOINT_SUBACCOUNTS;
    public static final c JOINT_TRADING_ACCOUNTS;
    public static final c POCKETS;
    public static final c PRO;
    public static final c PRO_VAULTS;
    public static final c REV_POINTS;
    public static final c SAVINGS;
    public static final c SPOT_MARGIN_COLLATERAL;
    public static final c SUBACCOUNTS;
    public static final c TEEN_POCKETS;
    public static final c TEEN_VAULTS;
    public static final c TRADING_ACCOUNTS;
    public static final c YOUTH_POCKETS;
    public static final c YOUTH_SAVINGS;
    public static final c YOUTH_VAULTS;

    static {
        c cVar = new c("POCKETS", 0);
        POCKETS = cVar;
        c cVar2 = new c("JOINT_ACCOUNT", 1);
        JOINT_ACCOUNT = cVar2;
        c cVar3 = new c("SUBACCOUNTS", 2);
        SUBACCOUNTS = cVar3;
        c cVar4 = new c("JOINT_SUBACCOUNTS", 3);
        JOINT_SUBACCOUNTS = cVar4;
        c cVar5 = new c("CREDIT_CARDS", 4);
        CREDIT_CARDS = cVar5;
        c cVar6 = new c("PRO", 5);
        PRO = cVar6;
        c cVar7 = new c("PRO_VAULTS", 6);
        PRO_VAULTS = cVar7;
        c cVar8 = new c("EXTERNAL_POCKETS", 7);
        EXTERNAL_POCKETS = cVar8;
        c cVar9 = new c("SAVINGS", 8);
        SAVINGS = cVar9;
        c cVar10 = new c("REV_POINTS", 9);
        REV_POINTS = cVar10;
        c cVar11 = new c("JOINT_SAVINGS", 10);
        JOINT_SAVINGS = cVar11;
        c cVar12 = new c("YOUTH_POCKETS", 11);
        YOUTH_POCKETS = cVar12;
        c cVar13 = new c("YOUTH_VAULTS", 12);
        YOUTH_VAULTS = cVar13;
        c cVar14 = new c("YOUTH_SAVINGS", 13);
        YOUTH_SAVINGS = cVar14;
        c cVar15 = new c("TEEN_POCKETS", 14);
        TEEN_POCKETS = cVar15;
        c cVar16 = new c("TEEN_VAULTS", 15);
        TEEN_VAULTS = cVar16;
        c cVar17 = new c("TRADING_ACCOUNTS", 16);
        TRADING_ACCOUNTS = cVar17;
        c cVar18 = new c("JOINT_TRADING_ACCOUNTS", 17);
        JOINT_TRADING_ACCOUNTS = cVar18;
        c cVar19 = new c("SPOT_MARGIN_COLLATERAL", 18);
        SPOT_MARGIN_COLLATERAL = cVar19;
        c cVar20 = new c("FUTURES_COLLATERAL", 19);
        FUTURES_COLLATERAL = cVar20;
        c cVar21 = new c("DEFI", 20);
        DEFI = cVar21;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, cVar20, cVar21};
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
