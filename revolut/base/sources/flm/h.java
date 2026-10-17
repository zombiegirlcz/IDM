package flm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import r10.v;
import skm.k2;
import skm.r1;
import zhm.d0;
import zhm.u;
import zkm.t;

/* JADX INFO: loaded from: classes14.dex */
public final class h implements skm.k, i, k2 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f136011a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f136013c;
    private volatile /* synthetic */ Object state$volatile = k.f136015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f136012b = new ArrayList(2);
    public int d = -1;
    public Object e = k.d;

    public h(CoroutineContext coroutineContext) {
        this.f136011a = coroutineContext;
    }

    @Override // skm.k
    public final void a(Throwable th10) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == k.f136016b) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, k.f136017c)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            ArrayList arrayList = this.f136012b;
            if (arrayList == null) {
                return;
            }
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                ((f) it8.next()).a();
            }
            this.e = k.d;
            this.f136012b = null;
            return;
        }
    }

    @Override // skm.k2
    public final void b(t tVar, int i) {
        this.f136013c = tVar;
        this.d = i;
    }

    public final Object c(gim.c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        f fVar = (f) obj2;
        Object obj3 = this.e;
        ArrayList<f> arrayList = this.f136012b;
        if (arrayList != null) {
            for (f fVar2 : arrayList) {
                if (fVar2 != fVar) {
                    fVar2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, k.f136016b);
            this.e = k.d;
            this.f136012b = null;
        }
        Object objInvoke = fVar.f136006c.invoke(fVar.f136004a, fVar.d, obj3);
        Continuation continuation = fVar.e;
        return fVar.d == k.e ? ((Function1) continuation).invoke(cVar) : ((Function2) continuation).invoke(objInvoke, cVar);
    }

    public final Object d(gim.i iVar) {
        return f.get(this) instanceof f ? c(iVar) : e(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(gim.c r10) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: flm.h.e(gim.c):java.lang.Object");
    }

    public final f f(Object obj2) {
        ArrayList arrayList = this.f136012b;
        Object obj3 = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (((f) next).f136004a == obj2) {
                obj3 = next;
                break;
            }
        }
        f fVar = (f) obj3;
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalStateException(("Clause with object " + obj2 + " is not found").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(c cVar, Function1 function1) {
        v vVar = (v) cVar;
        i(new f(this, (r1) vVar.f250863b, (Function3) vVar.f250864c, (j) vVar.d, k.e, (gim.i) function1, null), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(d dVar, Function2 function2) {
        twg.c cVar = (twg.c) dVar;
        i(new f(this, cVar.f275017a, (Function3) cVar.f275018b, (Function3) cVar.f275019c, null, (gim.i) function2, (Function3) cVar.d), false);
    }

    public final void i(f fVar, boolean z) {
        Object obj2 = fVar.f136004a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        if (atomicReferenceFieldUpdater.get(this) instanceof f) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.f136012b;
            Intrinsics.h(arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    if (((f) it8.next()).f136004a == obj2) {
                        throw new IllegalStateException(a0.d.m(obj2, "Cannot use select clauses on the same object: ").toString());
                    }
                }
            }
        }
        fVar.f136005b.invoke(obj2, this, fVar.d);
        if (this.e != k.d) {
            atomicReferenceFieldUpdater.set(this, fVar);
            return;
        }
        if (!z) {
            ArrayList arrayList2 = this.f136012b;
            Intrinsics.h(arrayList2);
            arrayList2.add(fVar);
        }
        fVar.f136007g = this.f136013c;
        fVar.f136008h = this.d;
        this.f136013c = null;
        this.d = -1;
    }

    public final boolean j(Object obj2, Object obj3) {
        return l(obj2, obj3) == 0;
    }

    public final l k(Object obj2, Unit unit) {
        int iL = l(obj2, unit);
        if (iL == 0) {
            return l.SUCCESSFUL;
        }
        if (iL == 1) {
            return l.REREGISTER;
        }
        if (iL == 2) {
            return l.CANCELLED;
        }
        if (iL == 3) {
            return l.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + iL).toString());
    }

    public final int l(Object obj2, Object obj3) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            Object obj4 = atomicReferenceFieldUpdater.get(this);
            if (!(obj4 instanceof CancellableContinuation)) {
                if (Intrinsics.f(obj4, k.f136016b) || (obj4 instanceof f)) {
                    return 3;
                }
                if (Intrinsics.f(obj4, k.f136017c)) {
                    return 2;
                }
                if (Intrinsics.f(obj4, k.f136015a)) {
                    List listC = u.c(obj2);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj4, listC)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj4) {
                            break;
                        }
                    }
                    return 1;
                }
                if (!(obj4 instanceof List)) {
                    throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.l(obj4, "Unexpected state: "));
                }
                ArrayList arrayListF0 = d0.F0(obj2, (Collection) obj4);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj4, arrayListF0)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj4) {
                        break;
                    }
                }
                return 1;
            }
            f fVarF = f(obj2);
            if (fVarF != null) {
                Function3 function3 = fVarF.f;
                Function3 function32 = function3 != null ? (Function3) function3.invoke(this, fVarF.d, obj3) : null;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj4, fVarF)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj4) {
                        break;
                    }
                }
                CancellableContinuation cancellableContinuation = (CancellableContinuation) obj4;
                this.e = obj3;
                cfm.c cVarQ = cancellableContinuation.q(Unit.f186387a, function32);
                if (cVarQ == null) {
                    this.e = k.d;
                    return 2;
                }
                cancellableContinuation.m(cVarQ);
                return 0;
            }
            continue;
        }
    }
}
