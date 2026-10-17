package jzh;

import com.revolut.feature.exchange.models.ExchangeOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExchangeOrder f179816a;

    public c0(ExchangeOrder order) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.f179816a = order;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c0) && Intrinsics.f(this.f179816a, ((c0) obj2).f179816a);
    }

    public final int hashCode() {
        return this.f179816a.hashCode();
    }
}
