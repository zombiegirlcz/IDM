package a26;

import com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType;
import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements ut5.g {
    @Override // ut5.g
    public final Flow a(st5.b itemsLimit, CryptoInvestmentsSortingType sortingType) {
        Intrinsics.checkNotNullParameter(itemsLimit, "itemsLimit");
        Intrinsics.checkNotNullParameter(sortingType, "sortingType");
        return new go.g(SplitAccountsItemGroup.Empty.f71455a, 2);
    }

    @Override // ut5.g
    public final Flow b() {
        return new go.g(ut5.j.HIDDEN, 2);
    }
}
