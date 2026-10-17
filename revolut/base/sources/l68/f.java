package l68;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192365b;

    public f(String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f192364a = firstName;
        this.f192365b = lastName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f192364a, fVar.f192364a) && Intrinsics.f(this.f192365b, fVar.f192365b);
    }

    public final int hashCode() {
        return this.f192365b.hashCode() + (this.f192364a.hashCode() * 31);
    }
}
