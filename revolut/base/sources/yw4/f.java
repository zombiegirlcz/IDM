package yw4;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f BALANCE_TRANSFER;
    public static final f BILL_PAYMENTS;
    public static final f CASHBACK;
    public static final f CREDIT_LIMIT_CAP;
    public static final f CREDIT_LIMIT_DECREASE;
    public static final f CREDIT_LIMIT_INCREASE_PREFERENCES;

    @NotNull
    public static final e Companion;
    public static final f INSTALMENT_PLAN_VIEW;
    public static final f INTEREST_FREE_INSTALMENT_PLANS;
    public static final f IN_APP_STATEMENT;
    public static final f MAIN_SCREEN_ONGOING_BALANCE;
    public static final f MOVE_MONEY;
    public static final f MSI_SHOPS_VIEW;
    public static final f PAYMENT_OPTION_BOLETO;
    public static final f PAYMENT_OPTION_PSE;
    public static final f PAYMENT_OPTION_SPEI;
    public static final f PAYMENT_SCREEN_V2;
    public static final f POCKET_TRANSFER;
    public static final f POST_PURCHASE_INSTALMENT_PLANS;
    public static final f PREMIUM_FEE_WAIVER;
    public static final f PRE_PURCHASE_INSTALMENT_PLANS;
    public static final f REPAYMENT_WITH_INSTALMENTS;
    public static final f REV_POINTS_MIGRATED;
    public static final f STATEMENT_DEFERRAL_INSTALMENT_PLANS;

    static {
        f fVar = new f("POST_PURCHASE_INSTALMENT_PLANS", 0);
        POST_PURCHASE_INSTALMENT_PLANS = fVar;
        f fVar2 = new f("PRE_PURCHASE_INSTALMENT_PLANS", 1);
        PRE_PURCHASE_INSTALMENT_PLANS = fVar2;
        f fVar3 = new f("STATEMENT_DEFERRAL_INSTALMENT_PLANS", 2);
        STATEMENT_DEFERRAL_INSTALMENT_PLANS = fVar3;
        f fVar4 = new f("INSTALMENT_PLAN_VIEW", 3);
        INSTALMENT_PLAN_VIEW = fVar4;
        f fVar5 = new f("CASHBACK", 4);
        CASHBACK = fVar5;
        f fVar6 = new f("BALANCE_TRANSFER", 5);
        BALANCE_TRANSFER = fVar6;
        f fVar7 = new f("POCKET_TRANSFER", 6);
        POCKET_TRANSFER = fVar7;
        f fVar8 = new f("BILL_PAYMENTS", 7);
        BILL_PAYMENTS = fVar8;
        f fVar9 = new f("IN_APP_STATEMENT", 8);
        IN_APP_STATEMENT = fVar9;
        f fVar10 = new f("PAYMENT_OPTION_BOLETO", 9);
        PAYMENT_OPTION_BOLETO = fVar10;
        f fVar11 = new f("MAIN_SCREEN_ONGOING_BALANCE", 10);
        MAIN_SCREEN_ONGOING_BALANCE = fVar11;
        f fVar12 = new f("MOVE_MONEY", 11);
        MOVE_MONEY = fVar12;
        f fVar13 = new f("REV_POINTS_MIGRATED", 12);
        REV_POINTS_MIGRATED = fVar13;
        f fVar14 = new f("INTEREST_FREE_INSTALMENT_PLANS", 13);
        INTEREST_FREE_INSTALMENT_PLANS = fVar14;
        f fVar15 = new f("CREDIT_LIMIT_DECREASE", 14);
        CREDIT_LIMIT_DECREASE = fVar15;
        f fVar16 = new f("CREDIT_LIMIT_INCREASE_PREFERENCES", 15);
        CREDIT_LIMIT_INCREASE_PREFERENCES = fVar16;
        f fVar17 = new f("PREMIUM_FEE_WAIVER", 16);
        PREMIUM_FEE_WAIVER = fVar17;
        f fVar18 = new f("MSI_SHOPS_VIEW", 17);
        MSI_SHOPS_VIEW = fVar18;
        f fVar19 = new f("CREDIT_LIMIT_CAP", 18);
        CREDIT_LIMIT_CAP = fVar19;
        f fVar20 = new f("PAYMENT_SCREEN_V2", 19);
        PAYMENT_SCREEN_V2 = fVar20;
        f fVar21 = new f("REPAYMENT_WITH_INSTALMENTS", 20);
        REPAYMENT_WITH_INSTALMENTS = fVar21;
        f fVar22 = new f("PAYMENT_OPTION_PSE", 21);
        PAYMENT_OPTION_PSE = fVar22;
        f fVar23 = new f("PAYMENT_OPTION_SPEI", 22);
        PAYMENT_OPTION_SPEI = fVar23;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12, fVar13, fVar14, fVar15, fVar16, fVar17, fVar18, fVar19, fVar20, fVar21, fVar22, fVar23};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
        Companion = new e();
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
