package u68;

import com.revolut.kompot.common.ParcelableDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParcelableDestination f277506a;

    public f(ParcelableDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f277506a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f277506a, ((f) obj2).f277506a);
    }

    public final int hashCode() {
        return this.f277506a.hashCode();
    }
}
