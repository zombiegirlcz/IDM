package kpb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f188214a;

    public d(Data productContainer) {
        Intrinsics.checkNotNullParameter(productContainer, "productContainer");
        this.f188214a = productContainer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f188214a, ((d) obj2).f188214a);
    }

    public final int hashCode() {
        return this.f188214a.hashCode();
    }
}
