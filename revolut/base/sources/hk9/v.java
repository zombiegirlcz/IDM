package hk9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f152894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f152895b;

    public v(int i, dj0.d amountToTopup) {
        Intrinsics.checkNotNullParameter(amountToTopup, "amountToTopup");
        this.f152894a = amountToTopup;
        this.f152895b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f152894a, vVar.f152894a) && this.f152895b == vVar.f152895b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f152895b) + (this.f152894a.hashCode() * 31);
    }
}
