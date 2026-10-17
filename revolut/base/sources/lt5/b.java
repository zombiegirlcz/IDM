package lt5;

import com.revolut.kompot.common.ExternalDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExternalDestination.ByIntent f199797a;

    public b(ExternalDestination.ByIntent destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f199797a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f199797a.equals(((b) obj2).f199797a);
    }

    public final int hashCode() {
        return this.f199797a.hashCode();
    }
}
