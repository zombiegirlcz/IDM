package eqf;

import com.revolut.feature.transfer.core.impl.ui.additional_information.AdditionalInformationScreen;
import com.revolut.feature.transfer.core.impl.ui.additional_information.flow.AdditionalInformationFlowContract$InputData;
import com.revolut.feature.transfer.core.impl.ui.additional_information.flow.AdditionalInformationFlowContract$State;
import com.revolut.feature.transfer.core.impl.ui.additional_information.flow.AdditionalInformationFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import dki.s;
import eq4.c;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends g implements s {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AdditionalInformationFlowContract$InputData f128456t;
    public final fqf.a u;
    public final AdditionalInformationFlowContract$Step v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AdditionalInformationFlowContract$State f128457w;

    public a(AdditionalInformationFlowContract$InputData inputData, fqf.a resultObserver) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(resultObserver, "resultObserver");
        this.f128456t = inputData;
        this.u = resultObserver;
        this.v = AdditionalInformationFlowContract$Step.f92188a;
        this.f128457w = AdditionalInformationFlowContract$State.f92187a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        AdditionalInformationFlowContract$Step step = (AdditionalInformationFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        AdditionalInformationFlowContract$InputData additionalInformationFlowContract$InputData = this.f128456t;
        AdditionalInformationScreen additionalInformationScreen = new AdditionalInformationScreen(additionalInformationFlowContract$InputData.f92186b);
        c cVar = new c(additionalInformationFlowContract$InputData, this, 9);
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        additionalInformationScreen.H = cVar;
        return additionalInformationScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f128457w;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.v;
    }
}
