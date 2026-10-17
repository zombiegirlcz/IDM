package myf;

import com.revolut.feature.travel.experiences.api.models.search.TravelSearchDestination;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f210474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelSearchDestination f210475b;

    public i(ArrayList recommendedCategories, TravelSearchDestination destination) {
        Intrinsics.checkNotNullParameter(recommendedCategories, "recommendedCategories");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f210474a = recommendedCategories;
        this.f210475b = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f210474a.equals(iVar.f210474a) && this.f210475b.equals(iVar.f210475b);
    }

    public final int hashCode() {
        return this.f210475b.hashCode() + (this.f210474a.hashCode() * 31);
    }
}
