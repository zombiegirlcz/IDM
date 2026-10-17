package tfm;

import efm.c0;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends ofm.q implements Runnable, ifm.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Callable f270948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f270949h;
    public final TimeUnit i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f270950j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c0.a f270951l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Collection f270952m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ifm.c f270953n;
    public ifm.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f270954p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f270955q;

    public y(bgm.d dVar, Callable callable, long j2, TimeUnit timeUnit, int i, boolean z, c0.a aVar) {
        super(dVar, new ufm.g());
        this.f270948g = callable;
        this.f270949h = j2;
        this.i = timeUnit;
        this.f270950j = i;
        this.k = z;
        this.f270951l = aVar;
    }

    @Override // ofm.q
    public final void a(efm.y yVar, Object obj2) {
        yVar.onNext((Collection) obj2);
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.o.dispose();
        this.f270951l.dispose();
        synchronized (this) {
            this.f270952m = null;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.d;
    }

    @Override // efm.y
    public final void onComplete() {
        Collection collection;
        this.f270951l.dispose();
        synchronized (this) {
            collection = this.f270952m;
            this.f270952m = null;
        }
        if (collection != null) {
            this.f224947c.offer(collection);
            this.e = true;
            if (f()) {
                c6d.b.h(this.f224947c, this.f224946b, this, this);
            }
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        synchronized (this) {
            this.f270952m = null;
        }
        this.f224946b.onError(th10);
        this.f270951l.dispose();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:45:0x0076
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // efm.y
    public final void onNext(java.lang.Object r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.Collection r0 = r7.f270952m     // Catch: java.lang.Throwable -> L71
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
            int r1 = r7.f270950j     // Catch: java.lang.Throwable -> L71
            if (r8 >= r1) goto L19
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L7
            return
        L19:
            r8 = 0
            r7.f270952m = r8     // Catch: java.lang.Throwable -> L71
            long r1 = r7.f270954p     // Catch: java.lang.Throwable -> L71
            r3 = 1
            long r1 = r1 + r3
            r7.f270954p = r1     // Catch: java.lang.Throwable -> L71
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L71
            boolean r8 = r7.k
            if (r8 == 0) goto L2d
            ifm.c r8 = r7.f270953n
            r8.dispose()
        L2d:
            r7.i(r0, r7)
            java.util.concurrent.Callable r8 = r7.f270948g     // Catch: java.lang.Throwable -> L62
            java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = "The buffer supplied is null"
            mfm.f.b(r8, r0)     // Catch: java.lang.Throwable -> L62
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Throwable -> L62
            monitor-enter(r7)
            r7.f270952m = r8     // Catch: java.lang.Throwable -> L5b
            long r0 = r7.f270955q     // Catch: java.lang.Throwable -> L5b
            long r0 = r0 + r3
            r7.f270955q = r0     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L5b
            boolean r8 = r7.k
            if (r8 == 0) goto L59
            efm.c0$a r0 = r7.f270951l
            long r2 = r7.f270949h
            java.util.concurrent.TimeUnit r6 = r7.i
            r4 = r2
            r1 = r7
            ifm.c r8 = r0.c(r1, r2, r4, r6)
            r1.f270953n = r8
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
            m70.a.u(r8)
            bgm.d r0 = r1.f224946b
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
        throw new UnsupportedOperationException("Method not decompiled: tfm.y.onNext(java.lang.Object):void");
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        bgm.d dVar = this.f224946b;
        if (lfm.d.f(this.o, cVar)) {
            this.o = cVar;
            try {
                Object objCall = this.f270948g.call();
                mfm.f.b(objCall, "The buffer supplied is null");
                this.f270952m = (Collection) objCall;
                dVar.onSubscribe(this);
                long j2 = this.f270949h;
                this.f270953n = this.f270951l.c(this, j2, j2, this.i);
            } catch (Throwable th10) {
                m70.a.u(th10);
                cVar.dispose();
                lfm.e.d(th10, dVar);
                this.f270951l.dispose();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Object objCall = this.f270948g.call();
            mfm.f.b(objCall, "The bufferSupplier returned a null buffer");
            Collection collection = (Collection) objCall;
            synchronized (this) {
                Collection collection2 = this.f270952m;
                if (collection2 != null && this.f270954p == this.f270955q) {
                    this.f270952m = collection;
                    i(collection2, this);
                }
            }
        } catch (Throwable th10) {
            m70.a.u(th10);
            dispose();
            this.f224946b.onError(th10);
        }
    }
}
