package x1g;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f302443a = new w();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        od0.i it8 = (od0.i) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        Object obj3 = it8.f224257a;
        if (obj3 instanceof PaymentMethod.Pocket) {
            return (PaymentMethod.Pocket) obj3;
        }
        return null;
    }
}
