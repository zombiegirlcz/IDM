package e28;

import com.revolut.feature.invest_feed.api.models.InvestWidgetContext;
import dsh.i;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements csh.g {
    public static i c(c cVar, String str) {
        dsh.e.Companion.getClass();
        return new i(str, dsh.d.a());
    }

    @Override // csh.g
    public final List a(Class contextClass) {
        Intrinsics.checkNotNullParameter(contextClass, "contextClass");
        return contextClass.equals(InvestWidgetContext.class) ? v.k(c(this, "WealthAutomationsDynamic"), c(this, "PopularFirstBuysDynamic")) : f0.f322471a;
    }

    @Override // csh.g
    public final List b(Class cls) {
        return cls.equals(InvestWidgetContext.class) ? v.k(c(this, "PopularFirstBuysDynamic"), c(this, "ProductsDynamic"), c(this, "WatchlistItems"), c(this, "TopMoversDynamic"), c(this, "MostTradedDynamic"), c(this, "NewsDynamic"), c(this, "WealthAutomationsDynamic"), c(this, "CorporateEventsDynamic"), c(this, "TransactionsDynamic"), c(this, "popular-starter-cfds")) : f0.f322471a;
    }
}
