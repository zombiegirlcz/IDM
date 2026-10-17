package l2d;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FavouritesAssetTypeKey f191782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f191783b;

    public i(FavouritesAssetTypeKey favouritesAssetTypeKey, Data data) {
        this.f191782a = favouritesAssetTypeKey;
        this.f191783b = (List) data.getContent();
    }
}
