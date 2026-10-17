package cu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f108803b;

    public a(String postcode, e addressType) {
        Intrinsics.checkNotNullParameter(postcode, "postcode");
        Intrinsics.checkNotNullParameter("1", "buildingNumber");
        Intrinsics.checkNotNullParameter(addressType, "addressType");
        this.f108802a = postcode;
        this.f108803b = addressType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f108802a, aVar.f108802a) && this.f108803b == aVar.f108803b;
    }

    public final int hashCode() {
        return this.f108803b.hashCode() + (((this.f108802a.hashCode() * 31) + 49) * 31);
    }
}
