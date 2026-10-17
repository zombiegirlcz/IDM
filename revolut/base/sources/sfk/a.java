package sfk;

import efm.r;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import sc7.g;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f262498a;

    public a(t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f262498a = pricingPlanInteractor;
    }

    public final r a() {
        r map = m70.a.g(this.f262498a.q(), null, new sa5.a(20), 1).buffer(2, 1).filter(new g(new se0.a(23), 25)).map(new g(new se0.a(24), 26));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
