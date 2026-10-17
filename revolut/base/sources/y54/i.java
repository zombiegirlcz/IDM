package y54;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310986a;

    public i(String city) {
        Intrinsics.checkNotNullParameter(city, "city");
        this.f310986a = city;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f310986a, ((i) obj2).f310986a);
    }

    public final int hashCode() {
        return this.f310986a.hashCode();
    }
}
