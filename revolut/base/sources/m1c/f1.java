package m1c;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class f1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f1[] $VALUES;
    public static final f1 CHALLENGES;
    public static final f1 CREDIT_CARD;
    public static final f1 CRYPTO;
    public static final f1 DAILY_REWARD;
    public static final f1 DONATIONS;
    public static final f1 ESIM;
    public static final f1 EXCLUSIVE_STORE;
    public static final f1 EXPERIENCES;
    public static final f1 FAST_TRACK;
    public static final f1 GIFT_CARDS;
    public static final f1 HOTELS_POINTS;
    public static final f1 LOUNGES;
    public static final f1 MILES;
    public static final f1 ONE_OFF_PURCHASE;
    public static final f1 RECURRING_PAYMENTS;
    public static final f1 RECURRING_PURCHASE;
    public static final f1 REVOLUT_CARD;
    public static final f1 REVPAY;
    public static final f1 REVPOINTS_POCKET;
    public static final f1 REWARDS;
    public static final f1 SHOPS;
    public static final f1 SPARE_CHANGE;
    public static final f1 STAYS;
    public static final f1 TRAINS_POINTS;
    public static final f1 UNKNOWN;

    static {
        f1 f1Var = new f1("STAYS", 0);
        STAYS = f1Var;
        f1 f1Var2 = new f1("EXPERIENCES", 1);
        EXPERIENCES = f1Var2;
        f1 f1Var3 = new f1("MILES", 2);
        MILES = f1Var3;
        f1 f1Var4 = new f1("SHOPS", 3);
        SHOPS = f1Var4;
        f1 f1Var5 = new f1("REWARDS", 4);
        REWARDS = f1Var5;
        f1 f1Var6 = new f1("REVOLUT_CARD", 5);
        REVOLUT_CARD = f1Var6;
        f1 f1Var7 = new f1("CHALLENGES", 6);
        CHALLENGES = f1Var7;
        f1 f1Var8 = new f1("REVPAY", 7);
        REVPAY = f1Var8;
        f1 f1Var9 = new f1("SPARE_CHANGE", 8);
        SPARE_CHANGE = f1Var9;
        f1 f1Var10 = new f1("REVPOINTS_POCKET", 9);
        REVPOINTS_POCKET = f1Var10;
        f1 f1Var11 = new f1("DAILY_REWARD", 10);
        DAILY_REWARD = f1Var11;
        f1 f1Var12 = new f1("GIFT_CARDS", 11);
        GIFT_CARDS = f1Var12;
        f1 f1Var13 = new f1("CREDIT_CARD", 12);
        CREDIT_CARD = f1Var13;
        f1 f1Var14 = new f1("DONATIONS", 13);
        DONATIONS = f1Var14;
        f1 f1Var15 = new f1("ESIM", 14);
        ESIM = f1Var15;
        f1 f1Var16 = new f1("ONE_OFF_PURCHASE", 15);
        ONE_OFF_PURCHASE = f1Var16;
        f1 f1Var17 = new f1("RECURRING_PURCHASE", 16);
        RECURRING_PURCHASE = f1Var17;
        f1 f1Var18 = new f1("LOUNGES", 17);
        LOUNGES = f1Var18;
        f1 f1Var19 = new f1("EXCLUSIVE_STORE", 18);
        EXCLUSIVE_STORE = f1Var19;
        f1 f1Var20 = new f1("FAST_TRACK", 19);
        FAST_TRACK = f1Var20;
        f1 f1Var21 = new f1("HOTELS_POINTS", 20);
        HOTELS_POINTS = f1Var21;
        f1 f1Var22 = new f1("TRAINS_POINTS", 21);
        TRAINS_POINTS = f1Var22;
        f1 f1Var23 = new f1("CRYPTO", 22);
        CRYPTO = f1Var23;
        f1 f1Var24 = new f1("RECURRING_PAYMENTS", 23);
        RECURRING_PAYMENTS = f1Var24;
        f1 f1Var25 = new f1("UNKNOWN", 24);
        UNKNOWN = f1Var25;
        f1[] f1VarArr = {f1Var, f1Var2, f1Var3, f1Var4, f1Var5, f1Var6, f1Var7, f1Var8, f1Var9, f1Var10, f1Var11, f1Var12, f1Var13, f1Var14, f1Var15, f1Var16, f1Var17, f1Var18, f1Var19, f1Var20, f1Var21, f1Var22, f1Var23, f1Var24, f1Var25};
        $VALUES = f1VarArr;
        $ENTRIES = vc.s.n(f1VarArr);
    }

    public static f1 valueOf(String str) {
        return (f1) Enum.valueOf(f1.class, str);
    }

    public static f1[] values() {
        return (f1[]) $VALUES.clone();
    }
}
