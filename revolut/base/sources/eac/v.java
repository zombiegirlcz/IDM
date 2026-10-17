package eac;

import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f124183a = new v();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        od0.i it8 = (od0.i) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return (ShippingContact) it8.g();
    }
}
