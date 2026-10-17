package bvb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f18987a;

    public h(dj0.d packagePrice) {
        Intrinsics.checkNotNullParameter(packagePrice, "packagePrice");
        this.f18987a = packagePrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f18987a, ((h) obj2).f18987a);
    }

    public final int hashCode() {
        return this.f18987a.hashCode();
    }
}
