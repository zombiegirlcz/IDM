package tt4;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.limit_hub.manage.CreditCardLimitHubManageScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import om4.k0;
import om4.n4;
import om4.y2;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class s extends oki.h implements dli.b {
    public final CreditCardLimitHubManageScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final al4.n f274229p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n4 f274230q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gte.a f274231r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y2 f274232s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k0 f274233t;
    public final ang.f u;
    public final ky4.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f274234w;

    public s(CreditCardLimitHubManageScreenContract$InputData inputData, al4.n creditCardInteractor, n4 securedCreditCardInteractor, gte.a featureToggleInteractor, y2 creditCardLimitCapInteractor, k0 creditCardFeatureInteractor, ang.f userInteractor, t stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(securedCreditCardInteractor, "securedCreditCardInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(creditCardLimitCapInteractor, "creditCardLimitCapInteractor");
        Intrinsics.checkNotNullParameter(creditCardFeatureInteractor, "creditCardFeatureInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f274229p = creditCardInteractor;
        this.f274230q = securedCreditCardInteractor;
        this.f274231r = featureToggleInteractor;
        this.f274232s = creditCardLimitCapInteractor;
        this.f274233t = creditCardFeatureInteractor;
        this.u = userInteractor;
        this.v = new ky4.e(0);
        this.f274234w = mra.d.b(this, new g(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.n(vkm.q.Q(this.v, new tik.b(continuation, this, 9)), h0.f322473a), null, null, new tna.p(this, continuation, 10), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f274234w;
    }
}
