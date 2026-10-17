package cid;

import com.revolut.feature.cashback.api.navigation.YourCashbackFeatureConfig;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig$AuctionBid$Destination;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig$CampaignCheckout$ModalDestination;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig$CarouselDetails$Destination;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig$PersonalizedOffersFullscreen$Destination;
import com.revolut.feature.shops.api.model.ShopsShortCampaignInfo;
import com.revolut.feature.shops.api.navigation.AdsFullScreenPromptType;
import com.revolut.kompot.common.ParcelableDestination;
import h4g.g;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements xii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f24446a;

    public b(g shopsFeatureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        this.f24446a = shopsFeatureAvailabilityInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.feature.rev10_main_screen.api.AppStarterDestination b(ytb.b r14) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cid.b.b(ytb.b):com.revolut.feature.rev10_main_screen.api.AppStarterDestination");
    }

    @Override // xii.b
    public final Set a() {
        String[] elements = {"shops", "offers", "shops/checkout", "shops/checkout/{campaignId}", "shops/campaign/{campaignId}", "shops/cashback", "shops/explore", "shops/carousel", "ads/consents/third-party-targeting-fullscreen", "auctions/{auctionId}"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d.y0(elements);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        String strD;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (!this.f24446a.b()) {
            return null;
        }
        ytb.b bVar = new ytb.b(deeplink);
        String strC = bVar.c(0);
        switch (strC.hashCode()) {
            case -1019793001:
                if (strC.equals("offers")) {
                    return b(bVar);
                }
                return null;
            case 96432:
                if (!strC.equals("ads") || !Intrinsics.f(bVar.c(2), "third-party-targeting-fullscreen")) {
                    return null;
                }
                String strE = bVar.e("utm_source");
                if (strE == null) {
                    strE = "";
                }
                return ytb.b.f(bVar, new ShopsFeatureConfig$PersonalizedOffersFullscreen$Destination(strE, u.c(new AdsFullScreenPromptType.AdsPersonalizedOffers(false))));
            case 109413437:
                if (!strC.equals("shops")) {
                    return null;
                }
                String strC2 = bVar.c(1);
                switch (strC2.hashCode()) {
                    case -1309148525:
                        if (strC2.equals("explore")) {
                            return ytb.b.f(bVar, new ShopsFeatureConfig.Home.Destination(bVar.e("categoryId"), 2));
                        }
                        break;
                    case -139919088:
                        if (strC2.equals("campaign")) {
                            String strD2 = bVar.d("campaignId");
                            String strE2 = bVar.e("analytics_ref");
                            if (strD2 == null) {
                                return b(bVar);
                            }
                            String strE3 = bVar.e("launch_source_key");
                            if (strE3 == null && (strE3 = bVar.e("utm_source")) == null) {
                                strE3 = whd.a.Deeplink.a();
                            }
                            return ytb.b.f(bVar, new ShopsFeatureConfig$CampaignCheckout$ModalDestination(new ShopsShortCampaignInfo(strD2, strE3, strE2)));
                        }
                        break;
                    case 2908512:
                        if (strC2.equals("carousel")) {
                            String strE4 = bVar.e("carouselId");
                            String strE5 = bVar.e("carouselTitle");
                            return (strE4 == null || strE5 == null) ? b(bVar) : ytb.b.f(bVar, new ShopsFeatureConfig$CarouselDetails$Destination(strE4, strE5));
                        }
                        break;
                    case 24489626:
                        if (strC2.equals("cashback")) {
                            return ytb.b.f(bVar, new YourCashbackFeatureConfig.ProductDestination(uc3.d.SHOPPING, true));
                        }
                        break;
                    case 1536904518:
                        if (strC2.equals("checkout")) {
                            String strD3 = bVar.d("campaignId");
                            if (strD3 == null) {
                                strD3 = bVar.e("campaignId");
                            }
                            String strE6 = bVar.e("analytics_ref");
                            if (strD3 == null) {
                                return b(bVar);
                            }
                            String strE7 = bVar.e("launch_source_key");
                            if (strE7 == null && (strE7 = bVar.e("utm_source")) == null) {
                                strE7 = whd.a.Deeplink.a();
                            }
                            return ytb.b.f(bVar, new ShopsFeatureConfig$CampaignCheckout$ModalDestination(new ShopsShortCampaignInfo(strD3, strE7, strE6)));
                        }
                        break;
                }
                return b(bVar);
            case 957278864:
                if (strC.equals("auctions") && (strD = bVar.d("auctionId")) != null) {
                    return ytb.b.f(bVar, new ShopsFeatureConfig$AuctionBid$Destination(strD, bVar.e("productArticleId")));
                }
                return null;
            default:
                return null;
        }
    }
}
