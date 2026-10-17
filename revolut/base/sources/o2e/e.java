package o2e;

import com.revolut.feature.store.api.model.StoreCampaignOffer;
import com.revolut.feature.store.api.model.StoreMegaOffer;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e {
    public static final boolean a(StoreMegaOffer storeMegaOffer, StoreCampaignOffer storeCampaignOffer) {
        StoreMegaOffer.StoreRedeem storeRedeem;
        return (storeMegaOffer == null || (storeRedeem = storeMegaOffer.f88550g) == null || storeRedeem.f88558a == null || storeRedeem.f88559b != null || storeCampaignOffer == null) ? false : true;
    }
}
