package he4;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f151585a;

    public m(Address userAddress) {
        Intrinsics.checkNotNullParameter(userAddress, "userAddress");
        this.f151585a = userAddress;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f151585a, ((m) obj2).f151585a);
    }

    public final int hashCode() {
        return this.f151585a.hashCode();
    }
}
