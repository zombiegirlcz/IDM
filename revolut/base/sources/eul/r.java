package eul;

import com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestOrderEditScreenContract$InputData f129653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final csl.i f129654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f129655c;

    public r(InvestOrderEditScreenContract$InputData inputData, csl.i tradingOrderListItemsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(tradingOrderListItemsMapper, "tradingOrderListItemsMapper");
        this.f129653a = inputData;
        this.f129654b = tradingOrderListItemsMapper;
        this.f129655c = te0.w.y0(new euf.a(2));
    }
}
