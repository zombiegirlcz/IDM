package vkm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import yhm.m;

/* JADX INFO: loaded from: classes13.dex */
public class z1 extends wkm.a implements MutableSharedFlow, Flow, wkm.q {
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ukm.f f290160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object[] f290161h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f290162j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f290163l;

    public z1(int i, int i2, ukm.f fVar) {
        this.e = i;
        this.f = i2;
        this.f290160g = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if (((vkm.m2) r9).a(r0) == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static fim.a m(vkm.z1 r8, kotlinx.coroutines.flow.FlowCollector r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.z1.m(vkm.z1, kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):fim.a");
    }

    @Override // wkm.a
    public final wkm.c b() {
        a2 a2Var = new a2();
        a2Var.f289993a = -1L;
        return a2Var;
    }

    @Override // wkm.a
    public final wkm.c[] c() {
        return new a2[2];
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        return m(this, flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public final List d() {
        synchronized (this) {
            int iQ = (int) ((q() + ((long) this.k)) - this.i);
            if (iQ == 0) {
                return zhm.f0.f322471a;
            }
            ArrayList arrayList = new ArrayList(iQ);
            Object[] objArr = this.f290161h;
            Intrinsics.h(objArr);
            for (int i = 0; i < iQ; i++) {
                arrayList.add(objArr[((int) (this.i + ((long) i))) & (objArr.length - 1)]);
            }
            return arrayList;
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation frame) throws Throwable {
        Throwable th10;
        Continuation[] continuationArrP;
        w1 w1Var;
        if (k(obj2)) {
            return Unit.f186387a;
        }
        skm.l lVar = new skm.l(1, fim.h.b(frame));
        lVar.u();
        Continuation[] continuationArrP2 = wkm.b.f298303a;
        synchronized (this) {
            try {
                if (s(obj2)) {
                    try {
                        m.Companion aVar = yhm.m.INSTANCE;
                        lVar.resumeWith(Unit.f186387a);
                        continuationArrP = p(continuationArrP2);
                        w1Var = null;
                    } catch (Throwable th11) {
                        th10 = th11;
                        throw th10;
                    }
                } else {
                    try {
                        w1Var = new w1(this, q() + ((long) (this.k + this.f290163l)), obj2, lVar);
                        o(w1Var);
                        this.f290163l++;
                        if (this.f == 0) {
                            continuationArrP2 = p(continuationArrP2);
                        }
                        continuationArrP = continuationArrP2;
                    } catch (Throwable th12) {
                        th = th12;
                        th10 = th;
                        throw th10;
                    }
                }
                if (w1Var != null) {
                    lVar.w(new skm.s0(w1Var));
                }
                for (Continuation continuation : continuationArrP) {
                    if (continuation != null) {
                        m.Companion aVar2 = yhm.m.INSTANCE;
                        continuation.resumeWith(Unit.f186387a);
                    }
                }
                Object objT = lVar.t();
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                if (objT == aVar3) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (objT != aVar3) {
                    objT = Unit.f186387a;
                }
                return objT == aVar3 ? objT : Unit.f186387a;
            } catch (Throwable th13) {
                th = th13;
            }
        }
    }

    @Override // wkm.q
    public final Flow f(CoroutineContext coroutineContext, int i, ukm.f fVar) {
        return q.D(this, coroutineContext, i, fVar);
    }

    public final Object g(a2 a2Var, y1 frame) {
        skm.l lVar = new skm.l(1, fim.h.b(frame));
        lVar.u();
        synchronized (this) {
            try {
                if (t(a2Var) < 0) {
                    a2Var.f289994b = lVar;
                } else {
                    m.Companion aVar = yhm.m.INSTANCE;
                    lVar.resumeWith(Unit.f186387a);
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        Object objT = lVar.t();
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objT == aVar2) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT == aVar2 ? objT : Unit.f186387a;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final void i() throws Throwable {
        synchronized (this) {
            try {
                try {
                    v(q() + ((long) this.k), this.f290162j, q() + ((long) this.k), q() + ((long) this.k) + ((long) this.f290163l));
                    Unit unit = Unit.f186387a;
                } catch (Throwable th10) {
                    th = th10;
                    throw th;
                }
            } catch (Throwable th11) {
                th = th11;
            }
        }
    }

    public final void j() {
        if (this.f != 0 || this.f290163l > 1) {
            Object[] objArr = this.f290161h;
            Intrinsics.h(objArr);
            while (this.f290163l > 0) {
                long jQ = q();
                int i = this.k;
                int i2 = this.f290163l;
                if (objArr[((int) ((jQ + ((long) (i + i2))) - 1)) & (objArr.length - 1)] != q.f290101c) {
                    return;
                }
                this.f290163l = i2 - 1;
                q.f(objArr, q() + ((long) (this.k + this.f290163l)), null);
            }
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final boolean k(Object obj2) {
        int i;
        boolean z;
        Continuation[] continuationArrP = wkm.b.f298303a;
        synchronized (this) {
            if (s(obj2)) {
                continuationArrP = p(continuationArrP);
                z = true;
            } else {
                z = false;
            }
        }
        for (Continuation continuation : continuationArrP) {
            if (continuation != null) {
                m.Companion aVar = yhm.m.INSTANCE;
                continuation.resumeWith(Unit.f186387a);
            }
        }
        return z;
    }

    public final void n() {
        wkm.c[] cVarArr;
        Object[] objArr = this.f290161h;
        Intrinsics.h(objArr);
        q.f(objArr, q(), null);
        this.k--;
        long jQ = q() + 1;
        if (this.i < jQ) {
            this.i = jQ;
        }
        if (this.f290162j < jQ) {
            if (this.f298301b != 0 && (cVarArr = this.f298300a) != null) {
                for (wkm.c cVar : cVarArr) {
                    if (cVar != null) {
                        a2 a2Var = (a2) cVar;
                        long j2 = a2Var.f289993a;
                        if (j2 >= 0 && j2 < jQ) {
                            a2Var.f289993a = jQ;
                        }
                    }
                }
            }
            this.f290162j = jQ;
        }
    }

    public final void o(Object obj2) {
        int i = this.k + this.f290163l;
        Object[] objArrR = this.f290161h;
        if (objArrR == null) {
            objArrR = r(0, 2, null);
        } else if (i >= objArrR.length) {
            objArrR = r(i, objArrR.length * 2, objArrR);
        }
        q.f(objArrR, q() + ((long) i), obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final Continuation[] p(Continuation[] continuationArr) {
        wkm.c[] cVarArr;
        a2 a2Var;
        skm.l lVar;
        int length = continuationArr.length;
        if (this.f298301b != 0 && (cVarArr = this.f298300a) != null) {
            int length2 = cVarArr.length;
            int i = 0;
            continuationArr = continuationArr;
            while (i < length2) {
                wkm.c cVar = cVarArr[i];
                if (cVar != null && (lVar = (a2Var = (a2) cVar).f289994b) != null && t(a2Var) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) continuationArr, Math.max(2, continuationArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                        continuationArr = objArrCopyOf;
                    }
                    ((Continuation[]) continuationArr)[length] = lVar;
                    a2Var.f289994b = null;
                    length++;
                }
                i++;
                continuationArr = continuationArr;
            }
        }
        return (Continuation[]) continuationArr;
    }

    public final long q() {
        return Math.min(this.f290162j, this.i);
    }

    public final Object[] r(int i, int i2, Object[] objArr) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.f290161h = objArr2;
        if (objArr != null) {
            long jQ = q();
            for (int i3 = 0; i3 < i; i3++) {
                long j2 = ((long) i3) + jQ;
                q.f(objArr2, j2, objArr[((int) j2) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.f298301b
            int r2 = r12.e
            r9 = 1
            if (r1 != 0) goto L23
            if (r2 != 0) goto Lb
            goto L84
        Lb:
            r12.o(r13)
            int r1 = r12.k
            int r1 = r1 + r9
            r12.k = r1
            if (r1 <= r2) goto L18
            r12.n()
        L18:
            long r1 = r12.q()
            int r3 = r12.k
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.f290162j = r1
            return r9
        L23:
            int r1 = r12.k
            int r3 = r12.f
            if (r1 < r3) goto L4c
            long r4 = r12.f290162j
            long r6 = r12.i
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L4c
            int[] r1 = vkm.x1.f290145a
            ukm.f r4 = r12.f290160g
            int r4 = r4.ordinal()
            r1 = r1[r4]
            if (r1 == r9) goto L4a
            r4 = 2
            if (r1 == r4) goto L84
            r4 = 3
            if (r1 != r4) goto L44
            goto L4c
        L44:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        L4a:
            r1 = 0
            return r1
        L4c:
            r12.o(r13)
            int r1 = r12.k
            int r1 = r1 + r9
            r12.k = r1
            if (r1 <= r3) goto L59
            r12.n()
        L59:
            long r3 = r12.q()
            int r1 = r12.k
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.i
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L84
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.f290162j
            long r5 = r12.q()
            int r7 = r12.k
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.q()
            int r10 = r12.k
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.f290163l
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.v(r1, r3, r5, r7)
        L84:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: vkm.z1.s(java.lang.Object):boolean");
    }

    public final long t(a2 a2Var) {
        long j2 = a2Var.f289993a;
        if (j2 < q() + ((long) this.k)) {
            return j2;
        }
        if (this.f <= 0 && j2 <= q() && this.f290163l != 0) {
            return j2;
        }
        return -1L;
    }

    public final Object u(a2 a2Var) {
        Object obj2;
        Continuation[] continuationArrW = wkm.b.f298303a;
        synchronized (this) {
            try {
                long jT = t(a2Var);
                if (jT < 0) {
                    obj2 = q.f290101c;
                } else {
                    long j2 = a2Var.f289993a;
                    Object[] objArr = this.f290161h;
                    Intrinsics.h(objArr);
                    Object obj3 = objArr[((int) jT) & (objArr.length - 1)];
                    if (obj3 instanceof w1) {
                        obj3 = ((w1) obj3).f290138c;
                    }
                    a2Var.f289993a = jT + 1;
                    Object obj4 = obj3;
                    continuationArrW = w(j2);
                    obj2 = obj4;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        for (Continuation continuation : continuationArrW) {
            if (continuation != null) {
                m.Companion aVar = yhm.m.INSTANCE;
                continuation.resumeWith(Unit.f186387a);
            }
        }
        return obj2;
    }

    public final void v(long j2, long j3, long j5, long j16) {
        long jMin = Math.min(j3, j2);
        for (long jQ = q(); jQ < jMin; jQ++) {
            Object[] objArr = this.f290161h;
            Intrinsics.h(objArr);
            q.f(objArr, jQ, null);
        }
        this.i = j2;
        this.f290162j = j3;
        this.k = (int) (j5 - jMin);
        this.f290163l = (int) (j16 - j5);
    }

    public final Continuation[] w(long j2) {
        long j3;
        long j5;
        long j16;
        Continuation[] continuationArr;
        Continuation[] continuationArr2;
        wkm.c[] cVarArr;
        cfm.c cVar = q.f290101c;
        Continuation[] continuationArr3 = wkm.b.f298303a;
        if (j2 <= this.f290162j) {
            long jQ = q();
            long j22 = ((long) this.k) + jQ;
            int i = this.f;
            if (i == 0 && this.f290163l > 0) {
                j22++;
            }
            int i2 = 0;
            if (this.f298301b != 0 && (cVarArr = this.f298300a) != null) {
                for (wkm.c cVar2 : cVarArr) {
                    if (cVar2 != null) {
                        long j42 = ((a2) cVar2).f289993a;
                        if (j42 >= 0 && j42 < j22) {
                            j22 = j42;
                        }
                    }
                }
            }
            if (j22 > this.f290162j) {
                long jQ2 = q() + ((long) this.k);
                int iMin = this.f298301b > 0 ? Math.min(this.f290163l, i - ((int) (jQ2 - j22))) : this.f290163l;
                long j46 = ((long) this.f290163l) + jQ2;
                if (iMin > 0) {
                    j16 = 1;
                    Object[] objArr = this.f290161h;
                    Intrinsics.h(objArr);
                    j3 = jQ;
                    Continuation[] continuationArr4 = new Continuation[iMin];
                    long j47 = jQ2;
                    while (true) {
                        if (jQ2 >= j46) {
                            continuationArr2 = continuationArr4;
                            j5 = j22;
                            break;
                        }
                        continuationArr2 = continuationArr4;
                        Object obj2 = objArr[(objArr.length - 1) & ((int) jQ2)];
                        if (obj2 != cVar) {
                            Intrinsics.i(obj2, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            w1 w1Var = (w1) obj2;
                            int i3 = i2 + 1;
                            j5 = j22;
                            continuationArr2[i2] = w1Var.d;
                            q.f(objArr, jQ2, cVar);
                            q.f(objArr, j47, w1Var.f290138c);
                            j47++;
                            if (i3 >= iMin) {
                                break;
                            }
                            i2 = i3;
                        } else {
                            j5 = j22;
                        }
                        jQ2++;
                        continuationArr4 = continuationArr2;
                        j22 = j5;
                    }
                    jQ2 = j47;
                    continuationArr = continuationArr2;
                } else {
                    j3 = jQ;
                    j5 = j22;
                    j16 = 1;
                    continuationArr = continuationArr3;
                }
                int i5 = (int) (jQ2 - j3);
                long j57 = this.f298301b == 0 ? jQ2 : j5;
                long jMax = Math.max(this.i, jQ2 - ((long) Math.min(this.e, i5)));
                if (i == 0 && jMax < j46) {
                    Object[] objArr2 = this.f290161h;
                    Intrinsics.h(objArr2);
                    if (Intrinsics.f(objArr2[((int) jMax) & (objArr2.length - 1)], cVar)) {
                        jQ2 += j16;
                        jMax += j16;
                    }
                }
                v(jMax, j57, jQ2, j46);
                j();
                return continuationArr.length == 0 ? continuationArr : p(continuationArr);
            }
        }
        return continuationArr3;
    }
}
