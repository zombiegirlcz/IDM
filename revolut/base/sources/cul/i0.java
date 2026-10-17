package cul;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i0 implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jvl.a f109116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rvl.b f109117b;

    public i0(ovl.a extendedHoursDialogMapper, jvl.a tradingOrderScreenDialogMapper, rvl.b tradingOrderPreconditionsMapper) {
        Intrinsics.checkNotNullParameter(extendedHoursDialogMapper, "extendedHoursDialogMapper");
        Intrinsics.checkNotNullParameter(tradingOrderScreenDialogMapper, "tradingOrderScreenDialogMapper");
        Intrinsics.checkNotNullParameter(tradingOrderPreconditionsMapper, "tradingOrderPreconditionsMapper");
        this.f109116a = tradingOrderScreenDialogMapper;
        this.f109117b = tradingOrderPreconditionsMapper;
    }

    public final rp0.y a() {
        return new rp0.y(zhm.u.c(((mvl.b) this.f109116a).c(R$attr.uikit_dp24)), new rp0.t(new TextLocalisedClause(R$string.wealth_stock_orders_switching_unavailable_title, null, null, 14), new TextLocalisedClause(R$string.wealth_stock_orders_switching_unavailable_description, null, null, 14), null, 28), null, null, null, null, 1020);
    }
}
