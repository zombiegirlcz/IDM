package wok;

import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistEntry;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PricingPlanWaitlistEntry f298954b;

    public /* synthetic */ l(PricingPlanWaitlistEntry pricingPlanWaitlistEntry, int i) {
        this.f298953a = i;
        this.f298954b = pricingPlanWaitlistEntry;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f298953a) {
            case 0:
                gok.f it8 = (gok.f) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new Pair(this.f298954b, it8);
            default:
                return yna.a.a((yna.a) obj2, null, null, null, null, null, null, null, false, false, null, false, this.f298954b, null, null, null, 61439);
        }
    }
}
