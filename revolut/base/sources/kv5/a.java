package kv5;

import com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType;
import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ut5.d {
    @Override // ut5.d
    public final Flow a(xi0.b targetCurrency) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        dj0.d.Companion.getClass();
        return zi0.c.i(dj0.d.e);
    }

    @Override // ut5.d
    public final boolean e(Object obj2) {
        return false;
    }

    @Override // ut5.d
    public final Flow f(CryptoInvestmentsSortingType sortingType) {
        Intrinsics.checkNotNullParameter(sortingType, "sortingType");
        return new go.g(SplitAccountsItemGroup.Empty.f71455a, 2);
    }
}
