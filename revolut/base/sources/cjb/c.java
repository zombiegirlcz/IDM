package cjb;

import com.revolut.kompot.common.ParcelableDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParcelableDestination f24632a;

    public c(ParcelableDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f24632a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f24632a.equals(((c) obj2).f24632a);
    }

    public final int hashCode() {
        return this.f24632a.hashCode();
    }
}
