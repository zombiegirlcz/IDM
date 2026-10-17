package kjd;

import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsCampaignOffer f184376a;

    public h(ShopsCampaignOffer shopsCampaignDetails) {
        Intrinsics.checkNotNullParameter(shopsCampaignDetails, "shopsCampaignDetails");
        this.f184376a = shopsCampaignDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f184376a.equals(((h) obj2).f184376a);
    }

    public final int hashCode() {
        return this.f184376a.hashCode();
    }
}
