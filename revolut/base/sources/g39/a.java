package g39;

import aii.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f140240a;

    public a(u destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f140240a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f140240a, ((a) obj2).f140240a);
    }

    public final int hashCode() {
        return this.f140240a.hashCode();
    }
}
