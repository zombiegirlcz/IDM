package clm;

import io.reactivex.exceptions.UndeliverableException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.channels.ProducerScope;
import tfm.z0;
import ukm.j0;
import ukm.w;
import ukm.x;
import ukm.z;

/* JADX INFO: loaded from: classes14.dex */
public final class q extends skm.a implements ProducerScope {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(q.class, "_signal$volatile");
    private volatile /* synthetic */ int _signal$volatile;
    public final z0 d;
    public final hlm.c e;

    public q(CoroutineContext coroutineContext, z0 z0Var) {
        super(coroutineContext, false, true);
        this.d = z0Var;
        this.e = hlm.d.a();
    }

    @Override // kotlinx.coroutines.channels.ProducerScope
    public final j0 G() {
        return this;
    }

    @Override // ukm.j0
    public final flm.e getOnSend() {
        n nVar = n.f;
        u0.f(3, nVar);
        o oVar = o.f;
        u0.f(3, oVar);
        return new mp.p(this, 18, nVar, oVar);
    }

    @Override // skm.a
    public final void h0(Throwable th10, boolean z) {
        if (f.compareAndSet(this, 0, -1) && this.e.tryLock(null)) {
            l0(th10, z);
        }
    }

    @Override // skm.a
    public final void i0(Object obj2) {
        if (f.compareAndSet(this, 0, -1) && this.e.tryLock(null)) {
            l0(null, false);
        }
    }

    @Override // ukm.j0
    public final void invokeOnClose(Function1 function1) {
        throw new UnsupportedOperationException("RxObservableCoroutine doesn't support invokeOnClose");
    }

    @Override // ukm.j0
    public final boolean isClosedForSend() {
        return !d();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.IllegalStateException k0(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r2.d()
            if (r0 != 0) goto L29
            java.lang.Throwable r3 = r2.J()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = skm.r1.f264005a
            java.lang.Object r0 = r0.get(r2)
            boolean r1 = r0 instanceof skm.u
            if (r1 == 0) goto L20
            skm.u r0 = (skm.u) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = skm.u.f264011b
            int r0 = r1.get(r0)
            r1 = 1
            if (r0 != r1) goto L20
            goto L21
        L20:
            r1 = 0
        L21:
            r2.l0(r3, r1)
            java.util.concurrent.CancellationException r3 = r2.p()
            return r3
        L29:
            tfm.z0 r0 = r2.d     // Catch: java.lang.Throwable -> L33
            r0.c(r3)     // Catch: java.lang.Throwable -> L33
            r2.m0()
            r3 = 0
            return r3
        L33:
            r3 = move-exception
            io.reactivex.exceptions.UndeliverableException r0 = new io.reactivex.exceptions.UndeliverableException
            r0.<init>(r3)
            boolean r3 = r2.z(r0)
            r2.m0()
            if (r3 == 0) goto L43
            goto L4c
        L43:
            kotlin.coroutines.CoroutineContext r3 = r2.f263953c
            n14.k.m(r3, r0)
            java.util.concurrent.CancellationException r0 = r2.p()
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: clm.q.k0(java.lang.Object):java.lang.IllegalStateException");
    }

    public final void l0(Throwable th10, boolean z) {
        hlm.c cVar = this.e;
        try {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f;
            if (atomicIntegerFieldUpdater.get(this) == -2) {
                return;
            }
            atomicIntegerFieldUpdater.set(this, -2);
            Throwable th11 = th10 != null ? th10 : null;
            CoroutineContext coroutineContext = this.f263953c;
            z0 z0Var = this.d;
            if (th11 == null) {
                try {
                    z0Var.a();
                } catch (Exception e) {
                    n14.k.m(coroutineContext, e);
                }
            } else if ((th11 instanceof UndeliverableException) && !z) {
                n14.k.m(coroutineContext, th10);
            } else if (th11 != p() || !z0Var.isDisposed()) {
                try {
                    z0Var.b(th10);
                } catch (Exception e2) {
                    yhm.f.a(th10, e2);
                    n14.k.m(coroutineContext, th10);
                }
            }
        } finally {
            cVar.unlock(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m0() {
        /*
            r3 = this;
            hlm.c r0 = r3.e
            r1 = 0
            r0.unlock(r1)
            boolean r2 = r3.d()
            if (r2 != 0) goto L30
            boolean r0 = r0.tryLock(r1)
            if (r0 == 0) goto L30
            java.lang.Throwable r0 = r3.J()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = skm.r1.f264005a
            java.lang.Object r1 = r1.get(r3)
            boolean r2 = r1 instanceof skm.u
            if (r2 == 0) goto L2c
            skm.u r1 = (skm.u) r1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = skm.u.f264011b
            int r1 = r2.get(r1)
            r2 = 1
            if (r1 != r2) goto L2c
            goto L2d
        L2c:
            r2 = 0
        L2d:
            r3.l0(r0, r2)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: clm.q.m0():void");
    }

    @Override // ukm.j0
    public final boolean offer(Object obj2) {
        return jh.d.n(this, obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ukm.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object send(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof clm.p
            if (r0 == 0) goto L13
            r0 = r6
            clm.p r0 = (clm.p) r0
            int r1 = r0.f25085y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25085y = r1
            goto L18
        L13:
            clm.p r0 = new clm.p
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f25083w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f25085y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.v
            clm.q r0 = r0.u
            yhm.o.b(r6)
            goto L47
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            r0.u = r4
            r0.v = r5
            r0.f25085y = r3
            r6 = 0
            hlm.c r2 = r4.e
            java.lang.Object r6 = r2.lock(r6, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            r0 = r4
        L47:
            java.lang.IllegalStateException r5 = r0.k0(r5)
            if (r5 != 0) goto L50
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L50:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: clm.q.send(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ukm.j0
    /* JADX INFO: renamed from: trySend-JP2dKIU, reason: not valid java name */
    public final Object mo3647trySendJP2dKIU(Object obj2) {
        if (!this.e.tryLock(null)) {
            z.Companion.getClass();
            return z.f280842b;
        }
        IllegalStateException illegalStateExceptionK0 = k0(obj2);
        if (illegalStateExceptionK0 != null) {
            z.Companion.getClass();
            return new w(illegalStateExceptionK0);
        }
        x xVar = z.Companion;
        Unit unit = Unit.f186387a;
        xVar.getClass();
        return unit;
    }
}
