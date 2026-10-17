package f7d;

import aii.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f132594a;

    public c(u destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f132594a = destination;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f132594a, ((c) obj2).f132594a);
    }

    public final int hashCode() {
        return this.f132594a.hashCode();
    }
}
