package rf3;

import efm.r;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import n30.x;
import raf.o;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f253680a;

    public e(t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f253680a = pricingPlanInteractor;
    }

    @Override // n30.x
    public final r a() {
        return nim.a.w(this.f253680a.q(), new o(this, 15));
    }
}
