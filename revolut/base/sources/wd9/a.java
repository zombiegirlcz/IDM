package wd9;

import com.revolut.feature.exchange.models.ExchangeOrder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExchangeOrder.Active f296466a;

    public a(ExchangeOrder.Active order) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.f296466a = order;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f296466a, ((a) obj2).f296466a);
    }

    public final int hashCode() {
        return this.f296466a.hashCode();
    }
}
