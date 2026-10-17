package com.revolut.feature.credit.application.plugins.impl.ui.banner;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.banner.BannerFlowContract$Step;
import cp5.d;
import d84.e;
import hw3.c;
import kotlin.jvm.internal.Intrinsics;
import s42.f;
import s54.g;
import wli.x;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements s54.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f67159p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final BannerFlowContract$InputData f67160q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f67161r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x f67162s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final cj4.a f67163t;
    public final e u;
    public final yki.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c bannerInteractor, BannerFlowContract$InputData inputData, g intentProvider, x deeplinkHandler, cj4.a creditPlanUpgradeControllerModelExtension, e overriddenDeeplinksControllerModelExtension, e84.e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(bannerInteractor, "bannerInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(creditPlanUpgradeControllerModelExtension, "creditPlanUpgradeControllerModelExtension");
        Intrinsics.checkNotNullParameter(overriddenDeeplinksControllerModelExtension, "overriddenDeeplinksControllerModelExtension");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67159p = bannerInteractor;
        this.f67160q = inputData;
        this.f67161r = intentProvider;
        this.f67162s = deeplinkHandler;
        this.f67163t = creditPlanUpgradeControllerModelExtension;
        this.u = overriddenDeeplinksControllerModelExtension;
        f fVar = new f(this, 4);
        this.v = d.a(this, BannerFlowContract$Step.Banner.f67158a, f0.f322471a, fVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        if (r9.Q2(r10, r5) == r0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0164, code lost:
    
        if (r9 == r0) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P2(com.revolut.feature.credit.application.plugins.impl.ui.banner.a r9, hs3.k r10, gim.c r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.banner.a.P2(com.revolut.feature.credit.application.plugins.impl.ui.banner.a, hs3.k, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (c84.t.N2(r5, (it3.d) r7, r0, 2) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q2(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof s54.d
            if (r0 == 0) goto L13
            r0 = r7
            s54.d r0 = (s54.d) r0
            int r1 = r0.f259920w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f259920w = r1
            goto L18
        L13:
            s54.d r0 = new s54.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f259920w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L53
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            goto L48
        L36:
            yhm.o.b(r7)
            hw3.c r7 = r5.f67159p
            ufm.n r6 = r7.b(r6)
            r0.f259920w = r4
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L48
            goto L52
        L48:
            it3.d r7 = (it3.d) r7
            r0.f259920w = r3
            java.lang.Object r6 = c84.t.N2(r5, r7, r0, r3)
            if (r6 != r1) goto L53
        L52:
            return r1
        L53:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.credit.application.plugins.impl.ui.banner.a.Q2(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yki.g
    public final b s() {
        return this.v;
    }
}
