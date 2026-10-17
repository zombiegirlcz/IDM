package kf8;

import com.revolut.feature.address.models.Address;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f183325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f183326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f183327c;
    public final bj0.b d;
    public final Address e;
    public final i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f183328g;

    public g(String firstName, String lastName, LocalDate birthDate, bj0.b gender, Address address, i serviceType, Map map) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        this.f183325a = firstName;
        this.f183326b = lastName;
        this.f183327c = birthDate;
        this.d = gender;
        this.e = address;
        this.f = serviceType;
        this.f183328g = map;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f183325a, gVar.f183325a) && Intrinsics.f(this.f183326b, gVar.f183326b) && Intrinsics.f(this.f183327c, gVar.f183327c) && this.d == gVar.d && Intrinsics.f(this.e, gVar.e) && this.f == gVar.f && Intrinsics.f(this.f183328g, gVar.f183328g);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + com.revolut.data.database.models.openbanking.d.g(this.f183327c, p.a.c(this.f183325a.hashCode() * 31, 31, this.f183326b), 31)) * 31;
        Address address = this.e;
        int iHashCode2 = (this.f.hashCode() + ((iHashCode + (address == null ? 0 : address.hashCode())) * 31)) * 31;
        Map map = this.f183328g;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }
}
