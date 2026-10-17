package efk;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements od0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f125356b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f125355a = i;
        this.f125356b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038 A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #2 {, blocks: (B:6:0x000d, B:7:0x0012, B:9:0x0016, B:15:0x0024, B:17:0x002c, B:19:0x0038, B:23:0x003d, B:24:0x0047, B:26:0x004d, B:27:0x0057, B:29:0x0059, B:30:0x005d, B:14:0x0020, B:16:0x0026), top: B:45:0x000d, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    @Override // od0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void clear() {
        /*
            r6 = this;
            int r0 = r6.f125355a
            r1 = 0
            switch(r0) {
                case 0: goto L78;
                case 1: goto L70;
                case 2: goto L68;
                case 3: goto L60;
                default: goto L6;
            }
        L6:
            java.lang.Object r0 = r6.f125356b
            rge.b r0 = (rge.b) r0
            java.lang.Object r2 = r0.d
            monitor-enter(r2)
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1d
            r3.<init>()     // Catch: java.lang.Throwable -> L1d
            hhe.d r4 = r0.e     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            if (r4 != 0) goto L24
            phm.a r4 = r0.f254139a     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            hhe.d r4 = rge.b.f(r4)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L1f
            goto L24
        L1d:
            r0 = move-exception
            goto L5e
        L1f:
            r4 = move-exception
            r3.add(r4)     // Catch: java.lang.Throwable -> L1d
            r4 = r1
        L24:
            hhe.d r5 = r0.f     // Catch: java.lang.Throwable -> L1d
            rge.b.a(r4, r3)     // Catch: java.lang.Throwable -> L58
            rge.b.a(r5, r3)     // Catch: java.lang.Throwable -> L58
            r0.e = r1     // Catch: java.lang.Throwable -> L1d
            r0.f = r1     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r0 = zhm.d0.d0(r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.Exception r0 = (java.lang.Exception) r0     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L3c
            kotlin.Unit r0 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)
            return
        L3c:
            r1 = 1
            java.util.List r1 = zhm.d0.V(r3, r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1d
        L47:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L57
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L1d
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch: java.lang.Throwable -> L1d
            r0.addSuppressed(r3)     // Catch: java.lang.Throwable -> L1d
            goto L47
        L57:
            throw r0     // Catch: java.lang.Throwable -> L1d
        L58:
            r3 = move-exception
            r0.e = r1     // Catch: java.lang.Throwable -> L1d
            r0.f = r1     // Catch: java.lang.Throwable -> L1d
            throw r3     // Catch: java.lang.Throwable -> L1d
        L5e:
            monitor-exit(r2)
            throw r0
        L60:
            java.lang.Object r0 = r6.f125356b
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            skm.e0.k(r0, r1)
            return
        L68:
            java.lang.Object r0 = r6.f125356b
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            skm.e0.k(r0, r1)
            return
        L70:
            java.lang.Object r0 = r6.f125356b
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            skm.e0.k(r0, r1)
            return
        L78:
            java.lang.Object r0 = r6.f125356b
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            skm.e0.k(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: efk.b.clear():void");
    }
}
