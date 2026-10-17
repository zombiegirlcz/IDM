package x2i;

import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.feature_exchange.impl.ui.order_details.screen.OrderDetailsActivity;
import kotlin.jvm.functions.Function0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f302574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OrderDetailsActivity f302575b;

    public /* synthetic */ a(OrderDetailsActivity orderDetailsActivity, int i) {
        this.f302574a = i;
        this.f302575b = orderDetailsActivity;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f302574a;
        OrderDetailsActivity orderDetailsActivity = this.f302575b;
        switch (i) {
            case 0:
                int i2 = OrderDetailsActivity.E0;
                return new z4l.j(7, v.k(new CellDetailsDelegate(), (ActionsDelegate) orderDetailsActivity.f96966w0.getValue(), (CellDetailsActionDelegate) orderDetailsActivity.f96967x0.getValue(), new ListSubheaderDelegate(), new ListCellDelegate(), new TextDelegate(), (RowDelegate) orderDetailsActivity.u0.getValue(), (CellDetailsChevronDelegate) orderDetailsActivity.A0.getValue(), (HighlightTileDelegate) orderDetailsActivity.f96965v0.getValue(), new HighlightTileLoadingDelegate(), new PlainTextWarningDelegate()), false);
            default:
                int i3 = OrderDetailsActivity.E0;
                return u.c((TwinHorizontalButtonDelegate) orderDetailsActivity.D0.getValue());
        }
    }
}
