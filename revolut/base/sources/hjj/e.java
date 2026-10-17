package hjj;

import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class e {
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public static PaymentMethod.Pocket a(PaymentMethod.RevolutAccount revolutAccount, String str) {
        Object obj2 = null;
        if (str == null) {
            return null;
        }
        Collection collectionValues = revolutAccount.f84394b.values();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = collectionValues.iterator();
        while (it8.hasNext()) {
            a0.x(w.u(((PaymentMethod.RevolutAccount.Wallet) it8.next()).f84396b.values()), arrayList);
        }
        Iterator it9 = arrayList.iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            Object next = it9.next();
            if (Intrinsics.f(((PaymentMethod.Pocket) next).f84376a, str)) {
                obj2 = next;
                break;
            }
        }
        return (PaymentMethod.Pocket) obj2;
    }
}
