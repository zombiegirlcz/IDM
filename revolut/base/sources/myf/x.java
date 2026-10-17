package myf;

import com.revolut.feature.travel.experiences.api.models.search.TravelSearchDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelSearchDestination f210494b;

    public x(TravelSearchDestination destination, String image) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f210493a = image;
        this.f210494b = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f210493a, xVar.f210493a) && Intrinsics.f(this.f210494b, xVar.f210494b);
    }

    public final int hashCode() {
        return this.f210494b.hashCode() + (this.f210493a.hashCode() * 31);
    }
}
