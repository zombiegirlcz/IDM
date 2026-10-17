package t2e;

import com.revolut.feature.store.api.model.StoreCampaignOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoreCampaignOffer f267547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StoreCampaignOffer f267548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StoreCampaignOffer f267549c;

    public h() {
        this(null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f267547a, hVar.f267547a) && Intrinsics.f(this.f267548b, hVar.f267548b) && Intrinsics.f(this.f267549c, hVar.f267549c);
    }

    public final int hashCode() {
        StoreCampaignOffer storeCampaignOffer = this.f267547a;
        int iHashCode = (storeCampaignOffer == null ? 0 : storeCampaignOffer.hashCode()) * 31;
        StoreCampaignOffer storeCampaignOffer2 = this.f267548b;
        int iHashCode2 = (iHashCode + (storeCampaignOffer2 == null ? 0 : storeCampaignOffer2.hashCode())) * 31;
        StoreCampaignOffer storeCampaignOffer3 = this.f267549c;
        return iHashCode2 + (storeCampaignOffer3 != null ? storeCampaignOffer3.hashCode() : 0);
    }

    public h(StoreCampaignOffer storeCampaignOffer, StoreCampaignOffer storeCampaignOffer2, StoreCampaignOffer storeCampaignOffer3) {
        this.f267547a = storeCampaignOffer;
        this.f267548b = storeCampaignOffer2;
        this.f267549c = storeCampaignOffer3;
    }
}
