package x15;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cl4.a f302277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cl4.e f302278b;

    public j(cl4.a details, cl4.e discoverDetails) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(discoverDetails, "discoverDetails");
        this.f302277a = details;
        this.f302278b = discoverDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f302277a, jVar.f302277a) && Intrinsics.f(this.f302278b, jVar.f302278b);
    }

    public final int hashCode() {
        return this.f302278b.hashCode() + (this.f302277a.hashCode() * 31);
    }
}
