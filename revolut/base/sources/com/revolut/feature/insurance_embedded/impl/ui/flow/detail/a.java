package com.revolut.feature.insurance_embedded.impl.ui.flow.detail;

import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_embedded.impl.ui.flow.detail.EmbeddedDetailFlowContract$Step;
import com.revolut.feature.insurance_embedded.impl.ui.screen.detail.EmbeddedInsuranceDetailScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.detail.EmbeddedInsuranceDetailScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.screen.help.EmbeddedInsuranceGetHelpScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.help.EmbeddedInsuranceGetHelpScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import tu7.c;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends g implements tu7.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final EmbeddedDetailFlowContract$InputData f76065t;
    public final EmbeddedDetailFlowContract$Step u;
    public final EmbeddedDetailFlowContract$State v;

    public a(EmbeddedDetailFlowContract$InputData inputData) {
        EmbeddedDetailFlowContract$Step embeddedDetailFlowContract$Step;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f76065t = inputData;
        int i = c.f274532a[inputData.f76061c.ordinal()];
        if (i == 1) {
            embeddedDetailFlowContract$Step = EmbeddedDetailFlowContract$Step.Detail.f76063a;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            embeddedDetailFlowContract$Step = EmbeddedDetailFlowContract$Step.GetHelp.f76064a;
        }
        this.u = embeddedDetailFlowContract$Step;
        this.v = EmbeddedDetailFlowContract$State.f76062a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        EmbeddedDetailFlowContract$Step step = (EmbeddedDetailFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        boolean z = step instanceof EmbeddedDetailFlowContract$Step.Detail;
        EmbeddedDetailFlowContract$InputData embeddedDetailFlowContract$InputData = this.f76065t;
        if (z) {
            return new EmbeddedInsuranceDetailScreen(new EmbeddedInsuranceDetailScreenContract$InputData(embeddedDetailFlowContract$InputData.f76059a, embeddedDetailFlowContract$InputData.f76060b));
        }
        if (!(step instanceof EmbeddedDetailFlowContract$Step.GetHelp)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = embeddedDetailFlowContract$InputData.f76059a;
        return new EmbeddedInsuranceGetHelpScreen(new EmbeddedInsuranceGetHelpScreenContract$InputData(R$drawable.uikit_icn_24_back_button_arrow, embeddedDetailFlowContract$InputData.f76060b, str));
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
