package hyk;

import com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OnboardingPart f156885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f156886c;

    public b(String portfolioId, OnboardingPart onboardingPart, String str) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f156884a = portfolioId;
        this.f156885b = onboardingPart;
        this.f156886c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f156884a, bVar.f156884a) && Intrinsics.f(this.f156885b, bVar.f156885b) && Intrinsics.f(this.f156886c, bVar.f156886c);
    }

    public final int hashCode() {
        int iHashCode = this.f156884a.hashCode() * 31;
        OnboardingPart onboardingPart = this.f156885b;
        int iHashCode2 = (iHashCode + (onboardingPart == null ? 0 : onboardingPart.hashCode())) * 31;
        String str = this.f156886c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
