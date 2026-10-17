package l7j;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExchangeOrderDraft f192670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f192671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f192672c;
    public final od0.i d;

    public g(ExchangeOrderDraft exchangeOrderDraft, Data orderQuote, Data planLimits, od0.i upgradeEntryPoint) {
        Intrinsics.checkNotNullParameter(exchangeOrderDraft, "exchangeOrderDraft");
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(planLimits, "planLimits");
        Intrinsics.checkNotNullParameter(upgradeEntryPoint, "upgradeEntryPoint");
        this.f192670a = exchangeOrderDraft;
        this.f192671b = orderQuote;
        this.f192672c = planLimits;
        this.d = upgradeEntryPoint;
    }

    public static g a(g gVar, ExchangeOrderDraft exchangeOrderDraft, Data orderQuote, Data planLimits, od0.i upgradeEntryPoint, int i) {
        if ((i & 1) != 0) {
            exchangeOrderDraft = gVar.f192670a;
        }
        if ((i & 2) != 0) {
            orderQuote = gVar.f192671b;
        }
        if ((i & 4) != 0) {
            planLimits = gVar.f192672c;
        }
        if ((i & 8) != 0) {
            upgradeEntryPoint = gVar.d;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(exchangeOrderDraft, "exchangeOrderDraft");
        Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
        Intrinsics.checkNotNullParameter(planLimits, "planLimits");
        Intrinsics.checkNotNullParameter(upgradeEntryPoint, "upgradeEntryPoint");
        return new g(exchangeOrderDraft, orderQuote, planLimits, upgradeEntryPoint);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f192670a, gVar.f192670a) && Intrinsics.f(this.f192671b, gVar.f192671b) && Intrinsics.f(this.f192672c, gVar.f192672c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f192672c, kii.e.c(this.f192671b, this.f192670a.hashCode() * 31, 31), 31);
    }
}
