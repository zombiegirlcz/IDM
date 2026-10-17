package ti1;

import aii.r;
import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f271399a;

    public c(Address selectedAddress) {
        Intrinsics.checkNotNullParameter(selectedAddress, "selectedAddress");
        this.f271399a = selectedAddress;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f271399a, ((c) obj2).f271399a);
    }

    public final int hashCode() {
        return this.f271399a.hashCode();
    }
}
