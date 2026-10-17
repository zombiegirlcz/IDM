package tr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f273748b;

    public a(String origin, String refValue) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(refValue, "refValue");
        this.f273747a = origin;
        this.f273748b = refValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f273747a, aVar.f273747a) && Intrinsics.f(this.f273748b, aVar.f273748b);
    }

    public final int hashCode() {
        return this.f273748b.hashCode() + (this.f273747a.hashCode() * 31);
    }
}
