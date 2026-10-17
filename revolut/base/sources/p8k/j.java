package p8k;

import com.revolut.core.model.account.AccountId;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.PaymentLinksAmountScreenContract$InputData;
import efm.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l1l.q;
import l1l.s;
import org.jetbrains.annotations.NotNull;
import p5a.m;
import vkm.j2;
import yji.n;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends n implements a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PaymentLinksAmountScreenContract$InputData f234172l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o8k.a f234173m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k61.a f234174n;
    public final u5k.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wsg.n f234175p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final srf.d f234176q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final urf.f f234177r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s f234178s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f234179t;
    public final l1l.h u;
    public final l1l.h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j2 f234180w;

    public j(PaymentLinksAmountScreenContract$InputData inputData, o8k.a transferDataObservable, k61.a transferInteractor, u5k.c transferWalletLimitsInteractor, wsg.n walletInteractor, srf.d balanceValidator, urf.f amountTransferLimitsValidator, s commonWalletLimitsValidator, q commonTransferNoteLengthValidator, l1l.h dealingCurrenciesValidator, l1l.h commonTransferAvailabilityValidator) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transferDataObservable, "transferDataObservable");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(transferWalletLimitsInteractor, "transferWalletLimitsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(balanceValidator, "balanceValidator");
        Intrinsics.checkNotNullParameter(amountTransferLimitsValidator, "amountTransferLimitsValidator");
        Intrinsics.checkNotNullParameter(commonWalletLimitsValidator, "commonWalletLimitsValidator");
        Intrinsics.checkNotNullParameter(commonTransferNoteLengthValidator, "commonTransferNoteLengthValidator");
        Intrinsics.checkNotNullParameter(dealingCurrenciesValidator, "dealingCurrenciesValidator");
        Intrinsics.checkNotNullParameter(commonTransferAvailabilityValidator, "commonTransferAvailabilityValidator");
        this.f234172l = inputData;
        this.f234173m = transferDataObservable;
        this.f234174n = transferInteractor;
        this.o = transferWalletLimitsInteractor;
        this.f234175p = walletInteractor;
        this.f234176q = balanceValidator;
        this.f234177r = amountTransferLimitsValidator;
        this.f234178s = commonWalletLimitsValidator;
        this.f234179t = commonTransferNoteLengthValidator;
        this.u = dealingCurrenciesValidator;
        this.v = commonTransferAvailabilityValidator;
        this.f234180w = vkm.q.c(new d(f0.f322471a, null));
    }

    @Override // yji.n
    public final void D2() {
        r rVarDistinctUntilChanged = this.f234173m.f255130a.map(new p30.b(29, new m(13))).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        Continuation continuation = null;
        n.j2(this, vkm.q.Q(rd0.e.b(rVarDistinctUntilChanged), new okf.m(continuation, this, 20)), null, new ox5.r(this, continuation, 17), 3);
        n.j2(this, rd0.e.b(m70.a.g(this.f234175p.U(AccountId.Personal.f51414a, true), null, null, 3)), null, new f(this, null), 3);
    }
}
