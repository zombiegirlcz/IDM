package uni;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements xni.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f281436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f281437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f281438c;

    public d(String otpCode, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(otpCode, "otpCode");
        this.f281436a = otpCode;
        this.f281437b = z;
        this.f281438c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f281436a, dVar.f281436a) && this.f281437b == dVar.f281437b && this.f281438c == dVar.f281438c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f281438c) + j6.a.c(this.f281436a.hashCode() * 31, 31, this.f281437b);
    }

    @Override // xni.a
    public final boolean p0() {
        return this.f281437b;
    }

    @Override // xni.a
    public final String y0() {
        return this.f281436a;
    }
}
