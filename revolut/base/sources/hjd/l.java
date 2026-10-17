package hjd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f152708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f152709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f152710c;
    public final q d;

    public l(w shopsNearbyWidgetListItemMapper, j shopsCombinedHeroCarouselMapper, e shopsCombinedContinueShoppingCarouselMapper, h shopsCombinedFeaturedGridMapper, b shopsCombinedCampaignCarouselMapper, g discoverMoreMapper, x shopsNearbyWidgetStateMapper, b0 shopsTallCarouselMapper, q shopsMyItemsMapper) {
        Intrinsics.checkNotNullParameter(shopsNearbyWidgetListItemMapper, "shopsNearbyWidgetListItemMapper");
        Intrinsics.checkNotNullParameter(shopsCombinedHeroCarouselMapper, "shopsCombinedHeroCarouselMapper");
        Intrinsics.checkNotNullParameter(shopsCombinedContinueShoppingCarouselMapper, "shopsCombinedContinueShoppingCarouselMapper");
        Intrinsics.checkNotNullParameter(shopsCombinedFeaturedGridMapper, "shopsCombinedFeaturedGridMapper");
        Intrinsics.checkNotNullParameter(shopsCombinedCampaignCarouselMapper, "shopsCombinedCampaignCarouselMapper");
        Intrinsics.checkNotNullParameter(discoverMoreMapper, "discoverMoreMapper");
        Intrinsics.checkNotNullParameter(shopsNearbyWidgetStateMapper, "shopsNearbyWidgetStateMapper");
        Intrinsics.checkNotNullParameter(shopsTallCarouselMapper, "shopsTallCarouselMapper");
        Intrinsics.checkNotNullParameter(shopsMyItemsMapper, "shopsMyItemsMapper");
        this.f152708a = shopsNearbyWidgetListItemMapper;
        this.f152709b = shopsCombinedCampaignCarouselMapper;
        this.f152710c = discoverMoreMapper;
        this.d = shopsMyItemsMapper;
    }
}
