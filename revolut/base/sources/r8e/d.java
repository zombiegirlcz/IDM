package r8e;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.subaccount.impl.ui.members.screen.GroupMembersScreen;
import com.revolut.retail.feature.actions.api.retail_accounts.ui.members_widget.GroupMemberClickData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ GroupMembersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(GroupMembersScreen groupMembersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = groupMembersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarG3 = this.v.T2();
        Object obj3 = model.u;
        n nVar = (n) iVarG3;
        nVar.getClass();
        if (obj3 instanceof GroupMemberClickData) {
            nVar.l2(new r83.g(nVar, obj3, null, 2), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
