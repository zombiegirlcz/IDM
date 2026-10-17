package t2h;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f267564a;

    public b(g parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f267564a = parcel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f267564a, ((b) obj2).f267564a);
    }

    public final int hashCode() {
        return this.f267564a.hashCode();
    }
}
