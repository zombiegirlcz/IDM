package com.revolut.feature.card_design.impl.card_design;

import android.os.Parcelable;
import ang.f;
import b93.g;
import c93.j;
import ce9.m;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.blue_prompt.BluePromptContent;
import com.revolut.feature.card_order_new.api.navigation.CardOrderFlowDestination;
import com.revolut.feature.card_payment_method.api.declaration.SelectedPaymentMethodResultContract$SelectedCardBindingStrategy;
import com.revolut.feature.cards_core.R$string;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import e93.n;
import grl.k9;
import hha.s;
import hha.u;
import java.util.ArrayList;
import java.util.List;
import jr6.p;
import jx2.l;
import kotlin.jvm.internal.Intrinsics;
import nx2.i;
import oki.h;
import om4.m4;
import q89.e;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends h implements nx2.b {
    public final f A;
    public final l93.f B;
    public final String C;
    public final qki.d D;
    public final yki.a E;
    public final CardDesignFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p f64723p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k93.b f64724q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z43.c f64725r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f64726s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fn2.c f64727t;
    public final ay2.h u;
    public final e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final gte.a f64728w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final kx2.a f64729x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final vx2.c f64730y;
    public final m4 z;

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData r26, jr6.p r27, k93.b r28, z43.c r29, jx2.l r30, fn2.c r31, ay2.h r32, q89.e r33, gte.a r34, kx2.a r35, vx2.c r36, om4.m4 r37, ang.f r38, l93.f r39, i90.b r40) {
        /*
            Method dump skipped, instruction units count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_design.impl.card_design.d.<init>(com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData, jr6.p, k93.b, z43.c, jx2.l, fn2.c, ay2.h, q89.e, gte.a, kx2.a, vx2.c, om4.m4, ang.f, l93.f, i90.b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.card_design.impl.card_design.d r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof nx2.o
            if (r0 == 0) goto L13
            r0 = r5
            nx2.o r0 = (nx2.o) r0
            int r1 = r0.f220114w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220114w = r1
            goto L18
        L13:
            nx2.o r0 = new nx2.o
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f220114w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L56
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            q89.e r5 = r4.v
            db9.d r5 = (db9.d) r5
            boolean r5 = r5.c()
            if (r5 != 0) goto L3f
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L3f:
            ang.f r4 = r4.A
            w4l.j r5 = w4l.j.f294644c
            akg.n r4 = r4.j(r5)
            r5 = 3
            r2 = 0
            jhi.b r4 = mo3.a.g(r4, r2, r2, r5)
            r0.f220114w = r3
            java.lang.Object r5 = vkm.q.x(r4, r0)
            if (r5 != r1) goto L56
            return r1
        L56:
            do3.n r5 = (do3.n) r5
            wi0.a r4 = wi0.b.Companion
            r4.getClass()
            wi0.b r4 = wi0.b.M0
            boolean r4 = te0.w.S(r5, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_design.impl.card_design.d.I2(com.revolut.feature.card_design.impl.card_design.d, gim.c):java.lang.Object");
    }

    public final nx2.e J2(c93.b bVar, e93.d cardDesign, j jVar, pi3.h hVar, hha.d dVar, boolean z, SelectedPaymentMethodResultContract$SelectedCardBindingStrategy selectedPaymentMethodResultContract$SelectedCardBindingStrategy) {
        n nVar;
        n nVar2;
        CardDesignFlowContract$InputData cardDesignFlowContract$InputData;
        NaviCommand naviCommandA;
        boolean zG = s.g(dVar);
        nx2.c cVar = null;
        CardDesignFlowContract$InputData cardDesignFlowContract$InputData2 = this.o;
        if ((zG || z) && (nVar = cardDesign.i) != null) {
            if (z) {
                j.Companion.getClass();
                j pricing = j.f22287c;
                List area = nVar.f123882a;
                String color = nVar.f123883b;
                String backgroundUrl = nVar.f123884c;
                Intrinsics.checkNotNullParameter(area, "area");
                Intrinsics.checkNotNullParameter(color, "color");
                Intrinsics.checkNotNullParameter(backgroundUrl, "backgroundUrl");
                Intrinsics.checkNotNullParameter(pricing, "pricing");
                nVar2 = new n(area, color, backgroundUrl, pricing);
            } else {
                nVar2 = nVar;
            }
            FeatureCommand personalisationCommand = u0.f(new CardOrderFlowDestination.CardPersonalisation(nVar2, !m.w(bVar.f22270b), bVar, cardDesignFlowContract$InputData2.getF64621l(), hVar, cardDesignFlowContract$InputData2.getI(), cardDesignFlowContract$InputData2.getF64624p(), null, cardDesignFlowContract$InputData2.getF(), cardDesignFlowContract$InputData2.getE(), cardDesignFlowContract$InputData2.getK(), cardDesignFlowContract$InputData2.getF64631y(), 2050));
            j jVar2 = cardDesign.e;
            if (z) {
                FeatureCommand skipPersonalisationCommand = gc0.c.f(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) L2(bVar, jVar2, cardDesignFlowContract$InputData2.getF(), null, null).f220096a, false, (Integer) null, 0, 61));
                g checkoutCardParams = K2(cardDesign);
                p53.c cVar2 = (p53.c) this.f64725r;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(personalisationCommand, "personalisationCommand");
                Intrinsics.checkNotNullParameter(skipPersonalisationCommand, "skipPersonalisationCommand");
                Intrinsics.checkNotNullParameter(checkoutCardParams, "checkoutCardParams");
                Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
                com.revolut.feature.blue_prompt.fullscreen.a aVar = ms2.g.Companion;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.card_personalisation_upgrade_to_unlock_title, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.card_personalisation_upgrade_to_unlock_subtitle, null, null, 14);
                BluePromptContent.MediaContent mediaContent = new BluePromptContent.MediaContent(new UrlVideo(cVar2.f233000a.d() ? "https://assets.revolut.com/mobile/cards/mp4/uikit_video_card_personalisation_dark.mp4" : "https://assets.revolut.com/mobile/cards/mp4/uikit_video_card_personalisation_light.mp4", (String) null, false, (oz0.b) null, false, (oz0.c) null, 126));
                ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.card_personalisation_upgrade_to_unlock_action_view_upgrade_options, null, null, 14);
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.card_personalisation_upgrade_to_unlock_action_skip_personalisation, null, null, 14);
                FinishCommand finishCommand = new FinishCommand(null, null, null, 7);
                u.Companion.getClass();
                cardDesignFlowContract$InputData = cardDesignFlowContract$InputData2;
                CompositeCommand compositeCommandC = com.revolut.retail.core.navigation.a.c(finishCommand, new FeatureCommand(new PricingPlanFeatureConfig.DashboardForCheckout(checkoutCardParams, u.l0, (ArrayList) null, personalisationCommand, xfa.b.CARD_PERSONALISATION_PITCH, (AccountId) null, cardDesign, (AnalyticsProduct) null, 292)));
                CompositeCommand compositeCommandG = r6.b.g(null, null, null, 7, skipPersonalisationCommand);
                k9 k9Var = k9.Cards;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                naviCommandA = com.revolut.feature.blue_prompt.fullscreen.a.a(aVar, textLocalisedClause, textLocalisedClause2, mediaContent, null, textLocalisedClause3, textLocalisedClause4, compositeCommandC, compositeCommandG, null, resourceImage, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), 33258544);
            } else {
                cardDesignFlowContract$InputData = cardDesignFlowContract$InputData2;
                naviCommandA = personalisationCommand;
            }
            cVar = new nx2.c(naviCommandA);
        } else {
            cardDesignFlowContract$InputData = cardDesignFlowContract$InputData2;
        }
        if (hVar == null || cVar == null) {
            if (hVar != null) {
                return L2(bVar, jVar, cardDesignFlowContract$InputData.getF(), hVar, selectedPaymentMethodResultContract$SelectedCardBindingStrategy);
            }
            if (cVar == null) {
                return L2(bVar, jVar, cardDesignFlowContract$InputData.getF(), null, selectedPaymentMethodResultContract$SelectedCardBindingStrategy);
            }
        }
        return cVar;
    }

    public final g K2(e93.d design) {
        String f64621l = this.o.getF64621l();
        this.f64726s.getClass();
        Intrinsics.checkNotNullParameter(design, "design");
        return new g(design, null, null, null, null, f64621l, null, design.e, null, null, null, null, null, null, null, null, null, null, null, 4190208);
    }

    public final nx2.d L2(c93.b bVar, j jVar, AccountId accountId, pi3.h hVar, SelectedPaymentMethodResultContract$SelectedCardBindingStrategy selectedPaymentMethodResultContract$SelectedCardBindingStrategy) {
        CardDesignFlowContract$InputData cardDesignFlowContract$InputData = this.o;
        xfa.b f64624p = cardDesignFlowContract$InputData.getF64624p();
        if ((f64624p == null ? -1 : i.f220105b[f64624p.ordinal()]) == 1) {
            f64624p = xfa.b.ONBOARDING_CARD_DELIVERY_OPTIONS;
        }
        xfa.b bVar2 = f64624p;
        NaviCommand i = cardDesignFlowContract$InputData.getI();
        String f64621l = cardDesignFlowContract$InputData.getF64621l();
        AnalyticsProduct k = cardDesignFlowContract$InputData.getK();
        return new nx2.d(new CardOrderFlowDestination.CardDelivery(bVar, f64621l, (Address) null, hVar, i, bVar2, (j) null, jVar, accountId, cardDesignFlowContract$InputData.getE(), (String) null, (List) null, k, selectedPaymentMethodResultContract$SelectedCardBindingStrategy != null ? selectedPaymentMethodResultContract$SelectedCardBindingStrategy.f65251a : null, selectedPaymentMethodResultContract$SelectedCardBindingStrategy != null ? selectedPaymentMethodResultContract$SelectedCardBindingStrategy.f65252b : null, cardDesignFlowContract$InputData.getF64631y(), 6282));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.retail.core.navigation.FeatureCommand M2(e93.e r11) {
        /*
            r10 = this;
            com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData r0 = r10.o
            com.revolut.retail.core.navigation.NaviCommand r4 = r0.getI()
            java.lang.String r5 = r0.getF64621l()
            com.revolut.core.model.account.AccountId r3 = r0.getF()
            e93.l0 r6 = r0.getF64619h()
            boolean r7 = r0.getF64618g()
            java.lang.String r1 = r0.getO()
            if (r1 == 0) goto L35
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toUpperCase(r2)
            java.lang.String r2 = "toUpperCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            if (r1 == 0) goto L35
            java.util.Map r2 = hx7.l.j()
            java.lang.Object r1 = le.u1.v(r1, r2)
            e93.b r1 = (e93.b) r1
        L33:
            r8 = r1
            goto L37
        L35:
            r1 = 0
            goto L33
        L37:
            pi3.h r9 = r0.getF64615a()
            com.revolut.feature.card_order_new.api.IssueVirtualCardFeatureConfig r1 = new com.revolut.feature.card_order_new.api.IssueVirtualCardFeatureConfig
            r2 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            com.revolut.retail.core.navigation.FeatureCommand r11 = gc0.c.f(r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_design.impl.card_design.d.M2(e93.e):com.revolut.retail.core.navigation.FeatureCommand");
    }

    public final void N2(e93.e eVar) {
        if (!m.s(eVar) && !m.w(eVar)) {
            C1(u0.b(M2(eVar)));
        } else {
            l2(new nx2.n(this, eVar, null, 1), new yi5.b(26));
        }
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.D;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.E;
    }
}
