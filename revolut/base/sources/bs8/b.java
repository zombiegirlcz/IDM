package bs8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18081c;

    public b(String id10, String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f18079a = id10;
        this.f18080b = firstName;
        this.f18081c = lastName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f18079a, bVar.f18079a) && Intrinsics.f(this.f18080b, bVar.f18080b) && Intrinsics.f(this.f18081c, bVar.f18081c);
    }

    public final int hashCode() {
        return this.f18081c.hashCode() + p.a.c(this.f18079a.hashCode() * 31, 31, this.f18080b);
    }
}
