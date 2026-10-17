package sfm;

import efm.y;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends AtomicInteger implements y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f262519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f262520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zfm.c f262521c = new zfm.c();
    public final rgm.d d = new rgm.d(this, 4);
    public final vfm.c e;
    public final zfm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ifm.c f262522g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f262523h;
    public volatile boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f262524j;
    public volatile int k;

    public g(y yVar, kfm.o oVar, int i, zfm.f fVar) {
        this.f262519a = yVar;
        this.f262520b = oVar;
        this.f = fVar;
        this.e = new vfm.c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r2.clear();
        r10.f262524j = null;
        r0.onError(zfm.h.b(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r10 = this;
            int r0 = r10.getAndIncrement()
            if (r0 == 0) goto L8
            goto La1
        L8:
            efm.y r0 = r10.f262519a
            zfm.f r1 = r10.f
            vfm.c r2 = r10.e
            zfm.c r3 = r10.f262521c
            r4 = 1
            r5 = r4
        L12:
            boolean r6 = r10.i
            r7 = 0
            if (r6 == 0) goto L1e
            r2.clear()
            r10.f262524j = r7
            goto L9a
        L1e:
            int r6 = r10.k
            java.lang.Object r8 = r3.get()
            if (r8 == 0) goto L3d
            zfm.f r8 = zfm.f.IMMEDIATE
            if (r1 == r8) goto L30
            zfm.f r8 = zfm.f.BOUNDARY
            if (r1 != r8) goto L3d
            if (r6 != 0) goto L3d
        L30:
            r2.clear()
            r10.f262524j = r7
            java.lang.Throwable r1 = zfm.h.b(r3)
            r0.onError(r1)
            return
        L3d:
            r8 = 0
            if (r6 != 0) goto L8c
            boolean r6 = r10.f262523h
            java.lang.Object r7 = r2.poll()
            if (r7 != 0) goto L49
            r8 = r4
        L49:
            if (r6 == 0) goto L5b
            if (r8 == 0) goto L5b
            java.lang.Throwable r1 = zfm.h.b(r3)
            if (r1 != 0) goto L57
            r0.onComplete()
            return
        L57:
            r0.onError(r1)
            return
        L5b:
            if (r8 == 0) goto L5e
            goto L9a
        L5e:
            kfm.o r6 = r10.f262520b     // Catch: java.lang.Throwable -> L75
            java.lang.Object r6 = r6.apply(r7)     // Catch: java.lang.Throwable -> L75
            java.lang.String r7 = "The mapper returned a null MaybeSource"
            mfm.f.b(r6, r7)     // Catch: java.lang.Throwable -> L75
            efm.n r6 = (efm.n) r6     // Catch: java.lang.Throwable -> L75
            r10.k = r4
            rgm.d r7 = r10.d
            efm.k r6 = (efm.k) r6
            r6.i(r7)
            goto L9a
        L75:
            r1 = move-exception
            m70.a.u(r1)
            ifm.c r4 = r10.f262522g
            r4.dispose()
            r2.clear()
            zfm.h.a(r3, r1)
            java.lang.Throwable r1 = zfm.h.b(r3)
            r0.onError(r1)
            return
        L8c:
            r9 = 2
            if (r6 != r9) goto L9a
            java.lang.Object r6 = r10.f262524j
            r10.f262524j = r7
            r0.onNext(r6)
            r10.k = r8
            goto L12
        L9a:
            int r5 = -r5
            int r5 = r10.addAndGet(r5)
            if (r5 != 0) goto L12
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sfm.g.a():void");
    }

    @Override // ifm.c
    public final void dispose() {
        this.i = true;
        this.f262522g.dispose();
        rgm.d dVar = this.d;
        dVar.getClass();
        lfm.d.a(dVar);
        if (getAndIncrement() == 0) {
            this.e.clear();
            this.f262524j = null;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.i;
    }

    @Override // efm.y
    public final void onComplete() {
        this.f262523h = true;
        a();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        zfm.c cVar = this.f262521c;
        cVar.getClass();
        if (!zfm.h.a(cVar, th10)) {
            mo3.a.m(th10);
            return;
        }
        if (this.f == zfm.f.IMMEDIATE) {
            rgm.d dVar = this.d;
            dVar.getClass();
            lfm.d.a(dVar);
        }
        this.f262523h = true;
        a();
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        this.e.offer(obj2);
        a();
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f262522g, cVar)) {
            this.f262522g = cVar;
            this.f262519a.onSubscribe(this);
        }
    }
}
