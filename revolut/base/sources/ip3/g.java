package ip3;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f167631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f167632b;

    public g(Set allActiveFilters, Set selectedFilters) {
        Intrinsics.checkNotNullParameter(allActiveFilters, "allActiveFilters");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        this.f167631a = allActiveFilters;
        this.f167632b = selectedFilters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f167631a, gVar.f167631a) && Intrinsics.f(this.f167632b, gVar.f167632b);
    }

    public final int hashCode() {
        return this.f167632b.hashCode() + (this.f167631a.hashCode() * 31);
    }
}
