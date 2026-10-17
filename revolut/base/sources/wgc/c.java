package wgc;

import ffk.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final igc.a f297304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f297305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sfk.a f297306c;
    public final lfm.c d;
    public final e0m.b e;

    public c(igc.a subscriptionsSearchRepository, t pricingPlanInteractor, sfk.a pricingPlanChangeObservable, lfm.c appCompositeDisposable) {
        Intrinsics.checkNotNullParameter(subscriptionsSearchRepository, "subscriptionsSearchRepository");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanChangeObservable, "pricingPlanChangeObservable");
        Intrinsics.checkNotNullParameter(appCompositeDisposable, "appCompositeDisposable");
        this.f297304a = subscriptionsSearchRepository;
        this.f297305b = pricingPlanInteractor;
        this.f297306c = pricingPlanChangeObservable;
        this.d = appCompositeDisposable;
        this.e = new e0m.b(new vt3.a(this, 20));
    }
}
