package qfm;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class x0 extends w0 {
    public final nfm.a d;

    public x0(nfm.a aVar, Iterator it8) {
        super(it8);
        this.d = aVar;
    }

    @Override // qfm.w0
    public final void c() {
        Iterator it8 = this.f245571a;
        nfm.a aVar = this.d;
        while (!this.f245572b) {
            try {
                Object next = it8.next();
                if (this.f245572b) {
                    return;
                }
                if (next == null) {
                    aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                    return;
                }
                aVar.d(next);
                if (this.f245572b) {
                    return;
                }
                try {
                    if (!it8.hasNext()) {
                        if (this.f245572b) {
                            return;
                        }
                        aVar.onComplete();
                        return;
                    }
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    aVar.onError(th10);
                    return;
                }
            } catch (Throwable th11) {
                m70.a.u(th11);
                aVar.onError(th11);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
    
        r9 = addAndGet(-r4);
     */
    @Override // qfm.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(long r9) {
        /*
            r8 = this;
            java.util.Iterator r0 = r8.f245571a
            nfm.a r1 = r8.d
            r2 = 0
        L6:
            r4 = r2
        L7:
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 == 0) goto L53
            boolean r6 = r8.f245572b
            if (r6 == 0) goto L10
            goto L64
        L10:
            java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L4b
            boolean r7 = r8.f245572b
            if (r7 == 0) goto L19
            goto L64
        L19:
            if (r6 != 0) goto L26
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "Iterator.next() returned a null value"
            r9.<init>(r10)
            r1.onError(r9)
            return
        L26:
            boolean r6 = r1.d(r6)
            boolean r7 = r8.f245572b
            if (r7 == 0) goto L2f
            goto L64
        L2f:
            boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L43
            if (r7 != 0) goto L3d
            boolean r9 = r8.f245572b
            if (r9 != 0) goto L64
            r1.onComplete()
            return
        L3d:
            if (r6 == 0) goto L7
            r6 = 1
            long r4 = r4 + r6
            goto L7
        L43:
            r9 = move-exception
            m70.a.u(r9)
            r1.onError(r9)
            return
        L4b:
            r9 = move-exception
            m70.a.u(r9)
            r1.onError(r9)
            return
        L53:
            long r9 = r8.get()
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 != 0) goto L7
            long r9 = -r4
            long r9 = r8.addAndGet(r9)
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 != 0) goto L6
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qfm.x0.d(long):void");
    }
}
