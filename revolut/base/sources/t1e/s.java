package t1e;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s ACCESSORIES;
    public static final s BEAUTY;

    @NotNull
    public static final r Companion;
    public static final s DIGITAL;
    public static final s DINING;
    public static final s DISCOUNTS;
    public static final s EARN;
    public static final s EATS;
    public static final s ELECTRONICS;
    public static final s ENTERTAINMENT;
    public static final s ESSENTIALS;
    public static final s EXCLUSIVES;
    public static final s FASHION;
    public static final s GIFTCARDS;
    public static final s HOME;
    public static final s LUXURY;
    public static final s MARKETPLACES;
    public static final s MSI;
    public static final s POINTS_BOOSTER;
    public static final s REDEEM;
    public static final s REVPAY;
    public static final s SHOPPING;
    public static final s SPORTS;
    public static final s TRAVEL;

    @NotNull
    private final q category;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f267270id;

    static {
        q qVar = q.ACTIVITY;
        s sVar = new s("EARN", 0, qVar, "EARN");
        EARN = sVar;
        s sVar2 = new s("REDEEM", 1, qVar, "REDEEM");
        REDEEM = sVar2;
        s sVar3 = new s("DISCOUNTS", 2, qVar, "DISCOUNTS");
        DISCOUNTS = sVar3;
        s sVar4 = new s("MSI", 3, qVar, "MSI");
        MSI = sVar4;
        q qVar2 = q.PRODUCT;
        s sVar5 = new s("POINTS_BOOSTER", 4, qVar2, "POINTS_BOOSTER");
        POINTS_BOOSTER = sVar5;
        s sVar6 = new s("GIFTCARDS", 5, qVar2, "GIFTCARDS");
        GIFTCARDS = sVar6;
        s sVar7 = new s("REVPAY", 6, qVar2, "REVPAY");
        REVPAY = sVar7;
        s sVar8 = new s("EXCLUSIVES", 7, qVar2, "EXCLUSIVES");
        EXCLUSIVES = sVar8;
        q qVar3 = q.CATEGORY;
        s sVar9 = new s("MARKETPLACES", 8, qVar3, "MARKETPLACES");
        MARKETPLACES = sVar9;
        s sVar10 = new s("DINING", 9, qVar3, "DINING");
        DINING = sVar10;
        s sVar11 = new s("TRAVEL", 10, qVar3, "TRAVEL");
        TRAVEL = sVar11;
        s sVar12 = new s("FASHION", 11, qVar3, "FASHION");
        FASHION = sVar12;
        s sVar13 = new s("ELECTRONICS", 12, qVar3, "ELECTRONICS");
        ELECTRONICS = sVar13;
        s sVar14 = new s("SPORTS", 13, qVar3, "SPORTS");
        SPORTS = sVar14;
        s sVar15 = new s("EATS", 14, qVar3, "EATS");
        EATS = sVar15;
        s sVar16 = new s("SHOPPING", 15, qVar3, "SHOPPING");
        SHOPPING = sVar16;
        s sVar17 = new s("BEAUTY", 16, qVar3, "BEAUTY");
        BEAUTY = sVar17;
        s sVar18 = new s("HOME", 17, qVar3, "HOME");
        HOME = sVar18;
        s sVar19 = new s("ACCESSORIES", 18, qVar3, "ACCESSORIES");
        ACCESSORIES = sVar19;
        s sVar20 = new s("DIGITAL", 19, qVar3, "DIGITAL");
        DIGITAL = sVar20;
        s sVar21 = new s("LUXURY", 20, qVar3, "LUXURY");
        LUXURY = sVar21;
        s sVar22 = new s("ENTERTAINMENT", 21, qVar3, "ENTERTAINMENT");
        ENTERTAINMENT = sVar22;
        s sVar23 = new s("ESSENTIALS", 22, qVar3, "ESSENTIALS");
        ESSENTIALS = sVar23;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9, sVar10, sVar11, sVar12, sVar13, sVar14, sVar15, sVar16, sVar17, sVar18, sVar19, sVar20, sVar21, sVar22, sVar23};
        $VALUES = sVarArr;
        $ENTRIES = vc.s.n(sVarArr);
        Companion = new r();
    }

    public s(String str, int i, q qVar, String str2) {
        this.category = qVar;
        this.f267270id = str2;
    }

    public static EnumEntries b() {
        return $ENTRIES;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }

    public final q a() {
        return this.category;
    }

    public final String c() {
        return com.google.android.gms.internal.mlkit_vision_face.a.o(this.category.b(), ":", this.f267270id);
    }

    public final String getId() {
        return this.f267270id;
    }
}
