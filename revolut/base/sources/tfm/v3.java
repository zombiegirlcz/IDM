package tfm;

import efm.c0;

/* JADX INFO: loaded from: classes13.dex */
public final class v3 extends ofm.b implements efm.y, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0.a f270886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f270887c;
    public final int d;
    public nfm.j e;
    public ifm.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Throwable f270888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f270889h;
    public volatile boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f270890j;
    public boolean k;

    public v3(efm.y yVar, c0.a aVar, boolean z, int i) {
        this.f270885a = yVar;
        this.f270886b = aVar;
        this.f270887c = z;
        this.d = i;
    }

    public final boolean a(boolean z, boolean z3, efm.y yVar) {
        if (this.i) {
            this.e.clear();
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th10 = this.f270888g;
        if (this.f270887c) {
            if (!z3) {
                return false;
            }
            this.i = true;
            if (th10 != null) {
                yVar.onError(th10);
            } else {
                yVar.onComplete();
            }
            this.f270886b.dispose();
            return true;
        }
        if (th10 != null) {
            this.i = true;
            this.e.clear();
            yVar.onError(th10);
            this.f270886b.dispose();
            return true;
        }
        if (!z3) {
            return false;
        }
        this.i = true;
        yVar.onComplete();
        this.f270886b.dispose();
        return true;
    }

    @Override // nfm.f
    public final int b(int i) {
        this.k = true;
        return 2;
    }

    @Override // nfm.j
    public final void clear() {
        this.e.clear();
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f.dispose();
        this.f270886b.dispose();
        if (this.k || getAndIncrement() != 0) {
            return;
        }
        this.e.clear();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.i;
    }

    @Override // nfm.j
    public final boolean isEmpty() {
        return this.e.isEmpty();
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.f270889h) {
            return;
        }
        this.f270889h = true;
        if (getAndIncrement() == 0) {
            this.f270886b.a(this);
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (this.f270889h) {
            mo3.a.m(th10);
            return;
        }
        this.f270888g = th10;
        this.f270889h = true;
        if (getAndIncrement() == 0) {
            this.f270886b.a(this);
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.f270889h) {
            return;
        }
        if (this.f270890j != 2) {
            this.e.offer(obj2);
        }
        if (getAndIncrement() == 0) {
            this.f270886b.a(this);
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f, cVar)) {
            this.f = cVar;
            if (cVar instanceof nfm.e) {
                nfm.e eVar = (nfm.e) cVar;
                int iB = eVar.b(7);
                if (iB == 1) {
                    this.f270890j = iB;
                    this.e = eVar;
                    this.f270889h = true;
                    this.f270885a.onSubscribe(this);
                    if (getAndIncrement() == 0) {
                        this.f270886b.a(this);
                        return;
                    }
                    return;
                }
                if (iB == 2) {
                    this.f270890j = iB;
                    this.e = eVar;
                    this.f270885a.onSubscribe(this);
                    return;
                }
            }
            this.e = new vfm.c(this.d);
            this.f270885a.onSubscribe(this);
        }
    }

    @Override // nfm.j
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
            boolean r2 = r7.f270889h
            java.lang.Throwable r3 = r7.f270888g
            boolean r4 = r7.f270887c
            if (r4 != 0) goto L27
            if (r2 == 0) goto L27
            if (r3 == 0) goto L27
            r7.i = r1
            efm.y r0 = r7.f270885a
            java.lang.Throwable r1 = r7.f270888g
            r0.onError(r1)
            efm.c0$a r0 = r7.f270886b
            r0.dispose()
            return
        L27:
            efm.y r3 = r7.f270885a
            r4 = 0
            r3.onNext(r4)
            if (r2 == 0) goto L46
            r7.i = r1
            java.lang.Throwable r0 = r7.f270888g
            if (r0 == 0) goto L3b
            efm.y r1 = r7.f270885a
            r1.onError(r0)
            goto L40
        L3b:
            efm.y r0 = r7.f270885a
            r0.onComplete()
        L40:
            efm.c0$a r0 = r7.f270886b
            r0.dispose()
            return
        L46:
            int r0 = -r0
            int r0 = r7.addAndGet(r0)
            if (r0 != 0) goto L6
            goto L7b
        L4e:
            nfm.j r0 = r7.e
            efm.y r2 = r7.f270885a
            r3 = r1
        L53:
            boolean r4 = r7.f270889h
            boolean r5 = r0.isEmpty()
            boolean r4 = r7.a(r4, r5, r2)
            if (r4 == 0) goto L60
            goto L7b
        L60:
            boolean r4 = r7.f270889h
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
            m70.a.u(r3)
            r7.i = r1
            ifm.c r1 = r7.f
            r1.dispose()
            r0.clear()
            r2.onError(r3)
            efm.c0$a r0 = r7.f270886b
            r0.dispose()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tfm.v3.run():void");
    }
}
