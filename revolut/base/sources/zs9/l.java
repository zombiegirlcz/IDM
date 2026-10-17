package zs9;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.feature.payments.groups.impl.ui_new.customize.GroupCustomizationScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ GroupCustomizationScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(GroupCustomizationScreen groupCustomizationScreen, Continuation continuation) {
        super(2, continuation);
        this.u = groupCustomizationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z zVar = (z) this.u.T2();
        j60.a aVar2 = zVar.f324852t;
        zVar.f324850r.getClass();
        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.payments_groups_base_currency_bottom_sheet_title, null, null, 14), new TextLocalisedClause(R$string.payments_groups_base_currency_bottom_sheet_description, null, null, 14), null, 28);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_BASE_CURRENCY_DIALOG_BUTTON", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.l(model, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
        aVar2.x(new rp0.y(zhm.u.c(model), tVar, null, null, null, null, 1020));
        return Unit.f186387a;
    }
}
