package ggk;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class g0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g0[] $VALUES;
    public static final g0 AIRPORT_LOUNGES;
    public static final g0 ATM;
    public static final g0 CARDS;
    public static final g0 COMMODITIES;
    public static final g0 CONCIERGE_ALBERTINE;
    public static final g0 CREDIT_CARD;
    public static final g0 CREDIT_CARD_OFFER_BENEFITS;
    public static final g0 CRYPTO;
    public static final g0 DEFAULT;
    public static final g0 EASY_DOWNGRADE;
    public static final g0 FREE_ESIM_DATA_PLAN;
    public static final g0 FX;
    public static final g0 GLOBAL_MONEY_TRANSFERS;
    public static final g0 INSURANCE;
    public static final g0 ONBOARDING;
    public static final g0 ONBOARDING_CARDS_UPGRADE;
    public static final g0 ONBOARDING_CREDIT;
    public static final g0 ONBOARDING_FAMILY;
    public static final g0 PRIVATE_BANKING;
    public static final g0 REVOLUT_PRO;
    public static final g0 REV_POINTS;
    public static final g0 SALARY_HUB;
    public static final g0 SAVINGS;
    public static final g0 STOCKS;
    public static final g0 SWITCH_TO_FAMILY;
    public static final g0 YOUTH;

    @NotNull
    private final String entryName;

    static {
        g0 g0Var = new g0("AIRPORT_LOUNGES", 0, "airport_lounges");
        AIRPORT_LOUNGES = g0Var;
        g0 g0Var2 = new g0("ATM", 1, "atm");
        ATM = g0Var2;
        g0 g0Var3 = new g0("CARDS", 2, "cards");
        CARDS = g0Var3;
        g0 g0Var4 = new g0("COMMODITIES", 3, "commodities");
        COMMODITIES = g0Var4;
        g0 g0Var5 = new g0("CONCIERGE_ALBERTINE", 4, "concierge_albertine");
        CONCIERGE_ALBERTINE = g0Var5;
        g0 g0Var6 = new g0("CREDIT_CARD", 5, "credit_card");
        CREDIT_CARD = g0Var6;
        g0 g0Var7 = new g0("CREDIT_CARD_OFFER_BENEFITS", 6, "credit_card_offer_benefits");
        CREDIT_CARD_OFFER_BENEFITS = g0Var7;
        g0 g0Var8 = new g0("CRYPTO", 7, "crypto");
        CRYPTO = g0Var8;
        g0 g0Var9 = new g0("DEFAULT", 8, "default");
        DEFAULT = g0Var9;
        g0 g0Var10 = new g0("EASY_DOWNGRADE", 9, "easy_downgrade");
        EASY_DOWNGRADE = g0Var10;
        g0 g0Var11 = new g0("FREE_ESIM_DATA_PLAN", 10, "free_esim_data_plan");
        FREE_ESIM_DATA_PLAN = g0Var11;
        g0 g0Var12 = new g0("FX", 11, "fx");
        FX = g0Var12;
        g0 g0Var13 = new g0("GLOBAL_MONEY_TRANSFERS", 12, "global_money_transfers");
        GLOBAL_MONEY_TRANSFERS = g0Var13;
        g0 g0Var14 = new g0("INSURANCE", 13, "insurance");
        INSURANCE = g0Var14;
        g0 g0Var15 = new g0("ONBOARDING", 14, "onboarding");
        ONBOARDING = g0Var15;
        g0 g0Var16 = new g0("ONBOARDING_CARDS_UPGRADE", 15, "cards_upgrade_onboarding");
        ONBOARDING_CARDS_UPGRADE = g0Var16;
        g0 g0Var17 = new g0("ONBOARDING_CREDIT", 16, "onboarding_credit");
        ONBOARDING_CREDIT = g0Var17;
        g0 g0Var18 = new g0("ONBOARDING_FAMILY", 17, "onboarding_family");
        ONBOARDING_FAMILY = g0Var18;
        g0 g0Var19 = new g0("PRIVATE_BANKING", 18, "private_banking");
        PRIVATE_BANKING = g0Var19;
        g0 g0Var20 = new g0("REVOLUT_PRO", 19, "revolut_pro");
        REVOLUT_PRO = g0Var20;
        g0 g0Var21 = new g0("REV_POINTS", 20, "rev_points");
        REV_POINTS = g0Var21;
        g0 g0Var22 = new g0("SALARY_HUB", 21, "salary_hub");
        SALARY_HUB = g0Var22;
        g0 g0Var23 = new g0("SAVINGS", 22, "savings");
        SAVINGS = g0Var23;
        g0 g0Var24 = new g0("STOCKS", 23, "stocks");
        STOCKS = g0Var24;
        g0 g0Var25 = new g0("SWITCH_TO_FAMILY", 24, "switch_to_family");
        SWITCH_TO_FAMILY = g0Var25;
        g0 g0Var26 = new g0("YOUTH", 25, "youth");
        YOUTH = g0Var26;
        g0[] g0VarArr = {g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7, g0Var8, g0Var9, g0Var10, g0Var11, g0Var12, g0Var13, g0Var14, g0Var15, g0Var16, g0Var17, g0Var18, g0Var19, g0Var20, g0Var21, g0Var22, g0Var23, g0Var24, g0Var25, g0Var26};
        $VALUES = g0VarArr;
        $ENTRIES = vc.s.n(g0VarArr);
    }

    public g0(String str, int i, String str2) {
        this.entryName = str2;
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) $VALUES.clone();
    }

    public final String a() {
        return this.entryName;
    }
}
