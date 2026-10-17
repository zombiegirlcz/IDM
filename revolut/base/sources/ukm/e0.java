package ukm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.u0;

/* JADX INFO: loaded from: classes14.dex */
public final class e0 extends a {
    public static final /* synthetic */ int f = 0;
    public Continuation e;

    @Override // skm.r1
    public final void b0() {
        alm.a.c(this.e, this);
    }

    @Override // ukm.v, skm.r1, ukm.j0
    public final boolean close(Throwable th10) {
        boolean zClose = super.close(th10);
        start();
        return zClose;
    }

    @Override // ukm.v, ukm.j0
    public final flm.e getOnSend() {
        d0 d0Var = d0.f;
        u0.f(3, d0Var);
        return new mp.p(this, 18, d0Var, (Function3) ((mp.p) this.d.getOnSend()).d);
    }

    @Override // ukm.v, ukm.j0
    public final boolean offer(Object obj2) {
        start();
        return super.offer(obj2);
    }

    @Override // ukm.v, ukm.j0
    public final Object send(Object obj2, Continuation continuation) {
        start();
        Object objSend = super.send(obj2, continuation);
        return objSend == fim.a.COROUTINE_SUSPENDED ? objSend : Unit.f186387a;
    }

    @Override // ukm.v, ukm.j0
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public final Object mo3647trySendJP2dKIU(Object obj2) {
        start();
        return super.mo3647trySendJP2dKIU(obj2);
    }
}
