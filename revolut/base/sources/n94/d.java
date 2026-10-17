package n94;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final my3.f f213565a;

    public d(my3.f config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f213565a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f213565a, ((d) obj2).f213565a);
    }

    public final int hashCode() {
        return this.f213565a.hashCode();
    }
}
