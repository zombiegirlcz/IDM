package n4d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r {
    public r(l80.e dateTimeProvider) {
        Intrinsics.checkNotNullParameter(dateTimeProvider, "dateTimeProvider");
        new FavouritesAssetTypeKey("FIAT");
        new FavouritesAssetTypeKey("CRYPTO");
        new FavouritesAssetTypeKey("COMMODITY");
    }
}
