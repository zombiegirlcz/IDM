package blk;

import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.pricingplans.models.PricingPlanUpdateSource;
import iha.b;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanSubscription f16735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f16736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16737c;
    public final PricingPlanUpdateSource d;
    public final DateTime e;

    public a(PricingPlanSubscription subscriptionBeforeDowngrade, b downgradeSurvey, boolean z, PricingPlanUpdateSource pricingPlanUpdateSource, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(subscriptionBeforeDowngrade, "subscriptionBeforeDowngrade");
        Intrinsics.checkNotNullParameter(downgradeSurvey, "downgradeSurvey");
        this.f16735a = subscriptionBeforeDowngrade;
        this.f16736b = downgradeSurvey;
        this.f16737c = z;
        this.d = pricingPlanUpdateSource;
        this.e = dateTime;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f16735a, aVar.f16735a) && Intrinsics.f(this.f16736b, aVar.f16736b) && this.f16737c == aVar.f16737c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f16736b.hashCode() + (this.f16735a.hashCode() * 31)) * 31, 31, this.f16737c);
        PricingPlanUpdateSource pricingPlanUpdateSource = this.d;
        int iHashCode = (iC + (pricingPlanUpdateSource == null ? 0 : pricingPlanUpdateSource.hashCode())) * 31;
        DateTime dateTime = this.e;
        return iHashCode + (dateTime != null ? dateTime.hashCode() : 0);
    }
}
