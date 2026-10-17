package tr1;

import com.revolut.feature.credit.card.api.models.creditcard.CreditCardPaymentDetails;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.h;
import od0.i;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f273625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Double f273626b;

    public /* synthetic */ a(int i, Double d) {
        this.f273625a = i;
        this.f273626b = d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f273625a) {
            case 0:
                CreditCardPaymentDetails it8 = (CreditCardPaymentDetails) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                h hVar = i.Companion;
                dj0.d dVarP = it8.d;
                Intrinsics.checkNotNullParameter(dVarP, "<this>");
                xi0.b bVar = dVarP.f115083b;
                xi0.b.Companion.getClass();
                if (!Intrinsics.f(bVar, xi0.b.z)) {
                    dVarP = yh5.b.p(dVarP, this.f273626b);
                }
                hVar.getClass();
                return h.a(dVarP);
            default:
                uid.a update = (uid.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return uid.a.a(update, this.f273626b, 30);
        }
    }
}
