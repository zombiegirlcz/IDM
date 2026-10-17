package com.revolut.feature.payments.bills_chooser.impl.ui.flow.summary;

import a31.k;
import bp9.f;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.bills_chooser.api.common.BillType;
import com.revolut.feature.payments.bills_chooser.api.common.SplitMethod;
import com.revolut.feature.payments.bills_chooser.api.navigation.SplitBillFlowInputData;
import com.revolut.feature.payments.bills_chooser.api.navigation.SplitBillInputData;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMembersType;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.SplitBillsSummaryScreen;
import com.revolut.feature.payments.bills_chooser.impl.ui.flow.summary.SplitBillsSummaryFlowContract$Step;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.r0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends g implements aq9.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final kp9.a f79264t;
    public final SplitBillsSummaryFlowContract$Step.SplitSummary u;
    public final SplitBillsSummaryFlowContract$State v;

    public a(kp9.a navigationScreenProvider, SplitBillFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(navigationScreenProvider, "navigationScreenProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f79264t = navigationScreenProvider;
        this.u = SplitBillsSummaryFlowContract$Step.SplitSummary.f79263a;
        this.v = new SplitBillsSummaryFlowContract$State(inputData.f79194a, inputData.f79195b, inputData.f79196c, f0.f322471a, r0.g());
    }

    public final TextLocalisedClause O2() {
        SplitMembersType splitMembersType = ((SplitBillsSummaryFlowContract$State) A2().f98429a).f79260a;
        if (splitMembersType instanceof SplitMembersType.Group) {
            return new TextLocalisedClause(R$string.payments_groups_split_bill_summary_next_button_title, null, null, 14);
        }
        if (splitMembersType instanceof SplitMembersType.Split) {
            return ((SplitBillsSummaryFlowContract$State) A2().f98429a).f79261b.size() == 1 ? new TextLocalisedClause(com.revolut.feature.payments.splitbill.api.R$string.split_bill_summary_action, null, null, 14) : new TextLocalisedClause(R$string.payments_groups_split_bill_summary_title_multiple, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void P2() {
        G2(new f(((SplitBillsSummaryFlowContract$State) A2().f98429a).e, ((SplitBillsSummaryFlowContract$State) A2().f98429a).f79260a.u2()));
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        Object next;
        SplitBillsSummaryFlowContract$Step step = (SplitBillsSummaryFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof SplitBillsSummaryFlowContract$Step.SplitSummary)) {
            throw new NoWhenBranchMatchedException();
        }
        SplitMethod splitMethod = ((SplitBillsSummaryFlowContract$State) A2().f98429a).f79262c;
        boolean zF = Intrinsics.f(splitMethod, SplitMethod.Individually.f79177a);
        kp9.a aVar = this.f79264t;
        if (!zF) {
            if (!Intrinsics.f(splitMethod, SplitMethod.Multiple.f79178a)) {
                throw new NoWhenBranchMatchedException();
            }
            List list = ((SplitBillsSummaryFlowContract$State) A2().f98429a).f79261b;
            int size = list.size();
            SplitBillInputData inputData = new SplitBillInputData(((SplitBillsSummaryFlowContract$State) A2().f98429a).f79260a, list, size == 1 ? new TextLocalisedClause(com.revolut.feature.payments.splitbill.api.R$string.split_bill_summary, null, null, 14) : new TextLocalisedClause(R$string.payments_groups_split_bill_summary_title_multiple, null, null, 14), O2(), (((SplitBillsSummaryFlowContract$State) A2().f98429a).f79260a instanceof SplitMembersType.Group) && size == 1, cp9.a.AMOUNT);
            an4.f fVar = new an4.f(this, 24);
            aVar.getClass();
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            SplitBillsSummaryScreen splitBillsSummaryScreen = new SplitBillsSummaryScreen(inputData);
            k block = new k(7, fVar);
            Intrinsics.checkNotNullParameter(block, "block");
            splitBillsSummaryScreen.H = block;
            return splitBillsSummaryScreen;
        }
        int size2 = ((SplitBillsSummaryFlowContract$State) A2().f98429a).f79261b.size();
        int size3 = ((SplitBillsSummaryFlowContract$State) A2().f98429a).d.size() + 1;
        boolean z = size2 == size3;
        Iterator it8 = ((SplitBillsSummaryFlowContract$State) A2().f98429a).f79261b.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (!((SplitBillsSummaryFlowContract$State) A2().f98429a).d.contains((BillType) next)) {
                break;
            }
        }
        BillType billType = (BillType) next;
        if (billType == null) {
            throw new IllegalStateException("BillsSplitSummary Flow: no bills to split: initial bills (" + size2 + ") / already split (" + ((SplitBillsSummaryFlowContract$State) A2().f98429a).d + ")");
        }
        SplitBillInputData inputData2 = new SplitBillInputData(((SplitBillsSummaryFlowContract$State) A2().f98429a).f79260a, u.c(billType), size2 == 1 ? new TextLocalisedClause(com.revolut.feature.payments.splitbill.api.R$string.split_bill_summary, null, null, 14) : new TextLocalisedClause(R$string.payments_groups_split_bill_summary_title_individual, v.k(Integer.valueOf(size3), Integer.valueOf(size2)), null, 12), z ? O2() : new TextLocalisedClause(R$string.payments_groups_split_bill_summary_next_button_title_individual, null, null, 14), (((SplitBillsSummaryFlowContract$State) A2().f98429a).f79260a instanceof SplitMembersType.Group) && size2 == 1, cp9.a.AMOUNT);
        a6j.a aVar2 = new a6j.a(this, z, 5);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(inputData2, "inputData");
        SplitBillsSummaryScreen splitBillsSummaryScreen2 = new SplitBillsSummaryScreen(inputData2);
        k block2 = new k(7, aVar2);
        Intrinsics.checkNotNullParameter(block2, "block");
        splitBillsSummaryScreen2.H = block2;
        return splitBillsSummaryScreen2;
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
