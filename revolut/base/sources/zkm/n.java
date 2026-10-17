package zkm;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class n {

    @NotNull
    public static final l Companion = new l();
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(n.class, "_state$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final cfm.c f323115g = new cfm.c("REMOVE_FROZEN", 3);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f323116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f323117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f323118c;
    public final /* synthetic */ AtomicReferenceArray d;

    public n(int i, boolean z) {
        this.f323116a = i;
        this.f323117b = z;
        int i2 = i - 1;
        this.f323118c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object obj2) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j2 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j2) != 0) {
                Companion.getClass();
                return (2305843009213693952L & j2) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j2);
            int i2 = (int) ((1152921503533105152L & j2) >> 30);
            int i3 = this.f323118c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.f323117b;
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                Companion.getClass();
                if (f.compareAndSet(this, j2, ((-1152921503533105153L) & j2) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj2);
                    n nVarC = this;
                    while ((atomicLongFieldUpdater.get(nVarC) & 1152921504606846976L) != 0) {
                        nVarC = nVarC.c();
                        AtomicReferenceArray atomicReferenceArray2 = nVarC.d;
                        int i5 = nVarC.f323118c & i2;
                        Object obj3 = atomicReferenceArray2.get(i5);
                        if ((obj3 instanceof m) && ((m) obj3).f323114a == i2) {
                            atomicReferenceArray2.set(i5, obj2);
                        } else {
                            nVarC = null;
                        }
                        if (nVarC == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i6 = this.f323116a;
                if (i6 < 1024 || ((i2 - i) & 1073741823) > (i6 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        do {
            atomicLongFieldUpdater = f;
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, 2305843009213693952L | j2));
        return true;
    }

    public final n c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        n nVar;
        while (true) {
            atomicLongFieldUpdater = f;
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 1152921504606846976L) != 0) {
                nVar = this;
                break;
            }
            long j3 = 1152921504606846976L | j2;
            nVar = this;
            if (atomicLongFieldUpdater.compareAndSet(nVar, j2, j3)) {
                j2 = j3;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            n nVar2 = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar2 != null) {
                return nVar2;
            }
            n nVar3 = new n(nVar.f323116a * 2, nVar.f323117b);
            int i = (int) (1073741823 & j2);
            int i2 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i3 = nVar.f323118c;
                int i5 = i & i3;
                if (i5 != (i3 & i2)) {
                    Object mVar = nVar.d.get(i5);
                    if (mVar == null) {
                        mVar = new m(i);
                    }
                    nVar3.d.set(nVar3.f323118c & i, mVar);
                    i++;
                }
            }
            Companion.getClass();
            atomicLongFieldUpdater.set(nVar3, (-1152921504606846977L) & j2);
            z9h.n.n(atomicReferenceFieldUpdater, this, nVar3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d() {
        /*
            r30 = this;
            r1 = r30
        L2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = zkm.n.f
            long r2 = r6.get(r1)
            r7 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r7
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L15
            cfm.c r0 = zkm.n.f323115g
            return r0
        L15:
            r11 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r2 & r11
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r13 = 30
            long r4 = r4 >> r13
            int r4 = (int) r4
            int r5 = r1.f323118c
            r4 = r4 & r5
            r13 = r0 & r5
            r14 = 0
            if (r4 != r13) goto L2e
            goto L41
        L2e:
            java.util.concurrent.atomic.AtomicReferenceArray r15 = r1.d
            java.lang.Object r4 = r15.get(r13)
            boolean r5 = r1.f323117b
            if (r4 != 0) goto L3b
            if (r5 == 0) goto L2
            goto L41
        L3b:
            r16 = r7
            boolean r7 = r4 instanceof zkm.m
            if (r7 == 0) goto L42
        L41:
            return r14
        L42:
            int r0 = r0 + 1
            r7 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r0 & r7
            zkm.l r7 = zkm.n.Companion
            r7.getClass()
            r7 = -1073741824(0xffffffffc0000000, double:NaN)
            long r18 = r2 & r7
            r20 = r7
            long r7 = (long) r0
            long r18 = r18 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = zkm.n.f
            r28 = r18
            r18 = r4
            r19 = r5
            r4 = r28
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L6b
            r15.set(r13, r14)
            return r18
        L6b:
            r1 = r30
            if (r19 == 0) goto L2
        L6f:
            long r24 = r6.get(r1)
            long r2 = r24 & r11
            int r0 = (int) r2
            long r2 = r24 & r16
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 == 0) goto L82
            zkm.n r0 = r1.c()
            r1 = r0
            goto La0
        L82:
            zkm.l r2 = zkm.n.Companion
            r2.getClass()
            long r2 = r24 & r20
            long r26 = r2 | r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r22 = zkm.n.f
            r23 = r1
            boolean r1 = r22.compareAndSet(r23, r24, r26)
            r2 = r23
            if (r1 == 0) goto La3
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.d
            int r2 = r2.f323118c
            r0 = r0 & r2
            r1.set(r0, r14)
            r1 = r14
        La0:
            if (r1 != 0) goto L6f
            return r18
        La3:
            r1 = r2
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: zkm.n.d():java.lang.Object");
    }
}
