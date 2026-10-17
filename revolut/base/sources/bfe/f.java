package bfe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class f implements yee.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14978a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final afe.d f14979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14980c;

    public f(b70.e accessibilityDataProvider, afe.d appInfoFactory) {
        Intrinsics.checkNotNullParameter(accessibilityDataProvider, "accessibilityDataProvider");
        Intrinsics.checkNotNullParameter(appInfoFactory, "appInfoFactory");
        this.f14980c = accessibilityDataProvider;
        this.f14979b = appInfoFactory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Type inference failed for: r1v0, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashSet] */
    @Override // yee.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            int r0 = r4.f14978a
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            ff4.z r0 = new ff4.z
            r1 = 0
            r2 = 3
            r0.<init>(r4, r1, r2)
            skm.p0 r1 = skm.p0.f264001a
            elm.f r1 = elm.f.f127540b
            java.lang.Object r5 = skm.e0.J(r1, r0, r5)
            return r5
        L15:
            boolean r0 = r5 instanceof bfe.e
            if (r0 == 0) goto L28
            r0 = r5
            bfe.e r0 = (bfe.e) r0
            int r1 = r0.f14977w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L28
            int r1 = r1 - r2
            r0.f14977w = r1
            goto L2f
        L28:
            bfe.e r0 = new bfe.e
            gim.c r5 = (gim.c) r5
            r0.<init>(r4, r5)
        L2f:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f14977w
            r3 = 1
            if (r2 == 0) goto L46
            if (r2 != r3) goto L3e
            yhm.o.b(r5)
            goto L56
        L3e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L46:
            yhm.o.b(r5)
            java.lang.Object r5 = r4.f14980c
            b70.e r5 = (b70.e) r5
            r0.f14977w = r3
            java.util.Set r5 = r5.a()
            if (r5 != r1) goto L56
            goto L77
        L56:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L61:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            afe.d r2 = r4.f14979b
            yee.b r0 = r2.a(r0)
            r1.add(r0)
            goto L61
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bfe.f.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public f(n80.e packageManagerWrapper, afe.d appInfoFactory) {
        Intrinsics.checkNotNullParameter(packageManagerWrapper, "packageManagerWrapper");
        Intrinsics.checkNotNullParameter(appInfoFactory, "appInfoFactory");
        this.f14980c = packageManagerWrapper;
        this.f14979b = appInfoFactory;
    }
}
