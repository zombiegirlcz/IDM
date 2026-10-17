package pya;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvitesDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(InvitesDetailsController invitesDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = invitesDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.v, continuation);
        pVar.u = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        a aVarF3 = this.v.R2();
        String itemId = model.f53228a;
        com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a aVar2 = (com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a) aVarF3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (Intrinsics.f(itemId, "NEED_HELP_LIST_ID")) {
            aVar2.n2(new x(aVar2, null, 3), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
