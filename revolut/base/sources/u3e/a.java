package u3e;

import com.revolut.feature.rev_points.exclusive_store.api.navigation.ExclusiveStoreInputData;
import com.revolut.feature.store.api.model.StoreAuctionOffer;
import com.revolut.feature.store.api.model.StoreExclusivesOfferContext;
import com.revolut.feature.store.api.model.StoreLockedProductOffer;
import com.revolut.feature.store.api.model.StoreProductOffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static final ExclusiveStoreInputData a(String str, String str2) {
        return str2 != null ? new ExclusiveStoreInputData.Onboarding(str, new ExclusiveStoreInputData.ArticleReference.ReferenceId(str2)) : new ExclusiveStoreInputData.Checkout(str);
    }

    public static final ExclusiveStoreInputData b(StoreExclusivesOfferContext storeExclusivesOfferContext) {
        Intrinsics.checkNotNullParameter(storeExclusivesOfferContext, "<this>");
        if (storeExclusivesOfferContext instanceof StoreExclusivesOfferContext.SoldOutProduct) {
            return new ExclusiveStoreInputData.SoldOut(((StoreExclusivesOfferContext.SoldOutProduct) storeExclusivesOfferContext).f88516a.f88603a);
        }
        if (storeExclusivesOfferContext instanceof StoreExclusivesOfferContext.ComingSoonProduct) {
            return new ExclusiveStoreInputData.ComingSoon(((StoreExclusivesOfferContext.ComingSoonProduct) storeExclusivesOfferContext).f88513a.f88469a);
        }
        if (storeExclusivesOfferContext instanceof StoreExclusivesOfferContext.Product) {
            StoreProductOffer storeProductOffer = ((StoreExclusivesOfferContext.Product) storeExclusivesOfferContext).f88515a;
            return a(storeProductOffer.f88573a, storeProductOffer.f88574b);
        }
        if (storeExclusivesOfferContext instanceof StoreExclusivesOfferContext.Auction) {
            StoreAuctionOffer storeAuctionOffer = ((StoreExclusivesOfferContext.Auction) storeExclusivesOfferContext).f88512a;
            return a(storeAuctionOffer.f88422a, storeAuctionOffer.d);
        }
        if (!(storeExclusivesOfferContext instanceof StoreExclusivesOfferContext.LockedProduct)) {
            throw new NoWhenBranchMatchedException();
        }
        StoreLockedProductOffer storeLockedProductOffer = ((StoreExclusivesOfferContext.LockedProduct) storeExclusivesOfferContext).f88514a;
        return a(storeLockedProductOffer.f88530a, storeLockedProductOffer.f88531b);
    }
}
