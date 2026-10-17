package po0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f237870b;

    public x(String markerName, b0 repeatCount) {
        Intrinsics.checkNotNullParameter(markerName, "markerName");
        Intrinsics.checkNotNullParameter(repeatCount, "repeatCount");
        this.f237869a = markerName;
        this.f237870b = repeatCount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f237869a, xVar.f237869a) && this.f237870b == xVar.f237870b;
    }

    public final int hashCode() {
        return this.f237870b.hashCode() + (this.f237869a.hashCode() * 31);
    }
}
