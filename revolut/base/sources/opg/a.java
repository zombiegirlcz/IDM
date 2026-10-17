package opg;

import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.shared.savings.models.product.e;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ncd.d;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public static final SavingsProductData a(List list) {
        Object obj2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        LocalDate localDate = ocd.c.f224221a;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it8 = list.iterator();
        if (it8.hasNext()) {
            Object next = it8.next();
            if (it8.hasNext()) {
                double dB = ocd.c.b((SavingsProductData) next);
                do {
                    Object next2 = it8.next();
                    double dB2 = ocd.c.b((SavingsProductData) next2);
                    if (Double.compare(dB, dB2) < 0) {
                        next = next2;
                        dB = dB2;
                    }
                } while (it8.hasNext());
            }
            obj2 = next;
        } else {
            obj2 = null;
        }
        return (SavingsProductData) obj2;
    }

    public static final SavingsProductData b(List list, Function1 predicate) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        LocalDate localDate = ocd.c.f224221a;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator it8 = list.iterator();
        while (true) {
            SavingsProductData savingsProductData = null;
            while (it8.hasNext()) {
                SavingsProductData savingsProductData2 = (SavingsProductData) it8.next();
                if (savingsProductData != null) {
                    if (!((Boolean) predicate.invoke(savingsProductData2)).booleanValue() || ocd.c.b(savingsProductData2) <= ocd.c.b(savingsProductData)) {
                        savingsProductData2 = null;
                    }
                    if (savingsProductData2 == null) {
                    }
                } else if (!((Boolean) predicate.invoke(savingsProductData2)).booleanValue()) {
                    break;
                }
                savingsProductData = savingsProductData2;
            }
            return savingsProductData;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static final SavingsProductData c(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        LocalDate localDate = ocd.c.f224221a;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator it8 = list.iterator();
        Object obj2 = null;
        if (it8.hasNext()) {
            Object next = it8.next();
            while (it8.hasNext()) {
                SavingsProductData savingsProductData = (SavingsProductData) it8.next();
                next = (SavingsProductData) next;
                if (ocd.c.b(next) == ocd.c.b(savingsProductData)) {
                    if (!ocd.c.i(savingsProductData)) {
                        savingsProductData = null;
                    }
                    if (savingsProductData != null) {
                        next = savingsProductData;
                    }
                } else {
                    if (ocd.c.b(savingsProductData) <= ocd.c.b(next)) {
                        savingsProductData = null;
                    }
                    if (savingsProductData != null) {
                        next = savingsProductData;
                    }
                }
            }
            obj2 = next;
        }
        return (SavingsProductData) obj2;
    }

    public static final double d(SavingsProductData savingsProductData) {
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        return ocd.c.b(savingsProductData);
    }

    public static final Double e(SavingsProductData savingsProductData) {
        Object next;
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        LocalDate localDate = ocd.c.f224221a;
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        Iterator it8 = savingsProductData.f86683a.f86622j.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((SavingsProduct.Deduction) next).f86634a, "SERVICE_FEE")) {
                break;
            }
        }
        SavingsProduct.Deduction deduction = (SavingsProduct.Deduction) next;
        if (deduction != null) {
            return Double.valueOf(deduction.f86635b);
        }
        return null;
    }

    public static final boolean f(SavingsProductData savingsProductData) {
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        LocalDate localDate = ocd.c.f224221a;
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        e eVar = savingsProductData.f86683a.f86620g.f86673a.f86676c;
        return eVar == e.EVERY_DAY || eVar == e.EVERY_WORKING_DAY;
    }

    public static final d g(SavingsProductData savingsProductData) {
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        LocalDate localDate = ocd.c.f224221a;
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        return savingsProductData.f86684b.d.f86565h;
    }

    public static final boolean h(SavingsProductData savingsProductData) {
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        return ocd.c.i(savingsProductData);
    }
}
