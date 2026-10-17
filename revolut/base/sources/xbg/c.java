package xbg;

import aii.r;
import com.revolut.feature_travel_hotels_models.property.room.BedOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BedOption f304078a;

    public c(BedOption selectedBedOption) {
        Intrinsics.checkNotNullParameter(selectedBedOption, "selectedBedOption");
        this.f304078a = selectedBedOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f304078a, ((c) obj2).f304078a);
    }

    public final int hashCode() {
        return this.f304078a.f98087a.hashCode();
    }
}
