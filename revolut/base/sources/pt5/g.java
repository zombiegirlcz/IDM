package pt5;

import com.revolut.feature.exchange.models.ExchangeOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExchangeOrder f239617a;

    public g(ExchangeOrder order) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.f239617a = order;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f239617a, ((g) obj2).f239617a);
    }

    public final int hashCode() {
        return this.f239617a.hashCode();
    }
}
