package a9g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2558b;

    public p0(String checkInFrom, String checkOutTo) {
        Intrinsics.checkNotNullParameter(checkInFrom, "checkInFrom");
        Intrinsics.checkNotNullParameter(checkOutTo, "checkOutTo");
        this.f2557a = checkInFrom;
        this.f2558b = checkOutTo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f2557a, p0Var.f2557a) && Intrinsics.f(this.f2558b, p0Var.f2558b);
    }

    public final int hashCode() {
        return this.f2558b.hashCode() + (this.f2557a.hashCode() * 31);
    }
}
