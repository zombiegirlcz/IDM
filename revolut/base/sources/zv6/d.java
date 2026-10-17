package zv6;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f325576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f325577c;
    public final String d;
    public final String e;
    public final Address f;

    public d(String str, String name, String email, String str2, String str3, Address address) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(email, "email");
        this.f325575a = str;
        this.f325576b = name;
        this.f325577c = email;
        this.d = str2;
        this.e = str3;
        this.f = address;
    }

    public static d a(d dVar, String str, String email, String str2, String str3, Address address, int i) {
        String name = str;
        String str4 = dVar.f325575a;
        if ((i & 2) != 0) {
            name = dVar.f325576b;
        }
        if ((i & 4) != 0) {
            email = dVar.f325577c;
        }
        if ((i & 8) != 0) {
            str2 = dVar.d;
        }
        if ((i & 16) != 0) {
            str3 = dVar.e;
        }
        if ((i & 32) != 0) {
            address = dVar.f;
        }
        Address address2 = address;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(email, "email");
        String str5 = str3;
        String str6 = str2;
        return new d(str4, name, email, str6, str5, address2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f325575a, dVar.f325575a) && Intrinsics.f(this.f325576b, dVar.f325576b) && Intrinsics.f(this.f325577c, dVar.f325577c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        String str = this.f325575a;
        int iC = p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f325576b), 31, this.f325577c);
        String str2 = this.d;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        Address address = this.f;
        return iHashCode2 + (address != null ? address.hashCode() : 0);
    }
}
