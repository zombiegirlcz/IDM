package y1d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f310357a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FavouritesAssetTypeKey f310358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FavouritesAssetTypeKey f310359c;
    public static final FavouritesAssetTypeKey d;
    public static final FavouritesAssetTypeKey e;
    public static final FavouritesAssetTypeKey f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final FavouritesAssetTypeKey f310360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final FavouritesAssetTypeKey f310361h;
    public static final FavouritesAssetTypeKey i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final FavouritesAssetTypeKey f310362j;
    public static final FavouritesAssetTypeKey k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Set f310363l;

    static {
        FavouritesAssetTypeKey favouritesAssetTypeKey = new FavouritesAssetTypeKey("FIAT");
        f310358b = favouritesAssetTypeKey;
        FavouritesAssetTypeKey favouritesAssetTypeKey2 = new FavouritesAssetTypeKey("CRYPTO");
        f310359c = favouritesAssetTypeKey2;
        FavouritesAssetTypeKey favouritesAssetTypeKey3 = new FavouritesAssetTypeKey("COMMODITY");
        d = favouritesAssetTypeKey3;
        e = new FavouritesAssetTypeKey("SECURITY");
        f = new FavouritesAssetTypeKey("STOCK");
        f310360g = new FavouritesAssetTypeKey("ETP");
        f310361h = new FavouritesAssetTypeKey("BOND");
        i = new FavouritesAssetTypeKey("CFD");
        f310362j = new FavouritesAssetTypeKey("INDEX");
        FavouritesAssetTypeKey favouritesAssetTypeKey4 = new FavouritesAssetTypeKey("PERPETUAL_FUTURE");
        k = favouritesAssetTypeKey4;
        FavouritesAssetTypeKey[] elements = {favouritesAssetTypeKey, favouritesAssetTypeKey2, favouritesAssetTypeKey3, favouritesAssetTypeKey4};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f310363l = d.y0(elements);
    }

    private a() {
    }
}
