package uhf;

import kotlin.jvm.internal.Intrinsics;
import rp0.y;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f280225a;

    public g(y model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f280225a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f280225a, ((g) obj2).f280225a);
    }

    public final int hashCode() {
        return this.f280225a.hashCode();
    }
}
