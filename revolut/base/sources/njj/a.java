package njj;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {
    public static final boolean a(PaymentMethod.Pocket pocket, dj0.d checkoutPrice) {
        Intrinsics.checkNotNullParameter(pocket, "<this>");
        Intrinsics.checkNotNullParameter(checkoutPrice, "checkoutPrice");
        dj0.d dVar = pocket.i;
        if (Intrinsics.f(dVar.f115083b, checkoutPrice.f115083b)) {
            return dVar.e(checkoutPrice);
        }
        xi0.b bVar = dVar.f115083b;
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "EsimMobilePlanCheckoutExtensions", a0.d.s("Can not perform balance sufficiency check. Pocket currency ", bVar.f306286a, " does not match payment currency ", checkoutPrice.f115083b.f306286a), null, h0Var);
        return false;
    }
}
