package pxk;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f240627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f240628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240629c;
    public final LocalDate d;

    public b(String firstName, String lastName, String phone, LocalDate birthDate) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        this.f240627a = firstName;
        this.f240628b = lastName;
        this.f240629c = phone;
        this.d = birthDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f240627a, bVar.f240627a) && Intrinsics.f(this.f240628b, bVar.f240628b) && Intrinsics.f(this.f240629c, bVar.f240629c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f240627a.hashCode() * 31, 31, this.f240628b), 31, this.f240629c);
    }
}
