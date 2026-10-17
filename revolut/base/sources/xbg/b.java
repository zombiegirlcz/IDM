package xbg;

import cli.j;
import com.revolut.feature_travel_hotels_models.property.room.BedOption;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BedOption f304076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f304077b;

    public b(BedOption selectedBedOption, List bedOptions) {
        Intrinsics.checkNotNullParameter(selectedBedOption, "selectedBedOption");
        Intrinsics.checkNotNullParameter(bedOptions, "bedOptions");
        this.f304076a = selectedBedOption;
        this.f304077b = bedOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f304076a, bVar.f304076a) && Intrinsics.f(this.f304077b, bVar.f304077b);
    }

    public final int hashCode() {
        return this.f304077b.hashCode() + (this.f304076a.f98087a.hashCode() * 31);
    }
}
