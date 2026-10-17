package pya;

import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ InvitesDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(InvitesDetailsController invitesDetailsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = invitesDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.v, continuation, 0);
            case 1:
                return new n(this.v, continuation, 1);
            case 2:
                return new n(this.v, continuation, 2);
            default:
                return new n(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InvitesDetailsController invitesDetailsController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a) invitesDetailsController.f3()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a) invitesDetailsController.f3()).B2();
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a aVar4 = (com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a) invitesDetailsController.f3();
                aVar4.H2(aVar4.G, new px0.a(17));
                aVar4.l2(new x(aVar4, null, 2), new yi5.b(26));
                break;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a aVar6 = (com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a) invitesDetailsController.f3();
                aVar6.C2(new g(new f(aVar6.o.getD())));
                break;
        }
        return Unit.f186387a;
    }
}
