package g0c;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m1c.h1;

/* JADX INFO: loaded from: classes6.dex */
public final class v implements c0c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p8g.c f139447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eub.a f139448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0c.a f139449c;

    public v(p8g.c travelHotelsFeatureInteractor, eub.a revPointsAvailabilityInteractor, h0c.a productItemFactory) {
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(productItemFactory, "productItemFactory");
        this.f139447a = travelHotelsFeatureInteractor;
        this.f139448b = revPointsAvailabilityInteractor;
        this.f139449c = productItemFactory;
    }

    @Override // c0c.b
    public final Flow a(h1 h1Var) {
        return new e(new t38.e(rd0.e.b(((i9g.v) this.f139447a).d()), 24, new go.g(Boolean.valueOf(((nyb.b) this.f139448b).a("STAYS.redeem_revpoint_on_paying_now")), 2), new au6.u(3, 3, (Continuation) null)), this, h1Var, 10);
    }
}
