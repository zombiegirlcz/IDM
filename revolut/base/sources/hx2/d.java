package hx2;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e93.f f156360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JuniorBankingProfile f156361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsProduct f156362c;

    public d(e93.f cardDesign, JuniorBankingProfile juniorBankingProfile, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f156360a = cardDesign;
        this.f156361b = juniorBankingProfile;
        this.f156362c = analyticsProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f156360a, dVar.f156360a) && Intrinsics.f(this.f156361b, dVar.f156361b) && Intrinsics.f(this.f156362c, dVar.f156362c);
    }

    public final int hashCode() {
        int iHashCode = this.f156360a.hashCode() * 31;
        JuniorBankingProfile juniorBankingProfile = this.f156361b;
        return this.f156362c.hashCode() + ((iHashCode + (juniorBankingProfile == null ? 0 : juniorBankingProfile.hashCode())) * 31);
    }
}
