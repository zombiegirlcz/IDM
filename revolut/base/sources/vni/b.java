package vni;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements xni.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f290812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f290813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f290814c;

    public b(String otpCode, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(otpCode, "otpCode");
        this.f290812a = otpCode;
        this.f290813b = z;
        this.f290814c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f290812a, bVar.f290812a) && this.f290813b == bVar.f290813b && this.f290814c == bVar.f290814c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f290814c) + j6.a.c(this.f290812a.hashCode() * 31, 31, this.f290813b);
    }

    @Override // xni.a
    public final boolean p0() {
        return this.f290813b;
    }

    @Override // xni.a
    public final String y0() {
        return this.f290812a;
    }
}
