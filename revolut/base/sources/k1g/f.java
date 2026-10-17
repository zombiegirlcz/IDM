package k1g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1g.g f180247a;

    public f(p1g.g bookingsOutput) {
        Intrinsics.checkNotNullParameter(bookingsOutput, "bookingsOutput");
        this.f180247a = bookingsOutput;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f180247a, ((f) obj2).f180247a);
    }

    public final int hashCode() {
        return this.f180247a.hashCode();
    }
}
