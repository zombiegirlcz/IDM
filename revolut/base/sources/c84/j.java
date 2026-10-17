package c84;

import ft3.j1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f22092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22093b;

    public j(j1 productType, String facilityId) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f22092a = productType;
        this.f22093b = facilityId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f22092a == jVar.f22092a && Intrinsics.f(this.f22093b, jVar.f22093b);
    }

    public final int hashCode() {
        return this.f22093b.hashCode() + (this.f22092a.hashCode() * 31);
    }
}
