package hv3;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Address f155784b;

    public a(String equifaxAddressId, Address address) {
        Intrinsics.checkNotNullParameter(equifaxAddressId, "equifaxAddressId");
        Intrinsics.checkNotNullParameter(address, "address");
        this.f155783a = equifaxAddressId;
        this.f155784b = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f155783a, aVar.f155783a) && Intrinsics.f(this.f155784b, aVar.f155784b);
    }

    public final int hashCode() {
        return this.f155784b.hashCode() + (this.f155783a.hashCode() * 31);
    }
}
