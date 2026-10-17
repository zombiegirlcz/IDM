package d1h;

import com.revolut.kompot.common.ExternalDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalDestination.Browser f110648a;

    public b(ExternalDestination.Browser destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f110648a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f110648a.equals(((b) obj2).f110648a);
    }

    public final int hashCode() {
        return this.f110648a.hashCode();
    }
}
