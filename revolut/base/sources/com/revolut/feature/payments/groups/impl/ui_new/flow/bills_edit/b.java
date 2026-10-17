package com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.bills_chooser.api.common.BillType;
import com.revolut.feature.payments.bills_chooser.api.navigation.CustomBillInputData;
import com.revolut.feature.payments.bills_chooser.api.navigation.SplitBillInputData;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMembersType;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_selection_custom.CustomBillScreen;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.SplitBillsSummaryScreen;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.PaymentsGroupsBillsEditFlowContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.PaymentsGroupsBillsEditFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.revolut.feature_fourthline_impl.R;
import dj0.d;
import dki.g;
import hs4.l;
import ht9.c;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oq9.i;
import oq9.o;
import org.jetbrains.annotations.NotNull;
import r10.t;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends g implements ht9.a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t f79434t;
    public final kp9.a u;
    public final ys9.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final PaymentsGroupsBillsEditFlowContract$Step f79435w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final PaymentsGroupsBillsEditFlowContract$State f79436x;

    public b(t interactor, kp9.a navigationScreenProvider, ys9.a groupSplitLineItemMapper, PaymentsGroupsBillsEditFlowContract$InputData inputData) {
        PaymentsGroupsBillsEditFlowContract$Step splitSummary;
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(navigationScreenProvider, "navigationScreenProvider");
        Intrinsics.checkNotNullParameter(groupSplitLineItemMapper, "groupSplitLineItemMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f79434t = interactor;
        this.u = navigationScreenProvider;
        this.v = groupSplitLineItemMapper;
        if (inputData instanceof PaymentsGroupsBillsEditFlowContract$InputData.EditBill) {
            splitSummary = new PaymentsGroupsBillsEditFlowContract$Step.EditCustomBill(((PaymentsGroupsBillsEditFlowContract$InputData.EditBill) inputData).f79422b);
        } else {
            if (!(inputData instanceof PaymentsGroupsBillsEditFlowContract$InputData.EditSplits)) {
                throw new NoWhenBranchMatchedException();
            }
            PaymentsGroupsBillsEditFlowContract$InputData.EditSplits editSplits = (PaymentsGroupsBillsEditFlowContract$InputData.EditSplits) inputData;
            splitSummary = new PaymentsGroupsBillsEditFlowContract$Step.SplitSummary(editSplits.f79424a, editSplits.f79425b, editSplits.f79426c);
        }
        this.f79435w = splitSummary;
        this.f79436x = new PaymentsGroupsBillsEditFlowContract$State(inputData.getF79424a(), inputData.getF79425b(), inputData.getF79426c());
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        PaymentsGroupsBillsEditFlowContract$Step step = (PaymentsGroupsBillsEditFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        boolean z = step instanceof PaymentsGroupsBillsEditFlowContract$Step.EditCustomBill;
        kp9.a aVar = this.u;
        if (z) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payments_groups_details_bill_edit_screen_title, null, null, 14);
            oq9.g gVar = ((PaymentsGroupsBillsEditFlowContract$Step.EditCustomBill) step).f79430a;
            String str = gVar.f227817c;
            d dVar = gVar.d;
            CustomBillInputData inputData = new CustomBillInputData(textLocalisedClause, str, dVar.f115082a, dVar.f115083b, false, null, 32);
            aVar.getClass();
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            CustomBillScreen customBillScreen = new CustomBillScreen(inputData);
            ht9.b bVar = new ht9.b(this, 1);
            Intrinsics.checkNotNullParameter(bVar, "<set-?>");
            customBillScreen.H = bVar;
            return customBillScreen;
        }
        if (!(step instanceof PaymentsGroupsBillsEditFlowContract$Step.SplitSummary)) {
            throw new NoWhenBranchMatchedException();
        }
        PaymentsGroupsBillsEditFlowContract$Step.SplitSummary splitSummary = (PaymentsGroupsBillsEditFlowContract$Step.SplitSummary) step;
        BillType billType = splitSummary.f79433c;
        PaymentGroup paymentGroup = splitSummary.f79431a;
        i iVar = splitSummary.f79432b;
        boolean z3 = false;
        if ((billType instanceof BillType.CustomBill) && !Intrinsics.f(((BillType.CustomBill) billType).f79174b, iVar.a())) {
            z3 = true;
        }
        SplitMemberType.GroupMember groupMember = new SplitMemberType.GroupMember(iVar.h());
        ArrayList arrayListJ = oc.c.j(paymentGroup);
        ArrayList arrayList = new ArrayList(w.t(arrayListJ, 10));
        Iterator it8 = arrayListJ.iterator();
        while (it8.hasNext()) {
            arrayList.add(new SplitMemberType.GroupMember((o) it8.next()));
        }
        SplitBillInputData inputData2 = new SplitBillInputData(new SplitMembersType.Group(groupMember, arrayList), u.c(billType), new TextLocalisedClause(R$string.payments_groups_details_bill_edit_summary_title, null, null, 14), new TextLocalisedClause(R.string.common_action_update, null, null, 14), true, cp9.a.AMOUNT, false, z3 ? null : this.v.a(paymentGroup, iVar.f()));
        ht9.b bVar2 = new ht9.b(this, 0);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(inputData2, "inputData");
        SplitBillsSummaryScreen splitBillsSummaryScreen = new SplitBillsSummaryScreen(inputData2);
        l block = new l(bVar2, 13);
        Intrinsics.checkNotNullParameter(block, "block");
        splitBillsSummaryScreen.H = block;
        return splitBillsSummaryScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f79436x;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f79435w;
    }
}
