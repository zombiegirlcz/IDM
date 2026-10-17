package j8l;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a COMMODITIES;
    public static final a CREDIT_CARD;
    public static final a CRYPTO;
    public static final a FIAT;
    public static final a FUTURES_COLLATERAL;
    public static final a INVEST_CASH_HOLDING;
    public static final a JOINT;
    public static final a JOINT_INVEST_CASH_HOLDING;
    public static final a JOINT_SAVINGS;
    public static final a JOINT_VAULT;
    public static final a JUNIOR_FIAT;
    public static final a JUNIOR_SAVINGS;
    public static final a JUNIOR_VAULT;
    public static final a PRO;
    public static final a PRO_VAULT;
    public static final a REVX_FIAT;
    public static final a REV_POINTS_POCKET;
    public static final a SAVINGS;
    public static final a SPOT_MARGIN_COLLATERAL;
    public static final a TEEN_FIAT;
    public static final a TEEN_VAULT;
    public static final a VAULT;

    static {
        a aVar = new a("FIAT", 0);
        FIAT = aVar;
        a aVar2 = new a("JOINT", 1);
        JOINT = aVar2;
        a aVar3 = new a("PRO", 2);
        PRO = aVar3;
        a aVar4 = new a("PRO_VAULT", 3);
        PRO_VAULT = aVar4;
        a aVar5 = new a("VAULT", 4);
        VAULT = aVar5;
        a aVar6 = new a("SAVINGS", 5);
        SAVINGS = aVar6;
        a aVar7 = new a("CREDIT_CARD", 6);
        CREDIT_CARD = aVar7;
        a aVar8 = new a("CRYPTO", 7);
        CRYPTO = aVar8;
        a aVar9 = new a("REV_POINTS_POCKET", 8);
        REV_POINTS_POCKET = aVar9;
        a aVar10 = new a("JUNIOR_FIAT", 9);
        JUNIOR_FIAT = aVar10;
        a aVar11 = new a("JUNIOR_VAULT", 10);
        JUNIOR_VAULT = aVar11;
        a aVar12 = new a("JUNIOR_SAVINGS", 11);
        JUNIOR_SAVINGS = aVar12;
        a aVar13 = new a("TEEN_FIAT", 12);
        TEEN_FIAT = aVar13;
        a aVar14 = new a("TEEN_VAULT", 13);
        TEEN_VAULT = aVar14;
        a aVar15 = new a("JOINT_SAVINGS", 14);
        JOINT_SAVINGS = aVar15;
        a aVar16 = new a("JOINT_VAULT", 15);
        JOINT_VAULT = aVar16;
        a aVar17 = new a("REVX_FIAT", 16);
        REVX_FIAT = aVar17;
        a aVar18 = new a("INVEST_CASH_HOLDING", 17);
        INVEST_CASH_HOLDING = aVar18;
        a aVar19 = new a("JOINT_INVEST_CASH_HOLDING", 18);
        JOINT_INVEST_CASH_HOLDING = aVar19;
        a aVar20 = new a("COMMODITIES", 19);
        COMMODITIES = aVar20;
        a aVar21 = new a("SPOT_MARGIN_COLLATERAL", 20);
        SPOT_MARGIN_COLLATERAL = aVar21;
        a aVar22 = new a("FUTURES_COLLATERAL", 21);
        FUTURES_COLLATERAL = aVar22;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22};
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
