package fqa;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f137232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f137234c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Address f137235g;

    public h(a aVar, String firstName, String lastName, String str, String str2, String str3, Address address) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f137232a = aVar;
        this.f137233b = firstName;
        this.f137234c = lastName;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.f137235g = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f137232a == hVar.f137232a && Intrinsics.f(this.f137233b, hVar.f137233b) && Intrinsics.f(this.f137234c, hVar.f137234c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f137235g, hVar.f137235g);
    }

    public final int hashCode() {
        a aVar = this.f137232a;
        int iC = p.a.c(p.a.c((aVar == null ? 0 : aVar.hashCode()) * 31, 31, this.f137233b), 31, this.f137234c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Address address = this.f137235g;
        return iHashCode3 + (address != null ? address.hashCode() : 0);
    }
}
