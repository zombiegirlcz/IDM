package he4;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f151587a;

    public o(Address userAddress) {
        Intrinsics.checkNotNullParameter(userAddress, "userAddress");
        this.f151587a = userAddress;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f151587a, ((o) obj2).f151587a);
    }

    public final int hashCode() {
        return this.f151587a.hashCode();
    }
}
