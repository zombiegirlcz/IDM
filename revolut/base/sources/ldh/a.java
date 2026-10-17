package ldh;

import com.revolut.kompot.common.ParcelableDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParcelableDestination f194105a;

    public a(ParcelableDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f194105a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f194105a.equals(((a) obj2).f194105a);
    }

    public final int hashCode() {
        return this.f194105a.hashCode();
    }
}
