package et6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l2 implements gr6.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zjh.c f129267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f129268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft6.s f129269c;

    public l2(zjh.c pricingPlanInteractor, ang.f userInteractor, ft6.s mapper) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f129267a = pricingPlanInteractor;
        this.f129268b = userInteractor;
        this.f129269c = mapper;
    }

    public final akg.n a() {
        return nim.a.v(zh9.u0.m(this.f129267a.k(w4l.h.f294642c), rd0.e.b(this.f129268b.k(false))), new eq4.g(this, 27));
    }
}
