package l9c;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.BillingAddress;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.revolutpay.impl.ui.request_cvv.RequestCvvScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ RequestCvvScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(RequestCvvScreen requestCvvScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = requestCvvScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RequestCvvScreen requestCvvScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar = (k) ((f) requestCvvScreen.f84515a0.getValue());
                PaymentMethod.Card card = kVar.f193129p.f84516a;
                String str = ((d) kVar.t2()).f;
                String id10 = card.f84370a;
                String str2 = card.f84371b;
                String lastFour = card.f84372c;
                com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.c brand = card.d;
                int i2 = card.e;
                int i3 = card.f;
                BillingAddress billingAddress = card.f84373g;
                boolean z = card.f84374h;
                String str3 = card.f84375j;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(lastFour, "lastFour");
                Intrinsics.checkNotNullParameter(brand, "brand");
                kVar.v2(new e(new PaymentMethod.Card(id10, str2, lastFour, brand, i2, i3, billingAddress, z, str, str3)));
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                requestCvvScreen.m2().onBackPressed();
                break;
        }
        return Unit.f186387a;
    }
}
