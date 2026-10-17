package ukm;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class a0 extends zkm.t {
    public final q e;
    public final /* synthetic */ AtomicReferenceArray f;

    public a0(long j2, a0 a0Var, q qVar, int i) {
        super(j2, a0Var, i);
        this.e = qVar;
        this.f = new AtomicReferenceArray(s.f280827b * 2);
    }

    @Override // zkm.t
    public final int g() {
        return s.f280827b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004e, code lost:
    
        n(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0051, code lost:
    
        if (r1 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0053, code lost:
    
        kotlin.jvm.internal.Intrinsics.h(r4);
        r7 = r4.f280824b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0058, code lost:
    
        if (r7 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005a, code lost:
    
        zkm.b.a(r7, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    @Override // zkm.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r7, kotlin.coroutines.CoroutineContext r8) {
        /*
            r6 = this;
            int r0 = ukm.s.f280827b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            int r0 = r7 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r6.f
            java.lang.Object r0 = r2.get(r0)
        L12:
            java.lang.Object r2 = r6.l(r7)
            boolean r3 = r2 instanceof skm.k2
            ukm.q r4 = r6.e
            r5 = 0
            if (r3 != 0) goto L5e
            boolean r3 = r2 instanceof ukm.k0
            if (r3 == 0) goto L22
            goto L5e
        L22:
            cfm.c r3 = ukm.s.f280831j
            if (r2 == r3) goto L4e
            cfm.c r3 = ukm.s.k
            if (r2 != r3) goto L2b
            goto L4e
        L2b:
            cfm.c r3 = ukm.s.f280829g
            if (r2 == r3) goto L12
            cfm.c r3 = ukm.s.f
            if (r2 != r3) goto L34
            goto L12
        L34:
            cfm.c r7 = ukm.s.i
            if (r2 == r7) goto L7f
            cfm.c r7 = ukm.s.d
            if (r2 != r7) goto L3d
            goto L7f
        L3d:
            cfm.c r7 = ukm.s.f280832l
            if (r2 != r7) goto L42
            goto L7f
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "unexpected state: "
            java.lang.String r8 = com.google.android.gms.internal.mlkit_vision_face.a.l(r2, r8)
            r7.<init>(r8)
            throw r7
        L4e:
            r6.n(r7, r5)
            if (r1 == 0) goto L7f
            kotlin.jvm.internal.Intrinsics.h(r4)
            kotlin.jvm.functions.Function1 r7 = r4.f280824b
            if (r7 == 0) goto L7f
            zkm.b.a(r7, r0, r8)
            return
        L5e:
            if (r1 == 0) goto L63
            cfm.c r3 = ukm.s.f280831j
            goto L65
        L63:
            cfm.c r3 = ukm.s.k
        L65:
            boolean r2 = r6.k(r7, r2, r3)
            if (r2 == 0) goto L12
            r6.n(r7, r5)
            r2 = r1 ^ 1
            r6.m(r7, r2)
            if (r1 == 0) goto L7f
            kotlin.jvm.internal.Intrinsics.h(r4)
            kotlin.jvm.functions.Function1 r7 = r4.f280824b
            if (r7 == 0) goto L7f
            zkm.b.a(r7, r0, r8)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ukm.a0.h(int, kotlin.coroutines.CoroutineContext):void");
    }

    public final boolean k(int i, Object obj2, Object obj3) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f;
            if (atomicReferenceArray.compareAndSet(i2, obj2, obj3)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj2);
        return false;
    }

    public final Object l(int i) {
        return this.f.get((i * 2) + 1);
    }

    public final void m(int i, boolean z) {
        if (z) {
            q qVar = this.e;
            Intrinsics.h(qVar);
            qVar.T((this.f323123c * ((long) s.f280827b)) + ((long) i));
        }
        i();
    }

    public final void n(int i, Object obj2) {
        this.f.set(i * 2, obj2);
    }

    public final void o(int i, Object obj2) {
        this.f.set((i * 2) + 1, obj2);
    }
}
