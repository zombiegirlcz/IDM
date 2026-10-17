package xo9;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f307746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f307747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f307748c;
    public final Address d;

    public j(String name, String str, String bankCountry, Address address) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bankCountry, "bankCountry");
        Intrinsics.checkNotNullParameter(address, "address");
        this.f307746a = name;
        this.f307747b = str;
        this.f307748c = bankCountry;
        this.d = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f307746a, jVar.f307746a) && Intrinsics.f(this.f307747b, jVar.f307747b) && Intrinsics.f(this.f307748c, jVar.f307748c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f307746a.hashCode() * 31;
        String str = this.f307747b;
        return this.d.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f307748c);
    }
}
