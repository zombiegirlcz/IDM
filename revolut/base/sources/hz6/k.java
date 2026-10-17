package hz6;

import cli.n;
import cli.y;
import et6.y1;
import hcj.o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends oki.h implements dli.b {
    public final y1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final oz6.a f157049p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z1 f157050q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f157051r;

    public k(n stateMapper, y1 freelancerOnboardingInteractor, oz6.a freelancerOnboardingProgressDelegate) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(freelancerOnboardingInteractor, "freelancerOnboardingInteractor");
        Intrinsics.checkNotNullParameter(freelancerOnboardingProgressDelegate, "freelancerOnboardingProgressDelegate");
        this.o = freelancerOnboardingInteractor;
        this.f157049p = freelancerOnboardingProgressDelegate;
        z1 z1VarB = q.b(0, 6, null);
        z1VarB.k(Unit.f186387a);
        this.f157050q = z1VarB;
        this.f157051r = mra.d.b(this, new e(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f157050q, new o(continuation, this, 14)), null, null, new hp2.d(this, continuation, 23), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f157051r;
    }
}
