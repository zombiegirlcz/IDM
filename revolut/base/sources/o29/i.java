package o29;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f221558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f221559b;

    public i(String product, String enabledFeatures) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(enabledFeatures, "enabledFeatures");
        this.f221558a = product;
        this.f221559b = enabledFeatures;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f221558a, iVar.f221558a) && Intrinsics.f(this.f221559b, iVar.f221559b);
    }

    public final int hashCode() {
        return this.f221559b.hashCode() + (this.f221558a.hashCode() * 31);
    }
}
