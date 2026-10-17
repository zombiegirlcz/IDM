package sgm;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes14.dex */
public final class t3 extends ngm.b implements fgm.l, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fgm.o f263178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f263179c;
    public final int d;
    public bhm.g e;
    public Disposable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Throwable f263180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f263181h;
    public volatile boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f263182j;
    public boolean k;

    public t3(fgm.l lVar, fgm.o oVar, boolean z, int i) {
        this.f263177a = lVar;
        this.f263178b = oVar;
        this.f263179c = z;
        this.d = i;
    }

    public final boolean a(boolean z, boolean z3, fgm.l lVar) {
        if (this.i) {
            this.e.clear();
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th10 = this.f263180g;
        if (this.f263179c) {
            if (!z3) {
                return false;
            }
            this.i = true;
            if (th10 != null) {
                lVar.onError(th10);
            } else {
                lVar.onComplete();
            }
            this.f263178b.dispose();
            return true;
        }
        if (th10 != null) {
            this.i = true;
            this.e.clear();
            lVar.onError(th10);
            this.f263178b.dispose();
            return true;
        }
        if (!z3) {
            return false;
        }
        this.i = true;
        lVar.onComplete();
        this.f263178b.dispose();
        return true;
    }

    @Override // bhm.c
    public final int b(int i) {
        this.k = true;
        return 2;
    }

    @Override // bhm.g
    public final void clear() {
        this.e.clear();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f.dispose();
        this.f263178b.dispose();
        if (this.k || getAndIncrement() != 0) {
            return;
        }
        this.e.clear();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.i;
    }

    @Override // bhm.g
    public final boolean isEmpty() {
        return this.e.isEmpty();
    }

    @Override // fgm.l
    public final void onComplete() {
        if (this.f263181h) {
            return;
        }
        this.f263181h = true;
        if (getAndIncrement() == 0) {
            this.f263178b.b(this);
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.f263181h) {
            jb3.l.v(th10);
            return;
        }
        this.f263180g = th10;
        this.f263181h = true;
        if (getAndIncrement() == 0) {
            this.f263178b.b(this);
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.f263181h) {
            return;
        }
        if (this.f263182j != 2) {
            this.e.offer(obj2);
        }
        if (getAndIncrement() == 0) {
            this.f263178b.b(this);
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f, disposable)) {
            this.f = disposable;
            if (disposable instanceof bhm.b) {
                bhm.b bVar = (bhm.b) disposable;
                int iB = bVar.b(7);
                if (iB == 1) {
                    this.f263182j = iB;
                    this.e = bVar;
                    this.f263181h = true;
                    this.f263177a.onSubscribe(this);
                    if (getAndIncrement() == 0) {
                        this.f263178b.b(this);
                        return;
                    }
                    return;
                }
                if (iB == 2) {
                    this.f263182j = iB;
                    this.e = bVar;
                    this.f263177a.onSubscribe(this);
                    return;
                }
            }
            this.e = new bhm.i(this.d);
            this.f263177a.onSubscribe(this);
        }
    }

    @Override // bhm.g
    public final Object poll() {
        return this.e.poll();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
    
        r3 = addAndGet(-r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0079, code lost:
    
        if (r3 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            boolean r0 = r7.k
            r1 = 1
            if (r0 == 0) goto L4e
            r0 = r1
        L6:
            boolean r2 = r7.i
            if (r2 == 0) goto Lc
            goto L7b
        Lc:
            boolean r2 = r7.f263181h
            java.lang.Throwable r3 = r7.f263180g
            boolean r4 = r7.f263179c
            if (r4 != 0) goto L27
            if (r2 == 0) goto L27
            if (r3 == 0) goto L27
            r7.i = r1
            fgm.l r0 = r7.f263177a
            java.lang.Throwable r1 = r7.f263180g
            r0.onError(r1)
            fgm.o r0 = r7.f263178b
            r0.dispose()
            return
        L27:
            fgm.l r3 = r7.f263177a
            r4 = 0
            r3.onNext(r4)
            if (r2 == 0) goto L46
            r7.i = r1
            java.lang.Throwable r0 = r7.f263180g
            if (r0 == 0) goto L3b
            fgm.l r1 = r7.f263177a
            r1.onError(r0)
            goto L40
        L3b:
            fgm.l r0 = r7.f263177a
            r0.onComplete()
        L40:
            fgm.o r0 = r7.f263178b
            r0.dispose()
            return
        L46:
            int r0 = -r0
            int r0 = r7.addAndGet(r0)
            if (r0 != 0) goto L6
            goto L7b
        L4e:
            bhm.g r0 = r7.e
            fgm.l r2 = r7.f263177a
            r3 = r1
        L53:
            boolean r4 = r7.f263181h
            boolean r5 = r0.isEmpty()
            boolean r4 = r7.a(r4, r5, r2)
            if (r4 == 0) goto L60
            goto L7b
        L60:
            boolean r4 = r7.f263181h
            java.lang.Object r5 = r0.poll()     // Catch: java.lang.Throwable -> L80
            if (r5 != 0) goto L6a
            r6 = r1
            goto L6b
        L6a:
            r6 = 0
        L6b:
            boolean r4 = r7.a(r4, r6, r2)
            if (r4 == 0) goto L72
            goto L7b
        L72:
            if (r6 == 0) goto L7c
            int r3 = -r3
            int r3 = r7.addAndGet(r3)
            if (r3 != 0) goto L53
        L7b:
            return
        L7c:
            r2.onNext(r5)
            goto L60
        L80:
            r3 = move-exception
            ce9.m.F(r3)
            r7.i = r1
            io.reactivex.rxjava3.disposables.Disposable r1 = r7.f
            r1.dispose()
            r0.clear()
            r2.onError(r3)
            fgm.o r0 = r7.f263178b
            r0.dispose()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sgm.t3.run():void");
    }
}
