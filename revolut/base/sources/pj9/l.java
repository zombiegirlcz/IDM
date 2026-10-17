package pj9;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.pay_later.api.PayLaterApi$Toggles;
import ej9.e0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends oki.h implements g {
    public final xh9.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ti9.l f236713p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wj0.a f236714q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f236715r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f236716s;

    public l(cli.n mapper, xh9.a interactor, ti9.l rightToCancelInteractor, gte.a featureToggleInteractor, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(rightToCancelInteractor, "rightToCancelInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.o = interactor;
        this.f236713p = rightToCancelInteractor;
        this.f236714q = idempotencyKeyHolder;
        boolean zC = ((jte.d) featureToggleInteractor).c(PayLaterApi$Toggles.PayLaterCancellationAfter14Days.f78805c);
        this.f236715r = zC;
        this.f236716s = mra.d.b(this, new f(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, zC), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        ti9.g gVar = (ti9.g) this.o;
        gVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        akg.n nVarA = ((e0) gVar.f271456a).a(loadingStrategy);
        h0 h0Var = h0.f322473a;
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.n(nVarA, h0Var), null, null, new k(this, null, 0), 3);
        if (this.f236715r) {
            this.f236714q.a("BNPL_CANCELLATION_IDEMPOTENCY_TAG");
            yji.l.a1(this, rd0.e.n(q.q(q.Q(this.f236716s.B(new pij.d(28)), new okf.m(continuation, this, 28))), h0Var), null, null, new k(this, null, 1), 3);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f236716s;
    }
}
