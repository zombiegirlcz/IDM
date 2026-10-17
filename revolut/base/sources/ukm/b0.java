package ukm;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public final class b0 implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f280798a = new d();

    @Override // ukm.j0
    public final boolean close(Throwable th10) {
        return this.f280798a.close(th10);
    }

    @Override // ukm.j0
    public final flm.e getOnSend() {
        return this.f280798a.getOnSend();
    }

    @Override // ukm.j0
    public final void invokeOnClose(Function1 function1) {
        this.f280798a.invokeOnClose(function1);
    }

    @Override // ukm.j0
    public final boolean isClosedForSend() {
        return this.f280798a.isClosedForSend();
    }

    @Override // ukm.j0
    public final boolean offer(Object obj2) {
        d dVar = this.f280798a;
        dVar.getClass();
        return jh.d.n(dVar, obj2);
    }

    @Override // ukm.j0
    public final Object send(Object obj2, Continuation continuation) {
        return this.f280798a.send(obj2, continuation);
    }

    @Override // ukm.j0
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public final Object mo3647trySendJP2dKIU(Object obj2) {
        return this.f280798a.mo3647trySendJP2dKIU(obj2);
    }
}
