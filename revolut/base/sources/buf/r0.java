package buf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.models.GroupMemberSettleInfo;
import com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class r0 extends gim.i implements Function1 {
    public final /* synthetic */ SelectableDelegate.Model u;
    public final /* synthetic */ a1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(a1 a1Var, SelectableDelegate.Model model, Continuation continuation) {
        super(1, continuation);
        this.u = model;
        this.v = a1Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new r0(this.v, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((r0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = ((RowDelegate.Model) this.u.f53305b).u;
        c1 c1Var = obj3 instanceof c1 ? (c1) obj3 : null;
        if (c1Var == null) {
            return Unit.f186387a;
        }
        a1 a1Var = this.v;
        TransferRequestApprovalData transferRequestApprovalData = ((c) a1Var.t2()).f18784a;
        TransferRequestApprovalData.GroupBillsApproval groupBillsApproval = transferRequestApprovalData instanceof TransferRequestApprovalData.GroupBillsApproval ? (TransferRequestApprovalData.GroupBillsApproval) transferRequestApprovalData : null;
        if (groupBillsApproval == null) {
            return Unit.f186387a;
        }
        List list = groupBillsApproval.d;
        GroupMemberSettleInfo memberToSwitchSelection = c1Var.f18790a;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(memberToSwitchSelection, "memberToSwitchSelection");
        List<GroupMemberSettleInfo> list2 = list;
        ArrayList selectedMembersSettleInfo = new ArrayList(zhm.w.t(list2, 10));
        for (GroupMemberSettleInfo groupMemberSettleInfo : list2) {
            if (Intrinsics.f(groupMemberSettleInfo, memberToSwitchSelection)) {
                boolean z = !groupMemberSettleInfo.f79505c;
                oq9.o member = groupMemberSettleInfo.f79503a;
                st9.e debt = groupMemberSettleInfo.f79504b;
                Intrinsics.checkNotNullParameter(member, "member");
                Intrinsics.checkNotNullParameter(debt, "debt");
                groupMemberSettleInfo = new GroupMemberSettleInfo(member, debt, z);
            }
            selectedMembersSettleInfo.add(groupMemberSettleInfo);
        }
        Intrinsics.checkNotNullParameter(selectedMembersSettleInfo, "<this>");
        dj0.d.Companion.getClass();
        dj0.d money = dj0.d.e;
        int i = 0;
        for (Object obj4 : selectedMembersSettleInfo) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            if (i == 0) {
                GroupMemberSettleInfo groupMemberSettleInfo2 = (GroupMemberSettleInfo) obj4;
                boolean z3 = groupMemberSettleInfo2.f79505c;
                st9.e eVar = groupMemberSettleInfo2.f79504b;
                money = z3 ? eVar.d : dj0.d.c(eVar.d, 0L, null, 2);
            } else {
                GroupMemberSettleInfo groupMemberSettleInfo3 = (GroupMemberSettleInfo) obj4;
                boolean z4 = groupMemberSettleInfo3.f79505c;
                st9.e eVar2 = groupMemberSettleInfo3.f79504b;
                money = pyd.c.O(money, z4 ? eVar2.d : dj0.d.c(eVar2.d, 0L, null, 2));
            }
            i = i2;
        }
        PaymentGroup group = groupBillsApproval.f92451c;
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(selectedMembersSettleInfo, "selectedMembersSettleInfo");
        a1Var.x2(new bq7.j(new TransferRequestApprovalData.GroupBillsApproval(money, group, selectedMembersSettleInfo), 13));
        return Unit.f186387a;
    }
}
