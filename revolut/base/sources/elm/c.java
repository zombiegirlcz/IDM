package elm;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f127529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ref$ObjectRef f127530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f127531c;
    public long d;
    public long e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f127532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f127533h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public c(e eVar, int i2) {
        this.f127533h = eVar;
        setDaemon(true);
        setContextClassLoader(e.class.getClassLoader());
        this.f127529a = new o();
        this.f127530b = new Ref$ObjectRef();
        this.f127531c = d.DORMANT;
        this.nextParkedWorker = e.k;
        int iNanoTime = (int) System.nanoTime();
        this.f = iNanoTime == 0 ? 42 : iNanoTime;
        f(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final elm.k a(boolean r12) {
        /*
            r11 = this;
            elm.d r0 = r11.f127531c
            elm.d r1 = elm.d.CPU_ACQUIRED
            elm.e r3 = r11.f127533h
            r8 = 0
            r9 = 1
            elm.o r10 = r11.f127529a
            if (r0 != r1) goto Le
            goto L7f
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = elm.e.i
        L10:
            long r4 = r0.get(r3)
            r1 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r1 = r1 & r4
            r6 = 42
            long r1 = r1 >> r6
            int r1 = (int) r1
            if (r1 != 0) goto L6c
            r10.getClass()
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = elm.o.f127552b
            java.lang.Object r0 = r12.get(r10)
            elm.k r0 = (elm.k) r0
            if (r0 != 0) goto L2e
            goto L3a
        L2e:
            boolean r1 = r0.f127546b
            if (r1 != r9) goto L3a
            boolean r12 = ehe.n.C(r12, r10, r0)
            if (r12 == 0) goto L23
            r8 = r0
            goto L5a
        L3a:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = elm.o.d
            int r12 = r12.get(r10)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = elm.o.f127553c
            int r0 = r0.get(r10)
        L46:
            if (r12 == r0) goto L5a
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = elm.o.e
            int r1 = r1.get(r10)
            if (r1 != 0) goto L51
            goto L5a
        L51:
            int r0 = r0 + (-1)
            elm.k r1 = r10.c(r0, r9)
            if (r1 == 0) goto L46
            r8 = r1
        L5a:
            if (r8 != 0) goto L6b
            elm.h r12 = r3.f
            java.lang.Object r12 = r12.c()
            elm.k r12 = (elm.k) r12
            if (r12 != 0) goto L6a
            elm.k r12 = r11.i(r9)
        L6a:
            return r12
        L6b:
            return r8
        L6c:
            r1 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r6 = r4 - r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = elm.e.i
            boolean r1 = r2.compareAndSet(r3, r4, r6)
            if (r1 == 0) goto L10
            elm.d r0 = elm.d.CPU_ACQUIRED
            r11.f127531c = r0
        L7f:
            if (r12 == 0) goto Lb3
            int r12 = r3.f127536a
            int r12 = r12 * 2
            int r12 = r11.d(r12)
            if (r12 != 0) goto L8c
            goto L8d
        L8c:
            r9 = 0
        L8d:
            if (r9 == 0) goto L96
            elm.k r12 = r11.e()
            if (r12 == 0) goto L96
            return r12
        L96:
            r10.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = elm.o.f127552b
            java.lang.Object r12 = r12.getAndSet(r10, r8)
            elm.k r12 = (elm.k) r12
            if (r12 != 0) goto La7
            elm.k r12 = r10.b()
        La7:
            if (r12 == 0) goto Laa
            return r12
        Laa:
            if (r9 != 0) goto Lba
            elm.k r12 = r11.e()
            if (r12 == 0) goto Lba
            return r12
        Lb3:
            elm.k r12 = r11.e()
            if (r12 == 0) goto Lba
            return r12
        Lba:
            r12 = 3
            elm.k r12 = r11.i(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: elm.c.a(boolean):elm.k");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i2) {
        int i3 = this.f;
        int i5 = i3 ^ (i3 << 13);
        int i6 = i5 ^ (i5 >> 17);
        int i21 = i6 ^ (i6 << 5);
        this.f = i21;
        int i22 = i2 - 1;
        return (i22 & i2) == 0 ? i21 & i22 : (i21 & Integer.MAX_VALUE) % i2;
    }

    public final k e() {
        int iD = d(2);
        e eVar = this.f127533h;
        if (iD == 0) {
            k kVar = (k) eVar.e.c();
            return kVar != null ? kVar : (k) eVar.f.c();
        }
        k kVar2 = (k) eVar.f.c();
        return kVar2 != null ? kVar2 : (k) eVar.e.c();
    }

    public final void f(int i2) {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.f127533h.d);
        sb6.append("-worker-");
        sb6.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb6.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj2) {
        this.nextParkedWorker = obj2;
    }

    public final boolean h(d dVar) {
        d dVar2 = this.f127531c;
        boolean z = dVar2 == d.CPU_ACQUIRED;
        if (z) {
            e.i.addAndGet(this.f127533h, 4398046511104L);
        }
        if (dVar2 != dVar) {
            this.f127531c = dVar;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        r7 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final elm.k i(int r26) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: elm.c.i(int):elm.k");
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: elm.c.run():void");
    }
}
