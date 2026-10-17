package dgi;

import com.revolut.feature_travel_hotels_models.property.search.HotelsSelectedDates;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HotelsSelectedDates f114686a;

    public f(HotelsSelectedDates selectedDates) {
        Intrinsics.checkNotNullParameter(selectedDates, "selectedDates");
        this.f114686a = selectedDates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f114686a, ((f) obj2).f114686a);
    }

    public final int hashCode() {
        return this.f114686a.hashCode();
    }
}
