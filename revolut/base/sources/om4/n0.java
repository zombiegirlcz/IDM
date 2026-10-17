package om4;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes22.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final al4.n f226643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dp4.s f226644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ffk.t f226645c;

    public n0(al4.n creditCardInteractor, dp4.s feeWaiverRepository, ffk.t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(feeWaiverRepository, "feeWaiverRepository");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f226643a = creditCardInteractor;
        this.f226644b = feeWaiverRepository;
        this.f226645c = pricingPlanInteractor;
    }

    public static Flow b(n0 n0Var, nl4.d entryPoint) {
        n0Var.getClass();
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return boh.f.e(rd0.e.b(n0Var.f226645c.q()), new ofg.a(entryPoint, n0Var, 23));
    }

    public final cxe.u a(Function1 function1) {
        return n14.k.p(new olf.e(boh.f.e(((x2) this.f226643a).l(w4l.h.f294642c), new ofg.a(this, function1, 25)), 3), new okk.d(26));
    }
}
