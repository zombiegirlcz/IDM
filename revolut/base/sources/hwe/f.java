package hwe;

import com.revolut.kompot.common.ParcelableDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParcelableDestination f156138a;

    public f(ParcelableDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f156138a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f156138a.equals(((f) obj2).f156138a);
    }

    public final int hashCode() {
        return this.f156138a.hashCode();
    }
}
