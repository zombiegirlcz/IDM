package cek;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23488c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final so3.c f23489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f23490h;

    public b(String id10, String firstName, String lastName, String displayName, String dateOfBirth, String str, so3.c cVar, float f) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        this.f23486a = id10;
        this.f23487b = firstName;
        this.f23488c = lastName;
        this.d = displayName;
        this.e = dateOfBirth;
        this.f = str;
        this.f23489g = cVar;
        this.f23490h = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f23486a, bVar.f23486a) && Intrinsics.f(this.f23487b, bVar.f23487b) && Intrinsics.f(this.f23488c, bVar.f23488c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f23489g, bVar.f23489g) && Float.compare(this.f23490h, bVar.f23490h) == 0;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(this.f23486a.hashCode() * 31, 31, this.f23487b), 31, this.f23488c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        so3.c cVar = this.f23489g;
        return Float.hashCode(this.f23490h) + ((iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31);
    }
}
