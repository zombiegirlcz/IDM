package z1i;

import com.revolut.core.ui_kit.delegates.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature_exchange.impl.ui.exchange.order_summary.OrderSummaryActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OrderSummaryActivity f318802b;

    public /* synthetic */ b(OrderSummaryActivity orderSummaryActivity, int i) {
        this.f318801a = i;
        this.f318802b = orderSummaryActivity;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f318801a;
        OrderSummaryActivity orderSummaryActivity = this.f318802b;
        switch (i) {
            case 0:
                int i2 = OrderSummaryActivity.G0;
                return new z4l.j(7, zhm.v.k(new ListSubheaderDelegate(), new ListCellDelegate(), (CellDetailsDelegate) orderSummaryActivity.y0.getValue(), orderSummaryActivity.c1(), new TextDelegate(), (RowDelegate) orderSummaryActivity.u0.getValue(), new RowLoadingDelegate(), new CellDetailsLoadingDelegate(), (CellDetailsSwitcherDelegate) orderSummaryActivity.f96916x0.getValue(), (FixedTabsDelegate) orderSummaryActivity.B0.getValue(), new FullScreenStateDelegate(), orderSummaryActivity.D0, new ActionWidgetLoadingDelegate(), orderSummaryActivity.C0, (HighlightTileDelegate) orderSummaryActivity.f96914v0.getValue(), new PlainTextWarningDelegate()), false);
            default:
                int i3 = OrderSummaryActivity.G0;
                return zhm.v.k((RowDelegate) orderSummaryActivity.u0.getValue(), (CellDetailsDelegate) orderSummaryActivity.y0.getValue(), new TextDelegate(), (LargeActionButtonDelegate) orderSummaryActivity.A0.getValue());
        }
    }
}
