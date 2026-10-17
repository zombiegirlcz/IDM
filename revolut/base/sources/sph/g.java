package sph;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f264953a;

    public g(List loadingFilters) {
        Intrinsics.checkNotNullParameter(loadingFilters, "loadingFilters");
        this.f264953a = loadingFilters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f264953a, ((g) obj2).f264953a);
    }

    public final int hashCode() {
        return this.f264953a.hashCode();
    }
}
