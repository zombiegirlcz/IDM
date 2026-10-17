package cw6;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.number.FreelancerInvoiceNumberSettingsScreen;
import ct6.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rp0.y;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ FreelancerInvoiceNumberSettingsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(FreelancerInvoiceNumberSettingsScreen freelancerInvoiceNumberSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = freelancerInvoiceNumberSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVar = (l) this.u.R2();
        j60.a aVar2 = lVar.f109553r;
        ((t) lVar.f109552q).getClass();
        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.freelancer_sale_invoice_number_prompt_info_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_sale_invoice_number_prompt_info_subtitle, null, null, 14), null, 28);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_INVOICE_NUMBER_INFO_ACTION_BUTTON", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.freelancer_sale_invoice_number_prompt_info_action_title, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, 0, R$attr.uikit_dp24, 0, 0, 13);
        aVar2.x(new y(u.c(model), tVar, null, null, null, null, 1020));
        return Unit.f186387a;
    }
}
