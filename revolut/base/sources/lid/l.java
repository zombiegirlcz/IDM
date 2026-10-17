package lid;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l AUCTION_HERO_TILE;
    public static final l AUCTION_TILE;
    public static final l BID_TILE;
    public static final l CAMPAIGN_HERO_TILE;
    public static final l CAMPAIGN_TILE;

    @NotNull
    public static final k Companion;
    public static final l DEEPLINK_TILE;
    public static final l FROZEN_HERO_TILE;
    public static final l FROZEN_TILE;
    public static final l LOCKED_HERO_TILE;
    public static final l LOCKED_TILE;
    public static final l PRODUCT_HERO_TILE;
    public static final l PRODUCT_TILE;
    public static final l PURCHASE_TILE;
    public static final l SOLD_OUT_HERO_TILE;
    public static final l SOLD_OUT_TILE;
    public static final l UNKNOWN_TILE;
    public static final l WAITLIST_HERO_TILE;
    public static final l WAITLIST_TILE;

    @NotNull
    private final String key;

    static {
        l lVar = new l("CAMPAIGN_TILE", 0, "CAMPAIGN_TILE");
        CAMPAIGN_TILE = lVar;
        l lVar2 = new l("CAMPAIGN_HERO_TILE", 1, "CAMPAIGN_HERO_TILE");
        CAMPAIGN_HERO_TILE = lVar2;
        l lVar3 = new l("DEEPLINK_TILE", 2, "DEEPLINK_TILE");
        DEEPLINK_TILE = lVar3;
        l lVar4 = new l("FROZEN_TILE", 3, "FROZEN_TILE");
        FROZEN_TILE = lVar4;
        l lVar5 = new l("FROZEN_HERO_TILE", 4, "FROZEN_HERO_TILE");
        FROZEN_HERO_TILE = lVar5;
        l lVar6 = new l("WAITLIST_HERO_TILE", 5, "EXCLUSIVE_STORE_COMING_SOON_HERO_TILE");
        WAITLIST_HERO_TILE = lVar6;
        l lVar7 = new l("LOCKED_HERO_TILE", 6, "EXCLUSIVE_STORE_LOCKED_HERO_TILE");
        LOCKED_HERO_TILE = lVar7;
        l lVar8 = new l("SOLD_OUT_HERO_TILE", 7, "EXCLUSIVE_STORE_SOLD_OUT_HERO_TILE");
        SOLD_OUT_HERO_TILE = lVar8;
        l lVar9 = new l("PRODUCT_HERO_TILE", 8, "EXCLUSIVE_STORE_PRODUCT_HERO_TILE");
        PRODUCT_HERO_TILE = lVar9;
        l lVar10 = new l("PRODUCT_TILE", 9, "EXCLUSIVE_STORE_PRODUCT_TILE");
        PRODUCT_TILE = lVar10;
        l lVar11 = new l("WAITLIST_TILE", 10, "EXCLUSIVE_STORE_COMING_SOON_TILE");
        WAITLIST_TILE = lVar11;
        l lVar12 = new l("SOLD_OUT_TILE", 11, "EXCLUSIVE_STORE_SOLD_OUT_TILE");
        SOLD_OUT_TILE = lVar12;
        l lVar13 = new l("LOCKED_TILE", 12, "EXCLUSIVE_STORE_LOCKED_TILE");
        LOCKED_TILE = lVar13;
        l lVar14 = new l("AUCTION_HERO_TILE", 13, "EXCLUSIVE_STORE_AUCTION_HERO_TILE");
        AUCTION_HERO_TILE = lVar14;
        l lVar15 = new l("AUCTION_TILE", 14, "EXCLUSIVE_STORE_AUCTION_TILE");
        AUCTION_TILE = lVar15;
        l lVar16 = new l("PURCHASE_TILE", 15, "PURCHASE_TILE");
        PURCHASE_TILE = lVar16;
        l lVar17 = new l("BID_TILE", 16, "BID_TILE");
        BID_TILE = lVar17;
        l lVar18 = new l("UNKNOWN_TILE", 17, "UNKNOWN_TILE");
        UNKNOWN_TILE = lVar18;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar11, lVar12, lVar13, lVar14, lVar15, lVar16, lVar17, lVar18};
        $VALUES = lVarArr;
        $ENTRIES = s.n(lVarArr);
        Companion = new k();
    }

    public l(String str, int i, String str2) {
        this.key = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }

    public final String b() {
        return this.key;
    }
}
