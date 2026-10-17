package pdg;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.map_preview.TravelHotelsPropertyOnMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class u extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsPropertyOnMap f235218a;

    public u(TravelHotelsPropertyOnMap property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.f235218a = property;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f235218a, ((u) obj2).f235218a);
    }

    public final int hashCode() {
        return this.f235218a.f93948a.hashCode();
    }
}
