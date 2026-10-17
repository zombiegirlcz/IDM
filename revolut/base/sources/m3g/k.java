package m3g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f202539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f202540b;

    public k(String destinationId, String str) {
        Intrinsics.checkNotNullParameter(destinationId, "destinationId");
        this.f202539a = destinationId;
        this.f202540b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f202539a, kVar.f202539a) && Intrinsics.f(this.f202540b, kVar.f202540b);
    }

    public final int hashCode() {
        int iHashCode = this.f202539a.hashCode() * 31;
        String str = this.f202540b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
