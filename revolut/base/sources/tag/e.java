package tag;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.map_preview.TravelHotelsPropertyOnMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsPropertyOnMap f269329a;

    public e(TravelHotelsPropertyOnMap property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.f269329a = property;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f269329a, ((e) obj2).f269329a);
    }

    public final int hashCode() {
        return this.f269329a.f93948a.hashCode();
    }
}
