package dmj;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPrice;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberCheckout;
import com.revolut.retail.feature.esim.api.model.EsimTerms;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.EsimMobilePlanPhoneNumberCheckoutScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep;
import ip0.e8;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EsimMobilePlanPhoneNumberCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(EsimMobilePlanPhoneNumberCheckoutScreen esimMobilePlanPhoneNumberCheckoutScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = esimMobilePlanPhoneNumberCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.v, continuation, 0);
            case 1:
                return new s(this.v, continuation, 1);
            case 2:
                return new s(this.v, continuation, 2);
            default:
                return new s(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((s) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((s) create((e8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((s) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((s) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        EsimTerms esimTerms;
        EsimTerms esimTerms2;
        dj0.d dVar;
        int i = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        EsimMobilePlanPhoneNumberCheckoutScreen esimMobilePlanPhoneNumberCheckoutScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c) esimMobilePlanPhoneNumberCheckoutScreen.d()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c) esimMobilePlanPhoneNumberCheckoutScreen.d()).A, EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep.PayNowInfo.f101374a, bottom_dialog);
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c) esimMobilePlanPhoneNumberCheckoutScreen.d()).A, EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep.RevPointsInfo.f101377a, bottom_dialog);
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c cVar = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c) esimMobilePlanPhoneNumberCheckoutScreen.d();
                cli.y yVar = cVar.z;
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                EsimPhoneNumberCheckout esimPhoneNumberCheckout = (EsimPhoneNumberCheckout) ((a0) j2Var.getValue()).f116136c.getContent();
                String str = null;
                String str2 = esimPhoneNumberCheckout != null ? esimPhoneNumberCheckout.f100318a : null;
                EsimCheckoutPrice esimCheckoutPrice = (EsimCheckoutPrice) ((a0) j2Var2.getValue()).d.getContent();
                if (esimCheckoutPrice == null) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "EsimMobilePlanPhoneNumberCheckoutScreenModel", "Can't purchase phone number checkoutPrice is null", null, h0Var);
                } else {
                    PaymentMethod.Pocket pocket = (PaymentMethod.Pocket) ((a0) j2Var2.getValue()).e.getContent();
                    if (pocket == null) {
                        zhm.h0 h0Var2 = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "EsimMobilePlanPhoneNumberCheckoutScreenModel", "User pocket is null", null, h0Var2);
                    } else {
                        PaymentMethod.Pocket pocket2 = (PaymentMethod.Pocket) ((a0) j2Var2.getValue()).e.getContent();
                        xi0.b bVar = (pocket2 == null || (dVar = pocket2.i) == null) ? null : dVar.f115083b;
                        EsimPhoneNumberCheckout esimPhoneNumberCheckout2 = (EsimPhoneNumberCheckout) ((a0) j2Var2.getValue()).f116136c.getContent();
                        Long lValueOf = (esimPhoneNumberCheckout2 == null || (esimTerms2 = esimPhoneNumberCheckout2.f100319b) == null) ? null : Long.valueOf(esimTerms2.e);
                        EsimPhoneNumberCheckout esimPhoneNumberCheckout3 = (EsimPhoneNumberCheckout) ((a0) j2Var2.getValue()).f116136c.getContent();
                        if (esimPhoneNumberCheckout3 != null && (esimTerms = esimPhoneNumberCheckout3.f100319b) != null) {
                            str = esimTerms.f;
                        }
                        String str3 = str;
                        if (njj.a.a(pocket, esimCheckoutPrice.f100197b)) {
                            cVar.l2(new t0(cVar, esimCheckoutPrice, pocket, str2, bVar, str3, lValueOf, null), new yi5.b(26));
                        } else {
                            oki.h.v2(cVar.A, new EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep.RevPayPocketSelection(esimCheckoutPrice.f100198c), ModalDestination.Style.POPUP.f98311a);
                        }
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
