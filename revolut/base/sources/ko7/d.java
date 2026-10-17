package ko7;

import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f186252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f186253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f186254c;
    public final Address d;

    public d(Data address, Data location, boolean z, Address address2) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f186252a = address;
        this.f186253b = location;
        this.f186254c = z;
        this.d = address2;
    }

    public static d a(d dVar, Data address, Data location, Address address2, int i) {
        if ((i & 1) != 0) {
            address = dVar.f186252a;
        }
        if ((i & 2) != 0) {
            location = dVar.f186253b;
        }
        boolean z = dVar.f186254c;
        if ((i & 8) != 0) {
            address2 = dVar.d;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(location, "location");
        return new d(address, location, z, address2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f186252a, dVar.f186252a) && Intrinsics.f(this.f186253b, dVar.f186253b) && this.f186254c == dVar.f186254c && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(kii.e.c(this.f186253b, this.f186252a.hashCode() * 31, 31), 31, this.f186254c);
        Address address = this.d;
        return iC + (address == null ? 0 : address.hashCode());
    }
}
