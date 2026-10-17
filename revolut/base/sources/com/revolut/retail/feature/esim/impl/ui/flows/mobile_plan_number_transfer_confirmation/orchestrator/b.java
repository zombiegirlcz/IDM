package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator;

import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingDynamicForm;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingOtp;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingPacInfo;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingPowerOfAttorneyInfo;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.orchestrator.a;
import d8l.d;
import dfj.a1;
import dfj.q1;
import dfj.z0;
import gvc.m;
import hba.k;
import hgj.c;
import hgj.e;
import hgj.f;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import yji.l;
import yki.i;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements hgj.b {

    @NotNull
    public static final e Companion = new e();
    public final EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z0 f100766p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qhj.e f100767q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gte.a f100768r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q1 f100769s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f100770t;

    public b(EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData inputData, z0 internalDeepLinkInteractor, qhj.e esimPhoneNumberFormatter, gte.a featureToggleInteractor, q1 portingInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(internalDeepLinkInteractor, "internalDeepLinkInteractor");
        Intrinsics.checkNotNullParameter(esimPhoneNumberFormatter, "esimPhoneNumberFormatter");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(portingInteractor, "portingInteractor");
        this.o = inputData;
        this.f100766p = internalDeepLinkInteractor;
        this.f100767q = esimPhoneNumberFormatter;
        this.f100768r = featureToggleInteractor;
        this.f100769s = portingInteractor;
        this.f100770t = d.a(this, new hfb.d(this, 4));
    }

    @Override // yji.l
    public final void I1() {
        if (((jte.d) this.f100768r).c(EsimApi$Toggles.EsimMobilePlansOtpPortability.f100180c)) {
            return;
        }
        l.a1(this, q.g(((a1) this.f100766p).f113903a), null, null, new k(this, (Continuation) null, 14), 3);
    }

    public final EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step I2(dej.a1 a1Var, EsimPhoneNumberPorting esimPhoneNumberPorting, String str, c cVar, boolean z) {
        int i = f.f152187a[a1Var.ordinal()];
        EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData = this.o;
        if (i == 1) {
            EsimPhoneNumberPortingPacInfo esimPhoneNumberPortingPacInfo = esimPhoneNumberPorting.i;
            if (esimPhoneNumberPortingPacInfo != null) {
                return new EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.Pac(esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.f100745a, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.f100746b, esimPhoneNumberPorting, cVar, z, esimPhoneNumberPortingPacInfo);
            }
            IllegalStateException illegalStateException = new IllegalStateException("Portability composite strategy is PAC but porting.pac is null");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "EsimMobilePlanNumberTransferConfirmationOrchestratorFlowModel", null, illegalStateException, h0Var);
            return null;
        }
        if (i == 2) {
            EsimPhoneNumberPortingPowerOfAttorneyInfo esimPhoneNumberPortingPowerOfAttorneyInfo = esimPhoneNumberPorting.f100336j;
            if (esimPhoneNumberPortingPowerOfAttorneyInfo != null) {
                return new EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.PowerOfAttorney(esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.f100745a, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.f100746b, esimPhoneNumberPorting, cVar, z, esimPhoneNumberPortingPowerOfAttorneyInfo);
            }
            IllegalStateException illegalStateException2 = new IllegalStateException("Portability composite strategy is POWER_OF_ATTORNEY but porting.powerOfAttorney is null");
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "EsimMobilePlanNumberTransferConfirmationOrchestratorFlowModel", null, illegalStateException2, h0Var2);
            return null;
        }
        if (i == 3) {
            EsimPhoneNumberPortingDynamicForm esimPhoneNumberPortingDynamicForm = esimPhoneNumberPorting.k;
            if (esimPhoneNumberPortingDynamicForm != null) {
                return new EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.DynamicForm(esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.f100745a, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.f100746b, esimPhoneNumberPorting, cVar, z, esimPhoneNumberPortingDynamicForm);
            }
            IllegalStateException illegalStateException3 = new IllegalStateException("Portability composite strategy is DYNAMIC_FORM but porting.dynamicForm is null");
            h0 h0Var3 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "EsimMobilePlanNumberTransferConfirmationOrchestratorFlowModel", null, illegalStateException3, h0Var3);
            return null;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        EsimPhoneNumberPortingOtp esimPhoneNumberPortingOtp = esimPhoneNumberPorting.f100337l;
        if (esimPhoneNumberPortingOtp != null && str != null) {
            return new EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.Otp(esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.f100745a, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.f100746b, esimPhoneNumberPorting, cVar, z, esimPhoneNumberPortingOtp, str);
        }
        IllegalStateException illegalStateException4 = new IllegalStateException("Portability composite strategy is OTP but either porting.otp or portingId is null");
        h0 h0Var4 = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "EsimMobilePlanNumberTransferConfirmationOrchestratorFlowModel", null, illegalStateException4, h0Var4);
        return null;
    }

    public final void J2(EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step, boolean z) {
        if (esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.getE()) {
            B2();
        } else {
            C2(new a.C0612a(z));
        }
    }

    public final void K2(EsimPhoneNumberPorting esimPhoneNumberPorting, String str) {
        EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$StepI2;
        a.b bVar = a.b.f100765a;
        if (esimPhoneNumberPorting == null) {
            C2(bVar);
            return;
        }
        List list = esimPhoneNumberPorting.f100333c;
        c cVar = c.DEFAULT;
        if (list != null) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                EsimPhoneNumberPorting esimPhoneNumberPorting2 = esimPhoneNumberPorting;
                String str2 = str;
                esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$StepI2 = I2((dej.a1) it8.next(), esimPhoneNumberPorting2, str2, cVar, true);
                if (esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$StepI2 != null) {
                    break;
                }
                esimPhoneNumberPorting = esimPhoneNumberPorting2;
                str = str2;
            }
            esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$StepI2 = null;
        } else {
            esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$StepI2 = null;
        }
        if (esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$StepI2 != null) {
            N2(esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$StepI2);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Next screen has no launchable porting strategy, strategyOrder:" + list);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "EsimMobilePlanNumberTransferConfirmationOrchestratorFlowModel", null, illegalStateException, h0Var);
        C2(bVar);
    }

    public final void L2() {
        EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData = this.o;
        String str = esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.f100747c.f100335h;
        if (((jte.d) this.f100768r).c(EsimApi$Toggles.EsimMobilePlansOtpPortability.f100180c) || str == null) {
            M2();
        } else {
            N2(new EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.PortabilityInstruction(esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.f100745a, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.f100746b, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.f100747c, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.e, false, str));
        }
    }

    @Override // yki.j
    public final void M0() {
        if (!((jte.d) this.f100768r).c(EsimApi$Toggles.EsimMobilePlansOtpPortability.f100180c)) {
            L2();
        } else {
            l2(new m(this, null, 17), new hg4.a(this, 2));
        }
    }

    public final void M2() {
        EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData = this.o;
        EsimPhoneNumberPorting esimPhoneNumberPorting = esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.f100747c;
        c cVar = esimPhoneNumberPorting.f100335h != null ? c.DEFAULT : esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.e;
        EsimPhoneNumberPortingPowerOfAttorneyInfo esimPhoneNumberPortingPowerOfAttorneyInfo = esimPhoneNumberPorting.f100336j;
        EsimPhoneNumberPortingDynamicForm esimPhoneNumberPortingDynamicForm = esimPhoneNumberPorting.k;
        EsimPhoneNumberPortingPacInfo esimPhoneNumberPortingPacInfo = esimPhoneNumberPorting.i;
        if (esimPhoneNumberPortingPowerOfAttorneyInfo != null) {
            N2(new EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.PowerOfAttorney(esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.f100745a, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.f100746b, esimPhoneNumberPorting, cVar, false, esimPhoneNumberPortingPowerOfAttorneyInfo));
            return;
        }
        if (esimPhoneNumberPortingPacInfo != null) {
            N2(new EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.Pac(esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.f100745a, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.f100746b, esimPhoneNumberPorting, cVar, false, esimPhoneNumberPortingPacInfo));
            return;
        }
        if (esimPhoneNumberPortingDynamicForm != null) {
            N2(new EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step.DynamicForm(esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.f100745a, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$InputData.f100746b, esimPhoneNumberPorting, cVar, false, esimPhoneNumberPortingDynamicForm));
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.r("Can't start portability confirmation flow. Pac, powerOfAttorney and dynamicForm are null, otp either null or OtpPortabilityFT is disabled -> esimMobilePlansOtpPortabilityEnabled:", ((jte.d) this.f100768r).c(EsimApi$Toggles.EsimMobilePlansOtpPortability.f100180c)));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "EsimMobilePlanNumberTransferConfirmationOrchestratorFlowModel", null, illegalStateException, h0Var);
        C2(new a.C0612a(false));
    }

    public final void N2(EsimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step) {
        h.t2(this, this.f100770t, esimMobilePlanNumberTransferConfirmationOrchestratorFlowContract$Step, true, null, false, 12);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f100770t;
    }
}
