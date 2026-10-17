package z63;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f319678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f319679b;

    public l(dj0.d amountToTopup, boolean z) {
        Intrinsics.checkNotNullParameter(amountToTopup, "amountToTopup");
        this.f319678a = amountToTopup;
        this.f319679b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f319678a, lVar.f319678a) && this.f319679b == lVar.f319679b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f319679b) + (this.f319678a.hashCode() * 31);
    }
}
