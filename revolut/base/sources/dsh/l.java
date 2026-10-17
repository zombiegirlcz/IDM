package dsh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f117329a;

    public l(e config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f117329a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f117329a, ((l) obj2).f117329a);
    }

    public final int hashCode() {
        return this.f117329a.f117319a.hashCode();
    }
}
