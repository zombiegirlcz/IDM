package wef;

import com.revolut.data.model.Data;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.details.TransactionRecogniserDetailsScreenContract$InputData;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import vkm.q;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TransactionRecogniserDetailsScreenContract$InputData f296775p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kef.a f296776q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final eff.a f296777r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final hff.c f296778s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2 f296779t;
    public final e u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p stateMapper, TransactionRecogniserDetailsScreenContract$InputData inputData, kef.a interactor, eff.a destinationProvider, hff.c transactionRecogniserLocationProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(destinationProvider, "destinationProvider");
        Intrinsics.checkNotNullParameter(transactionRecogniserLocationProvider, "transactionRecogniserLocationProvider");
        this.f296775p = inputData;
        this.f296776q = interactor;
        this.f296777r = destinationProvider;
        this.f296778s = transactionRecogniserLocationProvider;
        this.u = new e(new Data(null, null, true, 3, null), null);
    }

    @Override // yji.l
    public final void I1() {
        y2();
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }

    public final void y2() {
        a2 a2Var = this.f296779t;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        x2(new wdb.b(this, 4));
        String transactionId = this.f296775p.f91830a;
        kef.a aVar = this.f296776q;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        nef.d dVar = aVar.f183064a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f296779t = yji.l.a1(this, q.B(new k(this, continuation, 0), rd0.e.b(dVar.f.f(transactionId, true))), null, null, new k(this, continuation, 1), 3);
    }
}
