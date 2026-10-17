package tfm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class s7 extends ofm.q implements ifm.c, Runnable {
    public static final Object o = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f270822g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TimeUnit f270823h;
    public final efm.c0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f270824j;
    public ifm.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ihm.m f270825l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final lfm.b f270826m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f270827n;

    public s7(bgm.d dVar, long j2, TimeUnit timeUnit, efm.c0 c0Var, int i) {
        super(dVar, new ufm.g());
        this.f270826m = new lfm.b(1);
        this.f270822g = j2;
        this.f270823h = timeUnit;
        this.i = c0Var;
        this.f270824j = i;
    }

    @Override // ifm.c
    public final void dispose() {
        this.d = true;
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        r3.onComplete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r0 = r8.f270826m;
        r0.getClass();
        lfm.d.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        r8.f270825l = null;
        r1.clear();
        r0 = r8.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r3.onError(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j0() {
        /*
            r8 = this;
            java.lang.Object r0 = tfm.s7.o
            ufm.g r1 = r8.f224947c
            bgm.d r2 = r8.f224946b
            ihm.m r3 = r8.f270825l
            r4 = 1
        L9:
            boolean r5 = r8.f270827n
            boolean r6 = r8.e
            java.lang.Object r7 = r1.poll()
            if (r6 == 0) goto L31
            if (r7 == 0) goto L17
            if (r7 != r0) goto L31
        L17:
            r0 = 0
            r8.f270825l = r0
            r1.clear()
            java.lang.Throwable r0 = r8.f
            if (r0 == 0) goto L25
            r3.onError(r0)
            goto L28
        L25:
            r3.onComplete()
        L28:
            lfm.b r0 = r8.f270826m
            r0.getClass()
            lfm.d.a(r0)
            return
        L31:
            if (r7 != 0) goto L3d
            int r4 = -r4
            java.util.concurrent.atomic.AtomicInteger r5 = r8.f224945a
            int r4 = r5.addAndGet(r4)
            if (r4 != 0) goto L9
            return
        L3d:
            if (r7 != r0) goto L58
            r3.onComplete()
            if (r5 != 0) goto L52
            int r3 = r8.f270824j
            ihm.m r5 = new ihm.m
            r5.<init>(r3)
            r8.f270825l = r5
            r2.onNext(r5)
            r3 = r5
            goto L9
        L52:
            ifm.c r5 = r8.k
            r5.dispose()
            goto L9
        L58:
            r3.onNext(r7)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: tfm.s7.j0():void");
    }

    @Override // efm.y
    public final void onComplete() {
        this.e = true;
        if (f()) {
            j0();
        }
        this.f224946b.onComplete();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.f = th10;
        this.e = true;
        if (f()) {
            j0();
        }
        this.f224946b.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.f270827n) {
            return;
        }
        if (g()) {
            this.f270825l.onNext(obj2);
            if (this.f224945a.addAndGet(-1) == 0) {
                return;
            }
        } else {
            this.f224947c.offer(obj2);
            if (!f()) {
                return;
            }
        }
        j0();
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.k, cVar)) {
            this.k = cVar;
            this.f270825l = new ihm.m(this.f270824j);
            bgm.d dVar = this.f224946b;
            dVar.onSubscribe(this);
            dVar.onNext(this.f270825l);
            if (!this.d) {
                efm.c0 c0Var = this.i;
                long j2 = this.f270822g;
                ifm.c cVarE = c0Var.e(this, j2, j2, this.f270823h);
                lfm.b bVar = this.f270826m;
                bVar.getClass();
                lfm.d.c(bVar, cVarE);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d) {
            this.f270827n = true;
        }
        this.f224947c.offer(o);
        if (f()) {
            j0();
        }
    }
}
