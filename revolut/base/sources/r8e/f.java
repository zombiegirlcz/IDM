package r8e;

import com.revolut.feature.subaccount.impl.ui.members.screen.GroupMembersScreen;
import com.revolut.retail.feature.actions.api.retail_accounts.ui.members_widget.GroupMemberClickData;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ GroupMembersScreen f252405w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(GroupMembersScreen groupMembersScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f252405w = groupMembersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f252405w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f252405w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        um0 um0Var = (um0) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(um0Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        GroupMembersScreen groupMembersScreen = this.f252405w;
        switch (i) {
            case 0:
                um0 um0Var = (um0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarG3 = groupMembersScreen.g3();
                String listId = um0Var.f166695a;
                Object obj3 = um0Var.d;
                n nVar = (n) iVarG3;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (obj3 instanceof GroupMemberClickData) {
                    rsi.f aVar2 = Intrinsics.f(listId, "ACTION_ID_CONFIRM_REMOVE") ? new rsi.a((GroupMemberClickData) obj3) : Intrinsics.f(listId, "ACTION_ID_CONFIRM_WITHDRAW") ? new rsi.b((GroupMemberClickData) obj3) : null;
                    if (aVar2 != null) {
                        nVar.l2(new l(nVar, aVar2, null, 1), new yi5.b(26));
                    }
                }
                break;
            default:
                um0 um0Var2 = (um0) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarG32 = groupMembersScreen.g3();
                String listId2 = um0Var2.f166695a;
                n nVar2 = (n) iVarG32;
                nVar2.getClass();
                Intrinsics.checkNotNullParameter(listId2, "listId");
                j60.a.v(nVar2.v, false, null, 3);
                break;
        }
        return Unit.f186387a;
    }
}
