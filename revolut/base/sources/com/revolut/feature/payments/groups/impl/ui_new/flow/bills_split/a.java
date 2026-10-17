package com.revolut.feature.payments.groups.impl.ui_new.flow.bills_split;

import com.revolut.feature.payments.bills_chooser.api.common.SplitMethod;
import com.revolut.feature.payments.bills_chooser.api.navigation.SplitBillFlowInputData;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMembersType;
import com.revolut.feature.payments.bills_chooser.impl.ui.flow.summary.SplitBillsSummaryFlow;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_split.PaymentsGroupsBillsSplitFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import java.util.ArrayList;
import java.util.Iterator;
import kog.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kt9.b;
import oc.c;
import oq9.o;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends g implements kt9.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ryc.a f79456t;
    public final kp9.a u;
    public final PaymentsGroupsBillsSplitFlowContract$Step.SplitSummary v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final PaymentsGroupsBillsSplitFlowContract$State f79457w;

    public a(ryc.a interactor, kp9.a navigationScreenProvider, PaymentsGroupsBillsSplitFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(navigationScreenProvider, "navigationScreenProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f79456t = interactor;
        this.u = navigationScreenProvider;
        this.v = PaymentsGroupsBillsSplitFlowContract$Step.SplitSummary.f79455a;
        this.f79457w = new PaymentsGroupsBillsSplitFlowContract$State(inputData.f79449a, inputData.f79450b, inputData.f79451c);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        PaymentsGroupsBillsSplitFlowContract$Step step = (PaymentsGroupsBillsSplitFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof PaymentsGroupsBillsSplitFlowContract$Step.SplitSummary)) {
            throw new NoWhenBranchMatchedException();
        }
        SplitMemberType.GroupMember groupMember = new SplitMemberType.GroupMember(((PaymentsGroupsBillsSplitFlowContract$State) A2().f98429a).f79453b);
        ArrayList arrayListJ = c.j(((PaymentsGroupsBillsSplitFlowContract$State) A2().f98429a).f79452a);
        ArrayList arrayList = new ArrayList(w.t(arrayListJ, 10));
        Iterator it8 = arrayListJ.iterator();
        while (it8.hasNext()) {
            arrayList.add(new SplitMemberType.GroupMember((o) it8.next()));
        }
        SplitBillFlowInputData inputData = new SplitBillFlowInputData(new SplitMembersType.Group(groupMember, arrayList), ((PaymentsGroupsBillsSplitFlowContract$State) A2().f98429a).f79454c, SplitMethod.Multiple.f79178a);
        this.u.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        SplitBillsSummaryFlow splitBillsSummaryFlow = new SplitBillsSummaryFlow(inputData);
        k kVar = new k(this, 17);
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        splitBillsSummaryFlow.J = kVar;
        return splitBillsSummaryFlow;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f79457w;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.v;
    }
}
