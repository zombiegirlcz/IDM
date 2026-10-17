package com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails;

import ang.f;
import b9.w2;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.buying.api.navigation.InputData;
import com.revolut.feature.rev_points.giftcards.api.R$string;
import com.revolut.feature.rev_points.giftcards.api.RevPointsGiftcardsApi$Toggles;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucherDetails;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProduct;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.RevPointsGiftcardDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import eub.i;
import fmc.z;
import h4g.g;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jwb.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nii.y0;
import nyb.k;
import oki.h;
import org.bouncycastle.asn1.eac.CertificateBody;
import r70.c;
import rp0.f1;
import skm.a2;
import th9.t;
import tjf.p0;
import twb.l;
import twb.m;
import twb.x;
import vii.b;
import vkm.q;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements m {
    public final mwb.a A;
    public final f B;
    public final gte.a C;
    public final b D;
    public final b E;
    public final b F;
    public a2 G;
    public final InputData H;
    public final t I;
    public final y J;
    public final com.revolut.kompot.navigable.vc.modal.a K;
    public final RevPointsGiftcardDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c70.a f83717p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f83718q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f83719r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final svb.a f83720s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k f83721t;
    public final i u;
    public final ffk.t v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final wub.a f83722w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z f83723x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final fn2.c f83724y;
    public final g z;

    public a(n stateMapper, RevPointsGiftcardDetailsScreenContract$InputData inputData, c70.a clipboard, c hapticEngine, e revPointsGiftcardsInteractor, svb.a revPointsGiftcardsFeatureInteractor, k revPointsInteractor, i revPointsOptInInteractor, ffk.t pricingPlanInteractor, wub.a revPointsBuyingFeatureInteractor, z shopsCampaignInteractor, fn2.c shopsActivationInteractor, g shopsFeatureAvailabilityInteractor, mwb.a revPointsGiftCardDialogsFactory, f userInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(revPointsGiftcardsInteractor, "revPointsGiftcardsInteractor");
        Intrinsics.checkNotNullParameter(revPointsGiftcardsFeatureInteractor, "revPointsGiftcardsFeatureInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(revPointsBuyingFeatureInteractor, "revPointsBuyingFeatureInteractor");
        Intrinsics.checkNotNullParameter(shopsCampaignInteractor, "shopsCampaignInteractor");
        Intrinsics.checkNotNullParameter(shopsActivationInteractor, "shopsActivationInteractor");
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsGiftCardDialogsFactory, "revPointsGiftCardDialogsFactory");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f83717p = clipboard;
        this.f83718q = hapticEngine;
        this.f83719r = revPointsGiftcardsInteractor;
        this.f83720s = revPointsGiftcardsFeatureInteractor;
        this.f83721t = revPointsInteractor;
        this.u = revPointsOptInInteractor;
        this.v = pricingPlanInteractor;
        this.f83722w = revPointsBuyingFeatureInteractor;
        this.f83723x = shopsCampaignInteractor;
        this.f83724y = shopsActivationInteractor;
        this.z = shopsFeatureAvailabilityInteractor;
        this.A = revPointsGiftCardDialogsFactory;
        this.B = userInteractor;
        this.C = featureToggleInteractor;
        this.D = new b();
        this.E = new b();
        this.F = new b();
        this.H = new InputData(false, (Integer) null, (Function1) new twb.t(this, 0), 7);
        this.I = new t(this, 23);
        this.J = d.b(this, new l(inputData.f83710c, CertificateBody.profileType), stateMapper, null, false, 12);
        this.K = hx7.e.a(this, new tp8.l(this, 14));
    }

    public static final void I2(a aVar, UserVoucherDetails userVoucherDetails) {
        String brandId;
        if (aVar.z.e()) {
            if (!((jte.d) ((jwb.c) aVar.f83720s).f178947a).c(RevPointsGiftcardsApi$Toggles.GiftCardsShopsXSell.f83616c) || userVoucherDetails == null || (brandId = userVoucherDetails.f83632n) == null) {
                return;
            }
            z zVar = aVar.f83723x;
            zVar.getClass();
            Intrinsics.checkNotNullParameter(brandId, "brandId");
            Intrinsics.checkNotNullParameter("GiftCardsCheckout", "source");
            w2 w2Var = (w2) zVar.f136369b;
            Intrinsics.checkNotNullParameter(brandId, "brandId");
            Intrinsics.checkNotNullParameter("GiftCardsCheckout", "source");
            yji.l.a1(aVar, q.q(rd0.e.b(((w4l.f) w2Var.f13501g).e(new oid.h(brandId), w4l.h.f294642c))), null, null, new x(aVar, null, 4), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a r8, com.revolut.feature.shops.api.model.ShopsCampaignOffer r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof twb.d0
            if (r0 == 0) goto L14
            r0 = r10
            twb.d0 r0 = (twb.d0) r0
            int r1 = r0.f274974w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f274974w = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            twb.d0 r0 = new twb.d0
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r7.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.f274974w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r10)
            goto L4a
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            yhm.o.b(r10)
            fn2.c r1 = r8.f83724y
            r10 = r2
            java.lang.String r2 = r9.f87023a
            java.lang.String r4 = r9.f87024b
            java.lang.String r5 = r9.f87025c
            java.lang.String r6 = r9.u
            r7.f274974w = r10
            com.revolut.feature.shops.api.model.ShopsBenefit$RevPoints r3 = com.revolut.feature.shops.api.model.ShopsBenefit.RevPoints.f87022b
            java.lang.Object r10 = r1.s(r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L4a
            return r0
        L4a:
            shd.b r10 = (shd.b) r10
            java.lang.String r9 = r10.f263455a
            if (r9 == 0) goto L59
            com.revolut.kompot.common.ExternalDestination$Browser r10 = new com.revolut.kompot.common.ExternalDestination$Browser
            r0 = 0
            r10.<init>(r9, r0)
            r8.C1(r10)
        L59:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a.J2(com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a, com.revolut.feature.shops.api.model.ShopsCampaignOffer, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new p0(this, null, 20), new yi5.b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.K;
    }

    public final y0 K2() {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Something is not working correctly while fetching data in RevPointsGiftcardDetailsScreenModel, please check the stacktrace");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        this.A.getClass();
        return mwb.a.a();
    }

    public final void L2(String str) {
        this.f83717p.a("COPY_REDEMPTION_CODE_LABEL", str, false);
        if (!c70.a.g()) {
            this.I.invoke();
        }
        X1(new mii.f("CODE_COPIED_SHOT_DIALOG", new TextLocalisedClause(R$string.gift_cards_redeem_toast_code_copied, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_16_copy, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), f1.ABOVE_ANCHOR_VIEW, null, 76));
    }

    public final void M2(VoucherProduct voucherProduct) {
        String str = this.o.f83708a;
        if (str == null) {
            X1(K2());
            return;
        }
        h.v2(this.K, new RevPointsGiftcardDetailsScreenContract$ModalStep.Checkout(str, voucherProduct.f83639a, voucherProduct.f83640b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.J;
    }
}
