package uag;

import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HotelsProperty f278648a;

    public o(HotelsProperty hotelsProperty) {
        Intrinsics.checkNotNullParameter(hotelsProperty, "hotelsProperty");
        this.f278648a = hotelsProperty;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f278648a, ((o) obj2).f278648a);
    }

    public final int hashCode() {
        return this.f278648a.hashCode();
    }
}
