package com.revolut.feature.apm.bizum.impl.ui.transfer.flow;

import com.revolut.feature.apm.bizum.api.navigation.BizumTransferInputData;
import com.revolut.feature.apm.bizum.impl.ui.transfer.amount.BizumTransferAmountContract$InputData;
import com.revolut.feature.apm.bizum.impl.ui.transfer.amount.BizumTransferAmountScreen;
import com.revolut.feature.apm.bizum.impl.ui.transfer.flow.BizumTransferFlowContract$Step;
import com.revolut.feature.apm.bizum.impl.ui.transfer.review.BizumTransferReviewScreen;
import com.revolut.kompot.navigable.flow.EmptyFlowState;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mk5.s;
import ns1.b;
import ns1.e;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends g implements mt1.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final BizumTransferInputData f61622t;
    public final b3a.a u;
    public final b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final wj0.a f61623w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final BizumTransferFlowContract$Step.Amount f61624x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final EmptyFlowState f61625y;

    public a(BizumTransferInputData flowInputData, b3a.a chatTransferNavigationProvider, b errorHandlerExtension, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        Intrinsics.checkNotNullParameter(chatTransferNavigationProvider, "chatTransferNavigationProvider");
        Intrinsics.checkNotNullParameter(errorHandlerExtension, "errorHandlerExtension");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.f61622t = flowInputData;
        this.u = chatTransferNavigationProvider;
        this.v = errorHandlerExtension;
        this.f61623w = idempotencyKeyHolder;
        this.f61624x = new BizumTransferFlowContract$Step.Amount(new BizumTransferAmountContract$InputData.NewTransfer(flowInputData.f61561a, flowInputData.f61562b, flowInputData.f61563c));
        this.f61625y = EmptyFlowState.f98428a;
    }

    @Override // yji.l
    public final void I1() {
        String str;
        int i = mt1.b.f208743a[this.f61622t.f61562b.ordinal()];
        if (i == 1) {
            str = "payments_bizum_transfer";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "payments_apm_transfer";
        }
        this.f61623w.a(str);
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (((e) this.v).b3(throwable)) {
            return true;
        }
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return false;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        BizumTransferFlowContract$Step step = (BizumTransferFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof BizumTransferFlowContract$Step.Amount) {
            BizumTransferAmountScreen bizumTransferAmountScreen = new BizumTransferAmountScreen(((BizumTransferFlowContract$Step.Amount) step).f61620a);
            s sVar = new s(this, bizumTransferAmountScreen, 28);
            Intrinsics.checkNotNullParameter(sVar, "<set-?>");
            bizumTransferAmountScreen.H = sVar;
            return bizumTransferAmountScreen;
        }
        if (!(step instanceof BizumTransferFlowContract$Step.Review)) {
            throw new NoWhenBranchMatchedException();
        }
        BizumTransferReviewScreen bizumTransferReviewScreen = new BizumTransferReviewScreen(((BizumTransferFlowContract$Step.Review) step).f61621a);
        mqi.a aVar = new mqi.a(this, 7);
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        bizumTransferReviewScreen.H = aVar;
        return bizumTransferReviewScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f61625y;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f61624x;
    }
}
