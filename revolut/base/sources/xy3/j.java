package xy3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f309579a;

    public j(l configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f309579a = configuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f309579a, ((j) obj2).f309579a);
    }

    public final int hashCode() {
        return this.f309579a.hashCode();
    }
}
