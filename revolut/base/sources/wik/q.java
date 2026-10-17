package wik;

import com.revolut.retail.feature.pricing_plans.ui.impl.interactor.terms.PricingPlanTerms;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.z;

/* JADX INFO: loaded from: classes11.dex */
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pre.c f297930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f297931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f297932c;

    public q(pre.c termsInteractor, ang.f userInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f297930a = termsInteractor;
        this.f297931b = userInteractor;
        this.f297932c = featureToggleInteractor;
    }

    public final z a() {
        sfm.b bVar = new sfm.b(this.f297931b.f(false), new wf6.o(15, new o(this, 0)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        d0 d0VarFirstOrError = m70.a.g(bVar, null, new wf0.b(15), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return ue0.e.F(d0VarFirstOrError, new PricingPlanTerms("https://www.revolut.com/legal/paid-plans", null, null));
    }
}
