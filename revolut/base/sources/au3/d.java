package au3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9473c;
    public final dj0.d d;
    public final Integer e;
    public final c f;

    public d(String phoneNumber, String firstName, String lastName, dj0.d dVar, Integer num, c content) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f9471a = phoneNumber;
        this.f9472b = firstName;
        this.f9473c = lastName;
        this.d = dVar;
        this.e = num;
        this.f = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f9471a, dVar.f9471a) && Intrinsics.f(this.f9472b, dVar.f9472b) && Intrinsics.f(this.f9473c, dVar.f9473c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f9471a.hashCode() * 31, 31, this.f9472b), 31, this.f9473c);
        dj0.d dVar = this.d;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Integer num = this.e;
        return this.f.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }
}
