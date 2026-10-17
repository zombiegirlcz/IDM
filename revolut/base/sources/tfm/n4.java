package tfm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class n4 extends efm.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final agm.a f270676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f270677h;
    public final TimeUnit i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final efm.c0 f270678j;
    public l4 k;

    public n4(agm.a aVar, long j2, TimeUnit timeUnit, efm.c0 c0Var) {
        this.f270676g = aVar;
        this.f270677h = j2;
        this.i = timeUnit;
        this.f270678j = c0Var;
    }

    public final void d(l4 l4Var) {
        synchronized (this) {
            try {
                if (this.f270676g instanceof c4) {
                    l4 l4Var2 = this.k;
                    if (l4Var2 != null && l4Var2 == l4Var) {
                        this.k = null;
                        lfm.b bVar = l4Var.f270613b;
                        if (bVar != null) {
                            lfm.d.a(bVar);
                            l4Var.f270613b = null;
                        }
                    }
                    long j2 = l4Var.f270614c - 1;
                    l4Var.f270614c = j2;
                    if (j2 == 0) {
                        efm.w wVar = this.f270676g;
                        if (wVar instanceof ifm.c) {
                            ((ifm.c) wVar).dispose();
                        } else if (wVar instanceof lfm.g) {
                            ((lfm.g) wVar).a((ifm.c) l4Var.get());
                        }
                    }
                } else {
                    l4 l4Var3 = this.k;
                    if (l4Var3 != null && l4Var3 == l4Var) {
                        lfm.b bVar2 = l4Var.f270613b;
                        if (bVar2 != null) {
                            lfm.d.a(bVar2);
                            l4Var.f270613b = null;
                        }
                        long j3 = l4Var.f270614c - 1;
                        l4Var.f270614c = j3;
                        if (j3 == 0) {
                            this.k = null;
                            efm.w wVar2 = this.f270676g;
                            if (wVar2 instanceof ifm.c) {
                                ((ifm.c) wVar2).dispose();
                            } else if (wVar2 instanceof lfm.g) {
                                ((lfm.g) wVar2).a((ifm.c) l4Var.get());
                            }
                        }
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void e(l4 l4Var) {
        synchronized (this) {
            try {
                if (l4Var.f270614c == 0 && l4Var == this.k) {
                    this.k = null;
                    ifm.c cVar = (ifm.c) l4Var.get();
                    lfm.d.a(l4Var);
                    efm.w wVar = this.f270676g;
                    if (wVar instanceof ifm.c) {
                        ((ifm.c) wVar).dispose();
                    } else if (wVar instanceof lfm.g) {
                        if (cVar == null) {
                            l4Var.e = true;
                        } else {
                            ((lfm.g) wVar).a(cVar);
                        }
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    @Override // efm.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void subscribeActual(efm.y r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            tfm.l4 r0 = r6.k     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Lf
            tfm.l4 r0 = new tfm.l4     // Catch: java.lang.Throwable -> Ld
            r0.<init>(r6)     // Catch: java.lang.Throwable -> Ld
            r6.k = r0     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r7 = move-exception
            goto L44
        Lf:
            long r1 = r0.f270614c     // Catch: java.lang.Throwable -> Ld
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 != 0) goto L1e
            lfm.b r3 = r0.f270613b     // Catch: java.lang.Throwable -> Ld
            if (r3 == 0) goto L1e
            lfm.d.a(r3)     // Catch: java.lang.Throwable -> Ld
        L1e:
            r3 = 1
            long r1 = r1 + r3
            r0.f270614c = r1     // Catch: java.lang.Throwable -> Ld
            boolean r3 = r0.d     // Catch: java.lang.Throwable -> Ld
            if (r3 != 0) goto L30
            r3 = 1
            long r4 = (long) r3     // Catch: java.lang.Throwable -> Ld
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L30
            r0.d = r3     // Catch: java.lang.Throwable -> Ld
            goto L31
        L30:
            r3 = 0
        L31:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Ld
            agm.a r1 = r6.f270676g
            tfm.m4 r2 = new tfm.m4
            r2.<init>(r7, r6, r0)
            r1.subscribe(r2)
            if (r3 == 0) goto L43
            agm.a r7 = r6.f270676g
            r7.d(r0)
        L43:
            return
        L44:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Ld
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tfm.n4.subscribeActual(efm.y):void");
    }
}
