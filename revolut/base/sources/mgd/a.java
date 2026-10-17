package mgd;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FavouritesAssetDetails f205256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f205257c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final DateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f205258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f205259h;

    public a(FavouritesAssetDetails from, String id10, String toAssetId, String str, BigDecimal targetRate, BigDecimal placementRate, b bVar, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(toAssetId, "toAssetId");
        Intrinsics.checkNotNullParameter(targetRate, "targetRate");
        Intrinsics.checkNotNullParameter(placementRate, "placementRate");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.f205255a = id10;
        this.f205256b = from;
        this.f205257c = toAssetId;
        this.d = targetRate;
        this.e = placementRate;
        this.f = createdAt;
        this.f205258g = str;
        this.f205259h = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f205255a, aVar.f205255a) && Intrinsics.f(this.f205256b, aVar.f205256b) && Intrinsics.f(this.f205257c, aVar.f205257c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f205258g, aVar.f205258g) && this.f205259h == aVar.f205259h;
    }

    public final int hashCode() {
        int iF = m72.b.f(this.f, t61.a.d(this.e, t61.a.d(this.d, p.a.c((this.f205256b.hashCode() + (this.f205255a.hashCode() * 31)) * 31, 31, this.f205257c), 31), 31), 31);
        String str = this.f205258g;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.f205259h;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }
}
