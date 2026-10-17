package blm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import org.reactivestreams.Publisher;
import skm.e0;
import ukm.t;
import ukm.u;
import wkm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class f extends wkm.d {
    public final Publisher d;

    public f(Publisher publisher, CoroutineContext coroutineContext, int i, ukm.f fVar) {
        super(coroutineContext, i, fVar);
        this.d = publisher;
    }

    @Override // wkm.d
    public final Object b(ProducerScope producerScope, Continuation continuation) {
        producerScope.getCoroutineContext();
        Object objJ = j(new w(producerScope.G()), continuation);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    @Override // wkm.d
    public final wkm.d c(CoroutineContext coroutineContext, int i, ukm.f fVar) {
        return new f(this.d, coroutineContext, i, fVar);
    }

    @Override // wkm.d, kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        CoroutineContext context = continuation.getContext();
        eim.a aVar = kotlin.coroutines.d.q1;
        CoroutineContext coroutineContext = this.f298306a;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) coroutineContext.get(aVar);
        if (dVar == null || dVar.equals(context.get(aVar))) {
            context.plus(coroutineContext);
            Object objJ = j(flowCollector, continuation);
            return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
        }
        Object objO = e0.o(new b96.d(flowCollector, this, (Continuation) null, 18), continuation);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objO != aVar2) {
            objO = Unit.f186387a;
        }
        return objO == aVar2 ? objO : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
    
        if (r13.emit(r0, r2) == r3) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b A[Catch: all -> 0x003d, TRY_ENTER, TryCatch #0 {all -> 0x003d, blocks: (B:13:0x0037, B:39:0x00b3, B:41:0x00bf, B:43:0x00c3, B:45:0x00cb, B:46:0x00ce, B:25:0x0073, B:36:0x009b, B:20:0x0050), top: B:55:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v8, types: [blm.i] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00b0 -> B:14:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(kotlinx.coroutines.flow.FlowCollector r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: blm.f.j(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final long m() {
        if (this.f298308c != ukm.f.SUSPEND) {
            return Long.MAX_VALUE;
        }
        int i = this.f298307b;
        if (i == -2) {
            u.E1.getClass();
            return t.f280840b;
        }
        if (i == 0) {
            return 1L;
        }
        if (i == Integer.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        long j2 = i;
        if (j2 >= 1) {
            return j2;
        }
        throw new IllegalStateException("Check failed.");
    }
}
