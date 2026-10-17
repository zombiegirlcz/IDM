package bmb;

import com.revolut.feature.shared.savings.models.product.ProductGroupOptions;
import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        Integer num;
        Integer num2 = 3;
        ncd.g gVar = ((ProductGroupOptions.GroupOption) obj3).f86597a;
        int[] iArr = d.f16788a;
        int i = iArr[gVar.ordinal()];
        if (i == 1) {
            num = num2;
        } else if (i == 2) {
            num = 2;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            num = 1;
        }
        int i2 = iArr[((ProductGroupOptions.GroupOption) obj2).f86597a.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                num2 = 2;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                num2 = 1;
            }
        }
        return cim.b.b(num, num2);
    }
}
