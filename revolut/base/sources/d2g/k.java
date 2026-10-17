package d2g;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperienceDatesSelection f110807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f110808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f110809c;

    public k(TravelExperienceDatesSelection datesSelection, Data destinationDiscovery, Data revPointsPill) {
        Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
        Intrinsics.checkNotNullParameter(destinationDiscovery, "destinationDiscovery");
        Intrinsics.checkNotNullParameter(revPointsPill, "revPointsPill");
        this.f110807a = datesSelection;
        this.f110808b = destinationDiscovery;
        this.f110809c = revPointsPill;
    }

    public static k a(k kVar, Data destinationDiscovery, Data revPointsPill, int i) {
        TravelExperienceDatesSelection datesSelection = kVar.f110807a;
        if ((i & 2) != 0) {
            destinationDiscovery = kVar.f110808b;
        }
        if ((i & 4) != 0) {
            revPointsPill = kVar.f110809c;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
        Intrinsics.checkNotNullParameter(destinationDiscovery, "destinationDiscovery");
        Intrinsics.checkNotNullParameter(revPointsPill, "revPointsPill");
        return new k(datesSelection, destinationDiscovery, revPointsPill);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f110807a, kVar.f110807a) && Intrinsics.f(this.f110808b, kVar.f110808b) && Intrinsics.f(this.f110809c, kVar.f110809c);
    }

    public final int hashCode() {
        return this.f110809c.hashCode() + kii.e.c(this.f110808b, this.f110807a.hashCode() * 31, 31);
    }
}
