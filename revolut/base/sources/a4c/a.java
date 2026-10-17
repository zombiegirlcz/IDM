package a4c;

import com.revolut.feature.address.models.Address;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f1251a;

    public a(Address address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f1251a = address;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f1251a, ((a) obj2).f1251a);
    }

    public final int hashCode() {
        return this.f1251a.hashCode();
    }
}
