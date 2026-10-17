package zqe;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f324471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f324472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f324473c;
    public final String d;
    public final no3.b e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f324474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f324475h;
    public final String i;

    public /* synthetic */ f(int i, String str, String str2, String str3, String str4, no3.b bVar, String str5, String str6, String str7, String str8) {
        if (511 != (i & 511)) {
            j1.f(d.f324470a.getDescriptor(), i, 511);
            throw null;
        }
        this.f324471a = str;
        this.f324472b = str2;
        this.f324473c = str3;
        this.d = str4;
        this.e = bVar;
        this.f = str5;
        this.f324474g = str6;
        this.f324475h = str7;
        this.i = str8;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f324471a, fVar.f324471a) && Intrinsics.f(this.f324472b, fVar.f324472b) && Intrinsics.f(this.f324473c, fVar.f324473c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f324474g, fVar.f324474g) && Intrinsics.f(this.f324475h, fVar.f324475h) && Intrinsics.f(this.i, fVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f324471a.hashCode() * 31, 31, this.f324472b), 31, this.f324473c), 31, this.d)) * 31;
        String str = this.f;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f324474g);
        String str2 = this.f324475h;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public f(String registeredIdentityId, String firstName, String lastName, String dateOfBirth, no3.b address, String str, String code, String str2, String str3) {
        Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f324471a = registeredIdentityId;
        this.f324472b = firstName;
        this.f324473c = lastName;
        this.d = dateOfBirth;
        this.e = address;
        this.f = str;
        this.f324474g = code;
        this.f324475h = str2;
        this.i = str3;
    }
}
