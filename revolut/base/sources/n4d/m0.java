package n4d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class m0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((FavouritesAssetTypeKey) obj2).f86866a, ((FavouritesAssetTypeKey) obj3).f86866a);
    }
}
