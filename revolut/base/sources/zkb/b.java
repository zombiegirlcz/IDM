package zkb;

import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import dj0.d;
import go.g;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z70.c;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f322933a;

    public b(c maximumAllowedDepositCurrencyConverter) {
        Intrinsics.checkNotNullParameter(maximumAllowedDepositCurrencyConverter, "maximumAllowedDepositCurrencyConverter");
        this.f322933a = maximumAllowedDepositCurrencyConverter;
    }

    public static g a(long j2, SavingsProduct savingsProduct) {
        d dVar;
        ArrayList arrayList = savingsProduct.f86623l;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof SavingsProduct.Limit.MaxCurrentBalanceLimit) {
                arrayList2.add(obj2);
            }
        }
        SavingsProduct.Limit.MaxCurrentBalanceLimit maxCurrentBalanceLimit = (SavingsProduct.Limit.MaxCurrentBalanceLimit) d0.d0(arrayList2);
        Long lValueOf = (maxCurrentBalanceLimit == null || (dVar = maxCurrentBalanceLimit.f86655a) == null) ? null : Long.valueOf(dVar.f115082a);
        SavingsProduct.InterestRate.RateTier rateTier = (SavingsProduct.InterestRate.RateTier) d0.d0(savingsProduct.f86621h.f86644a);
        Long[] elements = {Long.valueOf(j2), lValueOf, rateTier != null ? rateTier.f86653b : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new g(Long.valueOf(((Number) d0.y0(kotlin.collections.d.L(elements))).longValue()), 2);
    }
}
