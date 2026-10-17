package zs2;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.business.referrals.ui.screens.invite_contacts.InviteContactsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InviteContactsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(InviteContactsScreen inviteContactsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = inviteContactsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean zF = Intrinsics.f(model.f52373a, "SEARCH_EMPTY_LIST_ID");
        InviteContactsScreen inviteContactsScreen = this.v;
        if (zF) {
            KProperty[] kPropertyArr = InviteContactsScreen.W;
            inviteContactsScreen.d3().f273947c.i0();
        } else {
            l lVarE3 = inviteContactsScreen.d();
            com.revolut.feature.business.referrals.ui.screens.invite_contacts.a aVar2 = (com.revolut.feature.business.referrals.ui.screens.invite_contacts.a) lVarE3;
            aVar2.N2(model.k, model.f52373a);
        }
        return Unit.f186387a;
    }
}
