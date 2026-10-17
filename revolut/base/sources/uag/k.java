package uag;

import com.revolut.feature_travel_hotels_models.dropoff.NavigableTravelHotelsDropoff;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavigableTravelHotelsDropoff f278644a;

    public k(NavigableTravelHotelsDropoff navigableDropOff) {
        Intrinsics.checkNotNullParameter(navigableDropOff, "navigableDropOff");
        this.f278644a = navigableDropOff;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f278644a, ((k) obj2).f278644a);
    }

    public final int hashCode() {
        return this.f278644a.hashCode();
    }
}
