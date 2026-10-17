package yu8;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import sri.m;
import te0.w;
import yg6.v;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements gt8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f316917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mt8.a f316918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jvh.a f316919c;
    public final wx8.a d;

    public d(m navigator, mt8.a kycFeatureToggleProvider, jvh.a workflowInteractor, wx8.a pendingDeeplinkInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(kycFeatureToggleProvider, "kycFeatureToggleProvider");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(pendingDeeplinkInteractor, "pendingDeeplinkInteractor");
        this.f316917a = navigator;
        this.f316918b = kycFeatureToggleProvider;
        this.f316919c = workflowInteractor;
        this.d = pendingDeeplinkInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strE = deeplink.e(1);
        return Intrinsics.f(strE, "kyc") || Intrinsics.f(strE, "ua-gov-auth") || Intrinsics.f(strE, "sg_gov_auth") || (Intrinsics.f(deeplink.e(1), "qes") && Intrinsics.f(deeplink.e(2), "dap"));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(jf0.c r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yu8.d.b(jf0.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(jf0.c r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yu8.d.c(jf0.c, gim.c):java.lang.Object");
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
            boolean r0 = r6 instanceof yu8.b
            if (r0 == 0) goto L13
            r0 = r6
            yu8.b r0 = (yu8.b) r0
            int r1 = r0.f316914w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f316914w = r1
            goto L1a
        L13:
            yu8.b r0 = new yu8.b
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f316914w
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
            r0.f316914w = r3
            java.lang.Object r6 = r4.c(r5, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: yu8.d.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return w.o0(p0.f264003c, new v(this, deeplink, null, 27));
    }
}
