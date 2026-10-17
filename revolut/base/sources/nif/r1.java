package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f216021b;

    public r1(String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f216020a = firstName;
        this.f216021b = lastName;
    }

    public final String a() {
        return this.f216020a;
    }

    public final String b() {
        return this.f216021b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj2;
        return Intrinsics.f(this.f216020a, r1Var.f216020a) && Intrinsics.f(this.f216021b, r1Var.f216021b);
    }

    public final int hashCode() {
        return this.f216021b.hashCode() + (this.f216020a.hashCode() * 31);
    }
}
