package kq8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188344b;

    public f(String id10, String firstName) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        this.f188343a = id10;
        this.f188344b = firstName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f188343a, fVar.f188343a) && Intrinsics.f(this.f188344b, fVar.f188344b);
    }

    public final int hashCode() {
        return this.f188344b.hashCode() + (this.f188343a.hashCode() * 31);
    }
}
