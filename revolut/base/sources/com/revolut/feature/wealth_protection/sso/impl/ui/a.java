package com.revolut.feature.wealth_protection.sso.impl.ui;

import cjl.s;
import com.revolut.feature.wealth_protection.sso.api.error.WealthProtectionSsoError;
import com.revolut.feature.wealth_protection.sso.impl.ui.WealthProtectionSsoFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.sso.api.login.RevolutSsoApi$InputData$OperationBoundAuthentication;
import com.revolut.sso.impl.ui.auth.AuthenticationFlow;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import nkl.b;
import no.e0;
import nrh.c;
import x0i.j;
import xjl.i;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends g implements c {
    public final j A;
    public final irh.a B;
    public final WealthProtectionSsoFlowContract$State C;
    public final WealthProtectionSsoFlowContract$Step.Initial D;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final WealthProtectionSsoFlowContract$InputData f96321t;
    public final i u;
    public final b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ppg.b f96322w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final eli.j f96323x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final nrh.b f96324y;
    public final rql.a z;

    public a(WealthProtectionSsoFlowContract$InputData inputData, i revolutSsoFlowConfigurationInteractor, b revolutSsoFlowsFactory, ppg.b vaultsInteractor, eli.j twoFaErrorHandler, nrh.b dialogFactory, rql.a ssoReauthenticationRepository, j submitOrderInteractor, irh.a wealthProtectionSsoRetryRepository) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revolutSsoFlowConfigurationInteractor, "revolutSsoFlowConfigurationInteractor");
        Intrinsics.checkNotNullParameter(revolutSsoFlowsFactory, "revolutSsoFlowsFactory");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        Intrinsics.checkNotNullParameter(ssoReauthenticationRepository, "ssoReauthenticationRepository");
        Intrinsics.checkNotNullParameter(submitOrderInteractor, "submitOrderInteractor");
        Intrinsics.checkNotNullParameter(wealthProtectionSsoRetryRepository, "wealthProtectionSsoRetryRepository");
        this.f96321t = inputData;
        this.u = revolutSsoFlowConfigurationInteractor;
        this.v = revolutSsoFlowsFactory;
        this.f96322w = vaultsInteractor;
        this.f96323x = twoFaErrorHandler;
        this.f96324y = dialogFactory;
        this.z = ssoReauthenticationRepository;
        this.A = submitOrderInteractor;
        this.B = wealthProtectionSsoRetryRepository;
        this.C = WealthProtectionSsoFlowContract$State.f96319a;
        this.D = WealthProtectionSsoFlowContract$Step.Initial.f96320a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        WealthProtectionSsoFlowContract$Step step = (WealthProtectionSsoFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof WealthProtectionSsoFlowContract$Step.Initial)) {
            throw new NoWhenBranchMatchedException();
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        WealthProtectionSsoError wealthProtectionSsoError = this.f96321t.f96316a;
        AuthenticationFlow authenticationFlowB = djl.a.b(this.v, new RevolutSsoApi$InputData$OperationBoundAuthentication(s.REGIONAL, wealthProtectionSsoError.f96313a, wealthProtectionSsoError.f96314b, 56), new kp0.b(ref$ObjectRef, this, 19));
        e0 block = new e0(this, ref$ObjectRef, 10);
        Intrinsics.checkNotNullParameter(block, "block");
        authenticationFlowB.H = block;
        return authenticationFlowB;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.C;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.D;
    }
}
