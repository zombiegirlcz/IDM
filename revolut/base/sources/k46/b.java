package k46;

import aii.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f180837a;

    public b(u destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f180837a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f180837a, ((b) obj2).f180837a);
    }

    public final int hashCode() {
        return this.f180837a.hashCode();
    }
}
