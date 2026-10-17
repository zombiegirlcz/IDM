package qfm;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends xfm.a {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f245419g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(nfm.a aVar, Object obj2, int i) {
        super(aVar);
        this.f = i;
        this.f245419g = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        if (r1.d(r4) != false) goto L23;
     */
    @Override // nfm.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f
            switch(r0) {
                case 0: goto L25;
                default: goto L5;
            }
        L5:
            boolean r0 = r3.d
            if (r0 == 0) goto Lb
            r4 = 0
            goto L24
        Lb:
            java.lang.Object r0 = r3.f245419g     // Catch: java.lang.Throwable -> L1f
            kfm.o r0 = (kfm.o) r0     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r4 = r0.apply(r4)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = "The mapper function returned a null value."
            mfm.f.b(r4, r0)     // Catch: java.lang.Throwable -> L1f
            nfm.a r0 = r3.f305439a
            boolean r4 = r0.d(r4)
            goto L24
        L1f:
            r4 = move-exception
            r3.c(r4)
            r4 = 1
        L24:
            return r4
        L25:
            boolean r0 = r3.d
            if (r0 == 0) goto L2a
            goto L49
        L2a:
            int r0 = r3.e
            nfm.a r1 = r3.f305439a
            if (r0 == 0) goto L36
            r4 = 0
            boolean r4 = r1.d(r4)
            goto L50
        L36:
            r0 = 1
            java.lang.Object r2 = r3.f245419g     // Catch: java.lang.Throwable -> L4b
            kfm.p r2 = (kfm.p) r2     // Catch: java.lang.Throwable -> L4b
            boolean r2 = r2.test(r4)     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L49
            boolean r4 = r1.d(r4)
            if (r4 == 0) goto L49
        L47:
            r4 = r0
            goto L50
        L49:
            r4 = 0
            goto L50
        L4b:
            r4 = move-exception
            r3.c(r4)
            goto L47
        L50:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: qfm.h0.d(java.lang.Object):boolean");
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        switch (this.f) {
            case 0:
                if (!d(obj2)) {
                    this.f305440b.a(1L);
                }
                break;
            default:
                if (!this.d) {
                    int i = this.e;
                    nfm.a aVar = this.f305439a;
                    if (i != 0) {
                        aVar.onNext(null);
                    } else {
                        try {
                            Object objApply = ((kfm.o) this.f245419g).apply(obj2);
                            mfm.f.b(objApply, "The mapper function returned a null value.");
                            aVar.onNext(objApply);
                        } catch (Throwable th10) {
                            c(th10);
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // nfm.j
    public final Object poll() {
        switch (this.f) {
            case 0:
                nfm.g gVar = this.f305441c;
                kfm.p pVar = (kfm.p) this.f245419g;
                while (true) {
                    Object objPoll = gVar.poll();
                    if (objPoll == null) {
                        return null;
                    }
                    if (pVar.test(objPoll)) {
                        return objPoll;
                    }
                    if (this.e == 2) {
                        gVar.a(1L);
                    }
                }
                break;
            default:
                Object objPoll2 = this.f305441c.poll();
                if (objPoll2 == null) {
                    return null;
                }
                Object objApply = ((kfm.o) this.f245419g).apply(objPoll2);
                mfm.f.b(objApply, "The mapper function returned a null value.");
                return objApply;
        }
    }
}
