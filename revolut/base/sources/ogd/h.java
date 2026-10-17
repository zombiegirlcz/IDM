package ogd;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h {
    private h() {
    }

    public static i a(e item) {
        Intrinsics.checkNotNullParameter(item, "item");
        FavouritesAssetDetails favouritesAssetDetails = item.f225109a;
        FavouritesAssetTypeKey favouritesAssetTypeKey = favouritesAssetDetails.d;
        String str = favouritesAssetDetails.f86863a;
        String str2 = item.f225110b;
        if (str2 == null) {
            str2 = "";
        }
        return new i(favouritesAssetTypeKey, str, str2);
    }
}
