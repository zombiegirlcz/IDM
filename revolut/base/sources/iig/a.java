package iig;

import com.revolut.feature.travel.miles.api.model.TravelMilesProvider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesProvider f161612a;

    public a(TravelMilesProvider milesProvider) {
        Intrinsics.checkNotNullParameter(milesProvider, "milesProvider");
        this.f161612a = milesProvider;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f161612a, ((a) obj2).f161612a);
    }

    public final int hashCode() {
        return this.f161612a.hashCode();
    }
}
