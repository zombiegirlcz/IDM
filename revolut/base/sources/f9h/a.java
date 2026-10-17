package f9h;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.revolut.feature.wealth.gia.margin_trading.impl.pushes.WealthGiaMarginCallRefreshWorker;
import com.revolut.feature.wealth.impl.domain.workers.TradingTransactionsCleanUpWorker;
import kotlin.jvm.internal.Intrinsics;
import r10.r;
import ybl.d;
import ybl.k;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements k90.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132967a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f132968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f132969c;
    public final Object d;

    public a(r wealthMarginInteractor, k tradingAccountsInteractor, d portfolioInteractor) {
        Intrinsics.checkNotNullParameter(wealthMarginInteractor, "wealthMarginInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        this.f132969c = wealthMarginInteractor;
        this.f132968b = tradingAccountsInteractor;
        this.d = portfolioInteractor;
    }

    @Override // k90.a
    public final ListenableWorker a(Context appContext, WorkerParameters params) {
        switch (this.f132967a) {
            case 0:
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(params, "params");
                return new TradingTransactionsCleanUpWorker(appContext, params, this.f132968b, (y2f.a) this.f132969c, (xoj.a) this.d);
            default:
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Intrinsics.checkNotNullParameter(params, "params");
                return new WealthGiaMarginCallRefreshWorker(appContext, params, (r) this.f132969c, this.f132968b, (d) this.d);
        }
    }

    public a(k tradingAccountsInteractor, y2f.a tradingTransactionsInteractor, xoj.a featuresInteractor) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingTransactionsInteractor, "tradingTransactionsInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        this.f132968b = tradingAccountsInteractor;
        this.f132969c = tradingTransactionsInteractor;
        this.d = featuresInteractor;
    }
}
