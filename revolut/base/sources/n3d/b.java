package n3d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements Comparator {
    public static int a(FavouritesAssetTypeKey favouritesAssetTypeKey) {
        y1d.b.Companion.getClass();
        if (Intrinsics.f(favouritesAssetTypeKey, y1d.a.e) || Intrinsics.f(favouritesAssetTypeKey, y1d.a.f)) {
            return 0;
        }
        return Intrinsics.f(favouritesAssetTypeKey, y1d.a.d) ? 1 : Integer.MAX_VALUE;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        FavouritesAssetTypeKey assetTypeKey1 = (FavouritesAssetTypeKey) obj2;
        FavouritesAssetTypeKey assetTypeKey2 = (FavouritesAssetTypeKey) obj3;
        Intrinsics.checkNotNullParameter(assetTypeKey1, "assetTypeKey1");
        Intrinsics.checkNotNullParameter(assetTypeKey2, "assetTypeKey2");
        return a(assetTypeKey1) - a(assetTypeKey2);
    }
}
