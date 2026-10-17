package u1k;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.payment_options.impl.ui.screens.vault.PaymentOptionsVaultWithdrawalScreenContract$InputData;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends jki.g implements g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PaymentOptionsVaultWithdrawalScreenContract$InputData f276427p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ppg.b f276428q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final eli.j f276429r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w80.b f276430s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f276431t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p stateMapper, PaymentOptionsVaultWithdrawalScreenContract$InputData inputData, ppg.b vaultsInteractor, eli.j twoFaErrorHandler, w80.b moneyEditAmountFormatter) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        Intrinsics.checkNotNullParameter(moneyEditAmountFormatter, "moneyEditAmountFormatter");
        this.f276427p = inputData;
        this.f276428q = vaultsInteractor;
        this.f276429r = twoFaErrorHandler;
        this.f276430s = moneyEditAmountFormatter;
        this.f276431t = new e(new Data(null, null, false, 7, null), null);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.b(((ypg.p) this.f276428q).i(this.f276427p.f101893a)), null, null, new tz6.e(this, (Continuation) null, 8), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f276431t;
    }
}
