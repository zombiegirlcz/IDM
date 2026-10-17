package com.revolut.feature.credit.autopay.ui.screen.amount.flow;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.credit.autopay.ui.screen.amount.flow.SetAmountFlowContract$Step;
import com.revolut.feature.credit.autopay.ui.screen.amount.flow.SetAmountFlowContract$UiConfig;
import com.revolut.feature.credit.autopay.ui.screen.amount.input.InputAmountScreen;
import com.revolut.feature.credit.autopay.ui.screen.amount.input.InputAmountScreenContract$InputData;
import com.revolut.feature.credit.autopay.ui.screen.amount.input.InputAmountScreenContract$RepaymentInfo;
import com.revolut.feature.credit.autopay.ui.screen.amount.select_type.SelectAmountTypeScreen;
import com.revolut.feature.credit.autopay.ui.screen.amount.select_type.SelectAmountTypeScreenContract$InputData;
import com.revolut.feature.credit_card.autopay.api.models.CreditScheduledAmountType;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import dki.g;
import jk4.h;
import jk4.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends g implements ik4.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SetAmountFlowContract$InputData f68602t;
    public final SetAmountFlowContract$Step.SelectAmountType u;
    public final SetAmountFlowContract$State v;

    public a(SetAmountFlowContract$InputData flowInput) {
        Intrinsics.checkNotNullParameter(flowInput, "flowInput");
        this.f68602t = flowInput;
        this.u = SetAmountFlowContract$Step.SelectAmountType.f68593a;
        this.v = new SetAmountFlowContract$State(flowInput.f68587b);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        d dVar;
        ak4.a aVar;
        SetAmountFlowContract$Step step = (SetAmountFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        boolean z = step instanceof SetAmountFlowContract$Step.SelectAmountType;
        SetAmountFlowContract$InputData setAmountFlowContract$InputData = this.f68602t;
        if (z) {
            CreditScheduledAmountType creditScheduledAmountType = ((SetAmountFlowContract$State) A2().f98429a).f68591a;
            if (creditScheduledAmountType == null) {
                aVar = null;
            } else if (creditScheduledAmountType instanceof CreditScheduledAmountType.Minimum) {
                aVar = ak4.a.MINIMUM;
            } else if (creditScheduledAmountType instanceof CreditScheduledAmountType.Statement) {
                aVar = ak4.a.STATEMENT;
            } else {
                if (!(creditScheduledAmountType instanceof CreditScheduledAmountType.Fixed)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = ak4.a.FIXED;
            }
            boolean z3 = setAmountFlowContract$InputData.f68588c;
            SetAmountFlowContract$UiConfig setAmountFlowContract$UiConfig = setAmountFlowContract$InputData.e;
            SelectAmountTypeScreen selectAmountTypeScreen = new SelectAmountTypeScreen(new SelectAmountTypeScreenContract$InputData(aVar, z3, setAmountFlowContract$UiConfig != null ? setAmountFlowContract$UiConfig.f68594a : null, setAmountFlowContract$InputData.f));
            final int i = 1;
            Function1 function1 = new Function1(this) { // from class: ik4.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.credit.autopay.ui.screen.amount.flow.a f161894b;

                {
                    this.f161894b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            i outputData = (i) obj2;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            if (!(outputData instanceof h)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            h hVar = (h) outputData;
                            this.f161894b.G2(new b(new CreditScheduledAmountType.Fixed(hVar.f175073a), hVar.f175074b));
                            return Unit.f186387a;
                        default:
                            lk4.e outputData2 = (lk4.e) obj2;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            if (!(outputData2 instanceof lk4.d)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            int i2 = e.f161895a[((lk4.d) outputData2).f196210a.ordinal()];
                            com.revolut.feature.credit.autopay.ui.screen.amount.flow.a aVar2 = this.f161894b;
                            if (i2 == 1) {
                                aVar2.G2(new b(CreditScheduledAmountType.Minimum.f70685a, null));
                            } else if (i2 == 2) {
                                aVar2.G2(new b(CreditScheduledAmountType.Statement.f70686a, null));
                            } else {
                                if (i2 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.E2(SetAmountFlowContract$Step.AmountInput.f68592a, true, null, false);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            selectAmountTypeScreen.H = function1;
            return selectAmountTypeScreen;
        }
        if (!(step instanceof SetAmountFlowContract$Step.AmountInput)) {
            throw new NoWhenBranchMatchedException();
        }
        CreditScheduledAmountType creditScheduledAmountType2 = ((SetAmountFlowContract$State) A2().f98429a).f68591a;
        CreditScheduledAmountType.Fixed fixed = creditScheduledAmountType2 instanceof CreditScheduledAmountType.Fixed ? (CreditScheduledAmountType.Fixed) creditScheduledAmountType2 : null;
        if (fixed == null || (dVar = fixed.f70684a) == null) {
            dVar = new d(0L, setAmountFlowContract$InputData.f68586a);
        }
        d dVar2 = dVar;
        boolean z4 = setAmountFlowContract$InputData.f68588c;
        AnalyticsContext analyticsContext = setAmountFlowContract$InputData.f;
        SetAmountFlowContract$UiConfig setAmountFlowContract$UiConfig2 = setAmountFlowContract$InputData.e;
        SetAmountFlowContract$UiConfig.InputAmount inputAmount = setAmountFlowContract$UiConfig2 != null ? setAmountFlowContract$UiConfig2.f68595b : null;
        SetAmountFlowContract$RepaymentInfo setAmountFlowContract$RepaymentInfo = setAmountFlowContract$InputData.d;
        InputAmountScreen inputAmountScreen = new InputAmountScreen(new InputAmountScreenContract$InputData(z4, dVar2, analyticsContext, setAmountFlowContract$RepaymentInfo != null ? new InputAmountScreenContract$RepaymentInfo(setAmountFlowContract$RepaymentInfo.f68590b, setAmountFlowContract$RepaymentInfo.f68589a) : null, inputAmount));
        final int i2 = 0;
        Function1 block = new Function1(this) { // from class: ik4.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.credit.autopay.ui.screen.amount.flow.a f161894b;

            {
                this.f161894b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        i outputData = (i) obj2;
                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                        if (!(outputData instanceof h)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        h hVar = (h) outputData;
                        this.f161894b.G2(new b(new CreditScheduledAmountType.Fixed(hVar.f175073a), hVar.f175074b));
                        return Unit.f186387a;
                    default:
                        lk4.e outputData2 = (lk4.e) obj2;
                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                        if (!(outputData2 instanceof lk4.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i22 = e.f161895a[((lk4.d) outputData2).f196210a.ordinal()];
                        com.revolut.feature.credit.autopay.ui.screen.amount.flow.a aVar2 = this.f161894b;
                        if (i22 == 1) {
                            aVar2.G2(new b(CreditScheduledAmountType.Minimum.f70685a, null));
                        } else if (i22 == 2) {
                            aVar2.G2(new b(CreditScheduledAmountType.Statement.f70686a, null));
                        } else {
                            if (i22 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar2.E2(SetAmountFlowContract$Step.AmountInput.f68592a, true, null, false);
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block, "block");
        inputAmountScreen.H = block;
        return inputAmountScreen;
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
