package rj9;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.pay_later.impl.ui.linkedplans.PayLaterLinkedPlansControllerContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends oki.h implements f {
    public final gte.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f254638p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xh9.a f254639q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final PayLaterLinkedPlansControllerContract$InputData f254640r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ky4.e f254641s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f254642t;

    public j(gte.a featureToggleInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, xh9.a payLaterInteractor, PayLaterLinkedPlansControllerContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = featureToggleInteractor;
        this.f254638p = transactionsInteractor;
        this.f254639q = payLaterInteractor;
        this.f254640r = inputData;
        this.f254641s = new ky4.e(0);
        this.f254642t = mra.d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f254641s, new r3k.c(continuation, this, 7)), null, null, new r5e.e(this, continuation, 29), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f254642t;
    }
}
