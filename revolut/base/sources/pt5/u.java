package pt5;

import com.revolut.feature.exchange.models.ExchangeOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExchangeOrder.Active f239625a;

    public u(ExchangeOrder.Active order) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.f239625a = order;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f239625a, ((u) obj2).f239625a);
    }

    public final int hashCode() {
        return this.f239625a.hashCode();
    }
}
