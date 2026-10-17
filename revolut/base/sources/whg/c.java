package whg;

import aii.r;
import hfg.i0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f297651a;

    public c(i0 selectedSortBy) {
        Intrinsics.checkNotNullParameter(selectedSortBy, "selectedSortBy");
        this.f297651a = selectedSortBy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f297651a == ((c) obj2).f297651a;
    }

    public final int hashCode() {
        return this.f297651a.hashCode();
    }
}
