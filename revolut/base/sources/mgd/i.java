package mgd;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FavouritesAssetDetails f205273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f205274c;
    public final String d;
    public final e e;
    public final DateTime f;

    public i(String id10, FavouritesAssetDetails from, BigDecimal percentage, String note, e timeRange, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(percentage, "percentage");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(timeRange, "timeRange");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.f205272a = id10;
        this.f205273b = from;
        this.f205274c = percentage;
        this.d = note;
        this.e = timeRange;
        this.f = createdAt;
    }

    @Override // mgd.j
    public final FavouritesAssetDetails a() {
        return this.f205273b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f205272a, iVar.f205272a) && Intrinsics.f(this.f205273b, iVar.f205273b) && Intrinsics.f(this.f205274c, iVar.f205274c) && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e && Intrinsics.f(this.f, iVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + p.a.c(t61.a.d(this.f205274c, (this.f205273b.hashCode() + (this.f205272a.hashCode() * 31)) * 31, 31), 31, this.d)) * 31);
    }
}
