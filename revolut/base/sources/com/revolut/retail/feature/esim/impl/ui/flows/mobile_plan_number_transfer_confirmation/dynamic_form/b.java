package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form;

import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form.EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step;
import d8l.d;
import dfj.a1;
import dfj.z0;
import gaa.g;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qhj.e;
import vkm.q;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements ggj.b {
    public final EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f100741p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z0 f100742q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gte.a f100743r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f100744s;

    public b(EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData inputData, e esimPhoneNumberFormatter, z0 internalDeepLinkInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(esimPhoneNumberFormatter, "esimPhoneNumberFormatter");
        Intrinsics.checkNotNullParameter(internalDeepLinkInteractor, "internalDeepLinkInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f100741p = esimPhoneNumberFormatter;
        this.f100742q = internalDeepLinkInteractor;
        this.f100743r = featureToggleInteractor;
        this.f100744s = d.a(this, new g75.i(this, 26));
    }

    @Override // yji.l
    public final void I1() {
        if (((jte.d) this.f100743r).c(EsimApi$Toggles.EsimMobilePlansOtpPortability.f100180c)) {
            l.a1(this, q.g(((a1) this.f100742q).f113903a), null, null, new g(this, null, 20), 3);
        }
    }

    @Override // yki.j
    public final void M0() {
        EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData = this.o;
        String str = esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData.e.f100351b;
        boolean zC = ((jte.d) this.f100743r).c(EsimApi$Toggles.EsimMobilePlansOtpPortability.f100180c);
        i iVar = this.f100744s;
        if (!zC || str == null) {
            h.t2(this, iVar, EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step.NumberTransferConfirmation.f100736a, true, null, false, 12);
        } else {
            h.t2(this, iVar, new EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$Step.PortabilityInstruction(esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData.f100730a, esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData.f100731b, str), true, null, false, 12);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f100744s;
    }
}
