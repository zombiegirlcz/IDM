package q6e;

import aii.u;
import com.revolut.feature.subaccount.api.BillAccountDetailDestination;
import com.revolut.feature.subaccount.api.CreateSubaccountScreenDestination;
import com.revolut.feature.subaccount.api.InviteMembersSubaccountDestination;
import com.revolut.feature.subaccount.api.ManageBillAccountDestination;
import com.revolut.feature.subaccount.api.MembersSubaccountDestination;
import com.revolut.feature.subaccount.api.SubAccountsEditNameFeatureConfig;
import com.revolut.feature.subaccount.api.SubaccountAddMoneyDestination;
import com.revolut.feature.subaccount.api.SubaccountApi$Toggles;
import com.revolut.feature.subaccount.api.SubaccountDetailsScreenDestination;
import com.revolut.feature.subaccount.api.SubaccountEditRecurringTransferDestination;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.subaccount.api.navigation.CreateSubaccountWithTypeScreenDestination;
import com.revolut.feature.subaccount.impl.ui.add_money.flow.SubaccountAddMoneyFlow;
import com.revolut.feature.subaccount.impl.ui.add_money.flow.SubaccountAddMoneyFlowContract$InputData;
import com.revolut.feature.subaccount.impl.ui.bill.screen.BillAccountDetailScreen;
import com.revolut.feature.subaccount.impl.ui.bill.screen.BillAccountDetailScreenContract$InputData;
import com.revolut.feature.subaccount.impl.ui.create.flow.main.CreateSubaccountFlow;
import com.revolut.feature.subaccount.impl.ui.create.flow.main.CreateSubaccountFlowContract$InputData;
import com.revolut.feature.subaccount.impl.ui.details.screen.SubaccountDetailsScreen;
import com.revolut.feature.subaccount.impl.ui.details.screen.SubaccountDetailsScreenContract$InputData;
import com.revolut.feature.subaccount.impl.ui.edit.billl.flow.BillsEditFlow;
import com.revolut.feature.subaccount.impl.ui.edit.billl.flow.BillsEditFlowContract$InputData;
import com.revolut.feature.subaccount.impl.ui.edit.invite.flow.InviteMembersFlow;
import com.revolut.feature.subaccount.impl.ui.edit.invite.flow.InviteMembersFlowContract$InputData;
import com.revolut.feature.subaccount.impl.ui.edit_name.SubAccountEditNameContract$InputData;
import com.revolut.feature.subaccount.impl.ui.edit_name.SubAccountEditNameScreen;
import com.revolut.feature.subaccount.impl.ui.invite.flow.VaultInviteFlow;
import com.revolut.feature.subaccount.impl.ui.members.screen.GroupMembersScreen;
import com.revolut.feature.subaccount.impl.ui.members.screen.GroupMembersScreenContract$InputData;
import com.revolut.feature.subaccount.impl.ui.recurring_transfer.RecurringTransferFlow;
import com.revolut.feature.subaccount.impl.ui.recurring_transfer.RecurringTransferFlowContract$FlowInput;
import com.revolut.feature.vaults.api.navigation.VaultsKompotFeatureConfig$InvitationConfirmation$Destination;
import dki.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k8e.d;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return SubaccountApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CreateSubaccountScreenDestination) {
            return new CreateSubaccountFlow(new CreateSubaccountFlowContract$InputData((Set) null, ((CreateSubaccountScreenDestination) destination).f88933a, (String) null, 4));
        }
        if (destination instanceof CreateSubaccountWithTypeScreenDestination) {
            CreateSubaccountWithTypeScreenDestination createSubaccountWithTypeScreenDestination = (CreateSubaccountWithTypeScreenDestination) destination;
            Set set = createSubaccountWithTypeScreenDestination.f88981a;
            ArrayList arrayList = new ArrayList(w.t(set, 10));
            Iterator it8 = set.iterator();
            while (it8.hasNext()) {
                arrayList.add(v6e.b.a((SubaccountType) it8.next(), createSubaccountWithTypeScreenDestination.d));
            }
            return new CreateSubaccountFlow(new CreateSubaccountFlowContract$InputData(d0.i1(arrayList), createSubaccountWithTypeScreenDestination.f88982b, createSubaccountWithTypeScreenDestination.f88983c, 4));
        }
        if (destination instanceof SubaccountDetailsScreenDestination) {
            SubaccountDetailsScreenDestination subaccountDetailsScreenDestination = (SubaccountDetailsScreenDestination) destination;
            return new SubaccountDetailsScreen(new SubaccountDetailsScreenContract$InputData(subaccountDetailsScreenDestination.f88948a, subaccountDetailsScreenDestination.f88949b));
        }
        if (destination instanceof InviteMembersSubaccountDestination) {
            InviteMembersSubaccountDestination inviteMembersSubaccountDestination = (InviteMembersSubaccountDestination) destination;
            return new InviteMembersFlow(new InviteMembersFlowContract$InputData(inviteMembersSubaccountDestination.f88934a, inviteMembersSubaccountDestination.f88935b));
        }
        if (destination instanceof MembersSubaccountDestination) {
            return new GroupMembersScreen(new GroupMembersScreenContract$InputData(((MembersSubaccountDestination) destination).f88939a));
        }
        if (destination instanceof VaultsKompotFeatureConfig$InvitationConfirmation$Destination) {
            return new VaultInviteFlow(new d(((VaultsKompotFeatureConfig$InvitationConfirmation$Destination) destination).f94726a));
        }
        if (destination instanceof SubAccountsEditNameFeatureConfig.Destination.EditNameDestination) {
            SubAccountsEditNameFeatureConfig.Destination.EditNameDestination editNameDestination = (SubAccountsEditNameFeatureConfig.Destination.EditNameDestination) destination;
            return new SubAccountEditNameScreen(new SubAccountEditNameContract$InputData(editNameDestination.f88942c, editNameDestination.f88940a, editNameDestination.f88941b));
        }
        if (destination instanceof ManageBillAccountDestination) {
            return new BillsEditFlow(new BillsEditFlowContract$InputData(((ManageBillAccountDestination) destination).f88938a));
        }
        if (destination instanceof BillAccountDetailDestination) {
            return new BillAccountDetailScreen(new BillAccountDetailScreenContract$InputData(((BillAccountDetailDestination) destination).f88926a));
        }
        if (destination instanceof SubaccountAddMoneyDestination) {
            return new SubaccountAddMoneyFlow(new SubaccountAddMoneyFlowContract$InputData(((SubaccountAddMoneyDestination) destination).getF88943a()));
        }
        if (!(destination instanceof SubaccountEditRecurringTransferDestination)) {
            return null;
        }
        SubaccountEditRecurringTransferDestination subaccountEditRecurringTransferDestination = (SubaccountEditRecurringTransferDestination) destination;
        return new RecurringTransferFlow(new RecurringTransferFlowContract$FlowInput(subaccountEditRecurringTransferDestination.f88950a, subaccountEditRecurringTransferDestination.f88951b, subaccountEditRecurringTransferDestination.f88952c, subaccountEditRecurringTransferDestination.d, subaccountEditRecurringTransferDestination.e, subaccountEditRecurringTransferDestination.f));
    }
}
