package aha;

import com.revolut.feature.pricing_plans.upgrade_prompt.api.PricingPlanUpgradeEntryPointApi$Toggles;
import jte.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mga.c0;
import mga.d0;
import mga.e;
import mga.h;
import mga.i;
import mga.j;
import mga.k;
import mga.l;
import mga.q;
import mga.t;
import mga.w;
import mga.x;
import mga.y;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {
    public static final boolean a(gte.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        d dVar = (d) aVar;
        return dVar.c(PricingPlanUpgradeEntryPointApi$Toggles.RevampedPremiumContextualBanners.f80974c) || dVar.c(PricingPlanUpgradeEntryPointApi$Toggles.RevampedPremiumContextualBannersPt2.f80975c) || dVar.c(PricingPlanUpgradeEntryPointApi$Toggles.RevampedPremiumContextualBannersPt2Crypto.f80976c);
    }

    public static final boolean b(gte.a aVar, d0 context) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if ((context instanceof e) || (context instanceof q) || (context instanceof c0) || (context instanceof h) || (context instanceof t) || (context instanceof w) || (context instanceof x)) {
            return ((d) aVar).c(PricingPlanUpgradeEntryPointApi$Toggles.RevampedPremiumContextualBanners.f80974c);
        }
        if ((context instanceof y) || (context instanceof mga.d)) {
            return ((d) aVar).c(PricingPlanUpgradeEntryPointApi$Toggles.RevampedPremiumContextualBannersPt2.f80975c);
        }
        if (context instanceof k) {
            return ((d) aVar).c(PricingPlanUpgradeEntryPointApi$Toggles.RevampedPremiumContextualBannersPt2Crypto.f80976c);
        }
        if ((context instanceof j) || (context instanceof l) || (context instanceof i)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
