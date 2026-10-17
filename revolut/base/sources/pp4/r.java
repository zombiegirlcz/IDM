package pp4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f238268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f238269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f238270c;

    public r(String id10, String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f238268a = id10;
        this.f238269b = firstName;
        this.f238270c = lastName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f238268a, rVar.f238268a) && Intrinsics.f(this.f238269b, rVar.f238269b) && Intrinsics.f(this.f238270c, rVar.f238270c);
    }

    public final int hashCode() {
        return this.f238270c.hashCode() + p.a.c(this.f238268a.hashCode() * 31, 31, this.f238269b);
    }
}
