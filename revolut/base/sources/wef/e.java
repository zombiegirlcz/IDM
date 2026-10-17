package wef;

import com.revolut.data.model.Data;
import com.revolut.feature.transaction.recogniser.api.domain.models.Location;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f296768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Location f296769b;

    public e(Data recogniserDetails, Location location) {
        Intrinsics.checkNotNullParameter(recogniserDetails, "recogniserDetails");
        this.f296768a = recogniserDetails;
        this.f296769b = location;
    }

    public static e a(e eVar, Data recogniserDetails, Location location, int i) {
        if ((i & 1) != 0) {
            recogniserDetails = eVar.f296768a;
        }
        if ((i & 2) != 0) {
            location = eVar.f296769b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(recogniserDetails, "recogniserDetails");
        return new e(recogniserDetails, location);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f296768a, eVar.f296768a) && Intrinsics.f(this.f296769b, eVar.f296769b);
    }

    public final int hashCode() {
        int iHashCode = this.f296768a.hashCode() * 31;
        Location location = this.f296769b;
        return iHashCode + (location == null ? 0 : location.hashCode());
    }
}
