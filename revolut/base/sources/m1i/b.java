package m1i;

import com.revolut.core.ui_kit.delegates.AmountDualEditDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.MarketOrderActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MarketOrderActivity f201512b;

    public /* synthetic */ b(MarketOrderActivity marketOrderActivity, int i) {
        this.f201511a = i;
        this.f201512b = marketOrderActivity;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f201511a;
        MarketOrderActivity marketOrderActivity = this.f201512b;
        switch (i) {
            case 0:
                MarketOrderActivity.Companion companion = MarketOrderActivity.INSTANCE;
                return new AmountDualEditDelegate(new lk7.n(marketOrderActivity, 14));
            case 1:
                return new z4l.j(7, zhm.v.k(marketOrderActivity.f96870v0, new RowLoadingDelegate(), marketOrderActivity.c1(), (CellDetailsActionDelegate) marketOrderActivity.A0.getValue()), false);
            default:
                return zhm.v.k(marketOrderActivity.f96871w0, (LargeActionButtonDelegate) marketOrderActivity.f96872x0.getValue(), (TextDelegate) marketOrderActivity.y0.getValue());
        }
    }
}
