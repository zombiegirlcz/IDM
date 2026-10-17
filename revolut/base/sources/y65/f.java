package y65;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f311159a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof f) {
            return Intrinsics.f(this.f311159a, ((f) obj2).f311159a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f311159a.hashCode();
    }

    public final String toString() {
        return "PayNowParcel(amount=" + this.f311159a + ")";
    }
}
