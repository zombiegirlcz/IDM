package ffk;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pfk.y f134834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f134835b;

    public j(pfk.y repository, t pricingPlanInteractor, i comparator) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        this.f134834a = repository;
        this.f134835b = pricingPlanInteractor;
    }

    public final efm.r a(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        return nim.a.w(((pfk.c0) this.f134834a).d.f(Unit.f186387a, false), new f9g.l(planId, 8));
    }

    public final efm.r b(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        pfk.c0 c0Var = (pfk.c0) this.f134834a;
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return c0Var.d.e(Unit.f186387a, loadingStrategy);
    }
}
