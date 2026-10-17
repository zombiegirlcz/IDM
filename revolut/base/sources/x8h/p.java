package x8h;

import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionSortOption;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p {
    public final InstrumentsCollectionSortOption a(InstrumentsCollectionType collectionType) {
        Intrinsics.checkNotNullParameter(collectionType, "collectionType");
        if (Intrinsics.f(collectionType, InstrumentsCollectionType.Bonds.f95283a)) {
            return new InstrumentsCollectionSortOption.MostOwned(zzg.s.DESC);
        }
        if (!Intrinsics.f(collectionType, InstrumentsCollectionType.Etfs.f95284a) && !(collectionType instanceof InstrumentsCollectionType.Related) && !(collectionType instanceof InstrumentsCollectionType.RecommendedBuy)) {
            throw new NoWhenBranchMatchedException();
        }
        return new InstrumentsCollectionSortOption.MostTraded(null);
    }
}
