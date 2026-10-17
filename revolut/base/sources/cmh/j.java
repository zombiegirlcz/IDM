package cmh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements yfe.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tzg.m f25257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oih.j f25258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y2f.a f25259c;

    public j(tzg.m wealthAccountsInteractor, oih.j wealthStocksAccountCommandProvider, y2f.a tradingTransactionsInteractor) {
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(wealthStocksAccountCommandProvider, "wealthStocksAccountCommandProvider");
        Intrinsics.checkNotNullParameter(tradingTransactionsInteractor, "tradingTransactionsInteractor");
        this.f25257a = wealthAccountsInteractor;
        this.f25258b = wealthStocksAccountCommandProvider;
        this.f25259c = tradingTransactionsInteractor;
    }

    @Override // yfe.d
    public final yfe.c a() {
        return new i(this.f25257a, this.f25258b, this.f25259c);
    }
}
