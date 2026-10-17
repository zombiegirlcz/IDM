package hbh;

import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Destination;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$DisplayOptions;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$InputData;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends h1h.b {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o f150735l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h1h.d f150736m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y2f.a f150737n;

    public i(o transactionsWidgetProvider, h1h.d transactionsWidgetMapper, y2f.a tradingTransactionsInteractor) {
        Intrinsics.checkNotNullParameter(transactionsWidgetProvider, "transactionsWidgetProvider");
        Intrinsics.checkNotNullParameter(transactionsWidgetMapper, "transactionsWidgetMapper");
        Intrinsics.checkNotNullParameter(tradingTransactionsInteractor, "tradingTransactionsInteractor");
        this.f150735l = transactionsWidgetProvider;
        this.f150736m = transactionsWidgetMapper;
        this.f150737n = tradingTransactionsInteractor;
    }

    @Override // yji.n
    public final void H2() {
        Continuation continuation = null;
        V2(new d(this, continuation, 0), new hb4.k(16));
        V2(new d(this, continuation, 1), new hb4.k(17));
    }

    @Override // h1h.b
    public final void Z2(h1h.e parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        A2(new InvestTransactionsListContract$Destination(new InvestTransactionsListContract$InputData(parcel.f148574a, new InvestTransactionsListContract$DisplayOptions(parcel.f148575b))));
    }

    @Override // h1h.b
    public final g0c.e b3(InvestTransactionsFilter filter, h1h.c displayOptions) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(displayOptions, "displayOptions");
        return new g0c.e(this.f150735l.a(filter, loadingStrategy), this, displayOptions, 18);
    }

    @Override // h1h.b
    public final g0c.e c3(InvestTransactionsFilter.InvestTransactionsFilterImpl filter, w4l.k loadingStrategy, h1h.c displayOptions) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(displayOptions, "displayOptions");
        return new g0c.e(this.f150735l.b(filter, loadingStrategy), this, displayOptions, 19);
    }

    @Override // h1h.b
    public final ayf.h d3(Flow widgetItemsDataFlow, boolean z) {
        Intrinsics.checkNotNullParameter(widgetItemsDataFlow, "widgetItemsDataFlow");
        return new ayf.h(widgetItemsDataFlow, this, z, 1);
    }
}
