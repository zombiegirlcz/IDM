package lul;

import com.revolut.trading.orders.ui.invest.placement.models.OrderQuoteResult;
import com.revolut.trading.orders.ui.invest.placement.screens.review.InvestOrderReviewScreenContract$InvestOrderPlacedStatusDialogPayload$SetRecurringBuyAction;
import d9.e1;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class f {
    public static ztl.a a(n1 statusDialogResult, OrderQuoteResult orderQuoteResult) throws Throwable {
        Intrinsics.checkNotNullParameter(statusDialogResult, "statusDialogResult");
        Intrinsics.checkNotNullParameter(orderQuoteResult, "orderQuoteResult");
        if ((statusDialogResult instanceof l1) || (statusDialogResult instanceof m1)) {
            if (Intrinsics.f(statusDialogResult.a().a(), InvestOrderReviewScreenContract$InvestOrderPlacedStatusDialogPayload$SetRecurringBuyAction.f106944a)) {
                return new ztl.a(e1.v(orderQuoteResult.f106859b).f104717a);
            }
        } else {
            if (statusDialogResult instanceof k1) {
                return null;
            }
            try {
                m.Companion companion = yhm.m.INSTANCE;
                throw new IllegalStateException(("Handler is not found for " + statusDialogResult).toString());
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                Throwable thA = yhm.m.a(o.a(th10));
                if (thA != null) {
                    hx7.e.n(thA);
                }
            }
        }
        return null;
    }
}
