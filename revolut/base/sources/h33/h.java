package h33;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f149025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f149026c;

    public h(String firstName, String lastName, String phone) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f149024a = firstName;
        this.f149025b = lastName;
        this.f149026c = phone;
    }

    public static h a(h hVar, String firstName, String lastName, String phone, int i) {
        if ((i & 1) != 0) {
            firstName = hVar.f149024a;
        }
        if ((i & 2) != 0) {
            lastName = hVar.f149025b;
        }
        if ((i & 4) != 0) {
            phone = hVar.f149026c;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(phone, "phone");
        return new h(firstName, lastName, phone);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f149024a, hVar.f149024a) && Intrinsics.f(this.f149025b, hVar.f149025b) && Intrinsics.f(this.f149026c, hVar.f149026c);
    }

    public final int hashCode() {
        return this.f149026c.hashCode() + p.a.c(this.f149024a.hashCode() * 31, 31, this.f149025b);
    }
}
