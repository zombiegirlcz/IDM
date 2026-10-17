package chh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24234b;

    public d(String fullName, String phoneNumber) {
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.f24233a = fullName;
        this.f24234b = phoneNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f24233a, dVar.f24233a) && Intrinsics.f(this.f24234b, dVar.f24234b);
    }

    public final int hashCode() {
        return this.f24234b.hashCode() + (this.f24233a.hashCode() * 31);
    }
}
