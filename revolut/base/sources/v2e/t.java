package v2e;

import com.revolut.feature.store.api.model.StoreCampaignOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoreCampaignOffer f285727a;

    public t(StoreCampaignOffer campaign) {
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        this.f285727a = campaign;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f285727a, ((t) obj2).f285727a);
    }

    public final int hashCode() {
        return this.f285727a.hashCode();
    }
}
