package cgi;

import com.revolut.feature_travel_hotels_models.property.room.BedOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f23992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BedOption f23993b;

    public f(g occupancyRatesSelection, BedOption bedOption) {
        Intrinsics.checkNotNullParameter(occupancyRatesSelection, "occupancyRatesSelection");
        Intrinsics.checkNotNullParameter(bedOption, "bedOption");
        this.f23992a = occupancyRatesSelection;
        this.f23993b = bedOption;
    }

    @Override // cgi.k
    public final BedOption a() {
        return this.f23993b;
    }

    @Override // cgi.k
    public final o b() {
        return this.f23992a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f23992a, fVar.f23992a) && Intrinsics.f(this.f23993b, fVar.f23993b);
    }

    public final int hashCode() {
        return this.f23993b.f98087a.hashCode() + (this.f23992a.hashCode() * 31);
    }
}
