package fy4;

import dx4.z2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z2 f138908a;

    public t(z2 configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f138908a = configuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f138908a, ((t) obj2).f138908a);
    }

    public final int hashCode() {
        return this.f138908a.hashCode();
    }
}
