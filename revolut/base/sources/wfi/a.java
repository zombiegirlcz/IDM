package wfi;

import com.revolut.feature_travel_hotels_models.property.PointsRewardRate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f297148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f297149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f297150c;
    public final String d;
    public final PointsRewardRate e;

    public a(String id10, String name, String description, String imageUrl, PointsRewardRate pointsRewardRate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(pointsRewardRate, "pointsRewardRate");
        this.f297148a = id10;
        this.f297149b = name;
        this.f297150c = description;
        this.d = imageUrl;
        this.e = pointsRewardRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f297148a, aVar.f297148a) && Intrinsics.f(this.f297149b, aVar.f297149b) && Intrinsics.f(this.f297150c, aVar.f297150c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f297148a.hashCode() * 31, 31, this.f297149b), 31, this.f297150c), 31, this.d);
    }
}
