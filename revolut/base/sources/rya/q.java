package rya;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.InvitesListController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ InvitesListController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(InvitesListController invitesListController, Continuation continuation) {
        super(2, continuation);
        this.u = invitesListController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.a aVar2 = (com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.a) this.u.R2();
        if (aVar2.u) {
            aVar2.l2(new t(aVar2, null, 2), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
