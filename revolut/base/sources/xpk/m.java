package xpk;

import com.revolut.retail.feature.ratedetails.impl.ui.RateDetailsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RateDetailsScreenContract$InputData f307998p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ppk.c f307999q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wif.a f308000r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final u1d.a f308001s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p f308002t;
    public final l1d.a u;
    public final aqk.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ypk.a f308003w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final sh5.d f308004x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final w8b.c f308005y;
    public final h z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(jki.p stateMapper, RateDetailsScreenContract$InputData inputData, ppk.c rateDetailsInteractor, wif.a userFeaturesChecker, u1d.a watchlistExtension, p watchlistAssetTypeResolutionDelegate, l1d.a alertsExtension, aqk.a rateDetailsExchangeActionsModelExtension, ypk.a chartModelExtension, sh5.d cryptoFcaDisclaimerWidget, w8b.c advanceChartsDestinationProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rateDetailsInteractor, "rateDetailsInteractor");
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        Intrinsics.checkNotNullParameter(watchlistExtension, "watchlistExtension");
        Intrinsics.checkNotNullParameter(watchlistAssetTypeResolutionDelegate, "watchlistAssetTypeResolutionDelegate");
        Intrinsics.checkNotNullParameter(alertsExtension, "alertsExtension");
        Intrinsics.checkNotNullParameter(rateDetailsExchangeActionsModelExtension, "rateDetailsExchangeActionsModelExtension");
        Intrinsics.checkNotNullParameter(chartModelExtension, "chartModelExtension");
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerWidget, "cryptoFcaDisclaimerWidget");
        Intrinsics.checkNotNullParameter(advanceChartsDestinationProvider, "advanceChartsDestinationProvider");
        this.f307998p = inputData;
        this.f307999q = rateDetailsInteractor;
        this.f308000r = userFeaturesChecker;
        this.f308001s = watchlistExtension;
        this.f308002t = watchlistAssetTypeResolutionDelegate;
        this.u = alertsExtension;
        this.v = rateDetailsExchangeActionsModelExtension;
        this.f308003w = chartModelExtension;
        this.f308004x = cryptoFcaDisclaimerWidget;
        this.f308005y = advanceChartsDestinationProvider;
        this.z = new h(alertsExtension.Z2(), 507);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0094  */
    @Override // yji.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T1(long r13) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xpk.m.T1(long):void");
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.z;
    }
}
