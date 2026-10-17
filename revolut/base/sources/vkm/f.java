package vkm;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes13.dex */
public class f extends wkm.d {
    public final /* synthetic */ int d = 1;
    public final Object e;

    public f(Iterable iterable, CoroutineContext coroutineContext, int i, ukm.f fVar) {
        super(coroutineContext, i, fVar);
        this.e = iterable;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // wkm.d
    public Object b(ProducerScope producerScope, Continuation continuation) {
        switch (this.d) {
            case 0:
                Object objInvoke = ((gim.i) this.e).invoke(producerScope, continuation);
                if (objInvoke != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                wkm.w wVar = new wkm.w(producerScope);
                Iterator it8 = ((Iterable) this.e).iterator();
                while (it8.hasNext()) {
                    skm.e0.C(producerScope, null, null, new afe.a((Flow) it8.next(), wVar, (Continuation) null, 19), 3);
                }
                break;
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [gim.i, kotlin.jvm.functions.Function2] */
    @Override // wkm.d
    public wkm.d c(CoroutineContext coroutineContext, int i, ukm.f fVar) {
        switch (this.d) {
            case 0:
                return new f((Function2) this.e, coroutineContext, i, fVar);
            default:
                return new f((Iterable) this.e, coroutineContext, i, fVar);
        }
    }

    @Override // wkm.d
    public ukm.i0 g(CoroutineScope coroutineScope) {
        switch (this.d) {
            case 1:
                Function2 aVar = new afe.a(this, null, 18);
                ukm.f fVar = ukm.f.SUSPEND;
                skm.d0 d0Var = skm.d0.DEFAULT;
                ukm.g0 g0Var = new ukm.g0(skm.x.b(coroutineScope, this.f298306a), vc.s.a(this.f298307b, fVar, null, 4), true, true);
                g0Var.j0(d0Var, g0Var, aVar);
                return g0Var;
            default:
                return super.g(coroutineScope);
        }
    }

    @Override // wkm.d
    public String toString() {
        switch (this.d) {
            case 0:
                return "block[" + ((gim.i) this.e) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(Function2 function2, CoroutineContext coroutineContext, int i, ukm.f fVar) {
        super(coroutineContext, i, fVar);
        this.e = (gim.i) function2;
    }
}
