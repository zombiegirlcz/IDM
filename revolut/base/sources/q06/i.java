package q06;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f241171a;

    public i(c configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f241171a = configuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f241171a, ((i) obj2).f241171a);
    }

    public final int hashCode() {
        return this.f241171a.hashCode();
    }
}
