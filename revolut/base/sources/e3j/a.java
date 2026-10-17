package e3j;

import com.revolut.retail.feature.beneficiary.api.domain.PaymentCodeAccount;
import com.revolut.retail.feature.beneficiary.api.domain.PaymentCodeTransactor;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static PaymentCodeAccount a(PaymentCodeAccount paymentCodeAccount) {
        String[] elements = {paymentCodeAccount.f99612a, paymentCodeAccount.f99613b};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        if ((setY0 instanceof Collection) && setY0.isEmpty()) {
            return null;
        }
        Iterator it8 = setY0.iterator();
        while (it8.hasNext()) {
            if (!d0.W((String) it8.next())) {
                return paymentCodeAccount;
            }
        }
        return null;
    }

    public static PaymentCodeTransactor b(PaymentCodeTransactor paymentCodeTransactor) {
        String[] elements = {paymentCodeTransactor.f99614a, paymentCodeTransactor.f99616c, paymentCodeTransactor.d, paymentCodeTransactor.e, paymentCodeTransactor.f, paymentCodeTransactor.f99617g};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        if ((setY0 instanceof Collection) && setY0.isEmpty()) {
            return null;
        }
        Iterator it8 = setY0.iterator();
        while (it8.hasNext()) {
            if (!d0.W((String) it8.next())) {
                return paymentCodeTransactor;
            }
        }
        return null;
    }
}
