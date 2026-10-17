package j49;

import aii.u;
import com.revolut.kompot.common.ParcelableDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f171321a;

    public b(ParcelableDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f171321a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f171321a, ((b) obj2).f171321a);
    }

    public final int hashCode() {
        return this.f171321a.hashCode();
    }
}
