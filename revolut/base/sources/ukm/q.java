package ukm;

import com.google.common.primitives.Longs;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import skm.k2;
import yhm.m;

/* JADX INFO: loaded from: classes14.dex */
public class q implements u {
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(q.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(q.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(q.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f280819g = AtomicLongFieldUpdater.newUpdater(q.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f280820h = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f280821j = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f280822l = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f280823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f280824b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uk2.w f280825c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public q(int i2, Function1 function1) {
        this.f280823a = i2;
        this.f280824b = function1;
        if (i2 < 0) {
            throw new IllegalArgumentException(j6.a.l(i2, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        a0 a0Var = s.f280826a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f.get(this);
        a0 a0Var2 = new a0(0L, null, this, 3);
        this.sendSegment$volatile = a0Var2;
        this.receiveSegment$volatile = a0Var2;
        if (D()) {
            a0Var2 = s.f280826a;
            Intrinsics.i(a0Var2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = a0Var2;
        this.f280825c = function1 != null ? new uk2.w(this, 4) : null;
        this._closeCause$volatile = s.f280838s;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object J(ukm.q r13, gim.c r14) {
        /*
            boolean r0 = r14 instanceof ukm.o
            if (r0 == 0) goto L14
            r0 = r14
            ukm.o r0 = (ukm.o) r0
            int r1 = r0.f280817w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f280817w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ukm.o r0 = new ukm.o
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f280817w
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            yhm.o.b(r14)
            ukm.z r14 = (ukm.z) r14
            java.lang.Object r13 = r14.f280843a
            return r13
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            yhm.o.b(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = ukm.q.i
            java.lang.Object r14 = r14.get(r13)
            ukm.a0 r14 = (ukm.a0) r14
        L40:
            boolean r1 = r13.A()
            if (r1 == 0) goto L55
            ukm.x r14 = ukm.z.Companion
            java.lang.Throwable r13 = r13.s()
            r14.getClass()
            ukm.w r14 = new ukm.w
            r14.<init>(r13)
            return r14
        L55:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = ukm.q.e
            long r4 = r1.getAndIncrement(r13)
            int r1 = ukm.s.f280827b
            long r7 = (long) r1
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.f323123c
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L72
            ukm.a0 r1 = r13.r(r9, r14)
            if (r1 != 0) goto L70
            goto L40
        L70:
            r8 = r1
            goto L73
        L72:
            r8 = r14
        L73:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.R(r8, r9, r10, r12)
            r1 = r7
            cfm.c r14 = ukm.s.f280833m
            if (r13 == r14) goto Laa
            cfm.c r14 = ukm.s.o
            if (r13 != r14) goto L92
            long r13 = r1.w()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L8f
            r8.b()
        L8f:
            r13 = r1
            r14 = r8
            goto L40
        L92:
            cfm.c r14 = ukm.s.f280834n
            if (r13 != r14) goto La1
            r6.f280817w = r2
            r2 = r8
            java.lang.Object r13 = r1.K(r2, r3, r4, r6)
            if (r13 != r0) goto La0
            return r0
        La0:
            return r13
        La1:
            r8.b()
            ukm.x r14 = ukm.z.Companion
            r14.getClass()
            return r13
        Laa:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ukm.q.J(ukm.q, gim.c):java.lang.Object");
    }

    public static final a0 a(q qVar, long j2, a0 a0Var) {
        Object objD;
        q qVar2;
        a0 a0Var2 = s.f280826a;
        r rVar = r.f;
        loop0: while (true) {
            objD = zkm.b.d(a0Var, j2, rVar);
            if (!zkm.b.h(objD)) {
                zkm.t tVarE = zkm.b.e(objD);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f280820h;
                    zkm.t tVar = (zkm.t) atomicReferenceFieldUpdater.get(qVar);
                    if (tVar.f323123c >= tVarE.f323123c) {
                        break loop0;
                    }
                    if (!tVarE.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(qVar, tVar, tVarE)) {
                        if (atomicReferenceFieldUpdater.get(qVar) != tVar) {
                            if (tVarE.f()) {
                                tVarE.e();
                            }
                        }
                    }
                    if (tVar.f()) {
                        tVar.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zH = zkm.b.h(objD);
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if (zH) {
            qVar.isClosedForSend();
            if (a0Var.f323123c * ((long) s.f280827b) < atomicLongFieldUpdater.get(qVar)) {
                a0Var.b();
                return null;
            }
        } else {
            a0 a0Var3 = (a0) zkm.b.e(objD);
            long j3 = a0Var3.f323123c;
            if (j3 <= j2) {
                return a0Var3;
            }
            long j5 = ((long) s.f280827b) * j3;
            while (true) {
                long j16 = d.get(qVar);
                long j22 = 1152921504606846975L & j16;
                if (j22 >= j5) {
                    qVar2 = qVar;
                    break;
                }
                qVar2 = qVar;
                if (d.compareAndSet(qVar2, j16, (((long) ((int) (j16 >> 60))) << 60) + j22)) {
                    break;
                }
                qVar = qVar2;
            }
            if (j3 * ((long) s.f280827b) < atomicLongFieldUpdater.get(qVar2)) {
                a0Var3.b();
            }
        }
        return null;
    }

    public static final void d(q qVar, Object obj2, skm.l lVar) {
        Function1 function1 = qVar.f280824b;
        if (function1 != null) {
            zkm.b.a(function1, obj2, lVar.e);
        }
        Throwable thU = qVar.u();
        m.Companion companion = yhm.m.INSTANCE;
        lVar.resumeWith(yhm.o.a(thU));
    }

    public static final void e(q qVar, flm.i iVar) {
        a0 a0Var;
        q qVar2;
        flm.i iVar2;
        int i2;
        qVar.getClass();
        a0 a0Var2 = (a0) i.get(qVar);
        while (!qVar.A()) {
            long andIncrement = e.getAndIncrement(qVar);
            long j2 = s.f280827b;
            long j3 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (a0Var2.f323123c != j3) {
                a0 a0VarR = qVar.r(j3, a0Var2);
                if (a0VarR == null) {
                    continue;
                } else {
                    a0Var = a0VarR;
                    iVar2 = iVar;
                    i2 = i3;
                    qVar2 = qVar;
                }
            } else {
                a0Var = a0Var2;
                qVar2 = qVar;
                iVar2 = iVar;
                i2 = i3;
            }
            Object objR = qVar2.R(a0Var, i2, andIncrement, iVar2);
            a0Var2 = a0Var;
            if (objR == s.f280833m) {
                k2 k2Var = iVar2 instanceof k2 ? (k2) iVar2 : null;
                if (k2Var != null) {
                    k2Var.b(a0Var2, i2);
                    return;
                }
                return;
            }
            if (objR != s.o) {
                if (objR == s.f280834n) {
                    throw new IllegalStateException("unexpected");
                }
                a0Var2.b();
                ((flm.h) iVar2).e = objR;
                return;
            }
            if (andIncrement < qVar2.w()) {
                a0Var2.b();
            }
            qVar = qVar2;
            iVar = iVar2;
        }
        ((flm.h) iVar).e = s.f280832l;
    }

    public static final int h(q qVar, a0 a0Var, int i2, Object obj2, long j2, Object obj3, boolean z) {
        a0Var.n(i2, obj2);
        if (z) {
            return qVar.S(a0Var, i2, obj2, j2, obj3, z);
        }
        Object objL = a0Var.l(i2);
        if (objL == null) {
            if (qVar.l(j2)) {
                if (a0Var.k(i2, null, s.d)) {
                    return 1;
                }
            } else {
                if (obj3 == null) {
                    return 3;
                }
                if (a0Var.k(i2, null, obj3)) {
                    return 2;
                }
            }
        } else if (objL instanceof k2) {
            a0Var.n(i2, null);
            if (qVar.P(objL, obj2)) {
                a0Var.o(i2, s.i);
                return 0;
            }
            cfm.c cVar = s.k;
            if (a0Var.f.getAndSet((i2 * 2) + 1, cVar) == cVar) {
                return 5;
            }
            a0Var.m(i2, true);
            return 5;
        }
        return qVar.S(a0Var, i2, obj2, j2, obj3, z);
    }

    public static void y(q qVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f280819g;
        if ((atomicLongFieldUpdater.addAndGet(qVar, 1L) & Longs.MAX_POWER_OF_TWO) != 0) {
            while ((atomicLongFieldUpdater.get(qVar) & Longs.MAX_POWER_OF_TWO) != 0) {
            }
        }
    }

    public final boolean A() {
        return z(d.get(this), true);
    }

    public final boolean B(long j2) {
        return z(j2, false);
    }

    public boolean C() {
        return false;
    }

    public final boolean D() {
        long j2 = f.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(long r5, ukm.a0 r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f323123c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            zkm.c r0 = r7.c()
            ukm.a0 r0 = (ukm.a0) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.d()
            if (r5 == 0) goto L22
            zkm.c r5 = r7.c()
            ukm.a0 r5 = (ukm.a0) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = ukm.q.f280821j
            java.lang.Object r6 = r5.get(r4)
            zkm.t r6 = (zkm.t) r6
            long r0 = r6.f323123c
            long r2 = r7.f323123c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.j()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.f()
            if (r5 == 0) goto L49
            r6.e()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.f()
            if (r5 == 0) goto L22
            r7.e()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: ukm.q.E(long, ukm.a0):void");
    }

    public void F() {
    }

    public final void H(flm.i iVar, Object obj2) {
        Function1 function1 = this.f280824b;
        if (function1 != null) {
            zkm.b.a(function1, obj2, ((flm.h) iVar).f136011a);
        }
        ((flm.h) iVar).e = s.f280832l;
    }

    public final Object I(Object obj2, Continuation frame) {
        UndeliveredElementException undeliveredElementExceptionB;
        skm.l lVar = new skm.l(1, fim.h.b(frame));
        lVar.u();
        Function1 function1 = this.f280824b;
        if (function1 == null || (undeliveredElementExceptionB = zkm.b.b(function1, obj2, null)) == null) {
            Throwable thU = u();
            m.Companion companion = yhm.m.INSTANCE;
            lVar.resumeWith(yhm.o.a(thU));
        } else {
            yhm.f.a(undeliveredElementExceptionB, u());
            m.Companion companion2 = yhm.m.INSTANCE;
            lVar.resumeWith(yhm.o.a(undeliveredElementExceptionB));
        }
        Object objT = lVar.t();
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objT == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT == aVar ? objT : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(ukm.a0 r17, int r18, long r19, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ukm.q.K(ukm.a0, int, long, gim.c):java.lang.Object");
    }

    public void L(flm.i iVar, Object obj2) {
        a0 a0Var;
        a0 a0Var2 = (a0) f280820h.get(this);
        while (true) {
            long andIncrement = d.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean z = z(andIncrement, false);
            int i2 = s.f280827b;
            long j3 = i2;
            long j5 = j2 / j3;
            int i3 = (int) (j2 % j3);
            if (a0Var2.f323123c != j5) {
                a0 a0VarA = a(this, j5, a0Var2);
                if (a0VarA != null) {
                    a0Var = a0VarA;
                } else if (z) {
                    H(iVar, obj2);
                    return;
                }
            } else {
                a0Var = a0Var2;
            }
            flm.i iVar2 = iVar;
            Object obj3 = obj2;
            int iH = h(this, a0Var, i3, obj3, j2, iVar2, z);
            a0Var2 = a0Var;
            if (iH == 0) {
                a0Var2.b();
                ((flm.h) iVar2).e = Unit.f186387a;
                return;
            }
            if (iH == 1) {
                ((flm.h) iVar2).e = Unit.f186387a;
                return;
            }
            if (iH == 2) {
                if (z) {
                    a0Var2.i();
                    H(iVar2, obj3);
                    return;
                } else {
                    k2 k2Var = iVar2 instanceof k2 ? (k2) iVar2 : null;
                    if (k2Var != null) {
                        k2Var.b(a0Var2, i3 + i2);
                        return;
                    }
                    return;
                }
            }
            if (iH == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iH == 4) {
                if (j2 < e.get(this)) {
                    a0Var2.b();
                }
                H(iVar2, obj3);
                return;
            } else {
                if (iH == 5) {
                    a0Var2.b();
                }
                obj2 = obj3;
                iVar = iVar2;
            }
        }
    }

    public final void M(k2 k2Var, boolean z) {
        if (k2Var instanceof h) {
            skm.l lVar = ((h) k2Var).f280814b;
            m.Companion companion = yhm.m.INSTANCE;
            lVar.resumeWith(Boolean.FALSE);
            return;
        }
        if (k2Var instanceof CancellableContinuation) {
            Continuation continuation = (Continuation) k2Var;
            m.Companion companion2 = yhm.m.INSTANCE;
            continuation.resumeWith(yhm.o.a(z ? t() : u()));
            return;
        }
        if (k2Var instanceof h0) {
            skm.l lVar2 = ((h0) k2Var).f280815a;
            m.Companion companion3 = yhm.m.INSTANCE;
            x xVar = z.Companion;
            Throwable thS = s();
            xVar.getClass();
            lVar2.resumeWith(new z(new w(thS)));
            return;
        }
        if (!(k2Var instanceof g)) {
            if (k2Var instanceof flm.i) {
                ((flm.h) ((flm.i) k2Var)).j(this, s.f280832l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + k2Var).toString());
            }
        }
        g gVar = (g) k2Var;
        skm.l lVar3 = gVar.f280811b;
        Intrinsics.h(lVar3);
        gVar.f280811b = null;
        gVar.f280810a = s.f280832l;
        Throwable thS2 = gVar.f280812c.s();
        if (thS2 == null) {
            m.Companion companion4 = yhm.m.INSTANCE;
            lVar3.resumeWith(Boolean.FALSE);
        } else {
            m.Companion companion5 = yhm.m.INSTANCE;
            lVar3.resumeWith(yhm.o.a(thS2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        r1 = yhm.m.INSTANCE;
        r0.resumeWith(java.lang.Boolean.TRUE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object N(java.lang.Object r15, ukm.c r16) {
        /*
            r14 = this;
            skm.l r0 = new skm.l
            kotlin.coroutines.Continuation r1 = fim.h.b(r16)
            r2 = 1
            r0.<init>(r2, r1)
            r0.u()
            kotlin.jvm.functions.Function1 r1 = r14.f280824b
            if (r1 != 0) goto Lac
            ukm.h r9 = new ukm.h
            r9.<init>(r0)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = ukm.q.f280820h
            java.lang.Object r1 = r1.get(r14)
            ukm.a0 r1 = (ukm.a0) r1
        L1e:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = ukm.q.d
            long r3 = r3.getAndIncrement(r14)
            r5 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r7 = r3 & r5
            r5 = 0
            boolean r10 = r14.z(r3, r5)
            int r11 = ukm.s.f280827b
            long r3 = (long) r11
            long r5 = r7 / r3
            long r3 = r7 % r3
            int r3 = (int) r3
            long r12 = r1.f323123c
            int r4 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r4 == 0) goto L52
            ukm.a0 r4 = a(r14, r5, r1)
            if (r4 != 0) goto L4e
            if (r10 == 0) goto L1e
        L46:
            yhm.m$a r1 = yhm.m.INSTANCE
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.resumeWith(r1)
            goto L9c
        L4e:
            r6 = r15
            r5 = r3
            r3 = r14
            goto L54
        L52:
            r4 = r1
            goto L4e
        L54:
            int r1 = h(r3, r4, r5, r6, r7, r9, r10)
            if (r1 == 0) goto L98
            if (r1 == r2) goto L90
            r6 = 2
            if (r1 == r6) goto L84
            r5 = 3
            if (r1 == r5) goto L7c
            r5 = 4
            if (r1 == r5) goto L6e
            r5 = 5
            if (r1 == r5) goto L69
            goto L6c
        L69:
            r4.b()
        L6c:
            r1 = r4
            goto L1e
        L6e:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = ukm.q.e
            long r1 = r1.get(r14)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 >= 0) goto L46
            r4.b()
            goto L46
        L7c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected"
            r0.<init>(r1)
            throw r0
        L84:
            if (r10 == 0) goto L8a
            r4.i()
            goto L46
        L8a:
            int r1 = r5 + r11
            r9.b(r4, r1)
            goto L9c
        L90:
            yhm.m$a r1 = yhm.m.INSTANCE
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.resumeWith(r1)
            goto L9c
        L98:
            r4.b()
            goto L90
        L9c:
            java.lang.Object r0 = r0.t()
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            if (r0 != r1) goto Lab
            java.lang.String r1 = "frame"
            r2 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
        Lab:
            return r0
        Lac:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ukm.q.N(java.lang.Object, ukm.c):java.lang.Object");
    }

    public boolean O() {
        if (B(d.get(this))) {
            return false;
        }
        return !l(r0 & 1152921504606846975L);
    }

    public final boolean P(Object obj2, Object obj3) {
        if (obj2 instanceof flm.i) {
            return ((flm.h) ((flm.i) obj2)).j(this, obj3);
        }
        boolean z = obj2 instanceof h0;
        Function1 function1 = this.f280824b;
        if (z) {
            skm.l lVar = ((h0) obj2).f280815a;
            z.Companion.getClass();
            return s.a(lVar, new z(obj3), function1 != null ? k() : null);
        }
        if (!(obj2 instanceof g)) {
            if (obj2 instanceof CancellableContinuation) {
                return s.a((CancellableContinuation) obj2, obj3, function1 != null ? i() : null);
            }
            throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.l(obj2, "Unexpected receiver type: "));
        }
        g gVar = (g) obj2;
        skm.l lVar2 = gVar.f280811b;
        Intrinsics.h(lVar2);
        gVar.f280811b = null;
        gVar.f280810a = obj3;
        Boolean bool = Boolean.TRUE;
        Function1 function12 = gVar.f280812c.f280824b;
        return s.a(lVar2, bool, function12 != null ? new tvh.e(function12, obj3, 13) : null);
    }

    public final boolean Q(Object obj2, a0 a0Var, int i2) {
        if (obj2 instanceof CancellableContinuation) {
            return s.a((CancellableContinuation) obj2, Unit.f186387a, null);
        }
        if (!(obj2 instanceof flm.i)) {
            if (obj2 instanceof h) {
                return s.a(((h) obj2).f280814b, Boolean.TRUE, null);
            }
            throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.l(obj2, "Unexpected waiter: "));
        }
        flm.l lVarK = ((flm.h) obj2).k(this, Unit.f186387a);
        if (lVarK == flm.l.REREGISTER) {
            a0Var.n(i2, null);
        }
        return lVarK == flm.l.SUCCESSFUL;
    }

    public final Object R(a0 a0Var, int i2, long j2, Object obj2) {
        Object objL = a0Var.l(i2);
        AtomicReferenceArray atomicReferenceArray = a0Var.f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        if (objL == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj2 == null) {
                    return s.f280834n;
                }
                if (a0Var.k(i2, objL, obj2)) {
                    q();
                    return s.f280833m;
                }
            }
        } else if (objL == s.d && a0Var.k(i2, objL, s.i)) {
            q();
            Object obj3 = atomicReferenceArray.get(i2 * 2);
            a0Var.n(i2, null);
            return obj3;
        }
        while (true) {
            Object objL2 = a0Var.l(i2);
            if (objL2 == null || objL2 == s.e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (a0Var.k(i2, objL2, s.f280830h)) {
                        q();
                        return s.o;
                    }
                } else {
                    if (obj2 == null) {
                        return s.f280834n;
                    }
                    if (a0Var.k(i2, objL2, obj2)) {
                        q();
                        return s.f280833m;
                    }
                }
            } else {
                if (objL2 != s.d) {
                    cfm.c cVar = s.f280831j;
                    if (objL2 != cVar && objL2 != s.f280830h) {
                        if (objL2 == s.f280832l) {
                            q();
                            return s.o;
                        }
                        if (objL2 != s.f280829g && a0Var.k(i2, objL2, s.f)) {
                            boolean z = objL2 instanceof k0;
                            if (z) {
                                objL2 = ((k0) objL2).f280816a;
                            }
                            if (Q(objL2, a0Var, i2)) {
                                a0Var.o(i2, s.i);
                                q();
                                Object obj4 = atomicReferenceArray.get(i2 * 2);
                                a0Var.n(i2, null);
                                return obj4;
                            }
                            a0Var.o(i2, cVar);
                            a0Var.i();
                            if (z) {
                                q();
                            }
                            return s.o;
                        }
                    }
                    return s.o;
                }
                if (a0Var.k(i2, objL2, s.i)) {
                    q();
                    Object obj5 = atomicReferenceArray.get(i2 * 2);
                    a0Var.n(i2, null);
                    return obj5;
                }
            }
        }
    }

    public final int S(a0 a0Var, int i2, Object obj2, long j2, Object obj3, boolean z) {
        while (true) {
            Object objL = a0Var.l(i2);
            if (objL == null) {
                if (!l(j2) || z) {
                    if (z) {
                        if (a0Var.k(i2, null, s.f280831j)) {
                            a0Var.i();
                            return 4;
                        }
                    } else {
                        if (obj3 == null) {
                            return 3;
                        }
                        if (a0Var.k(i2, null, obj3)) {
                            return 2;
                        }
                    }
                } else if (a0Var.k(i2, null, s.d)) {
                    break;
                }
            } else {
                if (objL != s.e) {
                    cfm.c cVar = s.k;
                    if (objL == cVar) {
                        a0Var.n(i2, null);
                        return 5;
                    }
                    if (objL == s.f280830h) {
                        a0Var.n(i2, null);
                        return 5;
                    }
                    if (objL == s.f280832l) {
                        a0Var.n(i2, null);
                        isClosedForSend();
                        return 4;
                    }
                    a0Var.n(i2, null);
                    if (objL instanceof k0) {
                        objL = ((k0) objL).f280816a;
                    }
                    if (P(objL, obj2)) {
                        a0Var.o(i2, s.i);
                        return 0;
                    }
                    if (a0Var.f.getAndSet((i2 * 2) + 1, cVar) != cVar) {
                        a0Var.m(i2, true);
                    }
                    return 5;
                }
                if (a0Var.k(i2, objL, s.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void T(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        q qVar = this;
        if (qVar.D()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f;
            if (atomicLongFieldUpdater.get(qVar) > j2) {
                break;
            } else {
                qVar = this;
            }
        }
        int i2 = s.f280828c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f280819g;
            if (i3 < i2) {
                long j3 = atomicLongFieldUpdater.get(qVar);
                if (j3 == (4611686018427387903L & atomicLongFieldUpdater2.get(qVar)) && j3 == atomicLongFieldUpdater.get(qVar)) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    long j5 = atomicLongFieldUpdater2.get(qVar);
                    if (atomicLongFieldUpdater2.compareAndSet(qVar, j5, (j5 & 4611686018427387903L) + Longs.MAX_POWER_OF_TWO)) {
                        break;
                    } else {
                        qVar = this;
                    }
                }
                while (true) {
                    long j16 = atomicLongFieldUpdater.get(qVar);
                    long j22 = atomicLongFieldUpdater2.get(qVar);
                    long j42 = j22 & 4611686018427387903L;
                    boolean z = (j22 & Longs.MAX_POWER_OF_TWO) != 0;
                    if (j16 == j42 && j16 == atomicLongFieldUpdater.get(qVar)) {
                        break;
                    }
                    if (z) {
                        qVar = this;
                    } else {
                        qVar = this;
                        atomicLongFieldUpdater2.compareAndSet(qVar, j22, Longs.MAX_POWER_OF_TWO + j42);
                    }
                }
                while (true) {
                    long j46 = atomicLongFieldUpdater2.get(qVar);
                    if (atomicLongFieldUpdater2.compareAndSet(qVar, j46, j46 & 4611686018427387903L)) {
                        return;
                    } else {
                        qVar = this;
                    }
                }
            }
        }
    }

    @Override // ukm.i0
    public final flm.d b() {
        k kVar = k.f;
        u0.f(3, kVar);
        l lVar = l.f;
        u0.f(3, lVar);
        return new twg.c(this, kVar, lVar, this.f280825c);
    }

    @Override // ukm.i0
    public final Object c() {
        a0 a0Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        long j2 = atomicLongFieldUpdater.get(this);
        long j3 = d.get(this);
        if (z(j3, true)) {
            x xVar = z.Companion;
            Throwable thS = s();
            xVar.getClass();
            return new w(thS);
        }
        long j5 = j3 & 1152921504606846975L;
        y yVar = z.f280842b;
        if (j2 >= j5) {
            z.Companion.getClass();
            return yVar;
        }
        Object obj2 = s.k;
        a0 a0Var2 = (a0) i.get(this);
        while (!A()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j16 = s.f280827b;
            long j22 = andIncrement / j16;
            int i2 = (int) (andIncrement % j16);
            if (a0Var2.f323123c != j22) {
                a0 a0VarR = r(j22, a0Var2);
                if (a0VarR == null) {
                    continue;
                } else {
                    a0Var = a0VarR;
                }
            } else {
                a0Var = a0Var2;
            }
            Object objR = R(a0Var, i2, andIncrement, obj2);
            a0 a0Var3 = a0Var;
            if (objR == s.f280833m) {
                k2 k2Var = obj2 instanceof k2 ? (k2) obj2 : null;
                if (k2Var != null) {
                    k2Var.b(a0Var3, i2);
                }
                T(andIncrement);
                a0Var3.i();
                z.Companion.getClass();
                return yVar;
            }
            if (objR != s.o) {
                if (objR == s.f280834n) {
                    throw new IllegalStateException("unexpected");
                }
                a0Var3.b();
                z.Companion.getClass();
                return objR;
            }
            if (andIncrement < w()) {
                a0Var3.b();
            }
            a0Var2 = a0Var3;
        }
        x xVar2 = z.Companion;
        Throwable thS2 = s();
        xVar2.getClass();
        return new w(thS2);
    }

    @Override // ukm.j0
    public boolean close(Throwable th10) {
        return n(th10, false);
    }

    @Override // ukm.i0
    public final void f(CancellationException cancellationException) {
        m(cancellationException);
    }

    @Override // ukm.i0
    public final flm.d g() {
        i iVar = i.f;
        u0.f(3, iVar);
        j jVar = j.f;
        u0.f(3, jVar);
        return new twg.c(this, iVar, jVar, this.f280825c);
    }

    @Override // ukm.j0
    public final flm.e getOnSend() {
        m mVar = m.f;
        u0.f(3, mVar);
        n nVar = n.f;
        u0.f(3, nVar);
        return new mp.p(this, 18, mVar, nVar);
    }

    public final eki.f i() {
        return new eki.f(3, this, q.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 5);
    }

    @Override // ukm.j0
    public final void invokeOnClose(Function1 function1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f280822l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, function1)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            cfm.c cVar = s.f280836q;
            if (obj2 != cVar) {
                if (obj2 != s.f280837r) {
                    throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.l(obj2, "Another handler is already registered: "));
                }
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            cfm.c cVar2 = s.f280837r;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, cVar, cVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != cVar) {
                    break;
                }
            }
            function1.invoke(s());
            return;
        }
    }

    @Override // ukm.j0
    public boolean isClosedForSend() {
        return z(d.get(this), false);
    }

    @Override // ukm.i0
    public final g iterator() {
        return new g(this);
    }

    @Override // ukm.i0
    public final Object j(Continuation frame) throws Throwable {
        a0 a0Var;
        Throwable th10;
        a0 a0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
        a0 a0Var3 = (a0) atomicReferenceFieldUpdater.get(this);
        while (!A()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j2 = s.f280827b;
            long j3 = andIncrement / j2;
            int i2 = (int) (andIncrement % j2);
            if (a0Var3.f323123c != j3) {
                a0 a0VarR = r(j3, a0Var3);
                if (a0VarR == null) {
                    continue;
                } else {
                    a0Var = a0VarR;
                }
            } else {
                a0Var = a0Var3;
            }
            Object objR = R(a0Var, i2, andIncrement, null);
            cfm.c cVar = s.f280833m;
            if (objR == cVar) {
                throw new IllegalStateException("unexpected");
            }
            cfm.c cVar2 = s.o;
            if (objR == cVar2) {
                if (andIncrement < w()) {
                    a0Var.b();
                }
                a0Var3 = a0Var;
            } else {
                if (objR != s.f280834n) {
                    a0Var.b();
                    return objR;
                }
                skm.l lVarU = skm.e0.u(fim.h.b(frame));
                q qVar = this;
                try {
                    Object objR2 = qVar.R(a0Var, i2, andIncrement, lVarU);
                    if (objR2 == cVar) {
                        lVarU.b(a0Var, i2);
                    } else {
                        Function1 function1 = qVar.f280824b;
                        if (objR2 == cVar2) {
                            if (andIncrement < w()) {
                                a0Var.b();
                            }
                            a0 a0Var4 = (a0) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (A()) {
                                    m.Companion companion = yhm.m.INSTANCE;
                                    lVarU.resumeWith(yhm.o.a(t()));
                                    break;
                                }
                                skm.l lVar = lVarU;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j5 = s.f280827b;
                                    long j16 = andIncrement2 / j5;
                                    int i3 = (int) (andIncrement2 % j5);
                                    if (a0Var4.f323123c != j16) {
                                        try {
                                            a0 a0VarR2 = r(j16, a0Var4);
                                            if (a0VarR2 == null) {
                                                lVarU = lVar;
                                            } else {
                                                a0Var2 = a0VarR2;
                                            }
                                        } catch (Throwable th11) {
                                            th10 = th11;
                                            lVarU = lVar;
                                            lVarU.C();
                                            throw th10;
                                        }
                                    } else {
                                        a0Var2 = a0Var4;
                                    }
                                    Object objR3 = qVar.R(a0Var2, i3, andIncrement2, lVar);
                                    a0 a0Var5 = a0Var2;
                                    lVarU = lVar;
                                    if (objR3 == s.f280833m) {
                                        lVarU.b(a0Var5, i3);
                                        break;
                                    }
                                    if (objR3 == s.o) {
                                        if (andIncrement2 < w()) {
                                            a0Var5.b();
                                        }
                                        qVar = this;
                                        a0Var4 = a0Var5;
                                    } else {
                                        if (objR3 == s.f280834n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        a0Var5.b();
                                        lVarU.e(objR3, function1 != null ? i() : null);
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    lVarU = lVar;
                                    th10 = th;
                                    lVarU.C();
                                    throw th10;
                                }
                            }
                        } else {
                            a0Var.b();
                            lVarU.e(objR2, function1 != null ? i() : null);
                        }
                    }
                    Object objT = lVarU.t();
                    if (objT == fim.a.COROUTINE_SUSPENDED) {
                        Intrinsics.checkNotNullParameter(frame, "frame");
                    }
                    return objT;
                } catch (Throwable th13) {
                    th = th13;
                }
            }
        }
        Throwable thT = t();
        int i5 = zkm.u.f323124a;
        throw thT;
    }

    public final eki.f k() {
        return new eki.f(3, this, q.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 6);
    }

    public final boolean l(long j2) {
        return j2 < f.get(this) || j2 < e.get(this) + ((long) this.f280823a);
    }

    public boolean m(Throwable th10) {
        if (th10 == null) {
            th10 = new CancellationException("Channel was cancelled");
        }
        return n(th10, true);
    }

    public final boolean n(Throwable th10, boolean z) {
        q qVar;
        boolean z3;
        long j2;
        long j3;
        long j5;
        Object obj2;
        long j16;
        long j22;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        if (!z) {
            qVar = this;
            break;
        }
        do {
            j22 = atomicLongFieldUpdater.get(this);
            if (((int) (j22 >> 60)) != 0) {
                qVar = this;
                break;
            }
            a0 a0Var = s.f280826a;
            qVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(qVar, j22, (j22 & 1152921504606846975L) + (((long) 1) << 60)));
        cfm.c cVar = s.f280838s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, cVar, th10)) {
                z3 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != cVar) {
                z3 = false;
                break;
            }
        }
        if (z) {
            do {
                j16 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(qVar, j16, (((long) 3) << 60) + (j16 & 1152921504606846975L)));
        } else {
            do {
                j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 >> 60);
                if (i2 == 0) {
                    j3 = j2 & 1152921504606846975L;
                    j5 = 2;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = j2 & 1152921504606846975L;
                    j5 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(qVar, j2, (j5 << 60) + j3));
        }
        isClosedForSend();
        F();
        if (z3) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f280822l;
                obj2 = atomicReferenceFieldUpdater2.get(this);
                cfm.c cVar2 = obj2 == null ? s.f280836q : s.f280837r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, cVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
            }
            if (obj2 != null) {
                u0.f(1, obj2);
                ((Function1) obj2).invoke(s());
                return z3;
            }
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r1 = (ukm.a0) ((zkm.c) zkm.c.f323099b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ukm.a0 o(long r13) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ukm.q.o(long):ukm.a0");
    }

    @Override // ukm.j0
    public final boolean offer(Object obj2) {
        return jh.d.n(this, obj2);
    }

    public void onError(Throwable th10) {
        close(th10);
    }

    public void onNext(Object obj2) {
        mo3647trySendJP2dKIU(obj2);
    }

    public final void p(long j2) {
        UndeliveredElementException undeliveredElementExceptionB;
        a0 a0Var = (a0) i.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(((long) this.f280823a) + j3, f.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, 1 + j3)) {
                long j5 = s.f280827b;
                long j16 = j3 / j5;
                int i2 = (int) (j3 % j5);
                if (a0Var.f323123c != j16) {
                    a0 a0VarR = r(j16, a0Var);
                    if (a0VarR == null) {
                        continue;
                    } else {
                        a0Var = a0VarR;
                    }
                }
                a0 a0Var2 = a0Var;
                Object objR = R(a0Var2, i2, j3, null);
                if (objR != s.o) {
                    a0Var2.b();
                    Function1 function1 = this.f280824b;
                    if (function1 != null && (undeliveredElementExceptionB = zkm.b.b(function1, objR, null)) != null) {
                        throw undeliveredElementExceptionB;
                    }
                } else if (j3 < w()) {
                    a0Var2.b();
                }
                a0Var = a0Var2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0181, code lost:
    
        y(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0184, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ukm.q.q():void");
    }

    public final a0 r(long j2, a0 a0Var) {
        Object objD;
        long j3;
        a0 a0Var2 = s.f280826a;
        r rVar = r.f;
        loop0: while (true) {
            objD = zkm.b.d(a0Var, j2, rVar);
            if (!zkm.b.h(objD)) {
                zkm.t tVarE = zkm.b.e(objD);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                    zkm.t tVar = (zkm.t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f323123c >= tVarE.f323123c) {
                        break loop0;
                    }
                    if (!tVarE.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, tVar, tVarE)) {
                        if (atomicReferenceFieldUpdater.get(this) != tVar) {
                            if (tVarE.f()) {
                                tVarE.e();
                            }
                        }
                    }
                    if (tVar.f()) {
                        tVar.e();
                    }
                }
            } else {
                break;
            }
        }
        if (zkm.b.h(objD)) {
            isClosedForSend();
            if (a0Var.f323123c * ((long) s.f280827b) < w()) {
                a0Var.b();
                return null;
            }
        } else {
            a0 a0Var3 = (a0) zkm.b.e(objD);
            long j5 = a0Var3.f323123c;
            if (!D() && j2 <= f.get(this) / ((long) s.f280827b)) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f280821j;
                    zkm.t tVar2 = (zkm.t) atomicReferenceFieldUpdater2.get(this);
                    if (tVar2.f323123c >= j5 || !a0Var3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, tVar2, a0Var3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != tVar2) {
                            if (a0Var3.f()) {
                                a0Var3.e();
                            }
                        }
                    }
                    if (tVar2.f()) {
                        tVar2.e();
                    }
                }
            }
            if (j5 <= j2) {
                return a0Var3;
            }
            long j16 = j5 * ((long) s.f280827b);
            do {
                j3 = e.get(this);
                if (j3 >= j16) {
                    break;
                }
            } while (!e.compareAndSet(this, j3, j16));
            if (j5 * ((long) s.f280827b) < w()) {
                a0Var3.b();
            }
        }
        return null;
    }

    public final Throwable s() {
        return (Throwable) k.get(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x019a, code lost:
    
        return kotlin.Unit.f186387a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c0, code lost:
    
        d(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017c A[RETURN] */
    @Override // ukm.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object send(java.lang.Object r23, kotlin.coroutines.Continuation r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ukm.q.send(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Throwable t() {
        Throwable thS = s();
        return thS == null ? new ClosedReceiveChannelException("Channel was closed") : thS;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c1, code lost:
    
        r16 = r7;
        r3 = (ukm.a0) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ca, code lost:
    
        if (r3 != null) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ukm.q.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d4, code lost:
    
        r1 = ukm.z.Companion;
        r2 = kotlin.Unit.f186387a;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00db, code lost:
    
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc A[SYNTHETIC] */
    @Override // ukm.j0
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo3647trySendJP2dKIU(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ukm.q.mo3647trySendJP2dKIU(java.lang.Object):java.lang.Object");
    }

    public final Throwable u() {
        Throwable thS = s();
        return thS == null ? new ClosedSendChannelException("Channel was closed") : thS;
    }

    @Override // ukm.i0
    public final Object v(gim.i iVar) {
        return J(this, iVar);
    }

    public final long w() {
        return d.get(this) & 1152921504606846975L;
    }

    public final boolean x() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            a0 a0VarR = (a0) atomicReferenceFieldUpdater.get(this);
            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
            long j2 = atomicLongFieldUpdater.get(this);
            if (w() <= j2) {
                return false;
            }
            int i2 = s.f280827b;
            long j3 = j2 / ((long) i2);
            if (a0VarR.f323123c == j3 || (a0VarR = r(j3, a0VarR)) != null) {
                a0VarR.b();
                int i3 = (int) (j2 % ((long) i2));
                while (true) {
                    Object objL = a0VarR.l(i3);
                    if (objL == null || objL == s.e) {
                        if (a0VarR.k(i3, objL, s.f280830h)) {
                            q();
                            break;
                        }
                    } else {
                        if (objL == s.d) {
                            return true;
                        }
                        if (objL != s.f280831j && objL != s.f280832l && objL != s.i && objL != s.f280830h) {
                            if (objL == s.f280829g) {
                                return true;
                            }
                            if (objL != s.f && j2 == atomicLongFieldUpdater.get(this)) {
                                return true;
                            }
                        }
                    }
                }
                e.compareAndSet(this, j2, j2 + 1);
            } else if (((a0) atomicReferenceFieldUpdater.get(this)).f323123c < j3) {
                return false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c0, code lost:
    
        r13 = (ukm.a0) ((zkm.c) zkm.c.f323099b.get(r13));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z(long r13, boolean r15) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ukm.q.z(long, boolean):boolean");
    }
}
