package dmj;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberCheckout;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EsimPhoneNumberCheckout f116174a;

    public n0(EsimPhoneNumberCheckout esimPhoneNumberCheckout) {
        this.f116174a = esimPhoneNumberCheckout;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        PaymentMethod.Pocket pocket = (PaymentMethod.Pocket) pair.f186385a;
        Boolean bool = (Boolean) pair.f186386b;
        bool.booleanValue();
        return new yhm.r(pocket, this.f116174a, bool);
    }
}
