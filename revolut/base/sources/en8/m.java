package en8;

import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f127779a = new m();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3;
        SavingsProduct savingsProduct;
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        List list = (List) pair.f186385a;
        List list2 = (List) pair.f186386b;
        if (list.isEmpty()) {
            return (SavingsProductData) d0.b0(list2);
        }
        Iterator it8 = list2.iterator();
        loop0: while (true) {
            obj3 = null;
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            SavingsProductData savingsProductData = (SavingsProductData) next;
            List list3 = list;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator it9 = list3.iterator();
                while (it9.hasNext()) {
                    SavingsProductData savingsProductData2 = ((g) it9.next()).f127768b;
                    if (Intrinsics.f((savingsProductData2 == null || (savingsProduct = savingsProductData2.f86683a) == null) ? null : savingsProduct.f86617a, savingsProductData.f86683a.f86617a)) {
                        obj3 = next;
                        break loop0;
                    }
                }
            }
        }
        SavingsProductData savingsProductData3 = (SavingsProductData) obj3;
        return savingsProductData3 == null ? (SavingsProductData) d0.b0(list2) : savingsProductData3;
    }
}
