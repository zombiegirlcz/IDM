package hh6;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.mandate.mandate_details.MandateDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import xg6.s;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ MandateDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(MandateDetailsScreen mandateDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = mandateDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVar = (p) this.u.T2();
        oe6.j jVar = pVar.v;
        String institutionId = pVar.f152268p.f72463a.f72225b;
        s sVar = (s) jVar;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        ((com.revolut.retail.analytics.tracking.impl.b) sVar.f305601a).e2(new ho.o(frl.c.TopUp, "RemoveAuthorisation", frl.b.viewed, a0.d.x("BankName", institutionId)));
        j60.a aVar2 = pVar.f152272t;
        ((c) pVar.u).getClass();
        t tVar = new t(new TextLocalisedClause(R$string.open_banking_mandate_details_revoke_dialog_title, null, null, 14), new TextLocalisedClause(R$string.open_banking_mandate_details_revoke_dialog_description, null, null, 14), null, 28);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ITEM_BUTTON_REVOKE", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.open_banking_mandate_details_revoke_dialog_confirm_action, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, R$attr.uikit_dp24, R$attr.uikit_dp0, 0, 0, 12);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ITEM_BUTTON_CANCEL", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.open_banking_mandate_details_revoke_dialog_cancel_action, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model2, R$attr.uikit_dp16, R$attr.uikit_dp24, 0, 0, 12);
        aVar2.x(new y(v.k(model, model2), tVar, null, null, null, null, 1020));
        return Unit.f186387a;
    }
}
