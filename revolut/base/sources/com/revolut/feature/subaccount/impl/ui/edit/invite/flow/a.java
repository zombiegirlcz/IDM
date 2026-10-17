package com.revolut.feature.subaccount.impl.ui.edit.invite.flow;

import com.revolut.feature.subaccount.impl.ui.create.flow.group.ContactsPickerFlow;
import com.revolut.feature.subaccount.impl.ui.create.flow.group.ContactsPickerFlowContract$InputData;
import com.revolut.feature.subaccount.impl.ui.edit.invite.flow.InviteMembersFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import f2i.x;
import g6e.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends g implements g8e.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final InviteMembersFlowContract$InputData f89076t;
    public final d u;
    public final InviteMembersFlowContract$Step.Invite v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final InviteMembersFlowContract$State f89077w;

    public a(InviteMembersFlowContract$InputData inputData, d subaccountInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        this.f89076t = inputData;
        this.u = subaccountInteractor;
        this.v = InviteMembersFlowContract$Step.Invite.f89075a;
        this.f89077w = InviteMembersFlowContract$State.f89074a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        InviteMembersFlowContract$Step step = (InviteMembersFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (!(step instanceof InviteMembersFlowContract$Step.Invite)) {
            throw new NoWhenBranchMatchedException();
        }
        ContactsPickerFlow contactsPickerFlow = new ContactsPickerFlow(new ContactsPickerFlowContract$InputData(this.f89076t.f89073b));
        x block = new x(1, this, a.class, "handleContactPickerResult", "handleContactPickerResult(Lcom/revolut/feature/subaccount/impl/ui/create/flow/group/ContactsPickerFlowContract$OutputData;)V", 0, 27);
        Intrinsics.checkNotNullParameter(block, "block");
        contactsPickerFlow.H = block;
        return contactsPickerFlow;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f89077w;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.v;
    }
}
