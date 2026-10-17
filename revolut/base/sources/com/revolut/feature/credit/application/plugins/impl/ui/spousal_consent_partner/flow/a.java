package com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow;

import c84.t;
import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentPartnerPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.SpousalConsentPartnerFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.SpousalConsentPartnerFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import e84.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import q5g.f0;
import qki.d;
import yki.b;
import yki.i;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t implements qi4.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SpousalConsentPartnerFlowContract$InputData f68467p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f68468q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f68469r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SpousalConsentPartnerFlowContract$InputData inputData, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f68467p = inputData;
        this.f68468q = hx7.e.b(this, SpousalConsentPartnerFlowContract$State.f68463a);
        this.f68469r = d8l.d.a(this, new f0(this, 23));
    }

    @Override // yki.j
    public final void M0() {
        SpousalConsentPartnerFlowContract$InputData.Config config = this.f68467p.f68460b;
        boolean z = config instanceof SpousalConsentPartnerFlowContract$InputData.Config.GiveConsent;
        i iVar = this.f68469r;
        if (z) {
            h.u2(this, iVar, SpousalConsentPartnerFlowContract$Step.GiveConsent.f68464a, null, 6);
            return;
        }
        if (!(config instanceof SpousalConsentPartnerFlowContract$InputData.Config.Popup)) {
            throw new NoWhenBranchMatchedException();
        }
        SpousalConsentPartnerPopupScreenConfig spousalConsentPartnerPopupScreenConfig = ((SpousalConsentPartnerFlowContract$InputData.Config.Popup) config).f68462a;
        boolean z3 = spousalConsentPartnerPopupScreenConfig instanceof SpousalConsentPartnerPopupScreenConfig.Respond;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (z3) {
            h.w2(iVar, new SpousalConsentPartnerFlowContract$Step.ModalStep.Respond((SpousalConsentPartnerPopupScreenConfig.Respond) spousalConsentPartnerPopupScreenConfig), bottom_dialog);
        } else {
            if (!(spousalConsentPartnerPopupScreenConfig instanceof SpousalConsentPartnerPopupScreenConfig.Waiting)) {
                throw new NoWhenBranchMatchedException();
            }
            h.w2(iVar, new SpousalConsentPartnerFlowContract$Step.ModalStep.Waiting((SpousalConsentPartnerPopupScreenConfig.Waiting) spousalConsentPartnerPopupScreenConfig), bottom_dialog);
        }
    }

    @Override // qki.e
    public final d getState() {
        return this.f68468q;
    }

    @Override // yki.g
    public final b s() {
        return this.f68469r;
    }
}
