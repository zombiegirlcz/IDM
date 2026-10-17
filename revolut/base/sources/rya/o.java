package rya;

import com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.InvitesListContract$InputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.InvitesListController;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ InvitesListController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(InvitesListController invitesListController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = invitesListController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.v, continuation, 0);
            default:
                return new o(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((o) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InvitesListController invitesListController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.a) invitesListController.e3()).B2();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.a aVar3 = (com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.a) invitesListController.e3();
                aVar3.getClass();
                Set set = pwa.l.f240370b;
                InvitesListContract$InputData invitesListContract$InputData = aVar3.o;
                if (set.contains(invitesListContract$InputData.f81888b)) {
                    aVar3.C2(new g(new c(invitesListContract$InputData.f81888b)));
                } else {
                    InvitesListContract$InputData.InviteMoreState inviteMoreState = invitesListContract$InputData.f81889c;
                    if (inviteMoreState instanceof InvitesListContract$InputData.InviteMoreState.Enabled) {
                        InvitesListContract$InputData.InviteMoreState.Enabled enabled = (InvitesListContract$InputData.InviteMoreState.Enabled) inviteMoreState;
                        ((cya.l) aVar3.f81899s).Z2(enabled.f81891a, enabled.f81892b);
                    } else {
                        if (!(inviteMoreState instanceof InvitesListContract$InputData.InviteMoreState.Disabled)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "InvitesListControllerModel", "Go to button is clicked, while inviteText is null", null, h0Var);
                    }
                }
                return Unit.f186387a;
        }
    }
}
