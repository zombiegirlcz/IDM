package c12;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hrf.f f20359b;

    public y(hrf.f transferDirection, String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        this.f20358a = query;
        this.f20359b = transferDirection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f20358a, yVar.f20358a) && this.f20359b == yVar.f20359b;
    }

    public final int hashCode() {
        return this.f20359b.hashCode() + (this.f20358a.hashCode() * 31);
    }
}
