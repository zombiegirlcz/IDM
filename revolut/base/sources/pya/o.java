package pya;

import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InvitesDetailsController f240725w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(InvitesDetailsController invitesDetailsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f240725w = invitesDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(this.f240725w, continuation, 0);
                oVar.v = obj2;
                return oVar;
            case 1:
                o oVar2 = new o(this.f240725w, continuation, 1);
                oVar2.v = obj2;
                return oVar2;
            case 2:
                o oVar3 = new o(this.f240725w, continuation, 2);
                oVar3.v = obj2;
                return oVar3;
            default:
                o oVar4 = new o(this.f240725w, continuation, 3);
                oVar4.v = obj2;
                return oVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((o) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        InvitesDetailsController invitesDetailsController = this.f240725w;
        switch (i) {
            case 0:
                String id10 = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a aVarF3 = invitesDetailsController.f3();
                Intrinsics.h(id10);
                com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a aVar2 = (com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a) aVarF3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                aVar2.l2(new u(id10, aVar2, null), new yi5.b(26));
                break;
            case 1:
                String id11 = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a aVarF32 = invitesDetailsController.f3();
                Intrinsics.h(id11);
                com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a aVar4 = (com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a) aVarF32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(id11, "id");
                aVar4.l2(new u(id11, aVar4, null), new yi5.b(26));
                break;
            case 2:
                ty0.a aVar5 = (ty0.a) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a aVarF33 = invitesDetailsController.f3();
                com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a aVar7 = (com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a) aVarF33;
                aVar7.J2(aVar5.d, aVar5.f275445a);
                break;
            default:
                ty0.a aVar8 = (ty0.a) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a aVarF34 = invitesDetailsController.f3();
                com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a aVar10 = (com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a) aVarF34;
                aVar10.J2(aVar8.d, aVar8.f275445a);
                break;
        }
        return Unit.f186387a;
    }
}
