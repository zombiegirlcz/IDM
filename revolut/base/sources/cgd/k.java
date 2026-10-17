package cgd;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesCounterpartAsset;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FavouritesCounterpartAsset f23940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23941c;
    public final boolean d;

    public k(List list, FavouritesCounterpartAsset favouritesCounterpartAsset, String searchInput, boolean z) {
        Intrinsics.checkNotNullParameter(searchInput, "searchInput");
        this.f23939a = list;
        this.f23940b = favouritesCounterpartAsset;
        this.f23941c = searchInput;
        this.d = z;
    }

    public static k a(k kVar, List list, FavouritesCounterpartAsset favouritesCounterpartAsset, String searchInput, boolean z, int i) {
        if ((i & 1) != 0) {
            list = kVar.f23939a;
        }
        if ((i & 2) != 0) {
            favouritesCounterpartAsset = kVar.f23940b;
        }
        if ((i & 4) != 0) {
            searchInput = kVar.f23941c;
        }
        if ((i & 8) != 0) {
            z = kVar.d;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(searchInput, "searchInput");
        return new k(list, favouritesCounterpartAsset, searchInput, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f23939a, kVar.f23939a) && Intrinsics.f(this.f23940b, kVar.f23940b) && Intrinsics.f(this.f23941c, kVar.f23941c) && this.d == kVar.d;
    }

    public final int hashCode() {
        List list = this.f23939a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        FavouritesCounterpartAsset favouritesCounterpartAsset = this.f23940b;
        return Boolean.hashCode(this.d) + p.a.c((iHashCode + (favouritesCounterpartAsset != null ? favouritesCounterpartAsset.hashCode() : 0)) * 31, 31, this.f23941c);
    }
}
