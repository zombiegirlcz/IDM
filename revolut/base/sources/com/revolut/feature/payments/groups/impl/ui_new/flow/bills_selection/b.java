package com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection;

import com.revolut.feature.payments.bills_chooser.api.navigation.BillsChooserInputData;
import com.revolut.feature.payments.bills_chooser.api.navigation.LimitedCurrenciesConfig;
import com.revolut.feature.payments.bills_chooser.api.navigation.SplitBillFlowInputData;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMembersType;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_selection.BillsChooserScreen;
import com.revolut.feature.payments.bills_chooser.impl.ui.flow.summary.SplitBillsSummaryFlow;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection.PaymentsGroupsBillsSelectionFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import java.util.ArrayList;
import java.util.Iterator;
import jsl.t0;
import jt9.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oc.c;
import oq9.o;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends g implements jt9.a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ryc.a f79447t;
    public final kp9.a u;
    public final PaymentsGroupsBillsSelectionFlowContract$Step.SelectBills v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final PaymentsGroupsBillsSelectionFlowContract$State f79448w;

    public b(PaymentsGroupsBillsSelectionFlowContract$InputData inputData, ryc.a billsSelectionInteractor, kp9.a navigationScreenProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(billsSelectionInteractor, "billsSelectionInteractor");
        Intrinsics.checkNotNullParameter(navigationScreenProvider, "navigationScreenProvider");
        this.f79447t = billsSelectionInteractor;
        this.u = navigationScreenProvider;
        this.v = PaymentsGroupsBillsSelectionFlowContract$Step.SelectBills.f79441a;
        this.f79448w = new PaymentsGroupsBillsSelectionFlowContract$State(inputData.f79437a, inputData.f79438b);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        PaymentsGroupsBillsSelectionFlowContract$Step step = (PaymentsGroupsBillsSelectionFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        boolean z = step instanceof PaymentsGroupsBillsSelectionFlowContract$Step.SelectBills;
        kp9.a aVar = this.u;
        if (z) {
            PaymentsGroupsBillsSelectionFlowContract$State paymentsGroupsBillsSelectionFlowContract$State = this.f79448w;
            BillsChooserInputData inputData = new BillsChooserInputData(true, paymentsGroupsBillsSelectionFlowContract$State.f79440b, paymentsGroupsBillsSelectionFlowContract$State.f79439a.f79290j.f79507b, LimitedCurrenciesConfig.DisallowAll.f79193a);
            aVar.getClass();
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            BillsChooserScreen billsChooserScreen = new BillsChooserScreen(inputData);
            final int i = 1;
            Function1 function1 = new Function1(this) { // from class: jt9.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection.b f178435b;

                {
                    this.f178435b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            bp9.g output = (bp9.g) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            if (output instanceof bp9.f) {
                                com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection.b bVar = this.f178435b;
                                bVar.l2(new t0(bVar, (bp9.f) output, null, 3), new yi5.b(26));
                            } else if (!(output instanceof bp9.e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.f186387a;
                        default:
                            bp9.c output2 = (bp9.c) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean z3 = output2 instanceof bp9.b;
                            com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection.b bVar2 = this.f178435b;
                            if (z3) {
                                bVar2.l2(new com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection.a(bVar2, (bp9.b) output2, null), new yi5.b(26));
                            } else {
                                if (!(output2 instanceof bp9.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar2.I2();
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            billsChooserScreen.H = function1;
            return billsChooserScreen;
        }
        if (!(step instanceof PaymentsGroupsBillsSelectionFlowContract$Step.SplitSummary)) {
            throw new NoWhenBranchMatchedException();
        }
        PaymentsGroupsBillsSelectionFlowContract$Step.SplitSummary splitSummary = (PaymentsGroupsBillsSelectionFlowContract$Step.SplitSummary) step;
        SplitMemberType.GroupMember groupMember = new SplitMemberType.GroupMember(splitSummary.f79442a);
        ArrayList arrayListJ = c.j(((PaymentsGroupsBillsSelectionFlowContract$State) A2().f98429a).f79439a);
        ArrayList arrayList = new ArrayList(w.t(arrayListJ, 10));
        Iterator it8 = arrayListJ.iterator();
        while (it8.hasNext()) {
            arrayList.add(new SplitMemberType.GroupMember((o) it8.next()));
        }
        SplitBillFlowInputData inputData2 = new SplitBillFlowInputData(new SplitMembersType.Group(groupMember, arrayList), splitSummary.f79443b, splitSummary.f79444c);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(inputData2, "inputData");
        SplitBillsSummaryFlow splitBillsSummaryFlow = new SplitBillsSummaryFlow(inputData2);
        final int i2 = 0;
        Function1 function12 = new Function1(this) { // from class: jt9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection.b f178435b;

            {
                this.f178435b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        bp9.g output = (bp9.g) obj2;
                        Intrinsics.checkNotNullParameter(output, "output");
                        if (output instanceof bp9.f) {
                            com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection.b bVar = this.f178435b;
                            bVar.l2(new t0(bVar, (bp9.f) output, null, 3), new yi5.b(26));
                        } else if (!(output instanceof bp9.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f186387a;
                    default:
                        bp9.c output2 = (bp9.c) obj2;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        boolean z3 = output2 instanceof bp9.b;
                        com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection.b bVar2 = this.f178435b;
                        if (z3) {
                            bVar2.l2(new com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection.a(bVar2, (bp9.b) output2, null), new yi5.b(26));
                        } else {
                            if (!(output2 instanceof bp9.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar2.I2();
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(function12, "<set-?>");
        splitBillsSummaryFlow.J = function12;
        return splitBillsSummaryFlow;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f79448w;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.v;
    }
}
