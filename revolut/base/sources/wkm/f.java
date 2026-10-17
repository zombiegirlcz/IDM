package wkm;

import ard.b0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import skm.d0;
import skm.g1;
import ukm.g0;
import ukm.i0;

/* JADX INFO: loaded from: classes14.dex */
public final class f extends d {
    public final Flow d;
    public final int e;

    public f(int i, int i2, CoroutineContext coroutineContext, Flow flow, ukm.f fVar) {
        super(coroutineContext, i2, fVar);
        this.d = flow;
        this.e = i;
    }

    @Override // wkm.d
    public final String a() {
        return "concurrency=" + this.e;
    }

    @Override // wkm.d
    public final Object b(ProducerScope producerScope, Continuation continuation) {
        Object objCollect = this.d.collect(new b0((Job) continuation.getContext().get(g1.f263979a), hlm.j.a(this.e), producerScope, new w(producerScope), 28), continuation);
        return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
    }

    @Override // wkm.d
    public final d c(CoroutineContext coroutineContext, int i, ukm.f fVar) {
        return new f(this.e, i, coroutineContext, this.d, fVar);
    }

    @Override // wkm.d
    public final i0 g(CoroutineScope coroutineScope) {
        Function2 aVar = new afe.a(this, null, 18);
        ukm.f fVar = ukm.f.SUSPEND;
        d0 d0Var = d0.DEFAULT;
        g0 g0Var = new g0(skm.x.b(coroutineScope, this.f298306a), vc.s.a(this.f298307b, fVar, null, 4), true, true);
        g0Var.j0(d0Var, g0Var, aVar);
        return g0Var;
    }
}
