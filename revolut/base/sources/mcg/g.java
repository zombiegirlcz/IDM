package mcg;

import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HotelsProperty f204353a;

    public g(HotelsProperty hotelsProperty) {
        Intrinsics.checkNotNullParameter(hotelsProperty, "hotelsProperty");
        this.f204353a = hotelsProperty;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f204353a, ((g) obj2).f204353a);
    }

    public final int hashCode() {
        return this.f204353a.hashCode();
    }
}
