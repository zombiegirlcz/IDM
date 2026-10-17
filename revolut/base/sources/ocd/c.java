package ocd;

import com.revolut.feature.shared.savings.models.product.ProductGroup;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import grl.b4;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ncd.k;
import rd0.d;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.d0;
import zhm.h0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LocalDate f224221a = LocalDate.of(b4.EXPIRED_OR_INVALID_KEY_VALUE, 1, 1);

    public static final Period a(SavingsProductData savingsProductData) {
        SavingsProduct.Term.Maturity maturity;
        String str;
        Object objA;
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        SavingsProduct.Term term = savingsProductData.f86683a.v;
        if (term == null || (maturity = term.f86678b) == null || (str = maturity.f86681a) == null) {
            return null;
        }
        try {
            m.Companion companion = m.INSTANCE;
            objA = Period.parse(str);
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        Throwable thA = m.a(objA);
        if (thA != null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid fixed-term maturity period: ".concat(str), thA);
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        }
        return (Period) (objA instanceof n ? null : objA);
    }

    public static final double b(SavingsProductData savingsProductData) {
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        SavingsProduct savingsProduct = savingsProductData.f86683a;
        Intrinsics.checkNotNullParameter(savingsProduct, "<this>");
        Double dE = e(savingsProduct, savingsProduct.f86621h.f86645b.f86647a);
        if (dE != null) {
            return dE.doubleValue();
        }
        throw new IllegalStateException("Primary rate percentage can't be null");
    }

    public static final ProductGroup.RateConfig c(ProductGroup productGroup, k interestRateType) {
        Intrinsics.checkNotNullParameter(productGroup, "<this>");
        Intrinsics.checkNotNullParameter(interestRateType, "interestRateType");
        switch (b.f224220a[interestRateType.ordinal()]) {
            case 1:
                return productGroup.d.f86561a;
            case 2:
                return productGroup.d.f86562b;
            case 3:
                return productGroup.d.f86563c;
            case 4:
                return productGroup.d.d;
            case 5:
                return productGroup.d.e;
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Double d(SavingsProduct.InterestRate.RatePercentages ratePercentages, k interestRateType) {
        Intrinsics.checkNotNullParameter(ratePercentages, "<this>");
        Intrinsics.checkNotNullParameter(interestRateType, "interestRateType");
        switch (b.f224220a[interestRateType.ordinal()]) {
            case 1:
                return Double.valueOf(ratePercentages.f86650b);
            case 2:
                return Double.valueOf(ratePercentages.f86649a);
            case 3:
                return ratePercentages.d;
            case 4:
                return Double.valueOf(ratePercentages.f86651c);
            case 5:
                return ratePercentages.e;
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Double e(SavingsProduct savingsProduct, k interestRateType) {
        Intrinsics.checkNotNullParameter(savingsProduct, "<this>");
        Intrinsics.checkNotNullParameter(interestRateType, "interestRateType");
        return d(savingsProduct.f86621h.a(), interestRateType);
    }

    public static final Double f(SavingsProductData savingsProductData) {
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        k kVarB = savingsProductData.f86683a.f86621h.b();
        if (kVarB != null) {
            return e(savingsProductData.f86683a, kVarB);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    public static final List g(SavingsProductData savingsProductData) {
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        List arrayList = savingsProductData.f86684b.k;
        if (arrayList.isEmpty()) {
            ArrayList<SavingsProduct.Deduction> arrayList2 = savingsProductData.f86683a.k;
            arrayList = new ArrayList(w.t(arrayList2, 10));
            for (SavingsProduct.Deduction deduction : arrayList2) {
                String str = deduction.f86636c;
                arrayList.add(new ProductGroup.Tax(str, null, deduction.e, null, u.c(new ProductGroup.TaxBand(str, deduction.f86635b, deduction.d))));
            }
        }
        return (List) arrayList;
    }

    public static final boolean h(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((SavingsProductData) it8.next()).f86683a.f86619c);
        }
        return d0.i1(arrayList).size() > 1;
    }

    public static final boolean i(SavingsProductData savingsProductData) {
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        return savingsProductData.f86683a.o != null;
    }

    public static final boolean j(SavingsProductData savingsProductData) {
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        return savingsProductData.f86683a.f86621h.f86644a.size() > 1;
    }
}
