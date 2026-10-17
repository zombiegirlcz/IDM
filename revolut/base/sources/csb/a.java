package csb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import k4l.m;
import k4l.n;
import k4l.o;
import k4l.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mii.f;
import mii.h;
import mii.l;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static l a(p result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof k4l.l) {
            return new h(new TextLocalisedClause(R$string.trading_advanced_charts_order_view_banner_title_order_declined, null, null, 14), "order-result-shot-id");
        }
        if (result instanceof m) {
            return new f("order-result-shot-id", new TextLocalisedClause(R$string.trading_advanced_charts_order_view_banner_title_order_executed, null, null, 14), null, null, null, null, 124);
        }
        if ((result instanceof n) || (result instanceof o)) {
            return new f("order-result-shot-id", new TextLocalisedClause(R$string.trading_advanced_charts_order_view_banner_title_order_created, null, null, 14), null, null, null, null, 124);
        }
        throw new NoWhenBranchMatchedException();
    }
}
