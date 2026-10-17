package qjj;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPrice;
import dec.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f246890a;

    public f(q paymentMethodsCommonMapper) {
        Intrinsics.checkNotNullParameter(paymentMethodsCommonMapper, "paymentMethodsCommonMapper");
        this.f246890a = paymentMethodsCommonMapper;
    }

    public final RowDelegate.Model a(PaymentMethod.Pocket pocket, EsimCheckoutPrice checkoutPrice) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(checkoutPrice, "checkoutPrice");
        return RowDelegate.Model.x(q.c(this.f246890a, pocket, true, njj.a.a(pocket, checkoutPrice.f100197b) ? dec.o.DEFAULT : dec.o.INSUFFICIENT_FUNDS, false, 24), null, null, null, null, null, 0, null, false, null, checkoutPrice.f100198c, 0, 0, 0, 0, null, -4194305, 15);
    }
}
