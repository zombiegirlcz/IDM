package m1c;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class i1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i1[] $VALUES;
    public static final i1 CREDIT_CARD;
    public static final i1 CRYPTO;
    public static final i1 DONATIONS;
    public static final i1 ESIM;
    public static final i1 EXPERIENCES;
    public static final i1 FAST_TRACK;
    public static final i1 GIFT_CARDS;
    public static final i1 HOTELS_POINTS;
    public static final i1 LOUNGES;
    public static final i1 MILES;
    public static final i1 REVPAY;
    public static final i1 STAYS;
    public static final i1 THEMES;
    public static final i1 TRAINS;
    public static final i1 TRANSPORT;
    public static final i1 VIRTUAL_CARDS;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f201378id;
    private final f1 product;

    static {
        i1 i1Var = new i1("MILES", 0, "WAYS_TO_REDEEM_AIR_MILES_LIST_ID", f1.MILES);
        MILES = i1Var;
        i1 i1Var2 = new i1("CREDIT_CARD", 1, "WAYS_TO_REDEEM_CREDIT_CARD_ID", f1.CREDIT_CARD);
        CREDIT_CARD = i1Var2;
        i1 i1Var3 = new i1("GIFT_CARDS", 2, "WAYS_TO_REDEEM_GIFT_CARDS_ID", f1.GIFT_CARDS);
        GIFT_CARDS = i1Var3;
        i1 i1Var4 = new i1("REVPAY", 3, "REVOLUT_PAY_REDEEM_LIST_ITEM", f1.REVPAY);
        REVPAY = i1Var4;
        i1 i1Var5 = new i1("STAYS", 4, "WAYS_TO_REDEEM_STAYS_LIST_ID", f1.STAYS);
        STAYS = i1Var5;
        i1 i1Var6 = new i1("HOTELS_POINTS", 5, "WAYS_TO_REDEEM_HOTELS_POINTS_LIST_ID", f1.HOTELS_POINTS);
        HOTELS_POINTS = i1Var6;
        i1 i1Var7 = new i1("ESIM", 6, "WAYS_TO_REDEEM_ESIM_ID", f1.ESIM);
        ESIM = i1Var7;
        i1 i1Var8 = new i1("TRAINS", 7, "WAYS_TO_REDEEM_EUROSTAR_ID", f1.TRAINS_POINTS);
        TRAINS = i1Var8;
        i1 i1Var9 = new i1("EXPERIENCES", 8, "WAYS_TO_REDEEM_EXPERIENCES_ID", f1.EXPERIENCES);
        EXPERIENCES = i1Var9;
        i1 i1Var10 = new i1("LOUNGES", 9, "WAYS_TO_REDEEM_LOUNGES_ID", f1.LOUNGES);
        LOUNGES = i1Var10;
        i1 i1Var11 = new i1("FAST_TRACK", 10, "WAYS_TO_REDEEM_FAST_TRACK_ID", f1.FAST_TRACK);
        FAST_TRACK = i1Var11;
        i1 i1Var12 = new i1("TRANSPORT", 11, "WAYS_TO_REDEEM_TRANSPORT_ID", null);
        TRANSPORT = i1Var12;
        i1 i1Var13 = new i1("CRYPTO", 12, "WAYS_TO_REDEEM_CRYPTO_ID", f1.CRYPTO);
        CRYPTO = i1Var13;
        i1 i1Var14 = new i1("DONATIONS", 13, "WAYS_TO_REDEEM_DONATIONS_ID", f1.DONATIONS);
        DONATIONS = i1Var14;
        f1 f1Var = f1.EXCLUSIVE_STORE;
        i1 i1Var15 = new i1("VIRTUAL_CARDS", 14, "WAYS_TO_REDEEM_VIRTUAL_CARDS_ID", f1Var);
        VIRTUAL_CARDS = i1Var15;
        i1 i1Var16 = new i1("THEMES", 15, "WAYS_TO_REDEEM_THEMES_ID", f1Var);
        THEMES = i1Var16;
        i1[] i1VarArr = {i1Var, i1Var2, i1Var3, i1Var4, i1Var5, i1Var6, i1Var7, i1Var8, i1Var9, i1Var10, i1Var11, i1Var12, i1Var13, i1Var14, i1Var15, i1Var16};
        $VALUES = i1VarArr;
        $ENTRIES = vc.s.n(i1VarArr);
    }

    public i1(String str, int i, String str2, f1 f1Var) {
        this.f201378id = str2;
        this.product = f1Var;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static i1 valueOf(String str) {
        return (i1) Enum.valueOf(i1.class, str);
    }

    public static i1[] values() {
        return (i1[]) $VALUES.clone();
    }

    public final f1 b() {
        return this.product;
    }

    public final String getId() {
        return this.f201378id;
    }
}
