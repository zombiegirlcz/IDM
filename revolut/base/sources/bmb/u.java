package bmb;

import au6.a3;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import wli.x;

/* JADX INFO: loaded from: classes6.dex */
public final class u extends oki.h implements h {
    public final ijb.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ffk.t f16803p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ugc.a f16804q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f16805r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f80.a f16806s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gte.a f16807t;
    public final clb.c u;
    public final vii.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f16808w;

    public u(ijb.a savingsProductInteractor, ffk.t pricingPlanInteractor, ugc.a savingsChallengeInteractor, x deeplinkHandler, f80.a uriHelper, gte.a featureToggleInteractor, clb.c savingsErrorHandlingApi, w stateMapper) {
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(savingsChallengeInteractor, "savingsChallengeInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(savingsErrorHandlingApi, "savingsErrorHandlingApi");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = savingsProductInteractor;
        this.f16803p = pricingPlanInteractor;
        this.f16804q = savingsChallengeInteractor;
        this.f16805r = deeplinkHandler;
        this.f16806s = uriHelper;
        this.f16807t = featureToggleInteractor;
        this.u = savingsErrorHandlingApi;
        this.v = new vii.b();
        this.f16808w = mra.d.b(this, new g(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.v, new a3(continuation, this, 23)), null, null, new bi2.n(this, continuation, 8), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f16808w;
    }
}
