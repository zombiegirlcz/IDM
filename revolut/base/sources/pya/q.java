package pya;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.DetailsScope;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsContract$InputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsContract$ModalStep;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsController;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvitesDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(InvitesDetailsController invitesDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = invitesDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q qVar = new q(this.v, continuation);
        qVar.u = obj2;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        a aVarF3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a aVar2 = (com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a) aVarF3;
        InvitesDetailsContract$InputData invitesDetailsContract$InputData = aVar2.o;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f51822a;
        if (Intrinsics.f(str, "NEED_MORE_HELP_LIST_ID")) {
            DetailsScope f81872b = invitesDetailsContract$InputData.getF81872b();
            if (Intrinsics.f(f81872b, DetailsScope.HelpCenter.f81865a)) {
                aVar2.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("topic.more-help-with-referrals", 14), (SharedFaqDestination.PassthroughData) null, false, 14));
            } else {
                if (!Intrinsics.f(f81872b, DetailsScope.Default.f81864a)) {
                    throw new NoWhenBranchMatchedException();
                }
                switch (t.f240729a[invitesDetailsContract$InputData.getD().ordinal()]) {
                    case 1:
                        aVar2.C1(aVar2.f81885x.a());
                        break;
                    case 2:
                        aVar2.C1(aVar2.f81886y.a());
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        aVar2.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("category.referrals", 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        } else if (kotlin.text.a0.H(str, "FAQ_LIST_ID_PREFIX", false)) {
            Object obj3 = model.e;
            if (obj3 instanceof hj0.b) {
                hj0.b bVar = (hj0.b) obj3;
                String str2 = bVar.d;
                hj0.a aVar3 = bVar.e;
                if (aVar3 != null) {
                    if (str2 != null) {
                        oki.h.v2(aVar2.H, new InvitesDetailsContract$ModalStep.FaqDialog(str2, aVar3.f152622a, aVar3.f152623b, bVar.f152624a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    } else {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "InviteDetails", "Deeplink is null", null, h0Var);
                    }
                } else if (str2 != null) {
                    aVar2.n2(new u(aVar2, str2, null, 2), new whi.b(6));
                } else {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "InviteDetails", "Deeplink is null", null, h0Var2);
                    Unit unit = Unit.f186387a;
                }
            }
        }
        return Unit.f186387a;
    }
}
