package rcg;

import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HotelsProperty f253258a;

    public i(HotelsProperty property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.f253258a = property;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f253258a, ((i) obj2).f253258a);
    }

    public final int hashCode() {
        return this.f253258a.hashCode();
    }
}
