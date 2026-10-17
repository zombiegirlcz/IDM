package sfm;

import efm.y;
import java.util.concurrent.atomic.AtomicInteger;
import rfm.a0;

/* JADX INFO: loaded from: classes13.dex */
public final class i extends AtomicInteger implements y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f262528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f262529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zfm.c f262530c = new zfm.c();
    public final a0 d = new a0(this, 1);
    public final vfm.c e;
    public final zfm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ifm.c f262531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f262532h;
    public volatile boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f262533j;
    public volatile int k;

    public i(y yVar, kfm.o oVar, int i, zfm.f fVar) {
        this.f262528a = yVar;
        this.f262529b = oVar;
        this.f = fVar;
        this.e = new vfm.c(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r2.clear();
        r10.f262533j = null;
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
            efm.y r0 = r10.f262528a
            zfm.f r1 = r10.f
            vfm.c r2 = r10.e
            zfm.c r3 = r10.f262530c
            r4 = 1
            r5 = r4
        L12:
            boolean r6 = r10.i
            r7 = 0
            if (r6 == 0) goto L1e
            r2.clear()
            r10.f262533j = r7
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
            r10.f262533j = r7
            java.lang.Throwable r1 = zfm.h.b(r3)
            r0.onError(r1)
            return
        L3d:
            r8 = 0
            if (r6 != 0) goto L8c
            boolean r6 = r10.f262532h
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
            kfm.o r6 = r10.f262529b     // Catch: java.lang.Throwable -> L75
            java.lang.Object r6 = r6.apply(r7)     // Catch: java.lang.Throwable -> L75
            java.lang.String r7 = "The mapper returned a null SingleSource"
            mfm.f.b(r6, r7)     // Catch: java.lang.Throwable -> L75
            efm.h0 r6 = (efm.h0) r6     // Catch: java.lang.Throwable -> L75
            r10.k = r4
            rfm.a0 r7 = r10.d
            efm.d0 r6 = (efm.d0) r6
            r6.q(r7)
            goto L9a
        L75:
            r1 = move-exception
            m70.a.u(r1)
            ifm.c r4 = r10.f262531g
            r4.dispose()
            r2.clear()
            zfm.h.a(r3, r1)
            java.lang.Throwable r1 = zfm.h.b(r3)
            r0.onError(r1)
            return
        L8c:
            r9 = 2
            if (r6 != r9) goto L9a
            java.lang.Object r6 = r10.f262533j
            r10.f262533j = r7
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
        throw new UnsupportedOperationException("Method not decompiled: sfm.i.a():void");
    }

    @Override // ifm.c
    public final void dispose() {
        this.i = true;
        this.f262531g.dispose();
        a0 a0Var = this.d;
        a0Var.getClass();
        lfm.d.a(a0Var);
        if (getAndIncrement() == 0) {
            this.e.clear();
            this.f262533j = null;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.i;
    }

    @Override // efm.y
    public final void onComplete() {
        this.f262532h = true;
        a();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        zfm.c cVar = this.f262530c;
        cVar.getClass();
        if (!zfm.h.a(cVar, th10)) {
            mo3.a.m(th10);
            return;
        }
        if (this.f == zfm.f.IMMEDIATE) {
            a0 a0Var = this.d;
            a0Var.getClass();
            lfm.d.a(a0Var);
        }
        this.f262532h = true;
        a();
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        this.e.offer(obj2);
        a();
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f262531g, cVar)) {
            this.f262531g = cVar;
            this.f262528a.onSubscribe(this);
        }
    }
}
