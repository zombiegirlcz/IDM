package av5;

import com.revolut.feature.crypto_investments.api.model.transaction_filter.CryptoTransactionFilter;
import com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.filters_by_type.FiltersByTypeScreenContract$InputData;
import java.util.ArrayList;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends jki.g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t70.b f9922p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f9923q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p stateMapper, FiltersByTypeScreenContract$InputData inputData, t70.b currenciesLocalization) {
        ArrayList arrayList;
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        this.f9922p = currenciesLocalization;
        ArrayList arrayList2 = inputData.f71445b;
        i iVar = inputData.f71444a;
        int i = k.f9921a[iVar.ordinal()];
        if (i == 1) {
            arrayList = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (obj2 instanceof CryptoTransactionFilter.TransactionTypeFilter) {
                    arrayList.add(obj2);
                }
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList = new ArrayList();
            for (Object obj3 : arrayList2) {
                if (obj3 instanceof CryptoTransactionFilter.CurrencyFilter) {
                    arrayList.add(obj3);
                }
            }
        }
        this.f9923q = new f(arrayList, null, iVar);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f9923q;
    }
}
