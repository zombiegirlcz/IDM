package ymh;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f314997a;

    public c(Set availablePrivateBankProducts) {
        Intrinsics.checkNotNullParameter(availablePrivateBankProducts, "availablePrivateBankProducts");
        this.f314997a = availablePrivateBankProducts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f314997a, ((c) obj2).f314997a);
    }

    public final int hashCode() {
        return this.f314997a.hashCode();
    }
}
