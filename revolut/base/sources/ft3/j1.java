package ft3;

import java.io.Serializable;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class j1 implements Serializable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j1[] $VALUES;
    public static final j1 BASIC_CREDIT_CARD;
    public static final j1 BUY_NOW_PAY_LATER;
    public static final j1 CC_FORBEARANCE;
    public static final j1 CREDIT_CARD;
    public static final j1 CREDIT_CARD_LIMIT_DECREASE;
    public static final j1 CREDIT_CARD_LIMIT_INCREASE;

    @NotNull
    public static final i1 Companion;
    public static final j1 FAMILY_CREDIT_CARD;
    public static final j1 FIXED_TERM_CREDIT;
    public static final j1 FTC_FORBEARANCE;
    public static final j1 MORTGAGE;
    public static final j1 MORTGAGE_RENEGOTIATION;
    public static final j1 NON_EMBEDDED_CREDIT_INSURANCE_CC;
    public static final j1 NON_EMBEDDED_CREDIT_INSURANCE_FTC;
    public static final j1 OVERDRAFT;
    public static final j1 POST_TERMINATION_PARTIAL_SETTLEMENTS;
    public static final j1 POST_TERMINATION_REPAYMENT_PLAN;
    public static final j1 REFINANCING_MORTGAGE;

    static {
        j1 j1Var = new j1("CREDIT_CARD", 0);
        CREDIT_CARD = j1Var;
        j1 j1Var2 = new j1("CREDIT_CARD_LIMIT_INCREASE", 1);
        CREDIT_CARD_LIMIT_INCREASE = j1Var2;
        j1 j1Var3 = new j1("CREDIT_CARD_LIMIT_DECREASE", 2);
        CREDIT_CARD_LIMIT_DECREASE = j1Var3;
        j1 j1Var4 = new j1("FAMILY_CREDIT_CARD", 3);
        FAMILY_CREDIT_CARD = j1Var4;
        j1 j1Var5 = new j1("BASIC_CREDIT_CARD", 4);
        BASIC_CREDIT_CARD = j1Var5;
        j1 j1Var6 = new j1("FIXED_TERM_CREDIT", 5);
        FIXED_TERM_CREDIT = j1Var6;
        j1 j1Var7 = new j1("MORTGAGE", 6);
        MORTGAGE = j1Var7;
        j1 j1Var8 = new j1("REFINANCING_MORTGAGE", 7);
        REFINANCING_MORTGAGE = j1Var8;
        j1 j1Var9 = new j1("MORTGAGE_RENEGOTIATION", 8);
        MORTGAGE_RENEGOTIATION = j1Var9;
        j1 j1Var10 = new j1("OVERDRAFT", 9);
        OVERDRAFT = j1Var10;
        j1 j1Var11 = new j1("BUY_NOW_PAY_LATER", 10);
        BUY_NOW_PAY_LATER = j1Var11;
        j1 j1Var12 = new j1("FTC_FORBEARANCE", 11);
        FTC_FORBEARANCE = j1Var12;
        j1 j1Var13 = new j1("CC_FORBEARANCE", 12);
        CC_FORBEARANCE = j1Var13;
        j1 j1Var14 = new j1("POST_TERMINATION_REPAYMENT_PLAN", 13);
        POST_TERMINATION_REPAYMENT_PLAN = j1Var14;
        j1 j1Var15 = new j1("POST_TERMINATION_PARTIAL_SETTLEMENTS", 14);
        POST_TERMINATION_PARTIAL_SETTLEMENTS = j1Var15;
        j1 j1Var16 = new j1("NON_EMBEDDED_CREDIT_INSURANCE_FTC", 15);
        NON_EMBEDDED_CREDIT_INSURANCE_FTC = j1Var16;
        j1 j1Var17 = new j1("NON_EMBEDDED_CREDIT_INSURANCE_CC", 16);
        NON_EMBEDDED_CREDIT_INSURANCE_CC = j1Var17;
        j1[] j1VarArr = {j1Var, j1Var2, j1Var3, j1Var4, j1Var5, j1Var6, j1Var7, j1Var8, j1Var9, j1Var10, j1Var11, j1Var12, j1Var13, j1Var14, j1Var15, j1Var16, j1Var17};
        $VALUES = j1VarArr;
        $ENTRIES = vc.s.n(j1VarArr);
        Companion = new i1();
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static j1 valueOf(String str) {
        return (j1) Enum.valueOf(j1.class, str);
    }

    public static j1[] values() {
        return (j1[]) $VALUES.clone();
    }

    public final boolean b() {
        j1[] elements = {FTC_FORBEARANCE, CC_FORBEARANCE, POST_TERMINATION_REPAYMENT_PLAN, POST_TERMINATION_PARTIAL_SETTLEMENTS, MORTGAGE_RENEGOTIATION, FAMILY_CREDIT_CARD, BASIC_CREDIT_CARD, CREDIT_CARD_LIMIT_INCREASE, CREDIT_CARD_LIMIT_DECREASE};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements).contains(this);
    }
}
