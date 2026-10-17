package uzk;

import kotlin.jvm.internal.Intrinsics;
import y7a.w;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f284683a;

    public b(wi0.b selectedCountry) {
        Intrinsics.checkNotNullParameter(selectedCountry, "selectedCountry");
        this.f284683a = selectedCountry;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f284683a, ((b) obj2).f284683a);
    }

    public final int hashCode() {
        return this.f284683a.f297794a.hashCode();
    }
}
