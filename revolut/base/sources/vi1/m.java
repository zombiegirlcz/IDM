package vi1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289509a;

    public m(String cityName) {
        Intrinsics.checkNotNullParameter(cityName, "cityName");
        this.f289509a = cityName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f289509a, ((m) obj2).f289509a);
    }

    public final int hashCode() {
        return this.f289509a.hashCode();
    }
}
