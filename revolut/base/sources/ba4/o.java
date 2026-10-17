package ba4;

import ht3.l0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f13906a;

    public o(l0 configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f13906a = configuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f13906a, ((o) obj2).f13906a);
    }

    public final int hashCode() {
        return this.f13906a.hashCode();
    }
}
