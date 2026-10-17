package zs2;

import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.feature.business.referrals.ui.screens.invite_contacts.InviteContactsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InviteContactsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(InviteContactsScreen inviteContactsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = inviteContactsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((ReferralContactDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ReferralContactDelegate.Model model = (ReferralContactDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.d();
        com.revolut.feature.business.referrals.ui.screens.invite_contacts.a aVar2 = (com.revolut.feature.business.referrals.ui.screens.invite_contacts.a) lVarE3;
        aVar2.N2(model.f53167l, model.f53161a);
        return Unit.f186387a;
    }
}
