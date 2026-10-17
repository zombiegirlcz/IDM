package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class z extends ngm.n implements Runnable, Disposable {
    public final igm.q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f263307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TimeUnit f263308h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f263309j;
    public final fgm.o k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Collection f263310l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Disposable f263311m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Disposable f263312n;
    public long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f263313p;

    public z(ahm.c cVar, igm.q qVar, long j2, TimeUnit timeUnit, int i, boolean z, fgm.o oVar) {
        super(cVar, new su9.c());
        this.f = qVar;
        this.f263307g = j2;
        this.f263308h = timeUnit;
        this.i = i;
        this.f263309j = z;
        this.k = oVar;
    }

    @Override // ngm.n
    public final void b(fgm.l lVar, Object obj2) {
        lVar.onNext((Collection) obj2);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.f263312n.dispose();
        this.k.dispose();
        synchronized (this) {
            this.f263310l = null;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.d;
    }

    @Override // fgm.l
    public final void onComplete() {
        Collection collection;
        this.k.dispose();
        synchronized (this) {
            collection = this.f263310l;
            this.f263310l = null;
        }
        if (collection != null) {
            this.f215263c.offer(collection);
            this.e = true;
            if (j()) {
                z92.f.f(this.f215263c, this.f215262b, this, this);
            }
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        synchronized (this) {
            this.f263310l = null;
        }
        this.f215262b.onError(th10);
        this.k.dispose();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:45:0x0076
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // fgm.l
    public final void onNext(java.lang.Object r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.Collection r0 = r7.f263310l     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto Lc
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L74
        Lc:
            r0.add(r8)     // Catch: java.lang.Throwable -> L71
            int r8 = r0.size()     // Catch: java.lang.Throwable -> L71
            int r1 = r7.i     // Catch: java.lang.Throwable -> L71
            if (r8 >= r1) goto L19
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L7
            return
        L19:
            r8 = 0
            r7.f263310l = r8     // Catch: java.lang.Throwable -> L71
            long r1 = r7.o     // Catch: java.lang.Throwable -> L71
            r3 = 1
            long r1 = r1 + r3
            r7.o = r1     // Catch: java.lang.Throwable -> L71
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L71
            boolean r8 = r7.f263309j
            if (r8 == 0) goto L2d
            io.reactivex.rxjava3.disposables.Disposable r8 = r7.f263311m
            r8.dispose()
        L2d:
            r7.l(r0, r7)
            igm.q r8 = r7.f     // Catch: java.lang.Throwable -> L62
            java.lang.Object r8 = r8.get()     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = "The buffer supplied is null"
            java.util.Objects.requireNonNull(r8, r0)     // Catch: java.lang.Throwable -> L62
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Throwable -> L62
            monitor-enter(r7)
            r7.f263310l = r8     // Catch: java.lang.Throwable -> L5b
            long r0 = r7.f263313p     // Catch: java.lang.Throwable -> L5b
            long r0 = r0 + r3
            r7.f263313p = r0     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L5b
            boolean r8 = r7.f263309j
            if (r8 == 0) goto L59
            fgm.o r0 = r7.k
            long r2 = r7.f263307g
            java.util.concurrent.TimeUnit r6 = r7.f263308h
            r4 = r2
            r1 = r7
            io.reactivex.rxjava3.disposables.Disposable r8 = r0.c(r1, r2, r4, r6)
            r1.f263311m = r8
            return
        L59:
            r1 = r7
            return
        L5b:
            r0 = move-exception
            r1 = r7
        L5d:
            r8 = r0
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L60
            throw r8
        L60:
            r0 = move-exception
            goto L5d
        L62:
            r0 = move-exception
            r1 = r7
            r8 = r0
            ce9.m.F(r8)
            ahm.c r0 = r1.f215262b
            r0.onError(r8)
            r7.dispose()
            return
        L71:
            r0 = move-exception
            r1 = r7
        L73:
            r8 = r0
        L74:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L76
            throw r8
        L76:
            r0 = move-exception
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: sgm.z.onNext(java.lang.Object):void");
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        ahm.c cVar = this.f215262b;
        if (jgm.b.f(this.f263312n, disposable)) {
            this.f263312n = disposable;
            try {
                Object obj2 = this.f.get();
                Objects.requireNonNull(obj2, "The buffer supplied is null");
                this.f263310l = (Collection) obj2;
                cVar.onSubscribe(this);
                long j2 = this.f263307g;
                this.f263311m = this.k.c(this, j2, j2, this.f263308h);
            } catch (Throwable th10) {
                ce9.m.F(th10);
                disposable.dispose();
                jgm.c.c(th10, cVar);
                this.k.dispose();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Object obj2 = this.f.get();
            Objects.requireNonNull(obj2, "The bufferSupplier returned a null buffer");
            Collection collection = (Collection) obj2;
            synchronized (this) {
                Collection collection2 = this.f263310l;
                if (collection2 != null && this.o == this.f263313p) {
                    this.f263310l = collection;
                    l(collection2, this);
                }
            }
        } catch (Throwable th10) {
            ce9.m.F(th10);
            dispose();
            this.f215262b.onError(th10);
        }
    }
}
