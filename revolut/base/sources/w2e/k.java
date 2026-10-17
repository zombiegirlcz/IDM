package w2e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294039b;

    public k(String filterId, String valueId) {
        Intrinsics.checkNotNullParameter(filterId, "filterId");
        Intrinsics.checkNotNullParameter(valueId, "valueId");
        this.f294038a = filterId;
        this.f294039b = valueId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f294038a, kVar.f294038a) && Intrinsics.f(this.f294039b, kVar.f294039b);
    }

    public final int hashCode() {
        return this.f294039b.hashCode() + (this.f294038a.hashCode() * 31);
    }
}
