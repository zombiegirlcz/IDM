package skm;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes13.dex */
public class r1 implements Job, z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f264005a = AtomicReferenceFieldUpdater.newUpdater(r1.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f264006b = AtomicReferenceFieldUpdater.newUpdater(r1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public r1(boolean z) {
        this._state$volatile = z ? e0.f263971j : e0.i;
    }

    public static p X(zkm.j jVar) {
        while (jVar.g()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zkm.j.f323111b;
            zkm.j jVarD = jVar.d();
            if (jVarD == null) {
                Object obj2 = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (zkm.j) obj2;
                    if (!jVar.g()) {
                        break;
                    }
                    obj2 = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = jVarD;
            }
        }
        while (true) {
            jVar = jVar.f();
            if (!jVar.g()) {
                if (jVar instanceof p) {
                    return (p) jVar;
                }
                if (jVar instanceof v1) {
                    return null;
                }
            }
        }
    }

    public static String e0(Object obj2) {
        if (!(obj2 instanceof l1)) {
            return obj2 instanceof d1 ? ((d1) obj2).isActive() ? "Active" : "New" : obj2 instanceof u ? "Cancelled" : "Completed";
        }
        l1 l1Var = (l1) obj2;
        return l1Var.d() ? "Cancelling" : l1.f263989b.get(l1Var) == 1 ? "Completing" : "Active";
    }

    public void A(CancellationException cancellationException) {
        z(cancellationException);
    }

    public final boolean B(Throwable th10) {
        if (T()) {
            return true;
        }
        boolean z = th10 instanceof CancellationException;
        o oVar = (o) f264006b.get(this);
        return (oVar == null || oVar == x1.f264019a) ? z : oVar.a(th10) || z;
    }

    public String C() {
        return "Job was cancelled";
    }

    public boolean D(Throwable th10) {
        if (th10 instanceof CancellationException) {
            return true;
        }
        return z(th10) && L();
    }

    public final void E(d1 d1Var, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f264006b;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        if (oVar != null) {
            oVar.dispose();
            atomicReferenceFieldUpdater.set(this, x1.f264019a);
        }
        CompletionHandlerException completionHandlerException = null;
        u uVar = obj2 instanceof u ? (u) obj2 : null;
        Throwable th10 = uVar != null ? uVar.f264012a : null;
        if (d1Var instanceof i1) {
            try {
                ((i1) d1Var).j(th10);
                return;
            } catch (Throwable th11) {
                Q(new CompletionHandlerException("Exception in completion handler " + d1Var + " for " + this, th11));
                return;
            }
        }
        v1 v1VarB = d1Var.b();
        if (v1VarB != null) {
            v1VarB.c(new zkm.i(1), 1);
            Object obj3 = zkm.j.f323110a.get(v1VarB);
            Intrinsics.i(obj3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (zkm.j jVarF = (zkm.j) obj3; !jVarF.equals(v1VarB); jVarF = jVarF.f()) {
                if (jVarF instanceof i1) {
                    try {
                        ((i1) jVarF).j(th10);
                    } catch (Throwable th12) {
                        if (completionHandlerException != null) {
                            yhm.f.a(completionHandlerException, th12);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + jVarF + " for " + this, th12);
                            Unit unit = Unit.f186387a;
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                Q(completionHandlerException);
            }
        }
    }

    public final Throwable F(Object obj2) {
        Throwable thC;
        if (obj2 == null ? true : obj2 instanceof Throwable) {
            Throwable th10 = (Throwable) obj2;
            return th10 == null ? new JobCancellationException(C(), null, this) : th10;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        r1 r1Var = (r1) ((z1) obj2);
        Object obj3 = f264005a.get(r1Var);
        if (obj3 instanceof l1) {
            thC = ((l1) obj3).c();
        } else if (obj3 instanceof u) {
            thC = ((u) obj3).f264012a;
        } else {
            if (obj3 instanceof d1) {
                throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.l(obj3, "Cannot be cancelling child in this state: "));
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(e0(obj3)), thC, r1Var) : cancellationException;
    }

    public final Object H(l1 l1Var, Object obj2) {
        boolean zD;
        Throwable thK;
        u uVar = obj2 instanceof u ? (u) obj2 : null;
        Throwable th10 = uVar != null ? uVar.f264012a : null;
        synchronized (l1Var) {
            zD = l1Var.d();
            ArrayList<Throwable> arrayListE = l1Var.e(th10);
            thK = K(l1Var, arrayListE);
            if (thK != null && arrayListE.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListE.size()));
                for (Throwable th11 : arrayListE) {
                    if (th11 != thK && th11 != thK && !(th11 instanceof CancellationException) && setNewSetFromMap.add(th11)) {
                        yhm.f.a(thK, th11);
                    }
                }
            }
        }
        if (thK != null && thK != th10) {
            obj2 = new u(thK, false);
        }
        if (thK != null && (B(thK) || P(thK))) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            u.f264011b.compareAndSet((u) obj2, 0, 1);
        }
        if (!zD) {
            Z(thK);
        }
        a0(obj2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f264005a;
        Object e1Var = obj2 instanceof d1 ? new e1((d1) obj2) : obj2;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, l1Var, e1Var) && atomicReferenceFieldUpdater.get(this) == l1Var) {
        }
        E(l1Var, obj2);
        return obj2;
    }

    public final Object I() throws Throwable {
        Object obj2 = f264005a.get(this);
        if (obj2 instanceof d1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj2 instanceof u) {
            throw ((u) obj2).f264012a;
        }
        return e0.I(obj2);
    }

    public final Throwable J() {
        Object obj2 = f264005a.get(this);
        if (obj2 instanceof l1) {
            Throwable thC = ((l1) obj2).c();
            if (thC != null) {
                return thC;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (obj2 instanceof d1) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (obj2 instanceof u) {
            return ((u) obj2).f264012a;
        }
        return null;
    }

    public final Throwable K(l1 l1Var, ArrayList arrayList) {
        Object next;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (l1Var.d()) {
                return new JobCancellationException(C(), null, this);
            }
            return null;
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th10 = (Throwable) next;
        if (th10 != null) {
            return th10;
        }
        Throwable th11 = (Throwable) arrayList.get(0);
        if (th11 instanceof TimeoutCancellationException) {
            Iterator it9 = arrayList.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                Object next2 = it9.next();
                Throwable th12 = (Throwable) next2;
                if (th12 != th11 && (th12 instanceof TimeoutCancellationException)) {
                    obj2 = next2;
                    break;
                }
            }
            Throwable th13 = (Throwable) obj2;
            if (th13 != null) {
                return th13;
            }
        }
        return th11;
    }

    public boolean L() {
        return true;
    }

    public final twg.c M() {
        kotlin.jvm.internal.u0.f(3, o1.f);
        kotlin.jvm.internal.u0.f(3, p1.f);
        return new twg.c(this);
    }

    public boolean N() {
        return this instanceof r;
    }

    public final v1 O(d1 d1Var) {
        v1 v1VarB = d1Var.b();
        if (v1VarB != null) {
            return v1VarB;
        }
        if (d1Var instanceof u0) {
            return new v1();
        }
        if (d1Var instanceof i1) {
            c0((i1) d1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + d1Var).toString());
    }

    public boolean P(Throwable th10) {
        return false;
    }

    public void Q(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public final void R(Job job2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f264006b;
        x1 x1Var = x1.f264019a;
        if (job2 == null) {
            atomicReferenceFieldUpdater.set(this, x1Var);
            return;
        }
        job2.start();
        o oVarS = job2.s(this);
        atomicReferenceFieldUpdater.set(this, oVarS);
        if (isCompleted()) {
            oVarS.dispose();
            atomicReferenceFieldUpdater.set(this, x1Var);
        }
    }

    public final r0 S(boolean z, i1 i1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        x1 x1Var;
        boolean z3;
        boolean zC;
        i1Var.d = this;
        while (true) {
            atomicReferenceFieldUpdater = f264005a;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z4 = obj2 instanceof u0;
            x1Var = x1.f264019a;
            z3 = true;
            if (!z4) {
                if (!(obj2 instanceof d1)) {
                    z3 = false;
                    break;
                }
                d1 d1Var = (d1) obj2;
                v1 v1VarB = d1Var.b();
                if (v1VarB == null) {
                    c0((i1) obj2);
                } else {
                    if (i1Var.i()) {
                        l1 l1Var = d1Var instanceof l1 ? (l1) d1Var : null;
                        Throwable thC = l1Var != null ? l1Var.c() : null;
                        if (thC == null) {
                            zC = v1VarB.c(i1Var, 5);
                        } else if (z) {
                            i1Var.j(thC);
                            return x1Var;
                        }
                    } else {
                        zC = v1VarB.c(i1Var, 1);
                    }
                    if (zC) {
                        break;
                    }
                }
            } else {
                u0 u0Var = (u0) obj2;
                boolean z6 = u0Var.f264013a;
                if (!z6) {
                    v1 v1Var = new v1();
                    d1 c1Var = v1Var;
                    if (!z6) {
                        c1Var = new c1(v1Var);
                    }
                    r6.b.t(atomicReferenceFieldUpdater, this, u0Var, c1Var);
                } else if (r6.b.A(atomicReferenceFieldUpdater, this, u0Var, i1Var)) {
                    break;
                }
            }
        }
        if (z3) {
            return i1Var;
        }
        if (z) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            u uVar = obj3 instanceof u ? (u) obj3 : null;
            i1Var.j(uVar != null ? uVar.f264012a : null);
        }
        return x1Var;
    }

    public boolean T() {
        return this instanceof h;
    }

    public final boolean U(Object obj2) {
        Object objF0;
        do {
            objF0 = f0(f264005a.get(this), obj2);
            if (objF0 == e0.d) {
                return false;
            }
            if (objF0 == e0.e) {
                return true;
            }
        } while (objF0 == e0.f);
        w(objF0);
        return true;
    }

    public final Object V(Object obj2) {
        Object objF0;
        do {
            objF0 = f0(f264005a.get(this), obj2);
            if (objF0 == e0.d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj2;
                u uVar = obj2 instanceof u ? (u) obj2 : null;
                throw new IllegalStateException(str, uVar != null ? uVar.f264012a : null);
            }
        } while (objF0 == e0.f);
        return objF0;
    }

    public String W() {
        return getClass().getSimpleName();
    }

    public final void Y(v1 v1Var, Throwable th10) {
        Z(th10);
        v1Var.c(new zkm.i(4), 4);
        Object obj2 = zkm.j.f323110a.get(v1Var);
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (zkm.j jVarF = (zkm.j) obj2; !jVarF.equals(v1Var); jVarF = jVarF.f()) {
            if ((jVarF instanceof i1) && ((i1) jVarF).i()) {
                try {
                    ((i1) jVarF).j(th10);
                } catch (Throwable th11) {
                    if (completionHandlerException != null) {
                        yhm.f.a(completionHandlerException, th11);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + jVarF + " for " + this, th11);
                        Unit unit = Unit.f186387a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            Q(completionHandlerException);
        }
        B(th10);
    }

    public void Z(Throwable th10) {
    }

    public void a0(Object obj2) {
    }

    public void b0() {
    }

    public final void c0(i1 i1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        v1 v1Var = new v1();
        i1Var.getClass();
        zkm.j.f323111b.set(v1Var, i1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = zkm.j.f323110a;
        atomicReferenceFieldUpdater2.set(v1Var, i1Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(i1Var) == i1Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(i1Var, i1Var, v1Var)) {
                    if (atomicReferenceFieldUpdater2.get(i1Var) != i1Var) {
                        break;
                    }
                }
                v1Var.e(i1Var);
                break loop0;
            }
            break;
        }
        zkm.j jVarF = i1Var.f();
        do {
            atomicReferenceFieldUpdater = f264005a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, i1Var, jVarF)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == i1Var);
    }

    public boolean close(Throwable th10) {
        return z(th10);
    }

    @Override // kotlinx.coroutines.Job
    public boolean d() {
        Object obj2 = f264005a.get(this);
        return (obj2 instanceof d1) && ((d1) obj2).isActive();
    }

    public final int d0(Object obj2) {
        boolean z = obj2 instanceof u0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f264005a;
        if (z) {
            if (((u0) obj2).f264013a) {
                return 0;
            }
            u0 u0Var = e0.f263971j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, u0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    return -1;
                }
            }
            b0();
            return 1;
        }
        if (!(obj2 instanceof c1)) {
            return 0;
        }
        v1 v1Var = ((c1) obj2).f263962a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, v1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                return -1;
            }
        }
        b0();
        return 1;
    }

    @Override // kotlinx.coroutines.Job
    public void f(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(C(), null, this);
        }
        A(cancellationException);
    }

    public final Object f0(Object obj2, Object obj3) {
        if (!(obj2 instanceof d1)) {
            return e0.d;
        }
        if (((obj2 instanceof u0) || (obj2 instanceof i1)) && !(obj2 instanceof p) && !(obj3 instanceof u)) {
            d1 d1Var = (d1) obj2;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f264005a;
            Object e1Var = obj3 instanceof d1 ? new e1((d1) obj3) : obj3;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, d1Var, e1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != d1Var) {
                    return e0.f;
                }
            }
            Z(null);
            a0(obj3);
            E(d1Var, obj3);
            return obj3;
        }
        d1 d1Var2 = (d1) obj2;
        v1 v1VarO = O(d1Var2);
        if (v1VarO == null) {
            return e0.f;
        }
        l1 l1Var = d1Var2 instanceof l1 ? (l1) d1Var2 : null;
        if (l1Var == null) {
            l1Var = new l1(v1VarO, null);
        }
        synchronized (l1Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l1.f263989b;
            if (atomicIntegerFieldUpdater.get(l1Var) == 1) {
                return e0.d;
            }
            atomicIntegerFieldUpdater.set(l1Var, 1);
            if (l1Var != d1Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f264005a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, d1Var2, l1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != d1Var2) {
                        return e0.f;
                    }
                }
            }
            boolean zD = l1Var.d();
            u uVar = obj3 instanceof u ? (u) obj3 : null;
            if (uVar != null) {
                l1Var.a(uVar.f264012a);
            }
            Throwable thC = zD ? null : l1Var.c();
            Unit unit = Unit.f186387a;
            if (thC != null) {
                Y(v1VarO, thC);
            }
            p pVarX = X(v1VarO);
            if (pVarX != null && g0(l1Var, pVarX, obj3)) {
                return e0.e;
            }
            v1VarO.c(new zkm.i(2), 2);
            p pVarX2 = X(v1VarO);
            return (pVarX2 == null || !g0(l1Var, pVarX2, obj3)) ? H(l1Var, obj3) : e0.e;
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj2, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj2, this);
    }

    public final boolean g0(l1 l1Var, p pVar, Object obj2) {
        while (pVar.e.S(false, new k1(this, l1Var, pVar, obj2)) == x1.f264019a) {
            pVar = X(pVar);
            if (pVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    @Override // kotlinx.coroutines.Job
    public final Sequence getChildren() {
        return nkm.p.b(new n1(null, this));
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return g1.f263979a;
    }

    public Object h() {
        return I();
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        Object obj2 = f264005a.get(this);
        if (obj2 instanceof u) {
            return true;
        }
        return (obj2 instanceof l1) && ((l1) obj2).d();
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCompleted() {
        return !(f264005a.get(this) instanceof d1);
    }

    @Override // kotlinx.coroutines.Job
    public final r0 k(Function1 function1) {
        return S(true, new n(function1, 1));
    }

    @Override // kotlinx.coroutines.Job
    public final flm.c l() {
        q1 q1Var = q1.f;
        kotlin.jvm.internal.u0.f(3, q1Var);
        return new r10.v(this, q1Var);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.c(this, fVar);
    }

    public final Throwable n() {
        Object obj2 = f264005a.get(this);
        if (obj2 instanceof d1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        u uVar = obj2 instanceof u ? (u) obj2 : null;
        if (uVar != null) {
            return uVar.f264012a;
        }
        return null;
    }

    @Override // kotlinx.coroutines.Job
    public final r0 o(boolean z, boolean z3, Function1 function1) {
        return S(z3, z ? new f1(function1) : new n(function1, 1));
    }

    @Override // kotlinx.coroutines.Job
    public final CancellationException p() {
        CancellationException cancellationException;
        Object obj2 = f264005a.get(this);
        if (!(obj2 instanceof l1)) {
            if (obj2 instanceof d1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj2 instanceof u)) {
                return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th10 = ((u) obj2).f264012a;
            cancellationException = th10 instanceof CancellationException ? (CancellationException) th10 : null;
            return cancellationException == null ? new JobCancellationException(C(), th10, this) : cancellationException;
        }
        Throwable thC = ((l1) obj2).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = C();
        }
        return new JobCancellationException(strConcat, thC, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.d(this, coroutineContext);
    }

    @Override // kotlinx.coroutines.Job
    public final o s(r1 r1Var) {
        p pVar = new p(r1Var);
        pVar.d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f264005a;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof u0) {
                u0 u0Var = (u0) obj2;
                boolean z = u0Var.f264013a;
                if (z) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, pVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    break loop0;
                }
                v1 v1Var = new v1();
                d1 c1Var = v1Var;
                if (!z) {
                    c1Var = new c1(v1Var);
                }
                r6.b.t(atomicReferenceFieldUpdater, this, u0Var, c1Var);
            } else {
                boolean z3 = obj2 instanceof d1;
                x1 x1Var = x1.f264019a;
                if (!z3) {
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    u uVar = obj3 instanceof u ? (u) obj3 : null;
                    pVar.j(uVar != null ? uVar.f264012a : null);
                    return x1Var;
                }
                v1 v1VarB = ((d1) obj2).b();
                if (v1VarB == null) {
                    c0((i1) obj2);
                } else if (!v1VarB.c(pVar, 7)) {
                    boolean zC = v1VarB.c(pVar, 3);
                    Object obj4 = atomicReferenceFieldUpdater.get(this);
                    if (obj4 instanceof l1) {
                        thC = ((l1) obj4).c();
                    } else {
                        u uVar2 = obj4 instanceof u ? (u) obj4 : null;
                        if (uVar2 != null) {
                            thC = uVar2.f264012a;
                        }
                    }
                    pVar.j(thC);
                    if (zC) {
                        break loop0;
                    }
                    return x1Var;
                }
            }
        }
        return pVar;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        int iD0;
        do {
            iD0 = d0(f264005a.get(this));
            if (iD0 == 0) {
                return false;
            }
        } while (iD0 != 1);
        return true;
    }

    public twg.c t() {
        return M();
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(W() + CoreConstants.CURLY_LEFT + e0(f264005a.get(this)) + CoreConstants.CURLY_RIGHT);
        sb6.append('@');
        sb6.append(e0.s(this));
        return sb6.toString();
    }

    @Override // kotlinx.coroutines.Job
    public final Object u(Continuation frame) {
        Object obj2;
        do {
            obj2 = f264005a.get(this);
            if (!(obj2 instanceof d1)) {
                e0.p(frame.getContext());
                return Unit.f186387a;
            }
        } while (d0(obj2) < 0);
        l lVar = new l(1, fim.h.b(frame));
        lVar.u();
        lVar.w(new s0(e0.w(this, new t0(lVar, 1))));
        Object objT = lVar.t();
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objT == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        if (objT != aVar) {
            objT = Unit.f186387a;
        }
        return objT == aVar ? objT : Unit.f186387a;
    }

    public void w(Object obj2) {
    }

    public void x(Object obj2) {
        w(obj2);
    }

    public final Object y(Continuation frame) {
        Object obj2;
        do {
            obj2 = f264005a.get(this);
            if (!(obj2 instanceof d1)) {
                if (obj2 instanceof u) {
                    throw ((u) obj2).f264012a;
                }
                return e0.I(obj2);
            }
        } while (d0(obj2) < 0);
        j1 j1Var = new j1(fim.h.b(frame), this);
        j1Var.u();
        j1Var.w(new s0(e0.w(this, new n(j1Var, 2))));
        Object objT = j1Var.t();
        if (objT == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[PHI: r0
      0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v12 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: skm.r1.z(java.lang.Object):boolean");
    }
}
