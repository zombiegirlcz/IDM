package i2i;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.MarketOrderActivityV2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MarketOrderActivityV2 f157950b;

    public /* synthetic */ b(MarketOrderActivityV2 marketOrderActivityV2, int i) {
        this.f157949a = i;
        this.f157950b = marketOrderActivityV2;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f157949a;
        MarketOrderActivityV2 marketOrderActivityV2 = this.f157950b;
        switch (i) {
            case 0:
                return new z4l.j(7, zhm.v.k(marketOrderActivityV2.f96942x0, new RowLoadingDelegate(), marketOrderActivityV2.H0, (CellDetailsActionDelegate) marketOrderActivityV2.A0.getValue(), new CellDetailsDelegate()), false);
            default:
                return zhm.v.k(marketOrderActivityV2.y0, (LargeActionButtonDelegate) marketOrderActivityV2.z0.getValue(), marketOrderActivityV2.D0, (TextDelegate) marketOrderActivityV2.B0.getValue(), (CellDetailsSwitcherDelegate) marketOrderActivityV2.C0.getValue());
        }
    }
}
