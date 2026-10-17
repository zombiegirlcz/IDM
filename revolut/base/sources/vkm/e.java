package vkm;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes14.dex */
public final class e extends wkm.d {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(e.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final ukm.i0 d;
    public final boolean e;

    public /* synthetic */ e(ukm.i0 i0Var, boolean z) {
        this(i0Var, z, kotlin.coroutines.g.f186406a, -3, ukm.f.SUSPEND);
    }

    @Override // wkm.d
    public final String a() {
        return "channel=" + this.d;
    }

    @Override // wkm.d
    public final Object b(ProducerScope producerScope, Continuation continuation) throws Throwable {
        Object objV = q.v(new wkm.w(producerScope), this.d, this.e, continuation);
        return objV == fim.a.COROUTINE_SUSPENDED ? objV : Unit.f186387a;
    }

    @Override // wkm.d
    public final wkm.d c(CoroutineContext coroutineContext, int i, ukm.f fVar) {
        return new e(this.d, this.e, coroutineContext, i, fVar);
    }

    @Override // wkm.d, kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        if (this.f298307b != -3) {
            Object objCollect = super.collect(flowCollector, continuation);
            return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
        }
        boolean z = this.e;
        if (z && f.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        Object objV = q.v(flowCollector, this.d, z, continuation);
        return objV == fim.a.COROUTINE_SUSPENDED ? objV : Unit.f186387a;
    }

    @Override // wkm.d
    public final Flow e() {
        return new e(this.d, this.e);
    }

    @Override // wkm.d
    public final ukm.i0 g(CoroutineScope coroutineScope) {
        if (this.e && f.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        return this.f298307b == -3 ? this.d : super.g(coroutineScope);
    }

    public e(ukm.i0 i0Var, boolean z, CoroutineContext coroutineContext, int i, ukm.f fVar) {
        super(coroutineContext, i, fVar);
        this.d = i0Var;
        this.e = z;
    }
}
