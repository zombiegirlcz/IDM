package tlg;

import cli.j;
import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f272093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final co3.a f272094b;

    public d(co3.a aVar, Address address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f272093a = address;
        this.f272094b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f272093a, dVar.f272093a) && Intrinsics.f(this.f272094b, dVar.f272094b);
    }

    public final int hashCode() {
        int iHashCode = this.f272093a.hashCode() * 31;
        co3.a aVar = this.f272094b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
