package com.revolut.feature.kyc.impl.flow.kyc;

import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pv8.b;
import pv8.c;
import pv8.f;
import vy8.d;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements c {

    @NotNull
    public static final f Companion = new f();
    public final KycFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f77711p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qv8.b f77712q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mre.c f77713r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f77714s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f77715t;

    public a(KycFlowContract$InputData inputData, b contentProvider, qv8.b kycFlowBridgeInteractor, mre.c termsNavigationFactory, d revolutVisionProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(contentProvider, "contentProvider");
        Intrinsics.checkNotNullParameter(kycFlowBridgeInteractor, "kycFlowBridgeInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(revolutVisionProvider, "revolutVisionProvider");
        this.o = inputData;
        this.f77711p = contentProvider;
        this.f77712q = kycFlowBridgeInteractor;
        this.f77713r = termsNavigationFactory;
        this.f77714s = revolutVisionProvider;
        this.f77715t = cp5.d.a(this, inputData.f77694a, f0.f322471a, new pu4.d(this, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.kyc.impl.flow.kyc.a r4, com.revolut.feature.terms.api.model.TermsScope r5, wi0.b r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof pv8.h
            if (r0 == 0) goto L13
            r0 = r7
            pv8.h r0 = (pv8.h) r0
            int r1 = r0.f240012w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f240012w = r1
            goto L18
        L13:
            pv8.h r0 = new pv8.h
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f240012w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L43
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r7)
            mre.c r7 = r4.f77713r
            rre.d r7 = (rre.d) r7
            ufm.i r5 = r7.c(r5, r6)
            r0.f240012w = r3
            java.lang.Object r7 = nim.a.b(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            kotlin.jvm.internal.Intrinsics.h(r7)
            r5.<init>(r7)
            r4.C1(r5)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.kyc.impl.flow.kyc.a.I2(com.revolut.feature.kyc.impl.flow.kyc.a, com.revolut.feature.terms.api.model.TermsScope, wi0.b, gim.c):java.lang.Object");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77715t;
    }
}
