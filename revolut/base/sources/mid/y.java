package mid;

import com.revolut.feature.rev_points.models.EarningBadge;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f205781c;
    public final String d;
    public final EarningBadge e;
    public final ShopsCampaignOffer f;

    public y(String id10, String title, String subtitle, String logoUrl, EarningBadge earningBadge, ShopsCampaignOffer campaignOffer) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(campaignOffer, "campaignOffer");
        this.f205779a = id10;
        this.f205780b = title;
        this.f205781c = subtitle;
        this.d = logoUrl;
        this.e = earningBadge;
        this.f = campaignOffer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f205779a, yVar.f205779a) && Intrinsics.f(this.f205780b, yVar.f205780b) && Intrinsics.f(this.f205781c, yVar.f205781c) && Intrinsics.f(this.d, yVar.d) && Intrinsics.f(this.e, yVar.e) && Intrinsics.f(this.f, yVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f205779a.hashCode() * 31, 31, this.f205780b), 31, this.f205781c), 31, this.d);
        EarningBadge earningBadge = this.e;
        return this.f.hashCode() + ((iC + (earningBadge == null ? 0 : earningBadge.hashCode())) * 31);
    }
}
