package m8c;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.revolutpay.impl.R$string;
import com.revolut.feature.revolutpay.impl.ui.deferred_payment.DeferredPaymentScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DeferredPaymentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DeferredPaymentScreen deferredPaymentScreen, Continuation continuation) {
        super(2, continuation);
        this.v = deferredPaymentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        j jVar;
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVar = (q) this.v.f84472a0.getValue();
        String listId = item.f58316a;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "BLOCK_PAYMENT_LIST_ID") && (jVar = (j) ((k) qVar.t2()).f203473a.getContent()) != null) {
            j60.a aVar2 = qVar.f203485r;
            i iVar = qVar.f203484q;
            r7c.a deferredPayment = jVar.f203471a;
            ((a) iVar).getClass();
            Intrinsics.checkNotNullParameter(deferredPayment, "deferredPayment");
            t tVar = new t(new TextLocalisedClause(R$string.revolut_pay_deferred_payment_screen_block_payments_dialog_title, null, null, 14), new TextLocalisedClause(R$string.revolut_pay_deferred_payment_screen_block_payments_dialog_description, u.c(deferredPayment.d), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), null, 28);
            LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("BLOCK_PAYMENT_CONFIRM_LIST_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.revolut_pay_deferred_payment_screen_block_payments_dialog_confirm, null, null, 14), true, null, null, null, null, 968);
            int i = R$attr.uikit_dp16;
            yp0.b.p(model, i, R$attr.uikit_dp8, i, i);
            LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("BLOCK_PAYMENT_CANCEL_LIST_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.revolut_pay_deferred_payment_block_payments_dialog_cancel, null, null, 14), true, null, null, null, null, 968);
            int i2 = R$attr.uikit_dp8;
            int i3 = R$attr.uikit_dp24;
            int i5 = R$attr.uikit_dp16;
            yp0.b.p(model2, i2, i3, i5, i5);
            aVar2.x(new y(v.k(model, model2), tVar, null, null, null, null, "DEFERRED_PAYMENT_DELEGATES_KEY", null, null, null, 3836));
        }
        return Unit.f186387a;
    }
}
