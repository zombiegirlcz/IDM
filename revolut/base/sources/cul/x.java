package cul;

import com.revolut.trading.orders.ui.invest.placement.models.InvestOrderDraft;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class x implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestOrderDraft f109199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f109200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f109201c;

    public x(InvestOrderDraft orderDraft, List availablePeriods, w wVar) {
        Intrinsics.checkNotNullParameter(orderDraft, "orderDraft");
        Intrinsics.checkNotNullParameter(availablePeriods, "availablePeriods");
        this.f109199a = orderDraft;
        this.f109200b = availablePeriods;
        this.f109201c = wVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f109199a, xVar.f109199a) && Intrinsics.f(this.f109200b, xVar.f109200b) && Intrinsics.f(this.f109201c, xVar.f109201c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f109199a.hashCode() * 31, 31, this.f109200b);
        w wVar = this.f109201c;
        return iD + (wVar == null ? 0 : wVar.f109194a.hashCode());
    }
}
