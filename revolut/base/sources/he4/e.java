package he4;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f151577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final co3.a f151578b;

    public e(co3.a userAddressLocation, Address userAddress) {
        Intrinsics.checkNotNullParameter(userAddress, "userAddress");
        Intrinsics.checkNotNullParameter(userAddressLocation, "userAddressLocation");
        this.f151577a = userAddress;
        this.f151578b = userAddressLocation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f151577a, eVar.f151577a) && Intrinsics.f(this.f151578b, eVar.f151578b);
    }

    public final int hashCode() {
        return this.f151578b.hashCode() + (this.f151577a.hashCode() * 31);
    }
}
