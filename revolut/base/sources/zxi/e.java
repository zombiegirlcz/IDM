package zxi;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f326340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f326341b;

    public e(List filters, Map selectedFilters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        this.f326340a = filters;
        this.f326341b = selectedFilters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f326340a, eVar.f326340a) && Intrinsics.f(this.f326341b, eVar.f326341b);
    }

    public final int hashCode() {
        return this.f326341b.hashCode() + (this.f326340a.hashCode() * 31);
    }
}
