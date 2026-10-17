package djb;

import com.revolut.kompot.common.ParcelableDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aii.u f115275a;

    public b(ParcelableDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f115275a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f115275a, ((b) obj2).f115275a);
    }

    public final int hashCode() {
        return this.f115275a.hashCode();
    }
}
