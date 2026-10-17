package xfb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f305221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f305222b;

    public n(dj0.d prizeAmount, String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(prizeAmount, "prizeAmount");
        this.f305221a = deeplink;
        this.f305222b = prizeAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f305221a, nVar.f305221a) && Intrinsics.f(this.f305222b, nVar.f305222b);
    }

    public final int hashCode() {
        return this.f305222b.hashCode() + (this.f305221a.hashCode() * 31);
    }
}
