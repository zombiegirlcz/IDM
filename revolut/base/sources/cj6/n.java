package cj6;

import cli.y;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.funds_confirmation.OpenBankingFundsConfirmationScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends oki.h implements g {
    public final OpenBankingFundsConfirmationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final oe6.m f24618p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ri6.c f24619q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e52.c f24620r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f24621s;

    public n(cli.n stateMapper, OpenBankingFundsConfirmationScreenContract$InputData inputData, oe6.m openBankingInteractor, ri6.c authFundsInteractor, e52.c outboundConsentsServerErrorHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(openBankingInteractor, "openBankingInteractor");
        Intrinsics.checkNotNullParameter(authFundsInteractor, "authFundsInteractor");
        Intrinsics.checkNotNullParameter(outboundConsentsServerErrorHandler, "outboundConsentsServerErrorHandler");
        this.o = inputData;
        this.f24618p = openBankingInteractor;
        this.f24619q = authFundsInteractor;
        this.f24620r = outboundConsentsServerErrorHandler;
        this.f24621s = mra.d.b(this, new d(null, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new k(this, null, 1), new i(this, 1));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f24621s;
    }
}
