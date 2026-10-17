package kf9;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import sri.m;
import te0.w;
import wp5.y;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements df9.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vo1.c f183346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f183347b;

    public j(m navigator, vo1.c featureChecker) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f183346a = featureChecker;
        this.f183347b = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "taxes");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(jf0.c r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kf9.g
            if (r0 == 0) goto L13
            r0 = r6
            kf9.g r0 = (kf9.g) r0
            int r1 = r0.f183343w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f183343w = r1
            goto L18
        L13:
            kf9.g r0 = new kf9.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f183343w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r6 = 2
            java.lang.String r5 = r5.e(r6)
            java.lang.String r6 = "f24"
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            if (r5 == 0) goto L53
            r0.f183343w = r3
            java.lang.Object r6 = r4.c(r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r5 == 0) goto L53
            com.revolut.feature.apm.bills.f24.api.navigation.F24Destination r5 = com.revolut.feature.apm.bills.f24.api.navigation.F24Destination.f61466a
            return r5
        L53:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kf9.j.b(jf0.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kf9.h
            if (r0 == 0) goto L13
            r0 = r6
            kf9.h r0 = (kf9.h) r0
            int r1 = r0.f183344w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f183344w = r1
            goto L18
        L13:
            kf9.h r0 = new kf9.h
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f183344w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L50
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            vo1.c r6 = r5.f183346a
            fp1.d r6 = (fp1.d) r6
            fp1.a r2 = new fp1.a
            r4 = 0
            r2.<init>(r6, r4)
            ufm.c r6 = new ufm.c
            r4 = 2
            r6.<init>(r2, r4)
            java.lang.String r2 = "fromCallable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r0.f183344w = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kf9.j.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kf9.i
            if (r0 == 0) goto L13
            r0 = r6
            kf9.i r0 = (kf9.i) r0
            int r1 = r0.f183345w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f183345w = r1
            goto L1a
        L13:
            kf9.i r0 = new kf9.i
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f183345w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.f183345w = r3
            java.lang.Object r6 = r4.b(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            com.revolut.feature.apm.bills.f24.api.navigation.F24Destination r6 = (com.revolut.feature.apm.bills.f24.api.navigation.F24Destination) r6
            r5 = 0
            if (r6 == 0) goto L48
            q06.h r0 = new q06.h
            r0.<init>(r6, r5)
            return r0
        L48:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kf9.j.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return w.o0(p0.f264003c, new kb7.c(this, deeplink, null, 5));
    }
}
