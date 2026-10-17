package fqa;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f137224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f137225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Address f137226c;

    public d(Address address, String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f137224a = firstName;
        this.f137225b = lastName;
        this.f137226c = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f137224a, dVar.f137224a) && Intrinsics.f(this.f137225b, dVar.f137225b) && Intrinsics.f(this.f137226c, dVar.f137226c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f137224a.hashCode() * 31, 961, this.f137225b);
        Address address = this.f137226c;
        return iC + (address == null ? 0 : address.hashCode());
    }
}
