package tfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class i0 extends AtomicReference implements efm.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f270524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f270525b;

    public i0(j0 j0Var, int i) {
        this.f270524a = j0Var;
        this.f270525b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x001f A[Catch: all -> 0x000b, TryCatch #0 {all -> 0x000b, blocks: (B:4:0x0005, B:6:0x0009, B:10:0x000d, B:15:0x0017, B:18:0x0021, B:17:0x001f), top: B:25:0x0005 }] */
    @Override // efm.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onComplete() {
        /*
            r5 = this;
            tfm.j0 r0 = r5.f270524a
            int r1 = r5.f270525b
            monitor-enter(r0)
            java.lang.Object[] r2 = r0.d     // Catch: java.lang.Throwable -> Lb
            if (r2 != 0) goto Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r1 = move-exception
            goto L2b
        Ld:
            r1 = r2[r1]     // Catch: java.lang.Throwable -> Lb
            r3 = 1
            if (r1 != 0) goto L14
            r1 = r3
            goto L15
        L14:
            r1 = 0
        L15:
            if (r1 != 0) goto L1f
            int r4 = r0.k     // Catch: java.lang.Throwable -> Lb
            int r4 = r4 + r3
            r0.k = r4     // Catch: java.lang.Throwable -> Lb
            int r2 = r2.length     // Catch: java.lang.Throwable -> Lb
            if (r4 != r2) goto L21
        L1f:
            r0.f270557h = r3     // Catch: java.lang.Throwable -> Lb
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto L27
            r0.a()
        L27:
            r0.c()
            return
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tfm.i0.onComplete():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0015, B:9:0x0019, B:13:0x001d, B:18:0x0026, B:21:0x0030, B:20:0x002e), top: B:31:0x0015 }] */
    @Override // efm.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onError(java.lang.Throwable r5) {
        /*
            r4 = this;
            tfm.j0 r0 = r4.f270524a
            int r1 = r4.f270525b
            zfm.c r2 = r0.i
            r2.getClass()
            boolean r2 = zfm.h.a(r2, r5)
            if (r2 == 0) goto L3e
            boolean r5 = r0.f
            r2 = 1
            if (r5 == 0) goto L35
            monitor-enter(r0)
            java.lang.Object[] r5 = r0.d     // Catch: java.lang.Throwable -> L1b
            if (r5 != 0) goto L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r5 = move-exception
            goto L33
        L1d:
            r1 = r5[r1]     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L23
            r1 = r2
            goto L24
        L23:
            r1 = 0
        L24:
            if (r1 != 0) goto L2e
            int r3 = r0.k     // Catch: java.lang.Throwable -> L1b
            int r3 = r3 + r2
            r0.k = r3     // Catch: java.lang.Throwable -> L1b
            int r5 = r5.length     // Catch: java.lang.Throwable -> L1b
            if (r3 != r5) goto L30
        L2e:
            r0.f270557h = r2     // Catch: java.lang.Throwable -> L1b
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            r2 = r1
            goto L35
        L33:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r5
        L35:
            if (r2 == 0) goto L3a
            r0.a()
        L3a:
            r0.c()
            return
        L3e:
            mo3.a.m(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tfm.i0.onError(java.lang.Throwable):void");
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        boolean z;
        j0 j0Var = this.f270524a;
        int i = this.f270525b;
        synchronized (j0Var) {
            try {
                Object[] objArr = j0Var.d;
                if (objArr == null) {
                    return;
                }
                Object obj3 = objArr[i];
                int i2 = j0Var.f270558j;
                if (obj3 == null) {
                    i2++;
                    j0Var.f270558j = i2;
                }
                objArr[i] = obj2;
                if (i2 == objArr.length) {
                    j0Var.e.offer(objArr.clone());
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    j0Var.c();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this, cVar);
    }
}
