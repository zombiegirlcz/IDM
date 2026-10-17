package vd8;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f287814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f287815c;
    public final String d;
    public final String e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f287816g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f287817h;
    public final String i;

    public a(String id10, String firstName, String lastName, String str, String str2, d role, e state, String str3, String str4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f287813a = id10;
        this.f287814b = firstName;
        this.f287815c = lastName;
        this.d = str;
        this.e = str2;
        this.f = role;
        this.f287816g = state;
        this.f287817h = str3;
        this.i = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f287813a, aVar.f287813a) && Intrinsics.f(this.f287814b, aVar.f287814b) && Intrinsics.f(this.f287815c, aVar.f287815c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && this.f == aVar.f && this.f287816g == aVar.f287816g && Intrinsics.f(this.f287817h, aVar.f287817h) && Intrinsics.f(this.i, aVar.i);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f287813a.hashCode() * 31, 31, this.f287814b), 31, this.f287815c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (this.f287816g.hashCode() + ((this.f.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        String str3 = this.f287817h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
