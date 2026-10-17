package r8e;

import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.subaccount.impl.ui.edit.permission.UserPermissionEditScreen;
import com.revolut.feature.subaccount.impl.ui.edit.permission.UserPermissionEditScreenContract$InputData;
import com.revolut.feature.subaccount.impl.ui.members.screen.GroupMembersScreen;
import com.revolut.kompot.common.ModalDestination;
import ip0.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ GroupMembersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(GroupMembersScreen groupMembersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = groupMembersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        g gVar;
        y yVar = (y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarG3 = this.v.T2();
        String listId = yVar.f167226b.f58316a;
        n nVar = (n) iVarG3;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Subaccount.Group group = (Subaccount.Group) ((h) nVar.t2()).f252408a.getContent();
        if (group != null) {
            if (Intrinsics.f(listId, "ACTION_ADD")) {
                nVar.l2(new k(nVar, group, null), new qi3.i(1, nVar, q7e.b.class, "genericErrorHandler", "genericErrorHandler(Lcom/revolut/kompot/navigable/ControllerModel;Ljava/lang/Throwable;)Z", 1, 17));
            } else if (Intrinsics.f(listId, "ACTION_PERMISSION") && (gVar = (g) ((h) nVar.t2()).f252409b.getContent()) != null) {
                yji.l.g2(nVar, new UserPermissionEditScreen(new UserPermissionEditScreenContract$InputData(group, gVar.f252406a)), ModalDestination.Style.POPUP.f98311a, null, 2);
            }
        }
        return Unit.f186387a;
    }
}
