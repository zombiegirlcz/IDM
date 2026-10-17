package dce;

import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentAuthorisationState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hce.c f112872b;

    public /* synthetic */ k0(hce.c cVar, int i) {
        this.f112871a = i;
        this.f112872b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f112871a) {
            case 0:
                p update = (p) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return p.a(update, null, null, new Data(this.f112872b.f150886a.f150883a, null, false, 6, null), 31);
            case 1:
                Data paymentAuthorisation = (Data) obj2;
                Intrinsics.checkNotNullParameter(paymentAuthorisation, "paymentAuthorisation");
                hce.b bVar = this.f112872b.f150886a;
                qua.p pVar = bVar.f150883a;
                Data data = bVar.f150884b;
                k71.q qVar = bVar.f150885c;
                ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummary = (ApmPaymentAuthorisationSummary) paymentAuthorisation.getContent();
                return new nbe.a(pVar, data, paymentAuthorisation, qVar, (apmPaymentAuthorisationSummary != null ? apmPaymentAuthorisationSummary.f61993b : null) == PaymentAuthorisationState.ACTIVE);
            case 2:
                Data paymentAuthorisation2 = (Data) obj2;
                Intrinsics.checkNotNullParameter(paymentAuthorisation2, "paymentAuthorisation");
                hce.b bVar2 = this.f112872b.f150886a;
                qua.p pVar2 = bVar2.f150883a;
                Data data2 = bVar2.f150884b;
                k71.q qVar2 = bVar2.f150885c;
                ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummary2 = (ApmPaymentAuthorisationSummary) paymentAuthorisation2.getContent();
                return new qbe.a(pVar2, data2, paymentAuthorisation2, qVar2, (apmPaymentAuthorisationSummary2 != null ? apmPaymentAuthorisationSummary2.f61993b : null) == PaymentAuthorisationState.ACTIVE);
            case 3:
                Data authorisation = (Data) obj2;
                Intrinsics.checkNotNullParameter(authorisation, "authorisation");
                hce.b bVar3 = this.f112872b.f150886a;
                return new sbe.a(bVar3.f150884b, authorisation, bVar3.f150885c, bVar3.f150883a);
            case 4:
                Data pendingPayment = (Data) obj2;
                Intrinsics.checkNotNullParameter(pendingPayment, "pendingPayment");
                hce.b bVar4 = this.f112872b.f150886a;
                qua.p pVar3 = bVar4.f150883a;
                Data data3 = bVar4.f150884b;
                k71.q qVar3 = bVar4.f150885c;
                ApmPaymentAuthorisationSummary apmPaymentAuthorisationSummary3 = (ApmPaymentAuthorisationSummary) pendingPayment.getContent();
                return new ybe.a(pVar3, data3, pendingPayment, qVar3, (apmPaymentAuthorisationSummary3 != null ? apmPaymentAuthorisationSummary3.f61993b : null) == PaymentAuthorisationState.ACTIVE);
            case 5:
                abe.a provider = (abe.a) obj2;
                Intrinsics.checkNotNullParameter(provider, "provider");
                provider.getClass();
                hce.c subscriptionContent = this.f112872b;
                Intrinsics.checkNotNullParameter(subscriptionContent, "subscriptionContent");
                efm.r map = provider.c(subscriptionContent).map(new a9j.j(new a7b.r(provider, 13), 10));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return map;
            default:
                abe.a provider2 = (abe.a) obj2;
                Intrinsics.checkNotNullParameter(provider2, "provider");
                return provider2.d(this.f112872b);
        }
    }
}
