package igk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanOfferPrompt.Available f161270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f161271b;

    public s(PricingPlanOfferPrompt.Available offer, r style) {
        Intrinsics.checkNotNullParameter(offer, "offer");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f161270a = offer;
        this.f161271b = style;
    }

    public final PricingPlanOfferPrompt.Available b() {
        return this.f161270a;
    }

    public final r c() {
        return this.f161271b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f161270a, sVar.f161270a) && this.f161271b == sVar.f161271b;
    }

    public final int hashCode() {
        return this.f161271b.hashCode() + (this.f161270a.f102847a.hashCode() * 31);
    }

    public /* synthetic */ s(PricingPlanOfferPrompt.Available available) {
        this(available, r.FULL_SCREEN);
    }
}
