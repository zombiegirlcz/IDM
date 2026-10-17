package skm;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.Job;
import yhm.m;

/* JADX INFO: loaded from: classes13.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cfm.c f263966a = new cfm.c("RESUME_TOKEN", 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final cfm.c f263967b = new cfm.c("REMOVED_TASK", 3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final cfm.c f263968c = new cfm.c("CLOSED_EMPTY", 3);
    public static final cfm.c d = new cfm.c("COMPLETING_ALREADY", 3);
    public static final cfm.c e = new cfm.c("COMPLETING_WAITING_CHILDREN", 3);
    public static final cfm.c f = new cfm.c("COMPLETING_RETRY", 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final cfm.c f263969g = new cfm.c("TOO_LATE_TO_CANCEL", 3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final cfm.c f263970h = new cfm.c("SEALED", 3);
    public static final u0 i = new u0(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final u0 f263971j = new u0(true);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:19:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A(kotlinx.coroutines.Job[] r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof skm.f
            if (r0 == 0) goto L13
            r0 = r7
            skm.f r0 = (skm.f) r0
            int r1 = r0.f263976y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f263976y = r1
            goto L18
        L13:
            skm.f r0 = new skm.f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f263975x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f263976y
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r6 = r0.f263974w
            int r2 = r0.v
            java.lang.Object[] r4 = r0.u
            kotlinx.coroutines.Job[] r4 = (kotlinx.coroutines.Job[]) r4
            yhm.o.b(r7)
            r7 = r4
            goto L53
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            yhm.o.b(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L40:
            if (r2 >= r6) goto L55
            r4 = r7[r2]
            r0.u = r7
            r0.v = r2
            r0.f263974w = r6
            r0.f263976y = r3
            java.lang.Object r4 = r4.u(r0)
            if (r4 != r1) goto L53
            return r1
        L53:
            int r2 = r2 + r3
            goto L40
        L55:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: skm.e0.A(kotlinx.coroutines.Job[], gim.c):java.lang.Object");
    }

    public static final a2 B(CoroutineScope coroutineScope, CoroutineContext coroutineContext, d0 d0Var, Function2 function2) {
        CoroutineContext coroutineContextB = x.b(coroutineScope, coroutineContext);
        d0Var.getClass();
        a2 t1Var = d0Var == d0.LAZY ? new t1(coroutineContextB, function2) : new a2(coroutineContextB, true, true);
        t1Var.j0(d0Var, t1Var, function2);
        return t1Var;
    }

    public static /* synthetic */ a2 C(CoroutineScope coroutineScope, CoroutineContext coroutineContext, d0 d0Var, Function2 function2, int i2) {
        if ((i2 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f186406a;
        }
        if ((i2 & 2) != 0) {
            d0Var = d0.DEFAULT;
        }
        return B(coroutineScope, coroutineContext, d0Var, function2);
    }

    public static final zkm.d D(CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        return new zkm.d(coroutineScope.getCoroutineContext().plus(coroutineContext));
    }

    public static final Object E(CoroutineContext coroutineContext, Function2 function2) throws Throwable {
        z0 z0VarA;
        CoroutineContext coroutineContextA;
        long jW;
        Thread threadCurrentThread = Thread.currentThread();
        kotlin.coroutines.f fVar = kotlin.coroutines.d.q1;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) coroutineContext.get(fVar);
        if (dVar == null) {
            z0VarA = e2.a();
            coroutineContextA = x.a(kotlin.coroutines.g.f186406a, coroutineContext.plus(z0VarA), true);
            elm.g gVar = p0.f264002b;
            if (coroutineContextA != gVar && coroutineContextA.get(fVar) == null) {
                coroutineContextA = coroutineContextA.plus(gVar);
            }
        } else {
            if (dVar instanceof z0) {
            }
            z0VarA = (z0) e2.f263973a.get();
            coroutineContextA = x.a(kotlin.coroutines.g.f186406a, coroutineContext, true);
            elm.g gVar2 = p0.f264002b;
            if (coroutineContextA != gVar2 && coroutineContextA.get(fVar) == null) {
                coroutineContextA = coroutineContextA.plus(gVar2);
            }
        }
        h hVar = new h(coroutineContextA, threadCurrentThread, z0VarA);
        hVar.j0(d0.DEFAULT, hVar, function2);
        z0 z0Var = hVar.e;
        if (z0Var != null) {
            int i2 = z0.e;
            z0Var.v(false);
        }
        while (true) {
            if (z0Var != null) {
                try {
                    jW = z0Var.w();
                } catch (Throwable th10) {
                    if (z0Var != null) {
                        int i3 = z0.e;
                        z0Var.m(false);
                    }
                    throw th10;
                }
            } else {
                jW = Long.MAX_VALUE;
            }
            if (hVar.isCompleted()) {
                break;
            }
            LockSupport.parkNanos(hVar, jW);
            if (Thread.interrupted()) {
                hVar.z(new InterruptedException());
            }
        }
        if (z0Var != null) {
            int i5 = z0.e;
            z0Var.m(false);
        }
        Object objI = I(r1.f264005a.get(hVar));
        u uVar = objI instanceof u ? (u) objI : null;
        if (uVar == null) {
            return objI;
        }
        throw uVar.f264012a;
    }

    public static final Object G(Function2 function2, Continuation frame) {
        b2 b2Var = new b2(frame.getContext(), frame, 0);
        Object objB = com.bumptech.glide.d.B(b2Var, true, b2Var, function2);
        if (objB == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objB;
    }

    public static final String H(Continuation continuation) {
        Object objA;
        if (continuation instanceof zkm.f) {
            return ((zkm.f) continuation).toString();
        }
        try {
            m.Companion aVar = yhm.m.INSTANCE;
            objA = continuation + '@' + s(continuation);
        } catch (Throwable th10) {
            m.Companion aVar2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (yhm.m.a(objA) != null) {
            objA = continuation.getClass().getName() + '@' + s(continuation);
        }
        return (String) objA;
    }

    public static final Object I(Object obj2) {
        d1 d1Var;
        e1 e1Var = obj2 instanceof e1 ? (e1) obj2 : null;
        return (e1Var == null || (d1Var = e1Var.f263972a) == null) ? obj2 : d1Var;
    }

    public static final Object J(CoroutineContext coroutineContext, Function2 function2, Continuation frame) throws Throwable {
        Object objI;
        CoroutineContext context = frame.getContext();
        CoroutineContext coroutineContextPlus = !((Boolean) coroutineContext.fold(Boolean.FALSE, new pq0.d(5))).booleanValue() ? context.plus(coroutineContext) : x.a(context, coroutineContext, false);
        p(coroutineContextPlus);
        if (coroutineContextPlus == context) {
            zkm.s sVar = new zkm.s(frame, coroutineContextPlus);
            objI = com.bumptech.glide.d.B(sVar, true, sVar, function2);
        } else {
            eim.a aVar = kotlin.coroutines.d.q1;
            if (Intrinsics.f(coroutineContextPlus.get(aVar), context.get(aVar))) {
                i2 i2Var = new i2(frame, coroutineContextPlus);
                CoroutineContext coroutineContext2 = i2Var.f263953c;
                Object objC = zkm.w.c(coroutineContext2, null);
                try {
                    Object objB = com.bumptech.glide.d.B(i2Var, true, i2Var, function2);
                    zkm.w.a(coroutineContext2, objC);
                    objI = objB;
                } catch (Throwable th10) {
                    zkm.w.a(coroutineContext2, objC);
                    throw th10;
                }
            } else {
                l0 l0Var = new l0(frame, coroutineContextPlus);
                alm.a.d(function2, l0Var, l0Var);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l0.e;
                while (true) {
                    int i2 = atomicIntegerFieldUpdater.get(l0Var);
                    if (i2 != 0) {
                        if (i2 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        objI = I(r1.f264005a.get(l0Var));
                        if (objI instanceof u) {
                            throw ((u) objI).f264012a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(l0Var, 0, 1)) {
                        objI = fim.a.COROUTINE_SUSPENDED;
                        break;
                    }
                }
            }
        }
        if (objI == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objI;
    }

    public static final r a(Object obj2) {
        r rVar = new r(null);
        rVar.U(obj2);
        return rVar;
    }

    public static r b() {
        return new r(null);
    }

    public static final zkm.d c(CoroutineContext coroutineContext) {
        if (coroutineContext.get(g1.f263979a) == null) {
            coroutineContext = coroutineContext.plus(d());
        }
        return new zkm.d(coroutineContext);
    }

    public static h1 d() {
        return new h1(null);
    }

    public static c2 e() {
        return new c2(null);
    }

    public static final Executor f(CoroutineDispatcher coroutineDispatcher) {
        Executor executorM;
        kotlinx.coroutines.c cVar = coroutineDispatcher instanceof kotlinx.coroutines.c ? (kotlinx.coroutines.c) coroutineDispatcher : null;
        return (cVar == null || (executorM = cVar.m()) == null) ? new o0(coroutineDispatcher) : executorM;
    }

    public static h0 g(CoroutineScope coroutineScope, CoroutineContext coroutineContext, d0 d0Var, Function2 function2, int i2) {
        if ((i2 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f186406a;
        }
        if ((i2 & 2) != 0) {
            d0Var = d0.DEFAULT;
        }
        CoroutineContext coroutineContextB = x.b(coroutineScope, coroutineContext);
        d0Var.getClass();
        h0 s1Var = d0Var == d0.LAZY ? new s1(coroutineContextB, function2) : new h0(coroutineContextB, true, true);
        s1Var.j0(d0Var, s1Var, function2);
        return s1Var;
    }

    public static final Object h(Collection collection, Continuation continuation) {
        return collection.isEmpty() ? zhm.f0.f322471a : new e((g0[]) collection.toArray(new g0[0])).a(continuation);
    }

    public static final Object i(g0[] g0VarArr, Continuation continuation) {
        return g0VarArr.length == 0 ? zhm.f0.f322471a : new e(g0VarArr).a(continuation);
    }

    public static final void j(CoroutineContext coroutineContext, CancellationException cancellationException) {
        Job job2 = (Job) coroutineContext.get(g1.f263979a);
        if (job2 != null) {
            job2.f(cancellationException);
        }
    }

    public static final void k(CoroutineScope coroutineScope, CancellationException cancellationException) {
        Job job2 = (Job) coroutineScope.getCoroutineContext().get(g1.f263979a);
        if (job2 != null) {
            job2.f(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + coroutineScope).toString());
        }
    }

    public static final void l(Job job2, String str, Throwable th10) {
        job2.f(d9.e1.a(str, th10));
    }

    public static final Object m(Job job2, gim.c cVar) {
        job2.f(null);
        Object objU = job2.u(cVar);
        return objU == fim.a.COROUTINE_SUSPENDED ? objU : Unit.f186387a;
    }

    public static void n(CoroutineContext coroutineContext) {
        Sequence children;
        Job job2 = (Job) coroutineContext.get(g1.f263979a);
        if (job2 == null || (children = job2.getChildren()) == null) {
            return;
        }
        Iterator it8 = children.iterator();
        while (it8.hasNext()) {
            ((Job) it8.next()).f(null);
        }
    }

    public static final Object o(Function2 function2, Continuation frame) {
        zkm.s sVar = new zkm.s(frame, frame.getContext());
        Object objB = com.bumptech.glide.d.B(sVar, true, sVar, function2);
        if (objB == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objB;
    }

    public static final void p(CoroutineContext coroutineContext) {
        Job job2 = (Job) coroutineContext.get(g1.f263979a);
        if (job2 != null && !job2.d()) {
            throw job2.p();
        }
    }

    public static final void q(CoroutineScope coroutineScope) {
        p(coroutineScope.getCoroutineContext());
    }

    public static final CoroutineDispatcher r(Executor executor) {
        CoroutineDispatcher coroutineDispatcher;
        o0 o0Var = executor instanceof o0 ? (o0) executor : null;
        return (o0Var == null || (coroutineDispatcher = o0Var.f264000a) == null) ? new a1(executor) : coroutineDispatcher;
    }

    public static final String s(Object obj2) {
        return Integer.toHexString(System.identityHashCode(obj2));
    }

    public static final Job t(CoroutineContext coroutineContext) {
        Job job2 = (Job) coroutineContext.get(g1.f263979a);
        if (job2 != null) {
            return job2;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
    
        if (r2 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r0 = skm.l.f263987g;
        r1 = r0.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if ((r1 instanceof skm.t) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (((skm.t) r1).d == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r2.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        skm.l.f.set(r2, 536870911);
        r0.set(r2, skm.b.f263955a);
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (r3 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        return new skm.l(2, r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final skm.l u(kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof zkm.f
            if (r0 != 0) goto Lb
            skm.l r0 = new skm.l
            r1 = 1
            r0.<init>(r1, r6)
            return r0
        Lb:
            r0 = r6
            zkm.f r0 = (zkm.f) r0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = zkm.f.f323102h
        L10:
            java.lang.Object r2 = r1.get(r0)
            r3 = 0
            cfm.c r4 = zkm.g.f323105b
            if (r2 != 0) goto L1e
            r1.set(r0, r4)
            r2 = r3
            goto L2a
        L1e:
            boolean r5 = r2 instanceof skm.l
            if (r5 == 0) goto L59
            boolean r4 = z9h.n.q(r1, r0, r2)
            if (r4 == 0) goto L10
            skm.l r2 = (skm.l) r2
        L2a:
            if (r2 == 0) goto L52
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = skm.l.f263987g
            java.lang.Object r1 = r0.get(r2)
            boolean r4 = r1 instanceof skm.t
            if (r4 == 0) goto L40
            skm.t r1 = (skm.t) r1
            java.lang.Object r1 = r1.d
            if (r1 == 0) goto L40
            r2.o()
            goto L4e
        L40:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = skm.l.f
            r3 = 536870911(0x1fffffff, float:1.0842021E-19)
            r1.set(r2, r3)
            skm.b r1 = skm.b.f263955a
            r0.set(r2, r1)
            r3 = r2
        L4e:
            if (r3 != 0) goto L51
            goto L52
        L51:
            return r3
        L52:
            skm.l r0 = new skm.l
            r1 = 2
            r0.<init>(r1, r6)
            return r0
        L59:
            if (r2 == r4) goto L10
            boolean r3 = r2 instanceof java.lang.Throwable
            if (r3 == 0) goto L60
            goto L10
        L60:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Inconsistent state "
            java.lang.String r0 = com.google.android.gms.internal.mlkit_vision_face.a.l(r2, r0)
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: skm.e0.u(kotlin.coroutines.Continuation):skm.l");
    }

    public static final void v(CoroutineContext coroutineContext, Throwable th10) {
        if (th10 instanceof DispatchException) {
            th10 = ((DispatchException) th10).getF187929a();
        }
        try {
            a0 a0Var = (a0) coroutineContext.get(z.f264021a);
            if (a0Var != null) {
                a0Var.handleException(coroutineContext, th10);
            } else {
                zkm.b.g(coroutineContext, th10);
            }
        } catch (Throwable th11) {
            if (th10 != th11) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th11);
                yhm.f.a(runtimeException, th10);
                th10 = runtimeException;
            }
            zkm.b.g(coroutineContext, th10);
        }
    }

    public static r0 w(Job job2, i1 i1Var) {
        return job2 instanceof r1 ? ((r1) job2).S(true, i1Var) : job2.o(i1Var.i(), true, new rnb.u(i1Var));
    }

    public static final boolean x(CoroutineContext coroutineContext) {
        Job job2 = (Job) coroutineContext.get(g1.f263979a);
        if (job2 != null) {
            return job2.d();
        }
        return true;
    }

    public static final boolean y(CoroutineScope coroutineScope) {
        Job job2 = (Job) coroutineScope.getCoroutineContext().get(g1.f263979a);
        if (job2 != null) {
            return job2.d();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(java.util.Collection r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof skm.g
            if (r0 == 0) goto L13
            r0 = r5
            skm.g r0 = (skm.g) r0
            int r1 = r0.f263978w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f263978w = r1
            goto L18
        L13:
            skm.g r0 = new skm.g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f263978w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.Iterator r4 = r0.u
            yhm.o.b(r5)
            goto L3a
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L51
            java.lang.Object r5 = r4.next()
            kotlinx.coroutines.Job r5 = (kotlinx.coroutines.Job) r5
            r0.u = r4
            r0.f263978w = r3
            java.lang.Object r5 = r5.u(r0)
            if (r5 != r1) goto L3a
            return r1
        L51:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: skm.e0.z(java.util.Collection, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
