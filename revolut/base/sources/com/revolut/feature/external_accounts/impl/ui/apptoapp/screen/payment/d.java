package com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment;

import a7j.g;
import akd.s;
import amh.w;
import cli.n;
import com.revolut.domain.models.openbanking.OpenBankingPayment;
import com.revolut.domain.models.openbanking.Provider;
import com.revolut.feature.external_accounts.api.OpenBankingConsentsApi$Toggles$OpenBankingXSell;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import e58.e;
import ej6.b0;
import ej6.f;
import ej6.i0;
import ej6.l;
import ej6.v;
import ej6.x;
import ej6.y;
import gld.f0;
import h6i.o;
import java.util.concurrent.CopyOnWriteArrayList;
import kl.t1;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oe6.m;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pi6.u;
import vkm.q;
import vkm.t0;
import yhm.j;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends h implements v {

    @NotNull
    public static final y Companion = new y();
    public final gte.a A;
    public final sh5.d B;
    public final Lazy C;
    public final cli.y D;
    public final OpenBankingAuthPaymentScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u f72533p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o f72534q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f72535r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o7.b f72536s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l4i.a f72537t;
    public final t1 u;
    public final g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m f72538w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ng6.a f72539x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a f72540y;
    public final mkd.d z;

    public d(n stateMapper, OpenBankingAuthPaymentScreenContract$InputData inputData, u relay, o moveMoneyAccountProvider, f accountResolver, o7.b orderQuoteInteractor, l4i.a amountConverter, t1 currencyRateNaviProvider, g paymentProviderResolver, m openBankingInteractor, ng6.a outboundPaymentBreakdownInteractor, a paymentAmountValidator, mkd.d slotManagerFeedControllerModelExtension, gte.a featureToggleInteractor, sh5.d cryptoFcaDisclaimerWidget) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(relay, "relay");
        Intrinsics.checkNotNullParameter(moveMoneyAccountProvider, "moveMoneyAccountProvider");
        Intrinsics.checkNotNullParameter(accountResolver, "accountResolver");
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(currencyRateNaviProvider, "currencyRateNaviProvider");
        Intrinsics.checkNotNullParameter(paymentProviderResolver, "paymentProviderResolver");
        Intrinsics.checkNotNullParameter(openBankingInteractor, "openBankingInteractor");
        Intrinsics.checkNotNullParameter(outboundPaymentBreakdownInteractor, "outboundPaymentBreakdownInteractor");
        Intrinsics.checkNotNullParameter(paymentAmountValidator, "paymentAmountValidator");
        Intrinsics.checkNotNullParameter(slotManagerFeedControllerModelExtension, "slotManagerFeedControllerModelExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerWidget, "cryptoFcaDisclaimerWidget");
        this.o = inputData;
        this.f72533p = relay;
        this.f72534q = moveMoneyAccountProvider;
        this.f72535r = accountResolver;
        this.f72536s = orderQuoteInteractor;
        this.f72537t = amountConverter;
        this.u = currencyRateNaviProvider;
        this.v = paymentProviderResolver;
        this.f72538w = openBankingInteractor;
        this.f72539x = outboundPaymentBreakdownInteractor;
        this.f72540y = paymentAmountValidator;
        this.z = slotManagerFeedControllerModelExtension;
        this.A = featureToggleInteractor;
        this.B = cryptoFcaDisclaimerWidget;
        this.C = j.b(new e(this, 11));
        this.D = mra.d.b(this, new l(null, null, null, null, null, null, i0.UNAVAILABLE), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        String str;
        x xVar = new x(1);
        cli.y yVar = this.D;
        Continuation continuation = null;
        yji.l.a1(this, new cqh.m(yVar.B(xVar), this, 23), null, null, new b0(this, continuation, 0), 3);
        OpenBankingAuthPaymentScreenContract$InputData openBankingAuthPaymentScreenContract$InputData = this.o;
        String str2 = openBankingAuthPaymentScreenContract$InputData.f72530b.f60386b;
        if (str2 != null) {
            if (((jte.d) this.A).c(OpenBankingConsentsApi$Toggles$OpenBankingXSell.f72208c)) {
                mkd.a aVar = new mkd.a(new SlotContext(s.OPEN_BANKING_PAYMENT_REVIEW, y0.b(str2)));
                f0 f0Var = (f0) this.z;
                f0Var.c3(aVar);
                yji.l.a1(this, f0Var.f144638l.h(), null, null, new b0(this, continuation, 4), 3);
            }
        }
        int i = 2;
        cqh.m mVar = new cqh.m(new dfj.f(yVar.B(new x(i)), 11), this, 24);
        int i2 = 3;
        yji.l.a1(this, mVar, null, null, new b0(this, continuation, i2), 3);
        l2(new ebg.o(this, continuation, 10), new ei8.d(this, i));
        OpenBankingPayment openBankingPayment = openBankingAuthPaymentScreenContract$InputData.f72530b;
        Provider provider = openBankingPayment.f60394p;
        if (provider == null || (str = provider.e) == null) {
            str = openBankingPayment.f60393n;
        }
        if (str != null) {
            l2(new eif.j(this, str, continuation, i2), new yi5.b(26));
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("pocketId cannot be null");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        C2(ej6.m.f126747a);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, q.q(q.H(new eif.j(this, continuation, 4), this.f72533p.f236457a)), null, new b0(this, continuation, 2), 3);
        String str = this.o.f72530b.f60386b;
        yji.l.b1(this, new w(q.Q(new t0(this.D.B(new x(0)), 1), new eh9.j(continuation, this, str, 2)), 8), null, new b0(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.D;
    }
}
