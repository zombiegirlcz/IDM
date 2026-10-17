package md6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e COLLATERAL_SUBACCOUNT;
    public static final e CREDIT;
    public static final e CRYPTO;
    public static final e CRYPTO_SUBACCOUNT;
    public static final e CURRENCY;
    public static final e GROUP_SUBACCOUNT;
    public static final e INVEST;
    public static final e JOINT;
    public static final e JOINT_INVEST;
    public static final e JOINT_SAVINGS;
    public static final e JOINT_SUBACCOUNT;
    public static final e LINKED;
    public static final e ON_HOLD;
    public static final e PERSONAL_SUBACCOUNT;
    public static final e PLAN_CASHBACK_SUBACCOUNT;
    public static final e PRO;
    public static final e PRO_SUBACCOUNT;
    public static final e PRO_TAX_SUBACCOUNT;
    public static final e REV_POINTS;
    public static final e REV_POINTS_SUBACCOUNT;
    public static final e SAVINGS;
    public static final e SAVINGS_DEPOSITS;
    public static final e SAVINGS_MMF;
    public static final e TEEN;
    public static final e TEEN_SAVINGS;
    public static final e TEEN_SUBACCOUNT;
    public static final e YOUTH;
    public static final e YOUTH_SAVINGS;
    public static final e YOUTH_SUBACCOUNT;

    static {
        e eVar = new e("CURRENCY", 0);
        CURRENCY = eVar;
        e eVar2 = new e("PERSONAL_SUBACCOUNT", 1);
        PERSONAL_SUBACCOUNT = eVar2;
        e eVar3 = new e("GROUP_SUBACCOUNT", 2);
        GROUP_SUBACCOUNT = eVar3;
        e eVar4 = new e("PLAN_CASHBACK_SUBACCOUNT", 3);
        PLAN_CASHBACK_SUBACCOUNT = eVar4;
        e eVar5 = new e("SAVINGS", 4);
        SAVINGS = eVar5;
        e eVar6 = new e("SAVINGS_DEPOSITS", 5);
        SAVINGS_DEPOSITS = eVar6;
        e eVar7 = new e("SAVINGS_MMF", 6);
        SAVINGS_MMF = eVar7;
        e eVar8 = new e("JOINT", 7);
        JOINT = eVar8;
        e eVar9 = new e("JOINT_SUBACCOUNT", 8);
        JOINT_SUBACCOUNT = eVar9;
        e eVar10 = new e("JOINT_SAVINGS", 9);
        JOINT_SAVINGS = eVar10;
        e eVar11 = new e("YOUTH", 10);
        YOUTH = eVar11;
        e eVar12 = new e("YOUTH_SUBACCOUNT", 11);
        YOUTH_SUBACCOUNT = eVar12;
        e eVar13 = new e("YOUTH_SAVINGS", 12);
        YOUTH_SAVINGS = eVar13;
        e eVar14 = new e("TEEN", 13);
        TEEN = eVar14;
        e eVar15 = new e("TEEN_SUBACCOUNT", 14);
        TEEN_SUBACCOUNT = eVar15;
        e eVar16 = new e("TEEN_SAVINGS", 15);
        TEEN_SAVINGS = eVar16;
        e eVar17 = new e("CREDIT", 16);
        CREDIT = eVar17;
        e eVar18 = new e("COLLATERAL_SUBACCOUNT", 17);
        COLLATERAL_SUBACCOUNT = eVar18;
        e eVar19 = new e("PRO", 18);
        PRO = eVar19;
        e eVar20 = new e("PRO_SUBACCOUNT", 19);
        PRO_SUBACCOUNT = eVar20;
        e eVar21 = new e("PRO_TAX_SUBACCOUNT", 20);
        PRO_TAX_SUBACCOUNT = eVar21;
        e eVar22 = new e("INVEST", 21);
        INVEST = eVar22;
        e eVar23 = new e("JOINT_INVEST", 22);
        JOINT_INVEST = eVar23;
        e eVar24 = new e("CRYPTO", 23);
        CRYPTO = eVar24;
        e eVar25 = new e("CRYPTO_SUBACCOUNT", 24);
        CRYPTO_SUBACCOUNT = eVar25;
        e eVar26 = new e("REV_POINTS", 25);
        REV_POINTS = eVar26;
        e eVar27 = new e("REV_POINTS_SUBACCOUNT", 26);
        REV_POINTS_SUBACCOUNT = eVar27;
        e eVar28 = new e("LINKED", 27);
        LINKED = eVar28;
        e eVar29 = new e("ON_HOLD", 28);
        ON_HOLD = eVar29;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15, eVar16, eVar17, eVar18, eVar19, eVar20, eVar21, eVar22, eVar23, eVar24, eVar25, eVar26, eVar27, eVar28, eVar29};
        $VALUES = eVarArr;
        $ENTRIES = vc.s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
