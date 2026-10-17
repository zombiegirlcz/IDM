package u9a;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.pix.impl.flow.automatico.screens.details.PixAutomaticoPaymentDetailsScreen;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.y;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PixAutomaticoPaymentDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PixAutomaticoPaymentDetailsScreen pixAutomaticoPaymentDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pixAutomaticoPaymentDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        String listId = model.f51822a;
        com.revolut.feature.pix.impl.flow.automatico.screens.details.a aVar2 = (com.revolut.feature.pix.impl.flow.automatico.screens.details.a) nVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "CANCEL_PIX_AUTOMATICO_TAG_ID")) {
            j60.a aVar3 = aVar2.f80617r;
            rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.recurring_payment_details_dialog_cancel_pix_mandate_title, null, null, 14), new TextLocalisedClause(R$string.recurring_payment_details_dialog_cancel_pix_mandate_subtitle, null, null, 14), null, 28);
            List listK = zhm.v.k(new LargeActionButtonDelegate.Model("CANCEL_PAYMENT_POSITIVE_CTA_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.recurring_payment_details_dialog_cancel_pix_mandate_cta_button_positive, null, null, 14), false, null, null, null, null, 1000), new LargeActionButtonDelegate.Model("CANCEL_PAYMENT_NEGATIVE_CTA_BUTTON_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.recurring_payment_details_dialog_cancel_pix_mandate_cta_button_negative, null, null, 14), false, null, null, R$attr.uikit_dp16, 0, 0, 0, 7664));
            yp0.b.q(listK, 0, 0, 0, 0, 15);
            aVar3.x(new y(listK, tVar, rp0.l.WINDOW, null, null, null, 1016));
        } else if (Intrinsics.f(listId, "GET_HELP_TAG_ID")) {
            aVar2.C1(u0.b(new FeatureCommand(new FaqFeatureConfig.Starter("0e9f76b4-872b-49a3-8deb-d1a56bb6ea22", 2))));
        }
        return Unit.f186387a;
    }
}
