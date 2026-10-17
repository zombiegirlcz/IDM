package com.revolut.feature.credit.loan.impl.ui.direct_debit_selection;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
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
import com.revolut.feature.credit.loan.impl.ui.direct_debit_selection.LoanDirectDebitFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import l35.b;
import ty4.e;
import ty4.f;
import ty4.h;
import ty4.i;
import w38.v;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends g implements w55.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f70337t;
    public final xy4.b u;
    public final LoanDirectDebitFlowContract$InputData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LoanDirectDebitFlowContract$Step.AccountSelection f70338w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final LoanDirectDebitFlowContract$EmptyState f70339x;

    public a(b loanInteractor, xy4.b directDebitStatusDialogFactory, LoanDirectDebitFlowContract$InputData flowInputData) {
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        Intrinsics.checkNotNullParameter(directDebitStatusDialogFactory, "directDebitStatusDialogFactory");
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        this.f70337t = loanInteractor;
        this.u = directDebitStatusDialogFactory;
        this.v = flowInputData;
        this.f70338w = new LoanDirectDebitFlowContract$Step.AccountSelection(flowInputData.f70332a);
        this.f70339x = LoanDirectDebitFlowContract$EmptyState.f70331a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        LoanDirectDebitFlowContract$Step step = (LoanDirectDebitFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof LoanDirectDebitFlowContract$Step.AccountSelection) {
            DirectDebitAccountSelectionScreen directDebitAccountSelectionScreen = new DirectDebitAccountSelectionScreen(new DirectDebitAccountSelectionScreenContract$InputData(((LoanDirectDebitFlowContract$Step.AccountSelection) step).f70335a, (AnalyticsContext) null, 6));
            final int i = 0;
            Function1 function1 = new Function1(this) { // from class: w55.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.credit.loan.impl.ui.direct_debit_selection.a f294694b;

                {
                    this.f294694b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    String str;
                    switch (i) {
                        case 0:
                            i outputData = (i) obj2;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            boolean z = outputData instanceof e;
                            com.revolut.feature.credit.loan.impl.ui.direct_debit_selection.a aVar = this.f294694b;
                            if (z) {
                                aVar.E2(new LoanDirectDebitFlowContract$Step.AccountDetails(((e) outputData).f275467a), true, null, false);
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
                                aVar.E2(new LoanDirectDebitFlowContract$Step.AccountConfirmation(new AccountSelectionSelectedData(f, f69907g, str2, pocketInfo.getF69908h())), true, null, false);
                            } else if (Intrinsics.f(outputData, h.f275471a)) {
                                aVar.E2(LoanDirectDebitFlowContract$Step.NewAccount.f70336a, true, null, false);
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
                            this.f294694b.E2(new LoanDirectDebitFlowContract$Step.AccountConfirmation(new AccountSelectionSelectedData(outputData2.f139094b, outputData2.f139093a, null, null)), true, null, false);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            directDebitAccountSelectionScreen.H = function1;
            return directDebitAccountSelectionScreen;
        }
        if (step instanceof LoanDirectDebitFlowContract$Step.AccountDetails) {
            return new DirectDebitAccountDetailsScreen(new DirectDebitAccountDetailsScreenContract$InputData(((LoanDirectDebitFlowContract$Step.AccountDetails) step).f70334a, null));
        }
        if (step instanceof LoanDirectDebitFlowContract$Step.AccountConfirmation) {
            DirectDebitAccountConfirmationScreen directDebitAccountConfirmationScreen = new DirectDebitAccountConfirmationScreen(new DirectDebitAccountConfirmationScreenContract$InputData(((LoanDirectDebitFlowContract$Step.AccountConfirmation) step).f70333a, null));
            v vVar = new v(this, step, 11);
            Intrinsics.checkNotNullParameter(vVar, "<set-?>");
            directDebitAccountConfirmationScreen.H = vVar;
            return directDebitAccountConfirmationScreen;
        }
        if (!Intrinsics.f(step, LoanDirectDebitFlowContract$Step.NewAccount.f70336a)) {
            throw new NoWhenBranchMatchedException();
        }
        DirectDebitNewAccountScreen directDebitNewAccountScreen = new DirectDebitNewAccountScreen();
        final int i2 = 1;
        Function1 function12 = new Function1(this) { // from class: w55.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.credit.loan.impl.ui.direct_debit_selection.a f294694b;

            {
                this.f294694b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String str;
                switch (i2) {
                    case 0:
                        i outputData = (i) obj2;
                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                        boolean z = outputData instanceof e;
                        com.revolut.feature.credit.loan.impl.ui.direct_debit_selection.a aVar = this.f294694b;
                        if (z) {
                            aVar.E2(new LoanDirectDebitFlowContract$Step.AccountDetails(((e) outputData).f275467a), true, null, false);
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
                            aVar.E2(new LoanDirectDebitFlowContract$Step.AccountConfirmation(new AccountSelectionSelectedData(f, f69907g, str2, pocketInfo.getF69908h())), true, null, false);
                        } else if (Intrinsics.f(outputData, h.f275471a)) {
                            aVar.E2(LoanDirectDebitFlowContract$Step.NewAccount.f70336a, true, null, false);
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
                        this.f294694b.E2(new LoanDirectDebitFlowContract$Step.AccountConfirmation(new AccountSelectionSelectedData(outputData2.f139094b, outputData2.f139093a, null, null)), true, null, false);
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
        return this.f70339x;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f70338w;
    }
}
