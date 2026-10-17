package qn9;

import com.revolut.data.model.Data;
import com.revolut.feature.payinstore.impl.ui.screen.PayInStoreScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import u80.t;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends jki.g implements l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PayInStoreScreenContract$InputData f247892p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f247893q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ln9.a f247894r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wsg.n f247895s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final on9.a f247896t;
    public final f u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(PayInStoreScreenContract$InputData inputData, t amountUtils, ln9.a payInStoreInteractor, wsg.n walletInteractor, on9.a statusDialogModelBuilder, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountUtils, "amountUtils");
        Intrinsics.checkNotNullParameter(payInStoreInteractor, "payInStoreInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(statusDialogModelBuilder, "statusDialogModelBuilder");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f247892p = inputData;
        this.f247893q = amountUtils;
        this.f247894r = payInStoreInteractor;
        this.f247895s = walletInteractor;
        this.f247896t = statusDialogModelBuilder;
        xi0.b.Companion.getClass();
        this.u = new f(xi0.b.f306273h, 0L, f0.f322471a, null, new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.b(zi0.c.q(osg.b.e(this.f247895s, false, null, null, null, null, null, null, 126), f0.f322471a)), null, null, new p(this, continuation, 1), 3);
        String orderId = this.f247892p.f79047a;
        ln9.c cVar = (ln9.c) this.f247894r;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        gn9.d dVar = (gn9.d) cVar.f197135a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        yji.l.a1(this, rd0.e.b(dVar.d.f(orderId, true)), null, null, new p(this, continuation, 2), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }
}
