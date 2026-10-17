package kvl;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.trading.orders.R$string;
import java.util.Optional;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class w extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public final /* synthetic */ a0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(a0 a0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.v = a0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w(this.v, continuation, 0);
            default:
                return new w(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((w) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        a0 a0Var = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j60.a.v(a0Var.f190158p, false, null, 3);
                Optional source = Optional.empty();
                Intrinsics.checkNotNullExpressionValue(source, "empty(...)");
                Intrinsics.checkNotNullParameter(source, "source");
                a0Var.f190161s.setValue(source);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j60.a aVar3 = a0Var.f190158p;
                ((lvl.a) a0Var.f190156m).getClass();
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R.string.common_action_got_it, null, null, 14);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                int i2 = R$attr.uikit_dp8;
                int i3 = R$attr.uikit_dp16;
                aVar3.x(new rp0.y(zhm.u.c(new LargeActionButtonDelegate.Model("AUTO_TOP_UP_INFO_DIALOG_BUTTON_GOT_IT", defaultFilledButton, null, textLocalisedClause, false, null, null, i2, R$attr.uikit_dp24, i3, i3, 496)), new rp0.t(new TextLocalisedClause(R$string.trading_orders_dialog_auto_topup_title, null, null, 14), new TextLocalisedClause(R$string.trading_orders_dialog_auto_topup_description, null, null, 14), null, 28), null, null, null, null, 1020));
                break;
        }
        return Unit.f186387a;
    }
}
