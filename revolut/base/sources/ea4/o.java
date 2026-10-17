package ea4;

import ht3.l0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f124138a;

    public o(l0 configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f124138a = configuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f124138a, ((o) obj2).f124138a);
    }

    public final int hashCode() {
        return this.f124138a.hashCode();
    }
}
