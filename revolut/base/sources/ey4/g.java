package ey4;

import dx4.b2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f130570a;

    public g(b2 configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f130570a = configuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f130570a, ((g) obj2).f130570a);
    }

    public final int hashCode() {
        return this.f130570a.hashCode();
    }
}
