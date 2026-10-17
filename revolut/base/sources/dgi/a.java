package dgi;

import com.revolut.feature_travel_hotels_models.property.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f114667a;

    public a(Address address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f114667a = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f114667a, ((a) obj2).f114667a);
    }

    public final int hashCode() {
        return this.f114667a.hashCode();
    }
}
