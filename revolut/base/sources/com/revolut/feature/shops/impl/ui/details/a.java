package com.revolut.feature.shops.impl.ui.details;

import b9.w2;
import c1g.o;
import cjd.e;
import cjd.k;
import cjd.m;
import cjd.q;
import cjd.s;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.impl.ui.shops.what_is.WhatIsRevolutPayScreen;
import com.revolut.feature.shops.api.model.ShopsBenefit;
import com.revolut.feature.shops.api.model.ShopsCampaignDetails;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.feature.shops.api.model.ShopsShortCampaignInfo;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.youTransactor.uCube.rpc.Constants;
import eub.i;
import ffk.t;
import fmc.z;
import h4g.g;
import jgk.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import mre.c;
import oid.a0;
import oid.w;
import oki.h;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import vkm.j2;
import w4l.f;
import w4l.j;
import whi.b;
import yji.l;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements e {

    @NotNull
    private static final cjd.h Companion = new cjd.h();
    public final v A;
    public final c B;
    public final k0c.a C;
    public final y D;
    public a2 E;
    public final com.revolut.kompot.navigable.vc.modal.a F;
    public final ShopsCampaignCheckoutScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a0 f87167p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final djd.e f87168q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b6c.c f87169r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z f87170s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f87171t;
    public final fn2.c u;
    public final c70.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a7c.a f87172w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g f87173x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final pre.c f87174y;
    public final t z;

    public a(s stateMapper, ShopsCampaignCheckoutScreenContract$InputData inputData, a0 shopsInstructionsRepository, djd.e countriesBottomSheetMapper, b6c.c revolutPayInfoInteractor, z shopsCampaignInteractor, i revPointsOptInInteractor, fn2.c shopsPerkActivationInteractor, c70.a clipboard, a7c.a revolutPayInfoScreenFactory, g shopsFeatureAvailabilityInteractor, pre.c termsInteractor, t pricingPlanInteractor, v planTermsNavigationFactory, c termsNavigationFactory, sf0.h serverErrorParser, v60.e serverErrorsProvider, k0c.a revPointsTermsReviewFlowProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(shopsInstructionsRepository, "shopsInstructionsRepository");
        Intrinsics.checkNotNullParameter(countriesBottomSheetMapper, "countriesBottomSheetMapper");
        Intrinsics.checkNotNullParameter(revolutPayInfoInteractor, "revolutPayInfoInteractor");
        Intrinsics.checkNotNullParameter(shopsCampaignInteractor, "shopsCampaignInteractor");
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        Intrinsics.checkNotNullParameter(shopsPerkActivationInteractor, "shopsPerkActivationInteractor");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(revolutPayInfoScreenFactory, "revolutPayInfoScreenFactory");
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(planTermsNavigationFactory, "planTermsNavigationFactory");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(revPointsTermsReviewFlowProvider, "revPointsTermsReviewFlowProvider");
        this.o = inputData;
        this.f87167p = shopsInstructionsRepository;
        this.f87168q = countriesBottomSheetMapper;
        this.f87169r = revolutPayInfoInteractor;
        this.f87170s = shopsCampaignInteractor;
        this.f87171t = revPointsOptInInteractor;
        this.u = shopsPerkActivationInteractor;
        this.v = clipboard;
        this.f87172w = revolutPayInfoScreenFactory;
        this.f87173x = shopsFeatureAvailabilityInteractor;
        this.f87174y = termsInteractor;
        this.z = pricingPlanInteractor;
        this.A = planTermsNavigationFactory;
        this.B = termsNavigationFactory;
        this.C = revPointsTermsReviewFlowProvider;
        this.D = d.b(this, new cjd.d(0), stateMapper, null, false, 12);
        this.F = hx7.e.a(this, new c9f.c(this, 21));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
    
        if (r9.Q2(r10, r1) == r2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a0, code lost:
    
        if (r9.O2(r10, r1) == r2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b2, code lost:
    
        if (r9.P2(r10, r1) == r2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ca, code lost:
    
        if (r9.N2(r10, r11, r1) == r2) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.shops.impl.ui.details.a r9, com.revolut.feature.shops.api.model.ShopsCampaignOffer r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.shops.impl.ui.details.a.I2(com.revolut.feature.shops.impl.ui.details.a, com.revolut.feature.shops.api.model.ShopsCampaignOffer, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        final ShopsCampaignDetails shopsCampaignDetails = this.o.f87163a;
        boolean z = shopsCampaignDetails instanceof ShopsCampaignOffer;
        y yVar = this.D;
        Continuation continuation = null;
        if (z) {
            final int i = 0;
            H2(yVar, new Function1() { // from class: cjd.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            d update = (d) obj2;
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return d.a(update, null, null, ((ShopsCampaignOffer) shopsCampaignDetails).f87036t, 0, false, null, false, false, Constants.TAG_FB_CHARGING_STATUS);
                        default:
                            d update2 = (d) obj2;
                            Intrinsics.checkNotNullParameter(update2, "$this$update");
                            return d.a(update2, null, null, ((ShopsShortCampaignInfo) shopsCampaignDetails).f87074c, 0, false, null, false, false, Constants.TAG_FB_CHARGING_STATUS);
                    }
                }
            });
            R2(new Data(shopsCampaignDetails, null, false, 6, null));
        } else {
            if (!(shopsCampaignDetails instanceof ShopsShortCampaignInfo)) {
                throw new NoWhenBranchMatchedException();
            }
            final int i2 = 1;
            H2(yVar, new Function1() { // from class: cjd.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            d update = (d) obj2;
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            return d.a(update, null, null, ((ShopsCampaignOffer) shopsCampaignDetails).f87036t, 0, false, null, false, false, Constants.TAG_FB_CHARGING_STATUS);
                        default:
                            d update2 = (d) obj2;
                            Intrinsics.checkNotNullParameter(update2, "$this$update");
                            return d.a(update2, null, null, ((ShopsShortCampaignInfo) shopsCampaignDetails).f87074c, 0, false, null, false, false, Constants.TAG_FB_CHARGING_STATUS);
                    }
                }
            });
            ShopsShortCampaignInfo shopsShortCampaignInfo = (ShopsShortCampaignInfo) shopsCampaignDetails;
            String id10 = shopsShortCampaignInfo.f87072a;
            String source = shopsShortCampaignInfo.f87073b;
            z zVar = this.f87170s;
            zVar.getClass();
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(source, "source");
            w2 w2Var = (w2) zVar.f136369b;
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(source, "source");
            l.a1(this, rd0.e.b(((f) w2Var.f).e(new oid.i(id10, source), w4l.h.f294642c)), null, null, new cbh.g(this, continuation, 25), 3);
        }
        n2(new q(this, null), new b(6));
        l2(new k(this, null), new yi5.b(26));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (nim.a.a(r7, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof cjd.j
            if (r0 == 0) goto L13
            r0 = r7
            cjd.j r0 = (cjd.j) r0
            int r1 = r0.f24647w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24647w = r1
            goto L18
        L13:
            cjd.j r0 = new cjd.j
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f24647w
            pre.c r3 = r6.f87174y
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r5) goto L2c
            yhm.o.b(r7)
            goto L6c
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            yhm.o.b(r7)
            goto L4f
        L38:
            yhm.o.b(r7)
            com.revolut.feature.terms.api.model.TermsScope$a r7 = com.revolut.feature.terms.api.model.TermsScope.INSTANCE
            r7.getClass()
            com.revolut.feature.terms.api.model.TermsScope r7 = com.revolut.feature.terms.api.model.TermsScope.N
            ufm.i r7 = r3.j(r7)
            r0.f24647w = r4
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L4f
            goto L6b
        L4f:
            od0.i r7 = (od0.i) r7
            boolean r2 = r7.d()
            if (r2 == 0) goto L6f
            java.lang.Object r7 = r7.c()
            com.revolut.feature.terms.api.model.Terms r7 = (com.revolut.feature.terms.api.model.Terms) r7
            java.lang.String r7 = r7.f90355a
            pfm.r r7 = pre.c.b(r3, r7)
            r0.f24647w = r5
            java.lang.Object r7 = nim.a.a(r7, r0)
            if (r7 != r1) goto L6c
        L6b:
            return r1
        L6c:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L6f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "No terms found for PAID_PLANS scope"
            r7.<init>(r0)
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r7, r0)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.shops.impl.ui.details.a.J2(gim.c):java.lang.Object");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.F;
    }

    public final ShopsBenefit K2() {
        return this.f87173x.e() ? ShopsBenefit.RevPoints.f87022b : ShopsBenefit.Cashback.f87021b;
    }

    public final void L2(String campaignId) {
        a2 a2Var = this.E;
        if (a2Var != null) {
            a2Var.f(null);
        }
        a0 a0Var = this.f87167p;
        a0Var.getClass();
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        this.E = l.a1(this, rd0.e.b(nim.a.w(a0Var.d.e(campaignId, j.f294644c), new w(a0Var, 0))), null, null, new m(this, null), 3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void M2(ty0.a data) {
        Intrinsics.checkNotNullParameter(data, "data");
        String str = data.f275445a;
        Continuation continuation = null;
        switch (str.hashCode()) {
            case -790618645:
                if (str.equals("CLICK_ID_SHOP_TERMS")) {
                    Object obj2 = data.d;
                    Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.String");
                    C1(u0.c(new WebViewFeatureConfig((String) obj2, null, 0, false, true, false, 114590)));
                    break;
                }
                break;
            case -568043487:
                if (str.equals("CLICK_ID_REVPOINTS_TERMS")) {
                    TermsScope.INSTANCE.getClass();
                    n2(new c34.d(this, TermsScope.X, continuation, 24), new b(6));
                    break;
                }
                break;
            case -471092904:
                if (str.equals("CLICK_ID_SHOPS_TERMS")) {
                    TermsScope.INSTANCE.getClass();
                    n2(new c34.d(this, TermsScope.i0, continuation, 24), new b(6));
                    break;
                }
                break;
            case 1066021175:
                if (str.equals("CLICK_ID_PAID_PLAN_TERMS")) {
                    n2(new c84.y(this, continuation, 22), new b(6));
                    break;
                }
                break;
            case 2127125345:
                if (str.equals("CLICK_ID_WHAT_IS_REVOLUT_PAY")) {
                    ((m9c.a) this.f87172w).getClass();
                    C1(new com.revolut.kompot.common.d(new WhatIsRevolutPayScreen(), 4));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N2(com.revolut.feature.shops.api.model.ShopsCampaignOffer r10, co3.a r11, gim.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof cjd.n
            if (r0 == 0) goto L14
            r0 = r12
            cjd.n r0 = (cjd.n) r0
            int r1 = r0.f24650y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f24650y = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            cjd.n r0 = new cjd.n
            r0.<init>(r9, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r7.f24648w
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.f24650y
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 == r2) goto L36
            if (r1 != r8) goto L2e
            co3.a r10 = r7.v
            yhm.o.b(r12)
            goto L6e
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            co3.a r11 = r7.v
            com.revolut.feature.shops.api.model.ShopsCampaignOffer r10 = r7.u
            yhm.o.b(r12)
            goto L5d
        L3e:
            yhm.o.b(r12)
            r12 = r2
            java.lang.String r2 = r10.f87023a
            com.revolut.feature.shops.api.model.ShopsBenefit r3 = r9.K2()
            java.lang.String r4 = r10.f87024b
            java.lang.String r5 = r10.f87025c
            java.lang.String r6 = r10.u
            r7.u = r10
            r7.v = r11
            r7.f24650y = r12
            fn2.c r1 = r9.u
            java.lang.Object r12 = r1.s(r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto L5d
            goto L6c
        L5d:
            r12 = 0
            r7.u = r12
            r7.v = r11
            r7.f24650y = r8
            fn2.c r12 = r9.u
            java.lang.Object r10 = r12.c(r10, r7)
            if (r10 != r0) goto L6d
        L6c:
            return r0
        L6d:
            r10 = r11
        L6e:
            com.revolut.kompot.common.ExternalDestination$ImplicitActivity r0 = new com.revolut.kompot.common.ExternalDestination$ImplicitActivity
            double r11 = r10.f25486a
            double r1 = r10.f25487b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r3 = "geo:0,0?q="
            r10.<init>(r3)
            r10.append(r11)
            java.lang.String r11 = ","
            r10.append(r11)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            android.net.Uri r3 = android.net.Uri.parse(r10)
            r5 = 0
            r6 = 494(0x1ee, float:6.92E-43)
            java.lang.String r1 = "android.intent.action.VIEW"
            r2 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.C1(r0)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.shops.impl.ui.details.a.N2(com.revolut.feature.shops.api.model.ShopsCampaignOffer, co3.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O2(com.revolut.feature.shops.api.model.ShopsCampaignOffer r10, gim.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof cjd.o
            if (r0 == 0) goto L14
            r0 = r11
            cjd.o r0 = (cjd.o) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.z = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            cjd.o r0 = new cjd.o
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r7.f24652x
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.z
            r2 = 1
            r8 = 2
            if (r1 == 0) goto L40
            if (r1 == r2) goto L3a
            if (r1 != r8) goto L32
            java.lang.String r10 = r7.f24651w
            java.lang.String r0 = r7.v
            com.revolut.feature.shops.api.model.ShopsCampaignOffer r1 = r7.u
            yhm.o.b(r11)
            goto L77
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            com.revolut.feature.shops.api.model.ShopsCampaignOffer r10 = r7.u
            yhm.o.b(r11)
            goto L5d
        L40:
            yhm.o.b(r11)
            r11 = r2
            java.lang.String r2 = r10.f87023a
            com.revolut.feature.shops.api.model.ShopsBenefit r3 = r9.K2()
            java.lang.String r4 = r10.f87024b
            java.lang.String r5 = r10.f87025c
            java.lang.String r6 = r10.u
            r7.u = r10
            r7.z = r11
            fn2.c r1 = r9.u
            java.lang.Object r11 = r1.s(r2, r3, r4, r5, r6, r7)
            if (r11 != r0) goto L5d
            goto L73
        L5d:
            shd.b r11 = (shd.b) r11
            java.lang.String r1 = r11.f263455a
            java.lang.String r11 = r11.f263456b
            r7.u = r10
            r7.v = r1
            r7.f24651w = r11
            r7.z = r8
            fn2.c r2 = r9.u
            java.lang.Object r2 = r2.c(r10, r7)
            if (r2 != r0) goto L74
        L73:
            return r0
        L74:
            r0 = r1
            r1 = r10
            r10 = r11
        L77:
            if (r10 == 0) goto La1
            if (r0 == 0) goto La1
            chc.c0 r11 = new chc.c0
            r1 = 5
            r11.<init>(r1)
            c70.a r1 = r9.v
            java.lang.String r2 = "CLIPBOARD_LABEL"
            r3 = 0
            r1.c(r2, r10, r3, r11)
            cge.g r10 = new cge.g
            r11 = 27
            r10.<init>(r11)
            cli.y r11 = r9.D
            r9.H2(r11, r10)
            com.revolut.kompot.common.ExternalDestination$Browser r10 = new com.revolut.kompot.common.ExternalDestination$Browser
            r11 = 0
            r10.<init>(r0, r11)
            r9.C1(r10)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        La1:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.f87023a
            java.lang.String r2 = ", webhook: "
            java.lang.String r3 = ", campaignId: "
            java.lang.String r4 = "Promocode and webhook shouldn't be null! promo: "
            java.lang.StringBuilder r10 = v0.a.m(r4, r10, r2, r0, r3)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.shops.impl.ui.details.a.O2(com.revolut.feature.shops.api.model.ShopsCampaignOffer, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P2(com.revolut.feature.shops.api.model.ShopsCampaignOffer r10, gim.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof cjd.p
            if (r0 == 0) goto L14
            r0 = r11
            cjd.p r0 = (cjd.p) r0
            int r1 = r0.f24656y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f24656y = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            cjd.p r0 = new cjd.p
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r7.f24654w
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.f24656y
            r2 = 1
            r8 = 2
            if (r1 == 0) goto L3e
            if (r1 == r2) goto L38
            if (r1 != r8) goto L30
            java.lang.String r10 = r7.v
            com.revolut.feature.shops.api.model.ShopsCampaignOffer r0 = r7.u
            yhm.o.b(r11)
            goto L70
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            com.revolut.feature.shops.api.model.ShopsCampaignOffer r10 = r7.u
            yhm.o.b(r11)
            goto L5b
        L3e:
            yhm.o.b(r11)
            r11 = r2
            java.lang.String r2 = r10.f87023a
            com.revolut.feature.shops.api.model.ShopsBenefit r3 = r9.K2()
            java.lang.String r4 = r10.f87024b
            java.lang.String r5 = r10.f87025c
            java.lang.String r6 = r10.u
            r7.u = r10
            r7.f24656y = r11
            fn2.c r1 = r9.u
            java.lang.Object r11 = r1.s(r2, r3, r4, r5, r6, r7)
            if (r11 != r0) goto L5b
            goto L6d
        L5b:
            shd.b r11 = (shd.b) r11
            java.lang.String r11 = r11.f263455a
            r7.u = r10
            r7.v = r11
            r7.f24656y = r8
            fn2.c r1 = r9.u
            java.lang.Object r1 = r1.c(r10, r7)
            if (r1 != r0) goto L6e
        L6d:
            return r0
        L6e:
            r0 = r10
            r10 = r11
        L70:
            if (r10 == 0) goto L7e
            com.revolut.kompot.common.ExternalDestination$Browser r11 = new com.revolut.kompot.common.ExternalDestination$Browser
            r0 = 0
            r11.<init>(r10, r0)
            r9.C1(r11)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L7e:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r0.f87023a
            java.lang.String r0 = "Webhook shouldn't be null! campaignId: "
            java.lang.String r11 = j6.a.q(r0, r11)
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.shops.impl.ui.details.a.P2(com.revolut.feature.shops.api.model.ShopsCampaignOffer, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q2(com.revolut.feature.shops.api.model.ShopsCampaignOffer r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof cjd.r
            if (r0 == 0) goto L14
            r0 = r10
            cjd.r r0 = (cjd.r) r0
            int r1 = r0.f24661x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f24661x = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            cjd.r r0 = new cjd.r
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r7.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.f24661x
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            com.revolut.feature.shops.api.model.ShopsCampaignOffer r9 = r7.u
            yhm.o.b(r10)
            goto L50
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            yhm.o.b(r10)
            r10 = r2
            java.lang.String r2 = r9.f87023a
            com.revolut.feature.shops.api.model.ShopsBenefit r3 = r8.K2()
            java.lang.String r4 = r9.f87024b
            java.lang.String r5 = r9.f87025c
            java.lang.String r6 = r9.u
            r7.u = r9
            r7.f24661x = r10
            fn2.c r1 = r8.u
            java.lang.Object r10 = r1.s(r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L50
            return r0
        L50:
            shd.b r10 = (shd.b) r10
            java.lang.String r10 = r10.f263455a
            if (r10 == 0) goto L62
            com.revolut.kompot.common.ExternalDestination$Browser r9 = new com.revolut.kompot.common.ExternalDestination$Browser
            r0 = 0
            r9.<init>(r10, r0)
            r8.C1(r9)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L62:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.f87023a
            java.lang.String r0 = "Webhook shouldn't be null! campaignId: "
            java.lang.String r9 = j6.a.q(r0, r9)
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.shops.impl.ui.details.a.Q2(com.revolut.feature.shops.api.model.ShopsCampaignOffer, gim.c):java.lang.Object");
    }

    public final void R2(Data data) {
        ShopsCampaignOffer shopsCampaignOffer;
        y yVar = this.D;
        ShopsCampaignOffer shopsCampaignOffer2 = (ShopsCampaignOffer) ((cjd.d) ((j2) yVar.f22677a).getValue()).f24636a.getContent();
        String str = shopsCampaignOffer2 != null ? shopsCampaignOffer2.f87023a : null;
        ShopsCampaignOffer shopsCampaignOffer3 = (ShopsCampaignOffer) data.getContent();
        boolean zF = Intrinsics.f(str, shopsCampaignOffer3 != null ? shopsCampaignOffer3.f87023a : null);
        H2(yVar, new o((ShopsCampaignOffer) data.getContent(), 15, this, data));
        if (zF || (shopsCampaignOffer = (ShopsCampaignOffer) data.getContent()) == null) {
            return;
        }
        L2(shopsCampaignOffer.f87023a);
    }

    @Override // yji.l
    public final void T1(long j2) {
        H2(this.D, new cge.g(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.D;
    }
}
