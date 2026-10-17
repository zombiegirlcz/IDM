package e54;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dx4.y f122740a;

    public b(dx4.y config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f122740a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f122740a, ((b) obj2).f122740a);
    }

    public final int hashCode() {
        return this.f122740a.hashCode();
    }
}
