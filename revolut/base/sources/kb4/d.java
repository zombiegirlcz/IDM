package kb4;

import aii.r;
import kotlin.jvm.internal.Intrinsics;
import xu3.x;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f182518a;

    public d(x configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f182518a = configuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f182518a, ((d) obj2).f182518a);
    }

    public final int hashCode() {
        return this.f182518a.hashCode();
    }
}
