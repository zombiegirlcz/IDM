package isd;

import amd.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f168185b;

    public b(String firstName, boolean z) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        this.f168184a = firstName;
        this.f168185b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f168184a, bVar.f168184a) && this.f168185b == bVar.f168185b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f168185b) + (this.f168184a.hashCode() * 31);
    }
}
