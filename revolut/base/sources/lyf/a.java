package lyf;

import com.revolut.feature.travel.experiences.models.TravelExperiencesPricing;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f200813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f200814c;
    public final TravelExperiencesPricing d;

    public a(String id10, String name, String image, TravelExperiencesPricing startingPrice) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(startingPrice, "startingPrice");
        this.f200812a = id10;
        this.f200813b = name;
        this.f200814c = image;
        this.d = startingPrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f200812a, aVar.f200812a) && Intrinsics.f(this.f200813b, aVar.f200813b) && Intrinsics.f(this.f200814c, aVar.f200814c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f200812a.hashCode() * 31, 31, this.f200813b), 31, this.f200814c);
    }
}
