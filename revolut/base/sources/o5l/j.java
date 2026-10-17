package o5l;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f222466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f222467b;

    public j(dj0.d price, dj0.d originalPrice) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        this.f222466a = price;
        this.f222467b = originalPrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f222466a, jVar.f222466a) && Intrinsics.f(this.f222467b, jVar.f222467b);
    }

    public final int hashCode() {
        return this.f222467b.hashCode() + (this.f222466a.hashCode() * 31);
    }
}
