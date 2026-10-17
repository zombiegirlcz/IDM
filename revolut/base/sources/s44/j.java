package s44;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f259759a;

    public j(List previousAddresses) {
        Intrinsics.checkNotNullParameter(previousAddresses, "previousAddresses");
        this.f259759a = previousAddresses;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f259759a, ((j) obj2).f259759a);
    }

    public final int hashCode() {
        return this.f259759a.hashCode();
    }
}
