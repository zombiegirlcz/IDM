package s2h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259346a;

    public b(String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        this.f259346a = assetName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f259346a, ((b) obj2).f259346a);
    }

    public final int hashCode() {
        return this.f259346a.hashCode();
    }
}
