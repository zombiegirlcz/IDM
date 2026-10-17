package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class j0 extends AtomicReference implements fgm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f262917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f262918b;

    public j0(k0 k0Var, int i) {
        this.f262917a = k0Var;
        this.f262918b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x001f A[Catch: all -> 0x000b, TryCatch #0 {all -> 0x000b, blocks: (B:4:0x0005, B:6:0x0009, B:10:0x000d, B:15:0x0017, B:18:0x0021, B:17:0x001f), top: B:25:0x0005 }] */
    @Override // fgm.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onComplete() {
        /*
            r5 = this;
            sgm.k0 r0 = r5.f262917a
            int r1 = r5.f262918b
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
            r0.f262948h = r3     // Catch: java.lang.Throwable -> Lb
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
        throw new UnsupportedOperationException("Method not decompiled: sgm.j0.onComplete():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002b A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0012, B:9:0x0016, B:13:0x001a, B:18:0x0023, B:21:0x002d, B:20:0x002b), top: B:29:0x0012 }] */
    @Override // fgm.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onError(java.lang.Throwable r5) {
        /*
            r4 = this;
            sgm.k0 r0 = r4.f262917a
            int r1 = r4.f262918b
            ygm.c r2 = r0.i
            boolean r5 = r2.a(r5)
            if (r5 == 0) goto L3a
            boolean r5 = r0.f
            r2 = 1
            if (r5 == 0) goto L32
            monitor-enter(r0)
            java.lang.Object[] r5 = r0.d     // Catch: java.lang.Throwable -> L18
            if (r5 != 0) goto L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r5 = move-exception
            goto L30
        L1a:
            r1 = r5[r1]     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L20
            r1 = r2
            goto L21
        L20:
            r1 = 0
        L21:
            if (r1 != 0) goto L2b
            int r3 = r0.k     // Catch: java.lang.Throwable -> L18
            int r3 = r3 + r2
            r0.k = r3     // Catch: java.lang.Throwable -> L18
            int r5 = r5.length     // Catch: java.lang.Throwable -> L18
            if (r3 != r5) goto L2d
        L2b:
            r0.f262948h = r2     // Catch: java.lang.Throwable -> L18
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            r2 = r1
            goto L32
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r5
        L32:
            if (r2 == 0) goto L37
            r0.a()
        L37:
            r0.c()
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sgm.j0.onError(java.lang.Throwable):void");
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        boolean z;
        k0 k0Var = this.f262917a;
        int i = this.f262918b;
        synchronized (k0Var) {
            try {
                Object[] objArr = k0Var.d;
                if (objArr == null) {
                    return;
                }
                Object obj3 = objArr[i];
                int i2 = k0Var.f262949j;
                if (obj3 == null) {
                    i2++;
                    k0Var.f262949j = i2;
                }
                objArr[i] = obj2;
                if (i2 == objArr.length) {
                    k0Var.e.offer(objArr.clone());
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    k0Var.c();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        jgm.b.e(this, disposable);
    }
}
