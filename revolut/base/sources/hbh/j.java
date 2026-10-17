package hbh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements f1h.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1h.c f150738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f150739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1h.d f150740c;
    public final y2f.a d;

    public j(f1h.c investTransactionsCommonFactory, o investTransactionsWidgetProvider, h1h.d investTransactionsWidgetMapper, ugc.a transactionsCommonNavigationProvider, y2f.a tradingTransactionsInteractor) {
        Intrinsics.checkNotNullParameter(investTransactionsCommonFactory, "investTransactionsCommonFactory");
        Intrinsics.checkNotNullParameter(investTransactionsWidgetProvider, "investTransactionsWidgetProvider");
        Intrinsics.checkNotNullParameter(investTransactionsWidgetMapper, "investTransactionsWidgetMapper");
        Intrinsics.checkNotNullParameter(transactionsCommonNavigationProvider, "transactionsCommonNavigationProvider");
        Intrinsics.checkNotNullParameter(tradingTransactionsInteractor, "tradingTransactionsInteractor");
        this.f150738a = investTransactionsCommonFactory;
        this.f150739b = investTransactionsWidgetProvider;
        this.f150740c = investTransactionsWidgetMapper;
        this.d = tradingTransactionsInteractor;
    }

    @Override // f1h.c
    public final f1h.b a() {
        return this.f150738a.a();
    }

    @Override // f1h.c
    public final f1h.a b(f1h.f screen, f1h.b controllerModelExtension) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        return this.f150738a.b(screen, controllerModelExtension);
    }
}
