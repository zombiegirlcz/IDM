package pmb;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.math.BigDecimal;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(new BigDecimal(String.valueOf(opg.a.d((SavingsProductData) obj3))), new BigDecimal(String.valueOf(opg.a.d((SavingsProductData) obj2))));
    }
}
