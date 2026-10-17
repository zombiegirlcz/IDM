package com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow;

import c84.t;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorIntroScreenConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.SpousalConsentInitiatorFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.SpousalConsentInitiatorFlowContract$Step;
import e84.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mi4.c;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qki.d;
import yki.i;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends t implements mi4.a {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hw3.c f68441p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SpousalConsentInitiatorFlowContract$InputData f68442q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f68443r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f68444s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hw3.c spousalConsentInitiatorInteractor, SpousalConsentInitiatorFlowContract$InputData inputData, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(spousalConsentInitiatorInteractor, "spousalConsentInitiatorInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f68441p = spousalConsentInitiatorInteractor;
        this.f68442q = inputData;
        this.f68443r = hx7.e.b(this, SpousalConsentInitiatorFlowContract$State.f68435a);
        this.f68444s = d8l.d.a(this, new m84.e(this, 19));
    }

    public static String P2(SpousalConsentInitiatorIntroScreenConfig spousalConsentInitiatorIntroScreenConfig) {
        if (spousalConsentInitiatorIntroScreenConfig instanceof SpousalConsentInitiatorIntroScreenConfig.ApplicationDecline) {
            return "ApplicationDecline";
        }
        if (spousalConsentInitiatorIntroScreenConfig instanceof SpousalConsentInitiatorIntroScreenConfig.ApplyForOtherProduct) {
            return "ApplyForOtherProduct";
        }
        if (spousalConsentInitiatorIntroScreenConfig instanceof SpousalConsentInitiatorIntroScreenConfig.AwaitingResponse) {
            return "AwaitingResponse";
        }
        if (spousalConsentInitiatorIntroScreenConfig instanceof SpousalConsentInitiatorIntroScreenConfig.NeedPartnerConsent) {
            return "NeedPartnerConsent";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static CdnImage Q2(String str) {
        return com.revolut.core.ui_kit_core.displayers.image.models.b.c(str, new ImageTransformations(null, null, null, null, null, 300, 300, 31), null, null, 28);
    }

    @Override // yki.j
    public final void M0() {
        SpousalConsentInitiatorFlowContract$InputData.Config config = this.f68442q.f68431b;
        boolean z = config instanceof SpousalConsentInitiatorFlowContract$InputData.Config.Intro;
        i iVar = this.f68444s;
        if (z) {
            h.u2(this, iVar, new SpousalConsentInitiatorFlowContract$Step.Intro(((SpousalConsentInitiatorFlowContract$InputData.Config.Intro) config).f68432a), null, 6);
        } else {
            if (!(config instanceof SpousalConsentInitiatorFlowContract$InputData.Config.Popup)) {
                throw new NoWhenBranchMatchedException();
            }
            SpousalConsentInitiatorFlowContract$InputData.Config.Popup popup = (SpousalConsentInitiatorFlowContract$InputData.Config.Popup) config;
            h.u2(this, iVar, new SpousalConsentInitiatorFlowContract$Step.ModalStep.Popup(popup.f68433a, popup.f68434b), null, 6);
        }
    }

    @Override // qki.e
    public final d getState() {
        return this.f68443r;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f68444s;
    }
}
