package vd8;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f287819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f287820c;
    public final String d;
    public final String e;

    public b(String firstName, String lastName, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f287818a = firstName;
        this.f287819b = lastName;
        this.f287820c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f287818a, bVar.f287818a) && Intrinsics.f(this.f287819b, bVar.f287819b) && Intrinsics.f(this.f287820c, bVar.f287820c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f287818a.hashCode() * 31, 31, this.f287819b);
        String str = this.f287820c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
