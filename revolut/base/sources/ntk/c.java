package ntk;

import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetDetailsDestination f219146a;

    public c(AssetDetailsDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f219146a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f219146a, ((c) obj2).f219146a);
    }

    public final int hashCode() {
        return this.f219146a.hashCode();
    }
}
