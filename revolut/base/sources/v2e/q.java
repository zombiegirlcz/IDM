package v2e;

import com.revolut.feature.store.api.model.StoreCampaignOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoreCampaignOffer f285724a;

    public q() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f285724a, ((q) obj2).f285724a);
    }

    public final int hashCode() {
        StoreCampaignOffer storeCampaignOffer = this.f285724a;
        if (storeCampaignOffer == null) {
            return 0;
        }
        return storeCampaignOffer.hashCode();
    }

    public q(StoreCampaignOffer storeCampaignOffer) {
        this.f285724a = storeCampaignOffer;
    }
}
