package ocd;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.jvm.internal.Intrinsics;
import ncd.g;
import ncd.m;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static final boolean a(SavingsProductData savingsProductData) {
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        return Intrinsics.f(savingsProductData.f86683a.f86618b, savingsProductData.f86684b.f86523c);
    }

    public static final boolean b(SavingsProductData savingsProductData) {
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        return savingsProductData.f86683a.f86619c == g.SAVINGS_DEPOSITS;
    }

    public static final boolean c(SavingsProductData savingsProductData) {
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        return savingsProductData.f86683a.d == m.SUSPENDED;
    }

    public static final boolean d(SavingsProductData savingsProductData) {
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        return savingsProductData.f86683a.f86619c == g.SAVINGS_MMF;
    }

    public static final boolean e(SavingsProductData savingsProductData) {
        return (savingsProductData != null ? savingsProductData.f86683a.f86619c : null) == g.SAVINGS_DEPOSITS && savingsProductData.f86683a.e == null;
    }
}
