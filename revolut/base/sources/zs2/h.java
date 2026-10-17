package zs2;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.business.referrals.ui.screens.invite_contacts.InviteContactsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InviteContactsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(InviteContactsScreen inviteContactsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = inviteContactsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.d();
        com.revolut.feature.business.referrals.ui.screens.invite_contacts.a aVar2 = (com.revolut.feature.business.referrals.ui.screens.invite_contacts.a) lVarE3;
        aVar2.N2(model.u, model.f53228a);
        return Unit.f186387a;
    }
}
