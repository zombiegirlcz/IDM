package com.revolut.feature.credit.card.impl.ui.direct_debit_selection;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.credit.card.impl.ui.direct_debit_selection.CreditCardDirectDebitFlowContract$Step;
import com.revolut.feature.credit.direct.debit.account_confirmation.DirectDebitAccountConfirmationScreen;
import com.revolut.feature.credit.direct.debit.account_confirmation.DirectDebitAccountConfirmationScreenContract$InputData;
import com.revolut.feature.credit.direct.debit.account_details.DirectDebitAccountDetailsScreen;
import com.revolut.feature.credit.direct.debit.account_details.DirectDebitAccountDetailsScreenContract$InputData;
import com.revolut.feature.credit.direct.debit.account_selection.DirectDebitAccountSelectionScreen;
import com.revolut.feature.credit.direct.debit.account_selection.DirectDebitAccountSelectionScreenContract$InputData;
import com.revolut.feature.credit.direct.debit.account_selection.models.AccountSelectionSelectedData;
import com.revolut.feature.credit.direct.debit.account_selection.models.LinkedPocketInfo;
import com.revolut.feature.credit.direct.debit.account_selection.models.PocketInfo;
import com.revolut.feature.credit.direct.debit.new_account.DirectDebitNewAccountScreen;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ty4.e;
import ty4.f;
import ty4.h;
import ty4.i;
import xy4.b;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends g implements jr4.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final lb5.a f69282t;
    public final b u;
    public final CreditCardDirectDebitFlowContract$InputData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CreditCardDirectDebitFlowContract$Step.AccountSelection f69283w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CreditCardDirectDebitFlowContract$EmptyState f69284x;

    public a(lb5.a interactor, b directDebitStatusDialogFactory, CreditCardDirectDebitFlowContract$InputData flowInputData) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(directDebitStatusDialogFactory, "directDebitStatusDialogFactory");
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        this.f69282t = interactor;
        this.u = directDebitStatusDialogFactory;
        this.v = flowInputData;
        this.f69283w = new CreditCardDirectDebitFlowContract$Step.AccountSelection(flowInputData.f69276a);
        this.f69284x = CreditCardDirectDebitFlowContract$EmptyState.f69275a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        CreditCardDirectDebitFlowContract$Step step = (CreditCardDirectDebitFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CreditCardDirectDebitFlowContract$Step.AccountSelection) {
            DirectDebitAccountSelectionScreen directDebitAccountSelectionScreen = new DirectDebitAccountSelectionScreen(new DirectDebitAccountSelectionScreenContract$InputData(((CreditCardDirectDebitFlowContract$Step.AccountSelection) step).f69280a, (AnalyticsContext) null, 6));
            final int i = 0;
            Function1 function1 = new Function1(this) { // from class: jr4.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.direct_debit_selection.a f177933b;

                {
                    this.f177933b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    String str;
                    switch (i) {
                        case 0:
                            i outputData = (i) obj2;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean z = outputData instanceof e;
                            com.revolut.feature.credit.card.impl.ui.direct_debit_selection.a aVar = this.f177933b;
                            if (z) {
                                aVar.E2(new CreditCardDirectDebitFlowContract$Step.AccountDetails(((e) outputData).f275467a), true, null, false);
                            } else if (outputData instanceof f) {
                                PocketInfo pocketInfo = ((f) outputData).f275468a;
                                String f = pocketInfo.getF();
                                String str2 = "";
                                if (f == null) {
                                    f = "";
                                }
                                String f69907g = pocketInfo.getF69907g();
                                if (f69907g == null) {
                                    f69907g = "";
                                }
                                LinkedPocketInfo linkedPocketInfo = pocketInfo instanceof LinkedPocketInfo ? (LinkedPocketInfo) pocketInfo : null;
                                if (linkedPocketInfo == null || (str = linkedPocketInfo.f69899a) == null) {
                                    m70.a.c(t0.f186434a);
                                } else {
                                    str2 = str;
                                }
                                aVar.E2(new CreditCardDirectDebitFlowContract$Step.AccountConfirmation(new AccountSelectionSelectedData(f, f69907g, str2, pocketInfo.getF69908h())), true, null, false);
                            } else if (Intrinsics.f(outputData, h.f275471a)) {
                                aVar.E2(CreditCardDirectDebitFlowContract$Step.NewAccount.f69281a, true, null, false);
                            } else {
                                if (!Intrinsics.f(outputData, ty4.g.f275470a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.I2();
                            }
                            return Unit.f186387a;
                        default:
                            fz4.h outputData2 = (fz4.h) obj2;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            if (outputData2 == null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f177933b.E2(new CreditCardDirectDebitFlowContract$Step.AccountConfirmation(new AccountSelectionSelectedData(outputData2.f139094b, outputData2.f139093a, null, null)), true, null, false);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            directDebitAccountSelectionScreen.H = function1;
            return directDebitAccountSelectionScreen;
        }
        if (step instanceof CreditCardDirectDebitFlowContract$Step.AccountDetails) {
            return new DirectDebitAccountDetailsScreen(new DirectDebitAccountDetailsScreenContract$InputData(((CreditCardDirectDebitFlowContract$Step.AccountDetails) step).f69279a, null));
        }
        if (step instanceof CreditCardDirectDebitFlowContract$Step.AccountConfirmation) {
            DirectDebitAccountConfirmationScreen directDebitAccountConfirmationScreen = new DirectDebitAccountConfirmationScreen(new DirectDebitAccountConfirmationScreenContract$InputData(((CreditCardDirectDebitFlowContract$Step.AccountConfirmation) step).f69278a, null));
            jp3.b bVar = new jp3.b(this, step, 10);
            Intrinsics.checkNotNullParameter(bVar, "<set-?>");
            directDebitAccountConfirmationScreen.H = bVar;
            return directDebitAccountConfirmationScreen;
        }
        if (!Intrinsics.f(step, CreditCardDirectDebitFlowContract$Step.NewAccount.f69281a)) {
            throw new NoWhenBranchMatchedException();
        }
        DirectDebitNewAccountScreen directDebitNewAccountScreen = new DirectDebitNewAccountScreen();
        final int i2 = 1;
        Function1 function12 = new Function1(this) { // from class: jr4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.direct_debit_selection.a f177933b;

            {
                this.f177933b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String str;
                switch (i2) {
                    case 0:
                        i outputData = (i) obj2;
                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                        boolean z = outputData instanceof e;
                        com.revolut.feature.credit.card.impl.ui.direct_debit_selection.a aVar = this.f177933b;
                        if (z) {
                            aVar.E2(new CreditCardDirectDebitFlowContract$Step.AccountDetails(((e) outputData).f275467a), true, null, false);
                        } else if (outputData instanceof f) {
                            PocketInfo pocketInfo = ((f) outputData).f275468a;
                            String f = pocketInfo.getF();
                            String str2 = "";
                            if (f == null) {
                                f = "";
                            }
                            String f69907g = pocketInfo.getF69907g();
                            if (f69907g == null) {
                                f69907g = "";
                            }
                            LinkedPocketInfo linkedPocketInfo = pocketInfo instanceof LinkedPocketInfo ? (LinkedPocketInfo) pocketInfo : null;
                            if (linkedPocketInfo == null || (str = linkedPocketInfo.f69899a) == null) {
                                m70.a.c(t0.f186434a);
                            } else {
                                str2 = str;
                            }
                            aVar.E2(new CreditCardDirectDebitFlowContract$Step.AccountConfirmation(new AccountSelectionSelectedData(f, f69907g, str2, pocketInfo.getF69908h())), true, null, false);
                        } else if (Intrinsics.f(outputData, h.f275471a)) {
                            aVar.E2(CreditCardDirectDebitFlowContract$Step.NewAccount.f69281a, true, null, false);
                        } else {
                            if (!Intrinsics.f(outputData, ty4.g.f275470a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar.I2();
                        }
                        return Unit.f186387a;
                    default:
                        fz4.h outputData2 = (fz4.h) obj2;
                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                        if (outputData2 == null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f177933b.E2(new CreditCardDirectDebitFlowContract$Step.AccountConfirmation(new AccountSelectionSelectedData(outputData2.f139094b, outputData2.f139093a, null, null)), true, null, false);
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(function12, "<set-?>");
        directDebitNewAccountScreen.H = function12;
        return directDebitNewAccountScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f69284x;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f69283w;
    }
}
