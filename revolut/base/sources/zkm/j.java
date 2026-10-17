package zkm;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;

/* JADX INFO: loaded from: classes13.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f323110a = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f323111b = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f323112c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean c(j jVar, int i) {
        while (true) {
            j jVarD = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f323111b;
            if (jVarD == null) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    jVarD = (j) obj2;
                    if (!jVarD.g()) {
                        break;
                    }
                    obj2 = atomicReferenceFieldUpdater.get(jVarD);
                }
            }
            if (jVarD instanceof i) {
                return (((i) jVarD).d & i) == 0 && jVarD.c(jVar, i);
            }
            atomicReferenceFieldUpdater.set(jVar, jVarD);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f323110a;
            atomicReferenceFieldUpdater2.set(jVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(jVarD, this, jVar)) {
                if (atomicReferenceFieldUpdater2.get(jVarD) != this) {
                    break;
                }
            }
            jVar.e(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        if (z9h.n.t(r5, r4, r3, ((zkm.q) r6).f323122a) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final zkm.j d() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = zkm.j.f323111b
            java.lang.Object r1 = r0.get(r9)
            zkm.j r1 = (zkm.j) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = zkm.j.f323110a
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L1e
            if (r1 != r3) goto L16
            goto L1d
        L16:
            boolean r0 = z9h.n.t(r0, r9, r1, r3)
            if (r0 != 0) goto L1d
            goto L0
        L1d:
            return r3
        L1e:
            boolean r7 = r9.g()
            if (r7 == 0) goto L25
            return r2
        L25:
            boolean r7 = r6 instanceof zkm.q
            if (r7 == 0) goto L3f
            if (r4 == 0) goto L38
            zkm.q r6 = (zkm.q) r6
            zkm.j r6 = r6.f323122a
            boolean r3 = z9h.n.t(r5, r4, r3, r6)
            if (r3 != 0) goto L36
            goto L0
        L36:
            r3 = r4
            goto La
        L38:
            java.lang.Object r3 = r0.get(r3)
            zkm.j r3 = (zkm.j) r3
            goto Lb
        L3f:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.Intrinsics.i(r6, r4)
            r4 = r6
            zkm.j r4 = (zkm.j) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: zkm.j.d():zkm.j");
    }

    public final void e(j jVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f323111b;
            j jVar2 = (j) atomicReferenceFieldUpdater.get(jVar);
            if (f323110a.get(this) != jVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(jVar, jVar2, this)) {
                if (atomicReferenceFieldUpdater.get(jVar) != jVar2) {
                    break;
                }
            }
            if (g()) {
                jVar.d();
                return;
            }
            return;
        }
    }

    public final j f() {
        j jVar;
        Object obj2 = f323110a.get(this);
        q qVar = obj2 instanceof q ? (q) obj2 : null;
        if (qVar != null && (jVar = qVar.f323122a) != null) {
            return jVar;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (j) obj2;
    }

    public boolean g() {
        return f323110a.get(this) instanceof q;
    }

    public String toString() {
        return new eki.e(this) + '@' + e0.s(this);
    }
}
