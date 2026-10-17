package er9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f128556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f128557b;

    public b(String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f128556a = firstName;
        this.f128557b = lastName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f128556a, bVar.f128556a) && Intrinsics.f(this.f128557b, bVar.f128557b);
    }

    public final int hashCode() {
        return this.f128557b.hashCode() + (this.f128556a.hashCode() * 31);
    }
}
