package w2b;

import akg.n;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import p2b.l;
import vkm.q;
import vrl.s;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements t2b.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f294020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t2b.c f294021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u2b.a f294022c;
    public final l d;
    public final s e;

    public h(d inputData, t2b.c cfdFlowDataMediator, u2b.a marginQuoteParamsMapper, l cfdShareableQuoteInteractor, s orderLimitsByPortfolio) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cfdFlowDataMediator, "cfdFlowDataMediator");
        Intrinsics.checkNotNullParameter(marginQuoteParamsMapper, "marginQuoteParamsMapper");
        Intrinsics.checkNotNullParameter(cfdShareableQuoteInteractor, "cfdShareableQuoteInteractor");
        Intrinsics.checkNotNullParameter(orderLimitsByPortfolio, "orderLimitsByPortfolio");
        this.f294020a = inputData;
        this.f294021b = cfdFlowDataMediator;
        this.f294022c = marginQuoteParamsMapper;
        this.d = cfdShareableQuoteInteractor;
        this.e = orderLimitsByPortfolio;
    }

    @Override // t2b.d
    public final Flow a() {
        return b();
    }

    @Override // t2b.d
    public final n b() {
        t2b.c cVar = this.f294021b;
        cVar.getClass();
        Continuation continuation = null;
        return nim.a.v(xam.a.h(new vrl.d(this, continuation, 22), q.Q(q.s(new qij.s(cVar, 16), new w29.a(6), q.f290100b), new w2a.q(continuation, this, 2))), new w29.a(5));
    }
}
