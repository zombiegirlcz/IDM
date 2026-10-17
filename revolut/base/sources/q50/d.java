package q50;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y50.b f242208a;

    public d(y50.b config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f242208a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f242208a, ((d) obj2).f242208a);
    }

    public final int hashCode() {
        return this.f242208a.hashCode();
    }
}
