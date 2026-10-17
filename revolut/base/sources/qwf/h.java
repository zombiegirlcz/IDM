package qwf;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.transport.api.R$string;
import com.revolut.feature.transport.impl.ui.transit_checkout.TransitCheckoutScreen;
import com.revolut.feature.transport.models.transit.TransitTicketEligibility;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.ck0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransitCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TransitCheckoutScreen transitCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transitCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarH3 = this.v.T2();
        Object obj3 = model.o;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.transport.models.transit.TransitTicketEligibility");
        TransitTicketEligibility parcel = (TransitTicketEligibility) obj3;
        z zVar = (z) qVarH3;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        j60.a aVar2 = zVar.v;
        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.transport_ticket_checkout_eligibility_title, null, null, 14), null, null, 30);
        TextDelegate.Model model2 = new TextDelegate.Model("ID_ELIGIBILITY_DESCRIPTION", new TextClause(parcel.f92723a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, new ck0(0), null, null, 0, 0, 0, 0, 2036);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        LargeActionButtonDelegate.Model model3 = new LargeActionButtonDelegate.Model("ID_ELIGIBILITY_ACTION_GOT_IT", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model3, 0, 0, 0, 0, 15);
        aVar2.x(new rp0.y(zhm.v.k(model2, model3), tVar, null, null, null, null, 1020));
        return Unit.f186387a;
    }
}
