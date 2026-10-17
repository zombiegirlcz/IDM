package s44;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f259758a;

    public i(List previousAddresses) {
        Intrinsics.checkNotNullParameter(previousAddresses, "previousAddresses");
        this.f259758a = previousAddresses;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f259758a, ((i) obj2).f259758a);
    }

    public final int hashCode() {
        return this.f259758a.hashCode();
    }
}
