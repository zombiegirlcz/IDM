package com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.flow;

import c12.v0;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import com.revolut.feature.apm.core.api.ApmToggles$ApmMoneyRequestAny2Any;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferWrapperNavigation$InputData;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.payments.money_request.api.navigation.ManualTransferInputData;
import com.revolut.feature.payments.social.api.navigation.SocialPaymentsFeatureConfig;
import com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.ManualTransferContract$InputData;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.ManualTransferScreen;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.flow.ManualTransferFlowContract$Step;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.ManualTransferReviewScreen;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.ManualTransferReviewScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import dki.g;
import gqd.s;
import jte.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends g implements guf.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ManualTransferInputData f92477t;
    public final guf.b u;
    public final b3a.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ManualTransferFlowContract$State f92478w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ManualTransferFlowContract$Step f92479x;

    public c(ManualTransferInputData inputData, guf.b flowInteractor, b3a.a chatTransferNavigationProvider, gte.a featureToggleInteractor) {
        ManualTransferFlowContract$Step amount;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(flowInteractor, "flowInteractor");
        Intrinsics.checkNotNullParameter(chatTransferNavigationProvider, "chatTransferNavigationProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f92477t = inputData;
        this.u = flowInteractor;
        this.v = chatTransferNavigationProvider;
        this.f92478w = ManualTransferFlowContract$State.f92473a;
        TransferRequestApprovalData transferRequestApprovalData = inputData.f79597a;
        if (transferRequestApprovalData instanceof TransferRequestApprovalData.GroupBillsApproval) {
            amount = new ManualTransferFlowContract$Step.Amount(new ManualTransferContract$InputData.NewTransfer(transferRequestApprovalData));
        } else {
            if (!(transferRequestApprovalData instanceof TransferRequestApprovalData.MoneyRequestApproval)) {
                throw new NoWhenBranchMatchedException();
            }
            MoneyRequest moneyRequest = ((TransferRequestApprovalData.MoneyRequestApproval) transferRequestApprovalData).f92452b;
            MoneyRequestChannel moneyRequestChannel = moneyRequest.f60316c;
            if ((moneyRequestChannel instanceof MoneyRequestChannel.Revolut) || (moneyRequestChannel instanceof MoneyRequestChannel.BankBeneficiary)) {
                amount = new ManualTransferFlowContract$Step.Amount(new ManualTransferContract$InputData.NewTransfer(transferRequestApprovalData));
            } else {
                if (!(moneyRequestChannel instanceof MoneyRequestChannel.APM)) {
                    throw new NoWhenBranchMatchedException();
                }
                amount = (((d) featureToggleInteractor).c(ApmToggles$ApmMoneyRequestAny2Any.f61781c) || (moneyRequest.f60324q != null)) ? new ManualTransferFlowContract$Step.Apm(new ApmTransferWrapperNavigation$InputData.AcceptMoneyRequest(moneyRequest, (MoneyRequestChannel.APM) moneyRequestChannel, false)) : new ManualTransferFlowContract$Step.Review(new ManualTransferReviewScreenContract$InputData(moneyRequest, null));
            }
        }
        this.f92479x = amount;
    }

    public static final void O2(c cVar, SocialPaymentsFeatureConfig socialPaymentsFeatureConfig) {
        cVar.C1(u0.b(new CompositeCommand(new FinishCommand(null, null, null, 7), new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267950b, null, null, 6))), new FeatureCommand(socialPaymentsFeatureConfig))));
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        ManualTransferFlowContract$Step step = (ManualTransferFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof ManualTransferFlowContract$Step.Amount) {
            ManualTransferScreen manualTransferScreen = new ManualTransferScreen(((ManualTransferFlowContract$Step.Amount) step).f92474a);
            final int i = 0;
            Function1 function1 = new Function1(this) { // from class: guf.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.flow.c f146926b;

                {
                    this.f146926b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            buf.j output = (buf.j) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof buf.f;
                            com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.flow.c cVar = this.f146926b;
                            if (z || (output instanceof buf.g)) {
                                cVar.I2();
                            } else {
                                Continuation continuation = null;
                                if (output instanceof buf.i) {
                                    cVar.l2(new gm6.j(cVar, ((buf.i) output).f18807a, continuation, 14), new yi5.b(26));
                                } else {
                                    if (!(output instanceof buf.h)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    cVar.l2(new com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.flow.b(cVar, (buf.h) output, null), new yi5.b(26));
                                }
                            }
                            return Unit.f186387a;
                        default:
                            c12.u0 it8 = (c12.u0) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f146926b.I2();
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            manualTransferScreen.H = function1;
            return manualTransferScreen;
        }
        if (step instanceof ManualTransferFlowContract$Step.Review) {
            ManualTransferReviewScreenContract$InputData manualTransferReviewScreenContract$InputData = ((ManualTransferFlowContract$Step.Review) step).f92476a;
            ManualTransferReviewScreen manualTransferReviewScreen = new ManualTransferReviewScreen(manualTransferReviewScreenContract$InputData);
            s block = new s(manualTransferReviewScreenContract$InputData, this, 13);
            Intrinsics.checkNotNullParameter(block, "block");
            manualTransferReviewScreen.H = block;
            return manualTransferReviewScreen;
        }
        if (!(step instanceof ManualTransferFlowContract$Step.Apm)) {
            throw new NoWhenBranchMatchedException();
        }
        ViewController viewControllerE1 = e1(new v0(((ManualTransferFlowContract$Step.Apm) step).f92475a));
        final int i2 = 1;
        Function1 block2 = new Function1(this) { // from class: guf.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.flow.c f146926b;

            {
                this.f146926b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        buf.j output = (buf.j) obj2;
                        Intrinsics.checkNotNullParameter(output, "output");
                        boolean z = output instanceof buf.f;
                        com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.flow.c cVar = this.f146926b;
                        if (z || (output instanceof buf.g)) {
                            cVar.I2();
                        } else {
                            Continuation continuation = null;
                            if (output instanceof buf.i) {
                                cVar.l2(new gm6.j(cVar, ((buf.i) output).f18807a, continuation, 14), new yi5.b(26));
                            } else {
                                if (!(output instanceof buf.h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cVar.l2(new com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.flow.b(cVar, (buf.h) output, null), new yi5.b(26));
                            }
                        }
                        return Unit.f186387a;
                    default:
                        c12.u0 it8 = (c12.u0) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        this.f146926b.I2();
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block2, "block");
        viewControllerE1.H = block2;
        return viewControllerE1;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f92478w;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f92479x;
    }
}
