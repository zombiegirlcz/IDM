package ykb;

import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    public static dj0.d a(long j2, SavingsProduct product) {
        long jD;
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(product, "<this>");
        LocalDate localDate = ocd.c.f224221a;
        Intrinsics.checkNotNullParameter(product, "<this>");
        Double dE = ocd.c.e(product, product.f86621h.f86645b.f86647a);
        if (dE == null) {
            throw new IllegalStateException("Primary rate percentage can't be null");
        }
        double dDoubleValue = dE.doubleValue() / ((double) 100);
        if (d.f314603a[product.f86621h.f86645b.f86647a.ordinal()] == 1) {
            jD = rim.d.d(Math.floor(j2 * dDoubleValue));
        } else {
            int i = d.f314604b[product.f86620g.f86673a.f86675b.ordinal()];
            double d = 1;
            double d5 = i != 1 ? i != 2 ? i != 3 ? 365 : 260 : 12 : 1;
            jD = rim.d.d(Math.floor((Math.pow((dDoubleValue / d5) + d, d5) - d) * j2));
        }
        return new dj0.d(jD, product.f86618b);
    }
}
