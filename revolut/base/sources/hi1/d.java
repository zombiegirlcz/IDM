package hi1;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address.Type f152446a;

    public d(Address.Type addressType) {
        Intrinsics.checkNotNullParameter(addressType, "addressType");
        this.f152446a = addressType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f152446a == ((d) obj2).f152446a;
    }

    public final int hashCode() {
        return this.f152446a.hashCode();
    }
}
