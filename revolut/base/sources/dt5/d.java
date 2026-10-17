package dt5;

import aii.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f117387a;

    public d(u destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f117387a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f117387a, ((d) obj2).f117387a);
    }

    public final int hashCode() {
        return this.f117387a.hashCode();
    }
}
