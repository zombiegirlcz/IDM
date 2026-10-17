package ukm;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.JobCancellationException;

/* JADX INFO: loaded from: classes13.dex */
public abstract class v extends skm.a implements u {
    public final q d;

    public v(CoroutineContext coroutineContext, q qVar, boolean z, boolean z3) {
        super(coroutineContext, z, z3);
        this.d = qVar;
    }

    @Override // skm.r1
    public final void A(CancellationException cancellationException) {
        this.d.f(cancellationException);
        z(cancellationException);
    }

    @Override // ukm.i0
    public final flm.d b() {
        return this.d.b();
    }

    @Override // ukm.i0
    public final Object c() {
        return this.d.c();
    }

    @Override // skm.r1, ukm.j0
    public boolean close(Throwable th10) {
        return this.d.close(th10);
    }

    @Override // skm.r1, kotlinx.coroutines.Job
    public final void f(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(C(), null, this);
        }
        A(cancellationException);
    }

    @Override // ukm.i0
    public final flm.d g() {
        return this.d.g();
    }

    public flm.e getOnSend() {
        return this.d.getOnSend();
    }

    @Override // ukm.j0
    public final void invokeOnClose(Function1 function1) {
        this.d.invokeOnClose(function1);
    }

    @Override // ukm.j0
    public final boolean isClosedForSend() {
        return this.d.isClosedForSend();
    }

    @Override // ukm.i0
    public final g iterator() {
        return this.d.iterator();
    }

    @Override // ukm.i0
    public final Object j(Continuation continuation) {
        return this.d.j(continuation);
    }

    public boolean offer(Object obj2) {
        return this.d.offer(obj2);
    }

    public Object send(Object obj2, Continuation continuation) {
        return this.d.send(obj2, continuation);
    }

    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo3647trySendJP2dKIU(Object obj2) {
        return this.d.mo3647trySendJP2dKIU(obj2);
    }

    @Override // ukm.i0
    public final Object v(gim.i iVar) {
        Object objV = this.d.v(iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        return objV;
    }
}
