package j6i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f171791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f171792b;

    public q(dj0.d topUpLimit, String productName) {
        Intrinsics.checkNotNullParameter(topUpLimit, "topUpLimit");
        Intrinsics.checkNotNullParameter(productName, "productName");
        this.f171791a = topUpLimit;
        this.f171792b = productName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f171791a, qVar.f171791a) && Intrinsics.f(this.f171792b, qVar.f171792b);
    }

    public final int hashCode() {
        return this.f171792b.hashCode() + (this.f171791a.hashCode() * 31);
    }
}
