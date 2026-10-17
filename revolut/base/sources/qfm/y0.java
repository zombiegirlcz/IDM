package qfm;

import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public final class y0 extends w0 {
    public final dom.a d;

    public y0(dom.a aVar, Iterator it8) {
        super(it8);
        this.d = aVar;
    }

    @Override // qfm.w0
    public final void c() {
        Iterator it8 = this.f245571a;
        dom.a aVar = this.d;
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
                aVar.onNext(next);
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

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
    
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
            dom.a r1 = r8.d
            r2 = 0
        L6:
            r4 = r2
        L7:
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 == 0) goto L50
            boolean r6 = r8.f245572b
            if (r6 == 0) goto L10
            goto L61
        L10:
            java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L48
            boolean r7 = r8.f245572b
            if (r7 == 0) goto L19
            goto L61
        L19:
            if (r6 != 0) goto L26
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "Iterator.next() returned a null value"
            r9.<init>(r10)
            r1.onError(r9)
            return
        L26:
            r1.onNext(r6)
            boolean r6 = r8.f245572b
            if (r6 == 0) goto L2e
            goto L61
        L2e:
            boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r6 != 0) goto L3c
            boolean r9 = r8.f245572b
            if (r9 != 0) goto L61
            r1.onComplete()
            return
        L3c:
            r6 = 1
            long r4 = r4 + r6
            goto L7
        L40:
            r9 = move-exception
            m70.a.u(r9)
            r1.onError(r9)
            return
        L48:
            r9 = move-exception
            m70.a.u(r9)
            r1.onError(r9)
            return
        L50:
            long r9 = r8.get()
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 != 0) goto L7
            long r9 = -r4
            long r9 = r8.addAndGet(r9)
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 != 0) goto L6
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qfm.y0.d(long):void");
    }
}
