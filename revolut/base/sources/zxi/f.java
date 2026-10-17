package zxi;

import aii.r;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f326342a;

    public f(Map selectedFilters) {
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        this.f326342a = selectedFilters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f326342a, ((f) obj2).f326342a);
    }

    public final int hashCode() {
        return this.f326342a.hashCode();
    }
}
