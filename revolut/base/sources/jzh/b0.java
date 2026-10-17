package jzh;

import com.revolut.feature.exchange.models.ExchangeOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExchangeOrder f179815a;

    public b0(ExchangeOrder order) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.f179815a = order;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && Intrinsics.f(this.f179815a, ((b0) obj2).f179815a);
    }

    public final int hashCode() {
        return this.f179815a.hashCode();
    }
}
