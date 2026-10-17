package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney;

import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney.EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step;
import d8l.d;
import dfj.a1;
import dfj.z0;
import k3k.k;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qhj.e;
import vkm.q;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements kgj.b {
    public final EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f100810p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z0 f100811q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gte.a f100812r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f100813s;

    public b(EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData inputData, e esimPhoneNumberFormatter, z0 internalDeepLinkInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(esimPhoneNumberFormatter, "esimPhoneNumberFormatter");
        Intrinsics.checkNotNullParameter(internalDeepLinkInteractor, "internalDeepLinkInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f100810p = esimPhoneNumberFormatter;
        this.f100811q = internalDeepLinkInteractor;
        this.f100812r = featureToggleInteractor;
        this.f100813s = d.a(this, new k(this, 24));
    }

    @Override // yji.l
    public final void I1() {
        if (((jte.d) this.f100812r).c(EsimApi$Toggles.EsimMobilePlansOtpPortability.f100180c)) {
            l.a1(this, q.g(((a1) this.f100811q).f113903a), null, null, new kae.d(this, null, 10), 3);
        }
    }

    @Override // yki.j
    public final void M0() {
        EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData = this.o;
        String str = esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData.e.f100375b;
        boolean zC = ((jte.d) this.f100812r).c(EsimApi$Toggles.EsimMobilePlansOtpPortability.f100180c);
        i iVar = this.f100813s;
        if (!zC || str == null) {
            h.t2(this, iVar, EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step.NumberTransferConfirmation.f100804a, true, null, false, 12);
        } else {
            h.t2(this, iVar, new EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$Step.PortabilityInstruction(esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData.f100798a, esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData.f100799b, str), true, null, false, 12);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f100813s;
    }
}
