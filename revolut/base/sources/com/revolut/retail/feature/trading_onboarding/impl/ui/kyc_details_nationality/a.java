package com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality;

import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.KycDetailsNationalityContract$Step;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.nationalities_screen.NationalitiesScreen;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.nationalities_screen.NationalitiesScreenContract$InputData;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rsl.p;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends g implements rzk.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final KycDetailsNationalityContract$InputData f104192t;
    public final KycDetailsNationalityContract$Step.NationalitiesStep u;
    public final KycDetailsNationalityContract$EmptyState v;

    public a(KycDetailsNationalityContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f104192t = inputData;
        this.u = KycDetailsNationalityContract$Step.NationalitiesStep.f104191a;
        this.v = KycDetailsNationalityContract$EmptyState.f104186a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        KycDetailsNationalityContract$Step step = (KycDetailsNationalityContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!Intrinsics.f(step, KycDetailsNationalityContract$Step.NationalitiesStep.f104191a)) {
            throw new NoWhenBranchMatchedException();
        }
        KycDetailsNationalityContract$InputData kycDetailsNationalityContract$InputData = this.f104192t;
        NationalitiesScreen nationalitiesScreen = new NationalitiesScreen(new NationalitiesScreenContract$InputData(kycDetailsNationalityContract$InputData.f104187a, kycDetailsNationalityContract$InputData.f104188b));
        p pVar = new p(this, nationalitiesScreen, 20);
        Intrinsics.checkNotNullParameter(pVar, "<set-?>");
        nationalitiesScreen.H = pVar;
        return nationalitiesScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.v;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.u;
    }
}
