package dw5;

import aii.r;
import com.revolut.feature.cryptocommodity_invest.models.SortingType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SortingType f120335a;

    public b(SortingType selectedSortingType) {
        Intrinsics.checkNotNullParameter(selectedSortingType, "selectedSortingType");
        this.f120335a = selectedSortingType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f120335a, ((b) obj2).f120335a);
    }

    public final int hashCode() {
        return this.f120335a.hashCode();
    }
}
