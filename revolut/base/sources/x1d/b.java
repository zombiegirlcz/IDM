package x1d;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FavouritesAssetTypeKey f302363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f302364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f302365c;

    public b(FavouritesAssetTypeKey favouritesAssetTypeKey, String from, String to6) {
        Intrinsics.checkNotNullParameter(favouritesAssetTypeKey, "favouritesAssetTypeKey");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f302363a = favouritesAssetTypeKey;
        this.f302364b = from;
        this.f302365c = to6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f302363a, bVar.f302363a) && Intrinsics.f(this.f302364b, bVar.f302364b) && Intrinsics.f(this.f302365c, bVar.f302365c);
    }

    public final int hashCode() {
        return this.f302365c.hashCode() + p.a.c(this.f302363a.f86866a.hashCode() * 31, 31, this.f302364b);
    }
}
