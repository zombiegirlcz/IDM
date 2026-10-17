package skm;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes13.dex */
public class l extends m0 implements CancellableContinuation, CoroutineStackFrame, k2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(l.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f263987g = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f263988h = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final Continuation d;
    public final CoroutineContext e;

    public l(int i, Continuation continuation) {
        super(i);
        this.d = continuation;
        this.e = continuation.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = b.f263955a;
    }

    public static void A(Object obj2, Object obj3) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj2 + ", already has " + obj3).toString());
    }

    public static Object F(y1 y1Var, Object obj2, int i, Function3 function3) {
        if (obj2 instanceof u) {
            return obj2;
        }
        if (i != 1 && i != 2) {
            return obj2;
        }
        if (function3 != null || (y1Var instanceof k)) {
            return new t(obj2, y1Var instanceof k ? (k) y1Var : null, function3, (Throwable) null, 16);
        }
        return obj2;
    }

    public String B() {
        return "CancellableContinuation";
    }

    public final void C() {
        Continuation continuation = this.d;
        Throwable th10 = null;
        zkm.f fVar = continuation instanceof zkm.f ? (zkm.f) continuation : null;
        if (fVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zkm.f.f323102h;
            while (true) {
                Object obj2 = atomicReferenceFieldUpdater.get(fVar);
                if (obj2 == zkm.g.f323105b) {
                    if (z9h.n.s(atomicReferenceFieldUpdater, fVar, this)) {
                        break;
                    }
                } else {
                    if (!(obj2 instanceof Throwable)) {
                        throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.l(obj2, "Inconsistent state "));
                    }
                    th10 = (Throwable) obj2;
                    if (!z9h.n.r(atomicReferenceFieldUpdater, fVar, th10)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
            }
            if (th10 == null) {
                return;
            }
            o();
            a(th10);
        }
    }

    public final void D(Object obj2, int i, Function3 function3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        y1 y1Var;
        do {
            atomicReferenceFieldUpdater = f263987g;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof y1)) {
                if (obj3 instanceof m) {
                    m mVar = (m) obj3;
                    if (m.f263994c.compareAndSet(mVar, 0, 1)) {
                        if (function3 != null) {
                            l(function3, mVar.f264012a, obj2);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.l(obj2, "Already resumed, but proposed with update "));
            }
            y1Var = (y1) obj3;
        } while (!r6.b.z(atomicReferenceFieldUpdater, this, y1Var, F(y1Var, obj2, i, function3)));
        if (!z()) {
            o();
        }
        p(i);
    }

    public final void E(CoroutineDispatcher coroutineDispatcher, Object obj2) {
        Continuation continuation = this.d;
        zkm.f fVar = continuation instanceof zkm.f ? (zkm.f) continuation : null;
        D(obj2, (fVar != null ? fVar.d : null) == coroutineDispatcher ? 4 : this.f263995c, null);
    }

    public final cfm.c G(Object obj2, Function3 function3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        y1 y1Var;
        cfm.c cVar = e0.f263966a;
        do {
            atomicReferenceFieldUpdater = f263987g;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof y1)) {
                return null;
            }
            y1Var = (y1) obj3;
        } while (!r6.b.z(atomicReferenceFieldUpdater, this, y1Var, F(y1Var, obj2, this.f263995c, function3)));
        if (!z()) {
            o();
        }
        return cVar;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final boolean a(Throwable th10) {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f263987g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof y1)) {
                return false;
            }
            boolean z = (obj2 instanceof k) || (obj2 instanceof zkm.t);
            if (th10 == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th10;
            }
            m mVar = new m(cancellationException, z);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, mVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            y1 y1Var = (y1) obj2;
            if (y1Var instanceof k) {
                k((k) obj2, th10);
            } else if (y1Var instanceof zkm.t) {
                n((zkm.t) obj2, th10);
            }
            if (!z()) {
                o();
            }
            p(this.f263995c);
            return true;
        }
    }

    @Override // skm.k2
    public final void b(zkm.t tVar, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        w(tVar);
    }

    @Override // skm.m0
    public final void c(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f263987g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof y1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof u) {
                return;
            }
            if (!(obj2 instanceof t)) {
                cancellationException2 = cancellationException;
                t tVar = new t(obj2, (k) null, (Function3) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, tVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            t tVar2 = (t) obj2;
            if (tVar2.e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            t tVarA = t.a(tVar2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, tVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    cancellationException2 = cancellationException;
                }
            }
            k kVar = tVar2.f264009b;
            if (kVar != null) {
                k(kVar, cancellationException);
            }
            Function3 function3 = tVar2.f264010c;
            if (function3 != null) {
                l(function3, cancellationException, tVar2.f264008a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final boolean d() {
        return f263987g.get(this) instanceof y1;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void e(Object obj2, Function3 function3) {
        D(obj2, this.f263995c, function3);
    }

    @Override // skm.m0
    public final Continuation f() {
        return this.d;
    }

    @Override // skm.m0
    public final Throwable g(Object obj2) {
        Throwable thG = super.g(obj2);
        if (thG != null) {
            return thG;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.d;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.e;
    }

    @Override // skm.m0
    public final Object h(Object obj2) {
        return obj2 instanceof t ? ((t) obj2).f264008a : obj2;
    }

    @Override // skm.m0
    public final Object j() {
        return f263987g.get(this);
    }

    public final void k(k kVar, Throwable th10) {
        try {
            kVar.a(th10);
        } catch (Throwable th11) {
            e0.v(this.e, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th11));
        }
    }

    public final void l(Function3 function3, Throwable th10, Object obj2) {
        CoroutineContext coroutineContext = this.e;
        try {
            function3.invoke(th10, obj2, coroutineContext);
        } catch (Throwable th11) {
            e0.v(coroutineContext, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th11));
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void m(Object obj2) {
        p(this.f263995c);
    }

    public final void n(zkm.t tVar, Throwable th10) {
        CoroutineContext coroutineContext = this.e;
        int i = f.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            tVar.h(i, coroutineContext);
        } catch (Throwable th11) {
            e0.v(coroutineContext, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th11));
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f263988h;
        r0 r0Var = (r0) atomicReferenceFieldUpdater.get(this);
        if (r0Var == null) {
            return;
        }
        r0Var.dispose();
        atomicReferenceFieldUpdater.set(this, x1.f264019a);
    }

    public final void p(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i == 4;
                Continuation continuation = this.d;
                if (!z && (continuation instanceof zkm.f)) {
                    boolean z3 = i == 1 || i == 2;
                    int i5 = this.f263995c;
                    if (z3 == (i5 == 1 || i5 == 2)) {
                        zkm.f fVar = (zkm.f) continuation;
                        CoroutineDispatcher coroutineDispatcher = fVar.d;
                        CoroutineContext context = fVar.e.getContext();
                        if (zkm.g.e(coroutineDispatcher, context)) {
                            zkm.g.d(coroutineDispatcher, context, this);
                            return;
                        }
                        z0 z0VarA = e2.a();
                        if (z0VarA.f264022b >= 4294967296L) {
                            z0VarA.q(this);
                            return;
                        }
                        z0VarA.v(true);
                        try {
                            n0.a(this, continuation, true);
                            do {
                            } while (z0VarA.x());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        return;
                    }
                }
                n0.a(this, continuation, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final cfm.c q(Object obj2, Function3 function3) {
        return G(obj2, function3);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    public final void r(Function1 function1) {
        w(new j(function1, 1));
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj2) {
        Throwable thA = yhm.m.a(obj2);
        if (thA != null) {
            obj2 = new u(thA, false);
        }
        D(obj2, this.f263995c, null);
    }

    public Throwable s(r1 r1Var) {
        return r1Var.p();
    }

    public final Object t() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        Job job2;
        boolean z = z();
        do {
            atomicIntegerFieldUpdater = f;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (z) {
                    C();
                }
                Object obj2 = f263987g.get(this);
                if (obj2 instanceof u) {
                    throw ((u) obj2).f264012a;
                }
                int i3 = this.f263995c;
                if ((i3 != 1 && i3 != 2) || (job2 = (Job) this.e.get(g1.f263979a)) == null || job2.d()) {
                    return h(obj2);
                }
                CancellationException cancellationExceptionP = job2.p();
                c(cancellationExceptionP);
                throw cancellationExceptionP;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, PKIFailureInfo.duplicateCertReq + (536870911 & i)));
        if (((r0) f263988h.get(this)) == null) {
            v();
        }
        if (z) {
            C();
        }
        return fim.a.COROUTINE_SUSPENDED;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(B());
        sb6.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        sb6.append(e0.H(this.d));
        sb6.append("){");
        Object obj2 = f263987g.get(this);
        sb6.append(obj2 instanceof y1 ? "Active" : obj2 instanceof m ? "Cancelled" : "Completed");
        sb6.append("}@");
        sb6.append(e0.s(this));
        return sb6.toString();
    }

    public final void u() {
        r0 r0VarV = v();
        if (r0VarV != null && y()) {
            r0VarV.dispose();
            f263988h.set(this, x1.f264019a);
        }
    }

    public final r0 v() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Job job2 = (Job) this.e.get(g1.f263979a);
        if (job2 == null) {
            return null;
        }
        r0 r0VarW = e0.w(job2, new n(this, 0));
        do {
            atomicReferenceFieldUpdater = f263988h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, r0VarW)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return r0VarW;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0099, code lost:
    
        A(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009c, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(skm.y1 r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = skm.l.f263987g
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof skm.b
            if (r1 == 0) goto L14
            skm.b r2 = (skm.b) r2
            boolean r0 = r6.b.x(r0, r7, r2, r8)
            if (r0 == 0) goto L0
            goto L98
        L14:
            boolean r1 = r2 instanceof skm.k
            r3 = 0
            if (r1 != 0) goto L99
            boolean r1 = r2 instanceof zkm.t
            if (r1 != 0) goto L99
            boolean r1 = r2 instanceof skm.u
            if (r1 == 0) goto L4d
            r0 = r2
            skm.u r0 = (skm.u) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = skm.u.f264011b
            r4 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 == 0) goto L49
            boolean r1 = r2 instanceof skm.m
            if (r1 == 0) goto L98
            java.lang.Throwable r0 = r0.f264012a
            boolean r1 = r8 instanceof skm.k
            if (r1 == 0) goto L3e
            skm.k r8 = (skm.k) r8
            r7.k(r8, r0)
            return
        L3e:
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>"
            kotlin.jvm.internal.Intrinsics.i(r8, r1)
            zkm.t r8 = (zkm.t) r8
            r7.n(r8, r0)
            return
        L49:
            A(r8, r2)
            throw r3
        L4d:
            boolean r1 = r2 instanceof skm.t
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler"
            if (r1 == 0) goto L7e
            r1 = r2
            skm.t r1 = (skm.t) r1
            skm.k r5 = r1.f264009b
            if (r5 != 0) goto L7a
            boolean r2 = r8 instanceof zkm.t
            if (r2 == 0) goto L5f
            return
        L5f:
            kotlin.jvm.internal.Intrinsics.i(r8, r4)
            r2 = r8
            skm.k r2 = (skm.k) r2
            java.lang.Throwable r4 = r1.e
            if (r4 == 0) goto L6d
            r7.k(r2, r4)
            return
        L6d:
            r4 = 29
            skm.t r2 = skm.t.a(r1, r2, r3, r4)
            boolean r0 = r6.b.y(r0, r7, r1, r2)
            if (r0 == 0) goto L0
            goto L98
        L7a:
            A(r8, r2)
            throw r3
        L7e:
            boolean r1 = r8 instanceof zkm.t
            if (r1 == 0) goto L83
            return
        L83:
            kotlin.jvm.internal.Intrinsics.i(r8, r4)
            r3 = r8
            skm.k r3 = (skm.k) r3
            skm.t r1 = new skm.t
            r5 = 0
            r6 = 28
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            boolean r0 = r6.b.w(r0, r7, r2, r1)
            if (r0 == 0) goto L0
        L98:
            return
        L99:
            A(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: skm.l.w(skm.y1):void");
    }

    public final boolean x() {
        return f263987g.get(this) instanceof m;
    }

    public final boolean y() {
        return !(f263987g.get(this) instanceof y1);
    }

    public final boolean z() {
        if (this.f263995c != 2) {
            return false;
        }
        Continuation continuation = this.d;
        Intrinsics.i(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return zkm.f.f323102h.get((zkm.f) continuation) != null;
    }
}
