package vt4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f291901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f291902b;

    public d(dj0.d balance, boolean z) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        this.f291901a = balance;
        this.f291902b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f291901a, dVar.f291901a) && this.f291902b == dVar.f291902b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f291902b) + (this.f291901a.hashCode() * 31);
    }
}
