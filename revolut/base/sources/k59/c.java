package k59;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f181470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f181471b;

    public c(double d, b orderLimits) {
        Intrinsics.checkNotNullParameter(orderLimits, "orderLimits");
        this.f181470a = d;
        this.f181471b = orderLimits;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Double.compare(this.f181470a, cVar.f181470a) == 0 && Intrinsics.f(this.f181471b, cVar.f181471b);
    }

    public final int hashCode() {
        return this.f181471b.hashCode() + (Double.hashCode(this.f181470a) * 31);
    }
}
