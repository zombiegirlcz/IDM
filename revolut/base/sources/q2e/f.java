package q2e;

import com.revolut.feature.store.api.model.StoreCampaignOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StoreCampaignOffer f241577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StoreCampaignOffer f241578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StoreCampaignOffer f241579c;
    public final StoreCampaignOffer d;
    public final StoreCampaignOffer e;
    public final StoreCampaignOffer f;

    public f() {
        this(null, null, null, null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f241577a, fVar.f241577a) && Intrinsics.f(this.f241578b, fVar.f241578b) && Intrinsics.f(this.f241579c, fVar.f241579c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f);
    }

    public final int hashCode() {
        StoreCampaignOffer storeCampaignOffer = this.f241577a;
        int iHashCode = (storeCampaignOffer == null ? 0 : storeCampaignOffer.hashCode()) * 31;
        StoreCampaignOffer storeCampaignOffer2 = this.f241578b;
        int iHashCode2 = (iHashCode + (storeCampaignOffer2 == null ? 0 : storeCampaignOffer2.hashCode())) * 31;
        StoreCampaignOffer storeCampaignOffer3 = this.f241579c;
        int iHashCode3 = (iHashCode2 + (storeCampaignOffer3 == null ? 0 : storeCampaignOffer3.hashCode())) * 31;
        StoreCampaignOffer storeCampaignOffer4 = this.d;
        int iHashCode4 = (iHashCode3 + (storeCampaignOffer4 == null ? 0 : storeCampaignOffer4.hashCode())) * 31;
        StoreCampaignOffer storeCampaignOffer5 = this.e;
        int iHashCode5 = (iHashCode4 + (storeCampaignOffer5 == null ? 0 : storeCampaignOffer5.hashCode())) * 31;
        StoreCampaignOffer storeCampaignOffer6 = this.f;
        return iHashCode5 + (storeCampaignOffer6 != null ? storeCampaignOffer6.hashCode() : 0);
    }

    public f(StoreCampaignOffer storeCampaignOffer, StoreCampaignOffer storeCampaignOffer2, StoreCampaignOffer storeCampaignOffer3, StoreCampaignOffer storeCampaignOffer4, StoreCampaignOffer storeCampaignOffer5, StoreCampaignOffer storeCampaignOffer6) {
        this.f241577a = storeCampaignOffer;
        this.f241578b = storeCampaignOffer2;
        this.f241579c = storeCampaignOffer3;
        this.d = storeCampaignOffer4;
        this.e = storeCampaignOffer5;
        this.f = storeCampaignOffer6;
    }
}
