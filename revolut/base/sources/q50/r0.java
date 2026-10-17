package q50;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r0 implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y50.b f242272a;

    public r0(y50.b config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f242272a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r0) && Intrinsics.f(this.f242272a, ((r0) obj2).f242272a);
    }

    public final int hashCode() {
        return this.f242272a.hashCode();
    }
}
