package nv5;

import com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType;
import fnc.s;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kv5.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    @NotNull
    private static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gv5.k f219506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f219507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ut5.c f219508c;
    public final s d;
    public final ut5.h e;
    public final kv5.c f;

    public m(gv5.k investmentsWidgetItemsListModifier, i itemsMapper, ut5.c cryptoStatsDataProvider, s stakeableCurrenciesProvider, ut5.h pocketsDataProvider, kv5.c pocketUiDataToInvestItemMapper) {
        Intrinsics.checkNotNullParameter(investmentsWidgetItemsListModifier, "investmentsWidgetItemsListModifier");
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(cryptoStatsDataProvider, "cryptoStatsDataProvider");
        Intrinsics.checkNotNullParameter(stakeableCurrenciesProvider, "stakeableCurrenciesProvider");
        Intrinsics.checkNotNullParameter(pocketsDataProvider, "pocketsDataProvider");
        Intrinsics.checkNotNullParameter(pocketUiDataToInvestItemMapper, "pocketUiDataToInvestItemMapper");
        this.f219506a = investmentsWidgetItemsListModifier;
        this.f219507b = itemsMapper;
        this.f219508c = cryptoStatsDataProvider;
        this.d = stakeableCurrenciesProvider;
        this.e = pocketsDataProvider;
        this.f = pocketUiDataToInvestItemMapper;
    }

    public final oji.f a(CryptoInvestmentsSortingType sortingType, st5.b itemsLimit, boolean z, Flow extraItemsFlow) {
        Intrinsics.checkNotNullParameter(sortingType, "sortingType");
        Intrinsics.checkNotNullParameter(itemsLimit, "itemsLimit");
        Intrinsics.checkNotNullParameter(extraItemsFlow, "extraItemsFlow");
        Flow flowB0 = this.e.b0();
        jhi.b bVarE = mo3.a.e(this.f219508c.c(), new nsl.d(7), new nsl.d(8));
        s sVar = this.d;
        return ta6.a.e(flowB0, bVarE, new q(sVar.o(), 3), new q(sVar.o(), 0), extraItemsFlow, new l(this, sortingType, itemsLimit, z, null));
    }
}
