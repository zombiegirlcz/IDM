package w3b;

import com.revolut.feature.retail.cfd.impl.screens.margin.CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f294259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f294260c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType f;

    public e(String instrumentRef, i marginTarget, String portfolioId, BigDecimal quantity, BigDecimal leverage, CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType orderType) {
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        Intrinsics.checkNotNullParameter(marginTarget, "marginTarget");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.f294258a = instrumentRef;
        this.f294259b = marginTarget;
        this.f294260c = portfolioId;
        this.d = quantity;
        this.e = leverage;
        this.f = orderType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f294258a, eVar.f294258a) && Intrinsics.f(this.f294259b, eVar.f294259b) && Intrinsics.f(this.f294260c, eVar.f294260c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + t61.a.d(this.e, t61.a.d(this.d, p.a.c((this.f294259b.hashCode() + (this.f294258a.hashCode() * 31)) * 31, 31, this.f294260c), 31), 31);
    }
}
