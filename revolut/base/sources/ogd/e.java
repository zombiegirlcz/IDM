package ogd;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FavouritesAssetDetails f225109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f225110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f225111c;
    public final dj0.d d;

    public e(FavouritesAssetDetails from, String str, dj0.d dVar, dj0.d dVar2) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.f225109a = from;
        this.f225110b = str;
        this.f225111c = dVar;
        this.d = dVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f225109a, eVar.f225109a) && Intrinsics.f(this.f225110b, eVar.f225110b) && Intrinsics.f(this.f225111c, eVar.f225111c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f225109a.hashCode() * 31;
        String str = this.f225110b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        dj0.d dVar = this.f225111c;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        dj0.d dVar2 = this.d;
        return iHashCode3 + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
