package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac;

import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac.EsimMobilePlanPacNumberTransferConfirmationFlowContract$Step;
import d8l.d;
import dfj.a1;
import dfj.z0;
import jch.p;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qhj.e;
import vkm.q;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements jgj.b {
    public final EsimMobilePlanPacNumberTransferConfirmationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f100794p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z0 f100795q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gte.a f100796r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f100797s;

    public b(EsimMobilePlanPacNumberTransferConfirmationFlowContract$InputData inputData, e esimPhoneNumberFormatter, z0 internalDeepLinkInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(esimPhoneNumberFormatter, "esimPhoneNumberFormatter");
        Intrinsics.checkNotNullParameter(internalDeepLinkInteractor, "internalDeepLinkInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f100794p = esimPhoneNumberFormatter;
        this.f100795q = internalDeepLinkInteractor;
        this.f100796r = featureToggleInteractor;
        this.f100797s = d.a(this, new p(this, 15));
    }

    @Override // yji.l
    public final void I1() {
        if (((jte.d) this.f100796r).c(EsimApi$Toggles.EsimMobilePlansOtpPortability.f100180c)) {
            l.a1(this, q.g(((a1) this.f100795q).f113903a), null, null, new j82.q(this, null, 24), 3);
        }
    }

    @Override // yki.j
    public final void M0() {
        EsimMobilePlanPacNumberTransferConfirmationFlowContract$InputData esimMobilePlanPacNumberTransferConfirmationFlowContract$InputData = this.o;
        String str = esimMobilePlanPacNumberTransferConfirmationFlowContract$InputData.e.f100370b;
        boolean zC = ((jte.d) this.f100796r).c(EsimApi$Toggles.EsimMobilePlansOtpPortability.f100180c);
        i iVar = this.f100797s;
        if (!zC || str == null) {
            h.t2(this, iVar, EsimMobilePlanPacNumberTransferConfirmationFlowContract$Step.NumberTransferConfirmation.f100789a, true, null, false, 12);
        } else {
            h.t2(this, iVar, new EsimMobilePlanPacNumberTransferConfirmationFlowContract$Step.PortabilityInstruction(esimMobilePlanPacNumberTransferConfirmationFlowContract$InputData.f100785a, esimMobilePlanPacNumberTransferConfirmationFlowContract$InputData.f100786b, str), true, null, false, 12);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f100797s;
    }
}
