package uei;

import com.revolut.feature_travel_hotels_models.location.HotelsLocation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HotelsLocation f279453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f279454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f279455c;
    public final String d;
    public final String e;
    public final int f;

    public a(HotelsLocation location, String image, String name, String discount, String campaignId, int i) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(discount, "discount");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        this.f279453a = location;
        this.f279454b = image;
        this.f279455c = name;
        this.d = discount;
        this.e = campaignId;
        this.f = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f279453a, aVar.f279453a) && Intrinsics.f(this.f279454b, aVar.f279454b) && Intrinsics.f(this.f279455c, aVar.f279455c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && this.f == aVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + p.a.c(p.a.c(p.a.c(p.a.c(this.f279453a.hashCode() * 31, 31, this.f279454b), 31, this.f279455c), 31, this.d), 31, this.e);
    }
}
