package com.revolut.feature.apm.bills.pagopa.impl.ui.flow;

import amh.j;
import ar1.b;
import ar1.c;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bills.pagopa.api.navigation.PagoPAFlowDestination;
import com.revolut.feature.apm.bills.pagopa.impl.ui.bill_input.PagoPABillInputScreen;
import com.revolut.feature.apm.bills.pagopa.impl.ui.bill_input.PagoPABillInputScreenContract$InputData;
import com.revolut.feature.apm.bills.pagopa.impl.ui.confirmation.PagoPABillConfirmationScreen;
import com.revolut.feature.apm.bills.pagopa.impl.ui.confirmation.PagoPABillConfirmationScreenContract$InputData;
import com.revolut.feature.apm.bills.pagopa.impl.ui.flow.PagoPAFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import retrofit2.HttpException;
import sf0.h;
import vq1.e;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends g implements ar1.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f61495t;
    public final h u;
    public final PagoPAFlowContract$Step v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final PagoPAFlowContract$State f61496w;

    public a(PagoPAFlowDestination.InputData inputData, b pagoPADialogProvider, h serverErrorParser) {
        PagoPAFlowContract$Step billManualInput;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pagoPADialogProvider, "pagoPADialogProvider");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f61495t = pagoPADialogProvider;
        this.u = serverErrorParser;
        PagoPAFlowDestination.StartType startType = inputData.f61483a;
        if (startType instanceof PagoPAFlowDestination.StartType.BillConfirmation) {
            billManualInput = new PagoPAFlowContract$Step.BillConfirmation(new PagoPABillConfirmationScreenContract$InputData(((PagoPAFlowDestination.StartType.BillConfirmation) startType).f61484a));
        } else {
            if (!(startType instanceof PagoPAFlowDestination.StartType.BillManualInput)) {
                throw new NoWhenBranchMatchedException();
            }
            billManualInput = new PagoPAFlowContract$Step.BillManualInput(PagoPABillInputScreenContract$InputData.f61489a);
        }
        this.v = billManualInput;
        this.f61496w = new PagoPAFlowContract$State();
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ServerError serverErrorC = throwable instanceof HttpException ? this.u.c((HttpException) throwable) : throwable instanceof ServerErrorException ? ((ServerErrorException) throwable).f : null;
        if (serverErrorC == null) {
            super.o1(throwable);
            return false;
        }
        int i = serverErrorC.f51362a;
        e eVar = ((cr1.a) this.f61495t).f108187a;
        nq1.a aVarA = e.a(i);
        y0 y0Var = aVarA != null ? new y0(null, new z(new TextLocalisedClause(aVarA.f218353a, null, null, 14), new TextLocalisedClause(aVarA.f218354b, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5) : null;
        if (y0Var != null) {
            X1(y0Var);
            return true;
        }
        super.o1(throwable);
        return false;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        PagoPAFlowContract$Step step = (PagoPAFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof PagoPAFlowContract$Step.BillConfirmation) {
            PagoPABillConfirmationScreen pagoPABillConfirmationScreen = new PagoPABillConfirmationScreen(((PagoPAFlowContract$Step.BillConfirmation) step).f61493a);
            j jVar = new j(this, step, 25);
            Intrinsics.checkNotNullParameter(jVar, "<set-?>");
            pagoPABillConfirmationScreen.H = jVar;
            return pagoPABillConfirmationScreen;
        }
        if (!(step instanceof PagoPAFlowContract$Step.BillManualInput)) {
            throw new NoWhenBranchMatchedException();
        }
        PagoPABillInputScreen pagoPABillInputScreen = new PagoPABillInputScreen(((PagoPAFlowContract$Step.BillManualInput) step).f61494a);
        c cVar = new c(this, 0);
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        pagoPABillInputScreen.H = cVar;
        return pagoPABillInputScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f61496w;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.v;
    }
}
