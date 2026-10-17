package mgd;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FavouritesAssetDetails f205268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f205269c;
    public final String d;
    public final b e;
    public final DateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BigDecimal f205270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f205271h;

    public h(FavouritesAssetDetails from, String id10, String note, String counterAsset, BigDecimal targetPrice, BigDecimal placementPrice, b frequency, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(targetPrice, "targetPrice");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(placementPrice, "placementPrice");
        Intrinsics.checkNotNullParameter(counterAsset, "counterAsset");
        this.f205267a = id10;
        this.f205268b = from;
        this.f205269c = targetPrice;
        this.d = note;
        this.e = frequency;
        this.f = createdAt;
        this.f205270g = placementPrice;
        this.f205271h = counterAsset;
    }

    @Override // mgd.j
    public final FavouritesAssetDetails a() {
        return this.f205268b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f205267a, hVar.f205267a) && Intrinsics.f(this.f205268b, hVar.f205268b) && Intrinsics.f(this.f205269c, hVar.f205269c) && Intrinsics.f(this.d, hVar.d) && this.e == hVar.e && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f205270g, hVar.f205270g) && Intrinsics.f(this.f205271h, hVar.f205271h);
    }

    public final int hashCode() {
        return this.f205271h.hashCode() + t61.a.d(this.f205270g, m72.b.f(this.f, (this.e.hashCode() + p.a.c(t61.a.d(this.f205269c, (this.f205268b.hashCode() + (this.f205267a.hashCode() * 31)) * 31, 31), 31, this.d)) * 31, 31), 31);
    }
}
