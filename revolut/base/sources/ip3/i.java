package ip3;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f167634a;

    public i(Set selectedFilters) {
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        this.f167634a = selectedFilters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f167634a, ((i) obj2).f167634a);
    }

    public final int hashCode() {
        return this.f167634a.hashCode();
    }
}
