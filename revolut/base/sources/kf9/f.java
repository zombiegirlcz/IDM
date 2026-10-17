package kf9;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import sri.m;
import te0.w;
import zhm.u;
import zkm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements df9.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f183340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vo1.c f183341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f183342c;

    public f(m navigator, vo1.c billsFeatureChecker, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(billsFeatureChecker, "billsFeatureChecker");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f183340a = navigator;
        this.f183341b = billsFeatureChecker;
        this.f183342c = userInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return u.c("phone-top-ups").contains(deeplink.e(1));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(jf0.c r17, gim.c r18) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kf9.f.b(jf0.c, gim.c):java.lang.Object");
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
            boolean r0 = r6 instanceof kf9.e
            if (r0 == 0) goto L13
            r0 = r6
            kf9.e r0 = (kf9.e) r0
            int r1 = r0.f183339w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f183339w = r1
            goto L1a
        L13:
            kf9.e r0 = new kf9.e
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f183339w
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
            r0.f183339w = r3
            java.lang.Object r6 = r4.b(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            r5 = 0
            if (r6 == 0) goto L4d
            q06.h r0 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r1.<init>(r6)
            r0.<init>(r1, r5)
            return r0
        L4d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kf9.f.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        p0 p0Var = p0.f264001a;
        return w.o0(o.f323119a.e, new kb7.c(this, deeplink, null, 4));
    }
}
