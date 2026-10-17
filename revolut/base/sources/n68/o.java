package n68;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f212729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f212730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f212731c;
    public final bj0.b d;
    public final boolean e;

    public o(String firstName, String lastName, LocalDate birthDate, bj0.b gender, boolean z) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        Intrinsics.checkNotNullParameter(gender, "gender");
        this.f212729a = firstName;
        this.f212730b = lastName;
        this.f212731c = birthDate;
        this.d = gender;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f212729a, oVar.f212729a) && Intrinsics.f(this.f212730b, oVar.f212730b) && Intrinsics.f(this.f212731c, oVar.f212731c) && this.d == oVar.d && this.e == oVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + wp5.y.a(p.a.c(this.f212729a.hashCode() * 31, 31, this.f212730b), 31, this.f212731c)) * 31);
    }
}
