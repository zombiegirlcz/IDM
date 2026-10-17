package zs2;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.business.referrals.ui.screens.invite_contacts.InviteContactsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InviteContactsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InviteContactsScreen inviteContactsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = inviteContactsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        t tVar = (t) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.d();
        ActionWidgetDelegate.Model model = tVar.f54722b;
        com.revolut.feature.business.referrals.ui.screens.invite_contacts.a aVar2 = (com.revolut.feature.business.referrals.ui.screens.invite_contacts.a) lVarE3;
        aVar2.N2(model.f51596l, model.f51590a);
        return Unit.f186387a;
    }
}
