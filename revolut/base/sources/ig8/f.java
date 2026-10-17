package ig8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f161088c;

    public f(String id10, String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f161086a = id10;
        this.f161087b = firstName;
        this.f161088c = lastName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f161086a, fVar.f161086a) && Intrinsics.f(this.f161087b, fVar.f161087b) && Intrinsics.f(this.f161088c, fVar.f161088c);
    }

    public final int hashCode() {
        return this.f161088c.hashCode() + p.a.c(this.f161086a.hashCode() * 31, 31, this.f161087b);
    }
}
