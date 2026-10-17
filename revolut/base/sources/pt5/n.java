package pt5;

import com.revolut.feature.exchange.models.ExchangeOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExchangeOrder f239622a;

    public n(ExchangeOrder order) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.f239622a = order;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f239622a, ((n) obj2).f239622a);
    }

    public final int hashCode() {
        return this.f239622a.hashCode();
    }
}
