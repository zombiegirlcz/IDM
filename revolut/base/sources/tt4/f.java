package tt4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f274214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f274215b;

    public f(int i, dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f274214a = amount;
        this.f274215b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f274214a, fVar.f274214a) && this.f274215b == fVar.f274215b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f274215b) + (this.f274214a.hashCode() * 31);
    }
}
