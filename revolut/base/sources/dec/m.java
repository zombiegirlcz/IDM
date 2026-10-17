package dec;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.q0;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f[] f113370a = {com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.ACCOUNTS, com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.POCKETS, com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.SAVINGS, com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.CREDIT, com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.CRYPTO, com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f.COMMODITIES};

    public static final int a(com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.f fVar) {
        int iY = kotlin.collections.d.Y(f113370a, fVar);
        Integer numValueOf = Integer.valueOf(iY);
        if (iY < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return Integer.MAX_VALUE;
    }

    public static final List b(PaymentMethod.RevolutAccount.Wallet wallet, List list, Function1 function1) {
        if (wallet == null) {
            return f0.f322471a;
        }
        Collection collectionValues = q0.f(wallet.f84396b, new k()).values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        ArrayList arrayListU = zhm.w.u(collectionValues);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : arrayListU) {
            PaymentMethod.Pocket pocket = (PaymentMethod.Pocket) obj2;
            if (!list.contains(pocket.f84376a) && ((Boolean) function1.invoke(pocket)).booleanValue()) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
