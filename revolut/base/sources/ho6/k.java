package ho6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final se6.i f154233a;

    public k(se6.i countryDepartment) {
        Intrinsics.checkNotNullParameter(countryDepartment, "countryDepartment");
        this.f154233a = countryDepartment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f154233a, ((k) obj2).f154233a);
    }

    public final int hashCode() {
        return this.f154233a.hashCode();
    }
}
