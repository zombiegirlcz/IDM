package vqk;

import aii.e;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetDetailsDestination f291427a;

    public a(AssetDetailsDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f291427a = destination;
    }

    public final AssetDetailsDestination b() {
        return this.f291427a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f291427a, ((a) obj2).f291427a);
    }

    public final int hashCode() {
        return this.f291427a.hashCode();
    }
}
