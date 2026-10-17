package com.revolut.feature.transaction.troubleshooter.impl.ui.flow;

import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.TroubleshooterFlowContract$InputData;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.TroubleshooterFlowContract$Step;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.detail.TroubleshooterDetailScreen;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.detail.TroubleshooterDetailScreenContract$InputData;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.list.TroubleshooterListScreen;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.list.TroubleshooterListScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import v73.c;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends g implements vff.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TroubleshooterFlowContract$Step f91877t;
    public final TroubleshooterFlowContract$State u;

    public a(TroubleshooterFlowContract$InputData inputData) {
        TroubleshooterFlowContract$Step troubleshooterDetails;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (inputData instanceof TroubleshooterFlowContract$InputData.TroubleshooterList) {
            TroubleshooterFlowContract$InputData.TroubleshooterList troubleshooterList = (TroubleshooterFlowContract$InputData.TroubleshooterList) inputData;
            troubleshooterDetails = new TroubleshooterFlowContract$Step.TroubleshooterList(troubleshooterList.f91865a, troubleshooterList.f91866b, troubleshooterList.f91867c, troubleshooterList.d, troubleshooterList.e, troubleshooterList.f, troubleshooterList.f91868g);
        } else {
            if (!(inputData instanceof TroubleshooterFlowContract$InputData.Details)) {
                throw new NoWhenBranchMatchedException();
            }
            TroubleshooterFlowContract$InputData.Details details = (TroubleshooterFlowContract$InputData.Details) inputData;
            troubleshooterDetails = new TroubleshooterFlowContract$Step.TroubleshooterDetails(details.f91862a, details.f91863b, details.f91864c, details.d);
        }
        this.f91877t = troubleshooterDetails;
        this.u = new TroubleshooterFlowContract$State(false);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        TroubleshooterFlowContract$Step step = (TroubleshooterFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof TroubleshooterFlowContract$Step.TroubleshooterList) {
            TroubleshooterFlowContract$Step.TroubleshooterList troubleshooterList = (TroubleshooterFlowContract$Step.TroubleshooterList) step;
            String str = troubleshooterList.f91873a;
            TroubleshooterListScreen troubleshooterListScreen = new TroubleshooterListScreen(new TroubleshooterListScreenContract$InputData(str, troubleshooterList.f91874b, troubleshooterList.f91875c, troubleshooterList.d, troubleshooterList.e, troubleshooterList.f, troubleshooterList.f91876g));
            c cVar = new c(this, str, 18);
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            troubleshooterListScreen.H = cVar;
            return troubleshooterListScreen;
        }
        if (!(step instanceof TroubleshooterFlowContract$Step.TroubleshooterDetails)) {
            throw new NoWhenBranchMatchedException();
        }
        TroubleshooterFlowContract$Step.TroubleshooterDetails troubleshooterDetails = (TroubleshooterFlowContract$Step.TroubleshooterDetails) step;
        TroubleshooterDetailScreen troubleshooterDetailScreen = new TroubleshooterDetailScreen(new TroubleshooterDetailScreenContract$InputData(troubleshooterDetails.f91870a, troubleshooterDetails.f91871b, troubleshooterDetails.f91872c, troubleshooterDetails.d));
        vdl.a aVar = new vdl.a(this, 14);
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        troubleshooterDetailScreen.H = aVar;
        return troubleshooterDetailScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f91877t;
    }
}
