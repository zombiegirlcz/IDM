package yge;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f313639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f313640b;

    public b(List favouriteDescriptors, Map favouriteAccountsMapToProduct) {
        Intrinsics.checkNotNullParameter(favouriteDescriptors, "favouriteDescriptors");
        Intrinsics.checkNotNullParameter(favouriteAccountsMapToProduct, "favouriteAccountsMapToProduct");
        this.f313639a = favouriteDescriptors;
        this.f313640b = favouriteAccountsMapToProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f313639a, bVar.f313639a) && this.f313640b.equals(bVar.f313640b);
    }

    public final int hashCode() {
        return this.f313640b.hashCode() + (this.f313639a.hashCode() * 31);
    }
}
