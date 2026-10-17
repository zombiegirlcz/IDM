package hee;

import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.support.impl.R$string;
import com.revolut.feature.support.impl.transfer_tracker.ui.input_form.TransferTrackerInputFormScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rp0.y;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ TransferTrackerInputFormScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TransferTrackerInputFormScreen transferTrackerInputFormScreen, Continuation continuation) {
        super(2, continuation);
        this.u = transferTrackerInputFormScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((AmountEditDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b bVar = (com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b) this.u.R2();
        j60.a aVar2 = bVar.f89421s;
        bVar.f89422t.getClass();
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("LIST_ID_BUTTON_GOT_IT", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, 0, R$attr.uikit_dp24, 0, 0, 13);
        aVar2.x(new y(zhm.u.c(model), new rp0.t(new TextLocalisedClause(R$string.locate_inbound_transfer_input_amount_info, null, null, 14), new TextLocalisedClause(R$string.locate_inbound_transfer_input_amount_info_details, null, null, 14), null, 28), rp0.l.WINDOW, null, null, null, 1016));
        return Unit.f186387a;
    }
}
