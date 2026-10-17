package bld;

import com.revolut.feature.slot_manager.impl.navigation.custom_rating.CustomRatingBottomSheetDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomRatingBottomSheetDestination f16526a;

    public b(CustomRatingBottomSheetDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f16526a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f16526a.equals(((b) obj2).f16526a);
    }

    public final int hashCode() {
        return this.f16526a.f87352a.hashCode();
    }
}
