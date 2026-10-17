package k5k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class v implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f181554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f181555b;

    public v(double d, dj0.d interest) {
        Intrinsics.checkNotNullParameter(interest, "interest");
        this.f181554a = d;
        this.f181555b = interest;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Double.compare(this.f181554a, vVar.f181554a) == 0 && Intrinsics.f(this.f181555b, vVar.f181555b);
    }

    public final int hashCode() {
        return this.f181555b.hashCode() + (Double.hashCode(this.f181554a) * 31);
    }
}
