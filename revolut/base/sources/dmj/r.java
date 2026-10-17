package dmj;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPriceBreakdown;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.mappers.EsimDynamicTermsMapper$TermsClickData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.EsimMobilePlanPhoneNumberCheckoutScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.EsimMobilePlanPhoneNumberCheckoutScreenContract$ExchangeBreakdownData;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ EsimMobilePlanPhoneNumberCheckoutScreen f116177w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(EsimMobilePlanPhoneNumberCheckoutScreen esimMobilePlanPhoneNumberCheckoutScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f116177w = esimMobilePlanPhoneNumberCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r rVar = new r(this.f116177w, continuation, 0);
                rVar.v = obj2;
                return rVar;
            case 1:
                r rVar2 = new r(this.f116177w, continuation, 1);
                rVar2.v = obj2;
                return rVar2;
            case 2:
                r rVar3 = new r(this.f116177w, continuation, 2);
                rVar3.v = obj2;
                return rVar3;
            default:
                r rVar4 = new r(this.f116177w, continuation, 3);
                rVar4.v = obj2;
                return rVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r) create((EsimDynamicTermsMapper$TermsClickData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((r) create((EsimMobilePlanPhoneNumberCheckoutScreenContract$ExchangeBreakdownData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((r) create((EsimPhoneNumberPriceBreakdown) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r) create((EsimDynamicTermsMapper$TermsClickData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        EsimMobilePlanPhoneNumberCheckoutScreen esimMobilePlanPhoneNumberCheckoutScreen = this.f116177w;
        switch (i) {
            case 0:
                EsimDynamicTermsMapper$TermsClickData esimDynamicTermsMapper$TermsClickData = (EsimDynamicTermsMapper$TermsClickData) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c) esimMobilePlanPhoneNumberCheckoutScreen.e3()).J2(esimDynamicTermsMapper$TermsClickData);
                break;
            case 1:
                EsimMobilePlanPhoneNumberCheckoutScreenContract$ExchangeBreakdownData breakdownData = (EsimMobilePlanPhoneNumberCheckoutScreenContract$ExchangeBreakdownData) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c cVar = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c) esimMobilePlanPhoneNumberCheckoutScreen.e3();
                cVar.getClass();
                Intrinsics.checkNotNullParameter(breakdownData, "breakdownData");
                oki.h.v2(cVar.A, new EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep.ExchangeBreakdown(breakdownData), bottom_dialog);
                break;
            case 2:
                EsimPhoneNumberPriceBreakdown phoneNumberPriceBreakdown = (EsimPhoneNumberPriceBreakdown) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c cVar2 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c) esimMobilePlanPhoneNumberCheckoutScreen.e3();
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(phoneNumberPriceBreakdown, "phoneNumberPriceBreakdown");
                oki.h.v2(cVar2.A, new EsimMobilePlanPhoneNumberCheckoutScreenContract$ModalStep.PhoneNumberPriceBreakdown(phoneNumberPriceBreakdown), bottom_dialog);
                break;
            default:
                EsimDynamicTermsMapper$TermsClickData esimDynamicTermsMapper$TermsClickData2 = (EsimDynamicTermsMapper$TermsClickData) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c) esimMobilePlanPhoneNumberCheckoutScreen.e3()).J2(esimDynamicTermsMapper$TermsClickData2);
                break;
        }
        return Unit.f186387a;
    }
}
