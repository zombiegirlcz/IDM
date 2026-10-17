package h6i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wzg.a f149687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.l f149688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f149689c;

    public k0(wzg.a cashHoldingsInteractor, ybl.l tradingConfigInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(cashHoldingsInteractor, "cashHoldingsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        od0.i collateralWithdrawableInfoProvider = od0.i.f224256b;
        Intrinsics.checkNotNullParameter(collateralWithdrawableInfoProvider, "collateralWithdrawableInfoProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f149687a = cashHoldingsInteractor;
        this.f149688b = tradingConfigInteractor;
        this.f149689c = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature_move_money.api.model.AccountSource.InvestCashHolding r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h6i.k0.a(com.revolut.feature_move_money.api.model.AccountSource$InvestCashHolding, gim.c):java.lang.Object");
    }
}
