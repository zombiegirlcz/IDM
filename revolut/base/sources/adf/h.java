package adf;

import a0l.k;
import cli.y;
import com.revolut.feature.trading_asset_quotes.impl.ui.dialog.total_exchange_fees.TotalExchangeFeesDialogContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import wli.x;
import yji.l;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends oki.h implements a {
    public final TotalExchangeFeesDialogContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final usc.a f3337p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f3338q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cdf.a f3339r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f3340s;

    public h(b initialState, i stateMapper, TotalExchangeFeesDialogContract$InputData inputData, usc.a fiatExchangeOrderQuoteInteractor, x deeplinkHandler, cdf.a httpsWebUrlValidator) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(fiatExchangeOrderQuoteInteractor, "fiatExchangeOrderQuoteInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(httpsWebUrlValidator, "httpsWebUrlValidator");
        this.o = inputData;
        this.f3337p = fiatExchangeOrderQuoteInteractor;
        this.f3338q = deeplinkHandler;
        this.f3339r = httpsWebUrlValidator;
        this.f3340s = mra.d.b(this, initialState, stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, nim.a.v(usc.a.f(this.f3337p, ((b) ((j2) this.f3340s.f22677a).getValue()).f3327a), new a9h.b(this, 27)), null, new k(this, null, 28), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f3340s;
    }
}
