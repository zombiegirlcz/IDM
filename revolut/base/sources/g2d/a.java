package g2d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements lgd.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0h.c f139957a;

    public a(z0h.c commoditiesDisclaimersData) {
        Intrinsics.checkNotNullParameter(commoditiesDisclaimersData, "commoditiesDisclaimersData");
        this.f139957a = commoditiesDisclaimersData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f139957a, ((a) obj2).f139957a);
    }

    public final int hashCode() {
        return this.f139957a.hashCode();
    }
}
