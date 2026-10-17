package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp;

import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$Step;
import d8l.d;
import dfj.a1;
import dfj.z0;
import i69.p;
import ibg.g;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qhj.e;
import vkm.q;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements igj.b {
    public final EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f100781p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z0 f100782q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gte.a f100783r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f100784s;

    public b(EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData inputData, e esimPhoneNumberFormatter, z0 internalDeepLinkInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(esimPhoneNumberFormatter, "esimPhoneNumberFormatter");
        Intrinsics.checkNotNullParameter(internalDeepLinkInteractor, "internalDeepLinkInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f100781p = esimPhoneNumberFormatter;
        this.f100782q = internalDeepLinkInteractor;
        this.f100783r = featureToggleInteractor;
        this.f100784s = d.a(this, new p(this, 16));
    }

    @Override // yji.l
    public final void I1() {
        if (((jte.d) this.f100783r).c(EsimApi$Toggles.EsimMobilePlansOtpPortability.f100180c)) {
            l.a1(this, q.g(((a1) this.f100782q).f113903a), null, null, new g(this, null, 6), 3);
        }
    }

    @Override // yki.j
    public final void M0() {
        EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData esimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData = this.o;
        String str = esimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData.f100773c.f100361b;
        boolean zC = ((jte.d) this.f100783r).c(EsimApi$Toggles.EsimMobilePlansOtpPortability.f100180c);
        i iVar = this.f100784s;
        if (!zC || str == null) {
            h.t2(this, iVar, EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$Step.NumberTransferConfirmation.f100775a, true, null, false, 12);
        } else {
            h.t2(this, iVar, new EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$Step.PortabilityInstruction(esimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData.f100771a, esimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData.f100772b, str), true, null, false, 12);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f100784s;
    }
}
