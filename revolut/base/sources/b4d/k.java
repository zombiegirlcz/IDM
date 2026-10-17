package b4d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f12308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FavouritesAssetTypeKey f12309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FavouritesAssetTypeKey f12310c;
    public final FavouritesAssetTypeKey d;

    public k(l80.e dateTimeProvider) {
        Intrinsics.checkNotNullParameter(dateTimeProvider, "dateTimeProvider");
        this.f12308a = dateTimeProvider;
        this.f12309b = new FavouritesAssetTypeKey("FIAT");
        this.f12310c = new FavouritesAssetTypeKey("CRYPTO");
        this.d = new FavouritesAssetTypeKey("COMMODITY");
    }
}
