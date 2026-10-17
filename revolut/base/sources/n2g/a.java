package n2g;

import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceCategoryWithImage;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelSearchDestination f211539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperienceCategoryWithImage f211540b;

    public a(TravelSearchDestination destination, TravelExperienceCategoryWithImage category) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(category, "category");
        this.f211539a = destination;
        this.f211540b = category;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f211539a, aVar.f211539a) && Intrinsics.f(this.f211540b, aVar.f211540b);
    }

    public final int hashCode() {
        return this.f211540b.hashCode() + (this.f211539a.hashCode() * 31);
    }
}
