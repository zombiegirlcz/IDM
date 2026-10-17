package eob;

import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import hjb.m;
import hjb.p;
import hjb.s;
import hjb.t;
import hjb.w;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import ncd.k;
import vc.o;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class j {
    public static t a(String str, List products) {
        Intrinsics.checkNotNullParameter(products, "products");
        if (products.isEmpty()) {
            IllegalStateException illegalStateException = new IllegalStateException("Unexpected state: Products are empty");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            throw illegalStateException;
        }
        Intrinsics.checkNotNullParameter(products, "<this>");
        if (ocd.c.h(products)) {
            SavingsProductData savingsProductDataB = opg.a.b(products, new elb.a(23));
            if (savingsProductDataB == null) {
                throw new IllegalStateException("Unexpected state: There is no product with default currency");
            }
            Intrinsics.checkNotNullParameter(savingsProductDataB, "<this>");
            double dB = ocd.c.b(savingsProductDataB);
            SavingsProduct.InterestRate.DisplayProperties displayProperties = savingsProductDataB.f86683a.f86621h.f86645b;
            return new s(new w(dB, displayProperties.f86648b, displayProperties.f86647a), b(savingsProductDataB), savingsProductDataB.f86684b.d.f86566j);
        }
        List list = products;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                if (!o.m((SavingsProductData) it8.next())) {
                    SavingsProductData savingsProductDataB2 = opg.a.b(products, new elb.a(25));
                    if (savingsProductDataB2 == null) {
                        throw new IllegalStateException("Unexpected state: There is no product with default currency");
                    }
                    Intrinsics.checkNotNullParameter(savingsProductDataB2, "<this>");
                    double dB2 = ocd.c.b(savingsProductDataB2);
                    SavingsProduct.InterestRate.DisplayProperties displayProperties2 = savingsProductDataB2.f86683a.f86621h.f86645b;
                    return new m(opg.a.f(savingsProductDataB2), new w(dB2, displayProperties2.f86648b, displayProperties2.f86647a), b(savingsProductDataB2), savingsProductDataB2.f86684b.d.f86566j, str);
                }
            }
        }
        SavingsProductData savingsProductDataB3 = opg.a.b(products, new elb.a(24));
        if (savingsProductDataB3 == null) {
            throw new IllegalStateException("Unexpected state: There is no product with default currency");
        }
        Intrinsics.checkNotNullParameter(savingsProductDataB3, "<this>");
        double dB3 = ocd.c.b(savingsProductDataB3);
        SavingsProduct.InterestRate.DisplayProperties displayProperties3 = savingsProductDataB3.f86683a.f86621h.f86645b;
        return new p(new w(dB3, displayProperties3.f86648b, displayProperties3.f86647a));
    }

    public static w b(SavingsProductData savingsProductData) {
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        Double dF = ocd.c.f(savingsProductData);
        SavingsProduct.InterestRate interestRate = savingsProductData.f86683a.f86621h;
        SavingsProduct.InterestRate.DisplayProperties displayProperties = interestRate.f86646c;
        String str = displayProperties != null ? displayProperties.f86648b : null;
        k kVarB = interestRate.b();
        if (dF == null || str == null || kVarB == null) {
            return null;
        }
        return new w(dF.doubleValue(), str, kVarB);
    }
}
