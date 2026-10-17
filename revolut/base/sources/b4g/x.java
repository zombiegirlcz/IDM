package b4g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12368b;

    public x(String itineraryId, String searchSessionId) {
        Intrinsics.checkNotNullParameter(itineraryId, "itineraryId");
        Intrinsics.checkNotNullParameter(searchSessionId, "searchSessionId");
        this.f12367a = itineraryId;
        this.f12368b = searchSessionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f12367a, xVar.f12367a) && Intrinsics.f(this.f12368b, xVar.f12368b);
    }

    public final int hashCode() {
        return this.f12368b.hashCode() + (this.f12367a.hashCode() * 31);
    }
}
