package sci;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f261752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yci.a f261753b;

    public h(dj0.d amount, yci.a frequency) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        this.f261752a = amount;
        this.f261753b = frequency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f261752a, hVar.f261752a) && this.f261753b == hVar.f261753b;
    }

    public final int hashCode() {
        return this.f261753b.hashCode() + (this.f261752a.hashCode() * 31);
    }
}
