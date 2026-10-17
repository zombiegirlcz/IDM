package com.revolut.feature.shops.impl.flow.session;

import com.revolut.feature.shops.impl.flow.session.ShopsSessionFlowContract$InputData;
import com.revolut.feature.shops.impl.flow.session.ShopsSessionFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import d8l.d;
import eub.e;
import h30.q;
import i69.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends h implements iid.b {
    public final ShopsSessionFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zja.a f87118p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f87119q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q f87120r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f87121s;

    public c(ShopsSessionFlowContract$InputData inputData, zja.a productArticleInteractor, e revPointsCountryOptInPolicyInteractor, q storeAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(revPointsCountryOptInPolicyInteractor, "revPointsCountryOptInPolicyInteractor");
        Intrinsics.checkNotNullParameter(storeAvailabilityInteractor, "storeAvailabilityInteractor");
        this.o = inputData;
        this.f87118p = productArticleInteractor;
        this.f87119q = revPointsCountryOptInPolicyInteractor;
        this.f87120r = storeAvailabilityInteractor;
        this.f87121s = d.a(this, new p(this, 21));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I2(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof iid.d
            if (r0 == 0) goto L13
            r0 = r7
            iid.d r0 = (iid.d) r0
            int r1 = r0.f161604x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f161604x = r1
            goto L18
        L13:
            iid.d r0 = new iid.d
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f161604x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.product_article.api.models.ProductArticleParams r0 = r0.u
            yhm.o.b(r7)
            goto L54
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            yhm.o.b(r7)
            com.revolut.feature.product_article.api.models.ProductArticleParams r7 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r2 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            com.revolut.feature.shops.api.model.ShopsProductArticleKey r4 = com.revolut.feature.shops.api.model.ShopsProductArticleKey.INTRO_LOYALTY
            r2.<init>(r4)
            r7.<init>(r2)
            r0.u = r7
            r0.f161604x = r3
            zja.a r2 = r6.f87118p
            kka.h r2 = (kka.h) r2
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r3 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            java.lang.Object r0 = r2.e(r7, r3, r0)
            if (r0 != r1) goto L51
            return r1
        L51:
            r5 = r0
            r0 = r7
            r7 = r5
        L54:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L5d
            return r0
        L5d:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.shops.impl.flow.session.c.I2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r15 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(com.revolut.feature.shops.impl.flow.session.ShopsSessionFlowContract$Step r13, boolean r14, gim.c r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof iid.f
            if (r0 == 0) goto L13
            r0 = r15
            iid.f r0 = (iid.f) r0
            int r1 = r0.f161608x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f161608x = r1
            goto L18
        L13:
            iid.f r0 = new iid.f
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f161608x
            yki.i r4 = r12.f87121s
            r10 = 2
            r11 = 1
            if (r2 == 0) goto L3c
            if (r2 == r11) goto L35
            if (r2 != r10) goto L2d
            yhm.o.b(r15)
            r3 = r12
            goto L5f
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            boolean r14 = r0.u
            yhm.o.b(r15)
            r3 = r12
            goto L54
        L3c:
            yhm.o.b(r15)
            r8 = 1
            r9 = 4
            r7 = 0
            r3 = r12
            r5 = r13
            r6 = r14
            oki.h.t2(r3, r4, r5, r6, r7, r8, r9)
            r0.u = r6
            r0.f161608x = r11
            java.lang.Object r13 = tkm.f.c(r0)
            if (r13 != r1) goto L53
            goto L5e
        L53:
            r14 = r6
        L54:
            r0.u = r14
            r0.f161608x = r10
            java.lang.Object r15 = r12.I2(r0)
            if (r15 != r1) goto L5f
        L5e:
            return r1
        L5f:
            com.revolut.feature.product_article.api.models.ProductArticleParams r15 = (com.revolut.feature.product_article.api.models.ProductArticleParams) r15
            if (r15 == 0) goto L6d
            com.revolut.feature.shops.impl.flow.session.ShopsSessionFlowContract$Step$Onboarding r13 = new com.revolut.feature.shops.impl.flow.session.ShopsSessionFlowContract$Step$Onboarding
            r13.<init>(r15)
            com.revolut.kompot.common.ModalDestination$Style$FULLSCREEN_SLIDE_FROM_BOTTOM r14 = com.revolut.kompot.common.ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a
            oki.h.w2(r4, r13, r14)
        L6d:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.shops.impl.flow.session.c.J2(com.revolut.feature.shops.impl.flow.session.ShopsSessionFlowContract$Step, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yki.j
    public final void M0() {
        ShopsSessionFlowContract$InputData shopsSessionFlowContract$InputData = this.o;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (shopsSessionFlowContract$InputData instanceof ShopsSessionFlowContract$InputData.Home) {
            l2(new iid.e(this, ((ShopsSessionFlowContract$InputData.Home) shopsSessionFlowContract$InputData).f87100a, objArr2 == true ? 1 : 0, 1), new yi5.b(26));
            return;
        }
        boolean z = shopsSessionFlowContract$InputData instanceof ShopsSessionFlowContract$InputData.Map;
        i iVar = this.f87121s;
        if (z) {
            h.u2(this, iVar, new ShopsSessionFlowContract$Step.MapView(((ShopsSessionFlowContract$InputData.Map) shopsSessionFlowContract$InputData).f87101a), null, 6);
            return;
        }
        if (shopsSessionFlowContract$InputData instanceof ShopsSessionFlowContract$InputData.CarouselDetails) {
            ShopsSessionFlowContract$InputData.CarouselDetails carouselDetails = (ShopsSessionFlowContract$InputData.CarouselDetails) shopsSessionFlowContract$InputData;
            l2(new i44.a(this, new ShopsSessionFlowContract$Step.CarouselDetails(carouselDetails.f87097b, carouselDetails.f87096a), objArr == true ? 1 : 0, 28), new yi5.b(26));
            return;
        }
        if (shopsSessionFlowContract$InputData instanceof ShopsSessionFlowContract$InputData.FullScreenPrompt) {
            ShopsSessionFlowContract$InputData.FullScreenPrompt fullScreenPrompt = (ShopsSessionFlowContract$InputData.FullScreenPrompt) shopsSessionFlowContract$InputData;
            h.u2(this, iVar, new ShopsSessionFlowContract$Step.FullScreenPrompt(fullScreenPrompt.f87098a, fullScreenPrompt.f87099b), null, 6);
        } else {
            if (!(shopsSessionFlowContract$InputData instanceof ShopsSessionFlowContract$InputData.AuctionBid)) {
                throw new NoWhenBranchMatchedException();
            }
            ShopsSessionFlowContract$InputData.AuctionBid auctionBid = (ShopsSessionFlowContract$InputData.AuctionBid) shopsSessionFlowContract$InputData;
            String str = auctionBid.f87094a;
            String str2 = auctionBid.f87095b;
            ShopsSessionFlowContract$Step.AuctionBid auctionBid2 = new ShopsSessionFlowContract$Step.AuctionBid(str, str2);
            ModalDestination.Style style = str2 != null ? ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a : null;
            if (style == null) {
                style = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
            }
            h.w2(iVar, auctionBid2, style);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f87121s;
    }
}
