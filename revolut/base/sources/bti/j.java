package bti;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18611b;

    public j(String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f18610a = firstName;
        this.f18611b = lastName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f18610a, jVar.f18610a) && Intrinsics.f(this.f18611b, jVar.f18611b);
    }

    public final int hashCode() {
        return this.f18611b.hashCode() + (this.f18610a.hashCode() * 31);
    }
}
