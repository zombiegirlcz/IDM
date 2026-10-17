package hbg;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.map_preview.TravelHotelsPropertyOnMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsPropertyOnMap f150711a;

    public n(TravelHotelsPropertyOnMap property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.f150711a = property;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f150711a, ((n) obj2).f150711a);
    }

    public final int hashCode() {
        return this.f150711a.f93948a.hashCode();
    }
}
