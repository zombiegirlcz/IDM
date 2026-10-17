package lh2;

import com.revolut.kompot.common.ParcelableDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParcelableDestination f195147a;

    public b(ParcelableDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f195147a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f195147a, ((b) obj2).f195147a);
    }

    public final int hashCode() {
        return this.f195147a.hashCode();
    }
}
