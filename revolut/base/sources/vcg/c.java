package vcg;

import cli.j;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.map_preview.TravelHotelsPropertyOnMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsPropertyOnMap f287691a;

    public c(TravelHotelsPropertyOnMap property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.f287691a = property;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f287691a, ((c) obj2).f287691a);
    }

    public final int hashCode() {
        return this.f287691a.f93948a.hashCode();
    }
}
