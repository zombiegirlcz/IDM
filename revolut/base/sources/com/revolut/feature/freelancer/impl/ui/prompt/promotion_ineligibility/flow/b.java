package com.revolut.feature.freelancer.impl.ui.prompt.promotion_ineligibility.flow;

import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import d8l.d;
import ghl.c;
import gr6.e;
import gr6.m;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements h17.b {
    public final gr6.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f74099p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f74100q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CdnImage f74101r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f74102s;

    public b(gr6.a freelancerAccountDetailsInteractor, e freelancerAvailabilityInteractor, m freelancerPocketsInteractor) {
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(freelancerPocketsInteractor, "freelancerPocketsInteractor");
        this.o = freelancerAccountDetailsInteractor;
        this.f74099p = freelancerAvailabilityInteractor;
        this.f74100q = freelancerPocketsInteractor;
        this.f74101r = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D353", null, null, null, 30);
        this.f74102s = d.a(this, new c(this, 29));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.freelancer.impl.ui.prompt.promotion_ineligibility.flow.b r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof h17.c
            if (r0 == 0) goto L13
            r0 = r7
            h17.c r0 = (h17.c) r0
            int r1 = r0.f148472w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f148472w = r1
            goto L18
        L13:
            h17.c r0 = new h17.c
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f148472w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto L67
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            gr6.m r7 = r6.f74100q
            w4l.h r2 = w4l.h.f294642c
            et6.i2 r7 = (et6.i2) r7
            akg.n r7 = r7.b(r2)
            gzg.a0 r2 = new gzg.a0
            r5 = 9
            r2.<init>(r5)
            akg.n r7 = nim.a.v(r7, r2)
            gzg.a0 r2 = new gzg.a0
            r5 = 10
            r2.<init>(r5)
            cxe.u r7 = nim.a.A(r7, r2)
            gug.c r2 = new gug.c
            r5 = 18
            r2.<init>(r5)
            jhi.b r7 = mo3.a.g(r7, r4, r2, r3)
            r0.f148472w = r3
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L67
            return r1
        L67:
            od0.i r7 = (od0.i) r7
            java.lang.Object r7 = r7.f224257a
            io3.d r7 = (io3.d) r7
            if (r7 == 0) goto L72
            java.lang.String r7 = r7.f163145a
            goto L73
        L72:
            r7 = r4
        L73:
            if (r7 == 0) goto L98
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r0 = ibb.c.f160140a
            com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig r1 = new com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r2 = new com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main
            com.revolut.feature.tab.accounts.models.ProductId r3 = com.revolut.feature.tab.accounts.models.ProductId.PRO
            com.revolut.feature.tab.accounts.models.ProductAccountId r5 = new com.revolut.feature.tab.accounts.models.ProductAccountId
            r5.<init>(r7, r4)
            r2.<init>(r5, r3)
            r1.<init>(r2, r4)
            r7 = 12
            com.revolut.retail.core.navigation.FeatureCommand r7 = jbb.a.a(r0, r1, r4, r4, r7)
            com.revolut.kompot.bridge.navigation.BridgeDestination r7 = zh9.u0.b(r7)
            aii.n r7 = r6.C1(r7)
            if (r7 != 0) goto La7
        L98:
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r7 = ibb.c.f160140a
            r0 = 14
            com.revolut.retail.core.navigation.FeatureCommand r7 = jbb.a.a(r7, r4, r4, r4, r0)
            com.revolut.kompot.bridge.navigation.BridgeDestination r7 = zh9.u0.b(r7)
            r6.C1(r7)
        La7:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.prompt.promotion_ineligibility.flow.b.I2(com.revolut.feature.freelancer.impl.ui.prompt.promotion_ineligibility.flow.b, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new gvc.m(this, null, 3), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74102s;
    }
}
