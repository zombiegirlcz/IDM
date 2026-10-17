package com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alert_details;

import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alert_details.SharedAlertDetailsFlowContract$Step;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alert_details.SharedAlertDetailsScreen;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alert_details.SharedAlertDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import raf.o;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends g implements red.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SharedAlertDetailsFlowContract$Step.Details f86702t;
    public final SharedAlertDetailsFlowContract$State u;

    public a(SharedAlertDetailsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f86702t = new SharedAlertDetailsFlowContract$Step.Details(inputData.f86700a);
        this.u = new SharedAlertDetailsFlowContract$State();
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        SharedAlertDetailsFlowContract$Step step = (SharedAlertDetailsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof SharedAlertDetailsFlowContract$Step.Details)) {
            throw new NoWhenBranchMatchedException();
        }
        SharedAlertDetailsScreen sharedAlertDetailsScreen = new SharedAlertDetailsScreen(new SharedAlertDetailsScreenContract$InputData(((SharedAlertDetailsFlowContract$Step.Details) step).f86701a));
        o oVar = new o(this, 14);
        Intrinsics.checkNotNullParameter(oVar, "<set-?>");
        sharedAlertDetailsScreen.H = oVar;
        return sharedAlertDetailsScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f86702t;
    }
}
