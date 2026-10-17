package fcd;

import com.revolut.feature.shared.savings.models.product.ProductGroup;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ncd.k;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b {
    public static final void a(SavingsProductData savingsProductData) {
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        SavingsProduct savingsProduct = savingsProductData.f86683a;
        SavingsProduct.InterestRate interestRate = savingsProduct.f86621h;
        k kVar = interestRate.f86645b.f86647a;
        k kVarB = interestRate.b();
        ProductGroup productGroup = savingsProductData.f86684b;
        List<k> listK = v.k(kVar, kVarB, productGroup.d.f86564g);
        ArrayList arrayList = new ArrayList(w.t(listK, 10));
        for (k kVar2 : listK) {
            if (kVar2 != null && ocd.c.c(productGroup, kVar2) == null) {
                throw new IllegalStateException("Group Configs are invalid");
            }
            arrayList.add(Unit.f186387a);
        }
        SavingsProduct.InterestRate interestRate2 = savingsProduct.f86621h;
        List<k> listK2 = v.k(interestRate2.f86645b.f86647a, interestRate2.b(), productGroup.d.f86564g);
        ArrayList arrayList2 = new ArrayList(w.t(listK2, 10));
        for (k kVar3 : listK2) {
            if (kVar3 != null && ocd.c.e(savingsProduct, kVar3) == null) {
                throw new IllegalStateException("Rates are invalid");
            }
            arrayList2.add(Unit.f186387a);
        }
    }
}
