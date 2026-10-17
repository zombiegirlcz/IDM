package kw4;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.topup.CreditCardTopupScreenContract$InputData;
import kkf.x5;
import klf.a3;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ku1.f0;
import om4.y3;
import vkm.j2;
import vkm.q0;
import vkm.t0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class z extends oki.h implements k, yx4.k {
    public final Object A;
    public final j2 B;
    public final cli.y C;
    public final mw4.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vt4.b f190252p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f190253q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n60.b f190254r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w80.b f190255s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gte.a f190256t;
    public final al4.n u;
    public final al4.q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final wsg.n f190257w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ang.f f190258x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CreditCardTopupScreenContract$InputData f190259y;
    public final r70.c z;

    public z(mw4.a creditCardTopupDialogMapper, vt4.b creditCardDialogMapper, j60.a bottomDialogExtension, n60.b keyboardViewControllerExtension, w80.b amountFormatter, gte.a featureToggleInteractor, al4.n creditCardInteractor, al4.q creditCardProductInteractor, wsg.n walletInteractor, ang.f userInteractor, CreditCardTopupScreenContract$InputData inputData, r70.c hapticEngine, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(creditCardTopupDialogMapper, "creditCardTopupDialogMapper");
        Intrinsics.checkNotNullParameter(creditCardDialogMapper, "creditCardDialogMapper");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(keyboardViewControllerExtension, "keyboardViewControllerExtension");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = creditCardTopupDialogMapper;
        this.f190252p = creditCardDialogMapper;
        this.f190253q = bottomDialogExtension;
        this.f190254r = keyboardViewControllerExtension;
        this.f190255s = amountFormatter;
        this.f190256t = featureToggleInteractor;
        this.u = creditCardInteractor;
        this.v = creditCardProductInteractor;
        this.f190257w = walletInteractor;
        this.f190258x = userInteractor;
        this.f190259y = inputData;
        this.z = hapticEngine;
        this.A = te0.w.y0(new kob.a(this, 10));
        this.B = vkm.q.c(Boolean.FALSE);
        this.C = mra.d.b(this, new i(new Data(null, null, true, 3, null), j6.a.p("toString(...)")), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        akg.n nVarF = ((y3) this.v).f(this.f190259y.f69781a, w4l.j.f294644c);
        h0 h0Var = h0.f322473a;
        Continuation continuation = null;
        Flow flowQ = vkm.q.q(vkm.q.Q(vkm.q.q(new g48.r(mo3.a.g(rd0.e.n(nVarF, h0Var), null, new f0(15), 1), 24)), new a3(continuation, this, 12)));
        Intrinsics.checkNotNullParameter(flowQ, "<this>");
        yji.l.a1(this, rd0.e.n(vkm.q.q(new v0f.p(new ax9.o(yh5.b.d(flowQ, L0()), 23), 28)), h0Var), null, null, new p(this, continuation, 1), 3);
        yji.l.a1(this, new q0(new t0(new x5(this.C.B(new kvg.j(8)), 19), 1), new p(this, continuation, 0), 1), null, null, null, 7);
    }

    public final h I2() {
        return (h) zi0.c.I(((i) ((j2) this.C.f22677a).getValue()).f190230b);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J2(java.lang.String r25) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kw4.z.J2(java.lang.String):void");
    }

    public final void K2(g inputAmountModel) {
        h hVarI2 = I2();
        String facilityId = hVarI2.f190221a;
        String pocketId = hVarI2.f190222b;
        dj0.d pocketBalance = hVarI2.f190223c;
        ll4.y paymentInfo = hVarI2.d;
        dj0.d overLimitAmount = hVarI2.e;
        dj0.d limitAmount = hVarI2.f;
        dj0.d maxAllowedPayment = hVarI2.f190224g;
        xw4.a paymentState = hVarI2.f190225h;
        boolean z = hVarI2.i;
        boolean z3 = hVarI2.f190226j;
        wi0.b countryCode = hVarI2.k;
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(pocketBalance, "pocketBalance");
        Intrinsics.checkNotNullParameter(paymentInfo, "paymentInfo");
        Intrinsics.checkNotNullParameter(overLimitAmount, "overLimitAmount");
        Intrinsics.checkNotNullParameter(limitAmount, "limitAmount");
        Intrinsics.checkNotNullParameter(maxAllowedPayment, "maxAllowedPayment");
        Intrinsics.checkNotNullParameter(paymentState, "paymentState");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(inputAmountModel, "inputAmountModel");
        H2(this.C, new kv7.g(new h(facilityId, pocketId, pocketBalance, paymentInfo, overLimitAmount, limitAmount, maxAllowedPayment, paymentState, z, z3, countryCode, inputAmountModel), 2));
    }

    @Override // yx4.k
    public final j2 L0() {
        return this.B;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.C;
    }
}
