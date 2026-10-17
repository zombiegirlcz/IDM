package u2f;

import com.revolut.feature.trade_rev_points.models.TradeRevPointsRate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f276639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f276640c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f276641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TradeRevPointsRate f276642h;
    public final g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f276643j;

    public h(String id10, j product, String name, String description, String logoUrl, String signupUrl, b accountLinkType, TradeRevPointsRate tradeRevPointsRate, g gVar, i membershipIdFormat) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(signupUrl, "signupUrl");
        Intrinsics.checkNotNullParameter(accountLinkType, "accountLinkType");
        Intrinsics.checkNotNullParameter(membershipIdFormat, "membershipIdFormat");
        this.f276638a = id10;
        this.f276639b = product;
        this.f276640c = name;
        this.d = description;
        this.e = logoUrl;
        this.f = signupUrl;
        this.f276641g = accountLinkType;
        this.f276642h = tradeRevPointsRate;
        this.i = gVar;
        this.f276643j = membershipIdFormat;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f276638a, hVar.f276638a) && this.f276639b == hVar.f276639b && Intrinsics.f(this.f276640c, hVar.f276640c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && this.f276641g == hVar.f276641g && Intrinsics.f(this.f276642h, hVar.f276642h) && Intrinsics.f(this.i, hVar.i) && this.f276643j == hVar.f276643j;
    }

    public final int hashCode() {
        int iHashCode = (this.f276641g.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c((this.f276639b.hashCode() + (this.f276638a.hashCode() * 31)) * 31, 31, this.f276640c), 31, this.d), 31, this.e), 31, this.f)) * 31;
        TradeRevPointsRate tradeRevPointsRate = this.f276642h;
        int iHashCode2 = (iHashCode + (tradeRevPointsRate == null ? 0 : tradeRevPointsRate.hashCode())) * 31;
        g gVar = this.i;
        return this.f276643j.hashCode() + ((iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31);
    }
}
