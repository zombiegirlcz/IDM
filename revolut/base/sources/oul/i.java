package oul;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f229903a;

    public i(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f229903a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f229903a, ((i) obj2).f229903a);
    }

    public final int hashCode() {
        return this.f229903a.hashCode();
    }
}
