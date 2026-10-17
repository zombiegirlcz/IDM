package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n5 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120693c;

    public n5(String userId, String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f120691a = userId;
        this.f120692b = firstName;
        this.f120693c = lastName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n5)) {
            return false;
        }
        n5 n5Var = (n5) obj2;
        return Intrinsics.f(this.f120691a, n5Var.f120691a) && Intrinsics.f(this.f120692b, n5Var.f120692b) && Intrinsics.f(this.f120693c, n5Var.f120693c);
    }

    public final int hashCode() {
        return this.f120693c.hashCode() + p.a.c(this.f120691a.hashCode() * 31, 31, this.f120692b);
    }
}
