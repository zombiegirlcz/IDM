package lde;

import aj0.m0;
import com.revolut.feature.support.api.SupportApi$Toggles$ShowAllTroubleshooters;
import ffk.t;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f194089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f194090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f194091c;

    public n(t pricingPlanInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f194089a = featureToggleInteractor;
        this.f194090b = pricingPlanInteractor;
        this.f194091c = yhm.j.b(new kob.a(this, 25));
    }

    public final k7d.a a() {
        return (k7d.a) this.f194091c.getValue();
    }

    public final boolean b(aj0.a faq) {
        String str;
        Intrinsics.checkNotNullParameter(faq, "faq");
        if (faq instanceof m0) {
            aj0.j jVar = ((m0) faq).e;
            return (jVar == null || (str = jVar.f5358a) == null || !(d0.W(str) ^ true)) ? false : true;
        }
        if (!(faq instanceof aj0.c)) {
            throw new NoWhenBranchMatchedException();
        }
        String str2 = ((aj0.c) faq).f5343g;
        return str2 != null && (d0.W(str2) ^ true);
    }

    public final boolean c() {
        return ((jte.d) this.f194089a).c(SupportApi$Toggles$ShowAllTroubleshooters.f89343a);
    }
}
