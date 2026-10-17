package f88;

import fmc.c0;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.n;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f132750l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f132751m;

    public f(bte.a appTipsBinding) {
        Intrinsics.checkNotNullParameter(appTipsBinding, "appTipsBinding");
        this.f132751m = appTipsBinding;
    }

    @Override // yji.n
    public void D2() {
        switch (this.f132750l) {
            case 4:
                ((bte.a) this.f132751m).start();
                break;
        }
    }

    @Override // yji.n
    public void H2() {
        switch (this.f132750l) {
            case 1:
                ae6.c cVar = (ae6.c) ((yd6.d) this.f132751m);
                n.l2(this, q.Q(cVar.d, new a72.k(cVar, null, 2)), null, new he6.a(this, null), 3);
                break;
            case 3:
                n.l2(this, ((p46.d) this.f132751m).f232838a, null, new o46.a(this, null), 3);
                break;
        }
    }

    public f(ejh.b onboardingNavigationCommandFactory) {
        Intrinsics.checkNotNullParameter(onboardingNavigationCommandFactory, "onboardingNavigationCommandFactory");
        this.f132751m = onboardingNavigationCommandFactory;
    }

    public f(c0 roboSpareChangeFeatureCommandFactory) {
        Intrinsics.checkNotNullParameter(roboSpareChangeFeatureCommandFactory, "roboSpareChangeFeatureCommandFactory");
        this.f132751m = roboSpareChangeFeatureCommandFactory;
    }

    public f(p46.d eventObserver) {
        Intrinsics.checkNotNullParameter(eventObserver, "eventObserver");
        this.f132751m = eventObserver;
    }

    public f(q58.b juniorAccountActivationNavigationFactory) {
        Intrinsics.checkNotNullParameter(juniorAccountActivationNavigationFactory, "juniorAccountActivationNavigationFactory");
        this.f132751m = juniorAccountActivationNavigationFactory;
    }

    public f(yd6.d appChallengeObserver) {
        Intrinsics.checkNotNullParameter(appChallengeObserver, "appChallengeObserver");
        this.f132751m = appChallengeObserver;
    }
}
