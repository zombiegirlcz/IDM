package d3d;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FavouritesAssetTypeKey f111086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f111087b;

    public c(FavouritesAssetTypeKey favouritesAssetTypeKey, boolean z) {
        this.f111086a = favouritesAssetTypeKey;
        this.f111087b = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data rates = (Data) obj2;
        Data names = (Data) obj3;
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(names, "names");
        return new b(this.f111086a, this.f111087b, rates, names);
    }
}
