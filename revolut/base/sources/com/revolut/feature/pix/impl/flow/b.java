package com.revolut.feature.pix.impl.flow;

import com.revolut.feature.pix.api.navigation.PixAliasNavigation$InputData;
import com.revolut.feature.pix.api.navigation.PixAreaNavigation$InputData;
import com.revolut.feature.pix.api.navigation.PixAuthorisationNavigation$InputData;
import com.revolut.feature.pix.api.navigation.PixAutomaticoNavigation$InputData;
import com.revolut.feature.pix.api.navigation.PixModalNavigation$InputData;
import com.revolut.feature.pix.api.navigation.PixNavigation$InputData;
import com.revolut.feature.pix.api.navigation.PixPortabilityNavigation$InputData;
import com.revolut.feature.pix.api.navigation.PixQrNavigation$InputData;
import com.revolut.feature.pix.api.navigation.PixRefundNavigation$InputData;
import com.revolut.feature.pix.api.navigation.PixTransferNavigation$InputData;
import com.revolut.feature.pix.impl.flow.PixFlowContract$Step;
import cu8.r0;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import u7k.w;
import u83.f;
import yki.i;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends h implements u8a.b {
    public final PixNavigation$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zja.a f80622p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r0 f80623q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f80624r;

    public b(PixNavigation$InputData inputData, zja.a productArticleInteractor, r0 kycRequiredActionTransformer) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        this.o = inputData;
        this.f80622p = productArticleInteractor;
        this.f80623q = kycRequiredActionTransformer;
        this.f80624r = d.a(this, new w(this, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.pix.impl.flow.b r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof u8a.c
            if (r0 == 0) goto L13
            r0 = r5
            u8a.c r0 = (u8a.c) r0
            int r1 = r0.f278145w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f278145w = r1
            goto L18
        L13:
            u8a.c r0 = new u8a.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f278145w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L47
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            zja.a r4 = r4.f80622p
            iaa.f r5 = iaa.f.ONBOARDING
            com.revolut.feature.product_article.api.models.ProductArticleParams r5 = r5.a()
            r0.f278145w = r3
            kka.h r4 = (kka.h) r4
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r2 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r5 = r4.e(r5, r2, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            r4 = r4 ^ r3
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.pix.impl.flow.b.I2(com.revolut.feature.pix.impl.flow.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r6.invoke(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.pix.impl.flow.b r5, com.revolut.feature.pix.impl.flow.a r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof u8a.d
            if (r0 == 0) goto L13
            r0 = r7
            u8a.d r0 = (u8a.d) r0
            int r1 = r0.f278147x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f278147x = r1
            goto L18
        L13:
            u8a.d r0 = new u8a.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f278147x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L71
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            com.revolut.feature.pix.impl.flow.a r6 = r0.u
            yhm.o.b(r7)
            goto L48
        L38:
            yhm.o.b(r7)
            cu8.r0 r7 = r5.f80623q
            r0.u = r6
            r0.f278147x = r4
            java.lang.Object r7 = ks8.m.b(r7, r0)
            if (r7 != r1) goto L48
            goto L70
        L48:
            ks8.j r7 = (ks8.j) r7
            boolean r2 = r7 instanceof ks8.i
            if (r2 == 0) goto L61
            yki.i r6 = r5.f80624r
            oki.h.D2(r6)
            ks8.i r7 = (ks8.i) r7
            com.revolut.retail.core.navigation.FeatureCommand r6 = r7.f189312a
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = zh9.u0.b(r6)
            r5.C1(r6)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L61:
            boolean r5 = r7 instanceof ks8.j.a
            if (r5 == 0) goto L74
            r5 = 0
            r0.u = r5
            r0.f278147x = r3
            java.lang.Object r5 = r6.invoke(r0)
            if (r5 != r1) goto L71
        L70:
            return r1
        L71:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L74:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.pix.impl.flow.b.J2(com.revolut.feature.pix.impl.flow.b, com.revolut.feature.pix.impl.flow.a, gim.c):java.lang.Object");
    }

    public static PixFlowContract$Step K2(PixNavigation$InputData pixNavigation$InputData) {
        if (pixNavigation$InputData instanceof PixAliasNavigation$InputData.Registration) {
            PixAliasNavigation$InputData.Registration registration = (PixAliasNavigation$InputData.Registration) pixNavigation$InputData;
            return new PixFlowContract$Step.AliasRegistration(registration.f80492a, registration.f80493b, registration.f80494c);
        }
        if (pixNavigation$InputData instanceof PixAreaNavigation$InputData) {
            return new PixFlowContract$Step.Area(((PixAreaNavigation$InputData) pixNavigation$InputData).f80496a);
        }
        if (pixNavigation$InputData instanceof PixAuthorisationNavigation$InputData.Request) {
            PixAuthorisationNavigation$InputData.Request request = (PixAuthorisationNavigation$InputData.Request) pixNavigation$InputData;
            return new PixFlowContract$Step.AuthorisationRequest(request.f80499a, request.f80500b);
        }
        if (pixNavigation$InputData instanceof PixAuthorisationNavigation$InputData.Details) {
            return new PixFlowContract$Step.AuthorisationDetails(((PixAuthorisationNavigation$InputData.Details) pixNavigation$InputData).f80498a);
        }
        if (pixNavigation$InputData instanceof PixAutomaticoNavigation$InputData) {
            return PixFlowContract$Step.Automatico.f80552a;
        }
        if (pixNavigation$InputData instanceof PixModalNavigation$InputData) {
            return new PixFlowContract$Step.OpenModal(((PixModalNavigation$InputData) pixNavigation$InputData).f80509a);
        }
        if (pixNavigation$InputData instanceof PixPortabilityNavigation$InputData.Details) {
            PixPortabilityNavigation$InputData.Details details = (PixPortabilityNavigation$InputData.Details) pixNavigation$InputData;
            return new PixFlowContract$Step.PortabilityDetails(details.f80512a, details.f80513b);
        }
        if (pixNavigation$InputData instanceof PixQrNavigation$InputData.Request) {
            PixQrNavigation$InputData.Request request2 = (PixQrNavigation$InputData.Request) pixNavigation$InputData;
            return new PixFlowContract$Step.QrRequest(request2.f80517c, request2.f80515a, request2.f80516b);
        }
        if (pixNavigation$InputData instanceof PixQrNavigation$InputData.Send) {
            PixQrNavigation$InputData.Send send = (PixQrNavigation$InputData.Send) pixNavigation$InputData;
            return new PixFlowContract$Step.QrPayment(send.f80518a, send.f80519b);
        }
        if (pixNavigation$InputData instanceof PixRefundNavigation$InputData) {
            PixRefundNavigation$InputData pixRefundNavigation$InputData = (PixRefundNavigation$InputData) pixNavigation$InputData;
            return new PixFlowContract$Step.Refund(pixRefundNavigation$InputData.f80521a, pixRefundNavigation$InputData.f80522b, pixRefundNavigation$InputData.f80523c, pixRefundNavigation$InputData.d, pixRefundNavigation$InputData.e, pixRefundNavigation$InputData.f, pixRefundNavigation$InputData.f80524g);
        }
        if (pixNavigation$InputData instanceof PixTransferNavigation$InputData) {
            return new PixFlowContract$Step.Transfer((PixTransferNavigation$InputData) pixNavigation$InputData);
        }
        throw new IllegalArgumentException("input data is not supported");
    }

    @Override // yki.j
    public final void M0() {
        l2(new f(this, null, 1), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f80624r;
    }
}
