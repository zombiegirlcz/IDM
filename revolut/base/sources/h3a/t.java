package h3a;

import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import rfm.f0;
import skm.p0;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gqa.b f149069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bu9.a f149070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ga6.a f149071c;
    public final fnc.s d;
    public final uw1.e e;
    public final fp1.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gte.a f149072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final cw9.d f149073h;
    public final v67.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final er1.b f149074j;

    public t(gqa.b pushToCardStatusChecker, bu9.a cryptoFeatureChecker, ga6.a donationsTransferFeatureChecker, fnc.s paymentLinksStatusChecker, uw1.e apmProductProvider, fp1.f billsProductProvider, gte.a featureToggleInteractor, cw9.d paymentsProductFeatureChecker, v67.b giroFeatureChecker, er1.b postalCheckFeatureChecker) {
        Intrinsics.checkNotNullParameter(pushToCardStatusChecker, "pushToCardStatusChecker");
        Intrinsics.checkNotNullParameter(cryptoFeatureChecker, "cryptoFeatureChecker");
        Intrinsics.checkNotNullParameter(donationsTransferFeatureChecker, "donationsTransferFeatureChecker");
        Intrinsics.checkNotNullParameter(paymentLinksStatusChecker, "paymentLinksStatusChecker");
        Intrinsics.checkNotNullParameter(apmProductProvider, "apmProductProvider");
        Intrinsics.checkNotNullParameter(billsProductProvider, "billsProductProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(giroFeatureChecker, "giroFeatureChecker");
        Intrinsics.checkNotNullParameter(postalCheckFeatureChecker, "postalCheckFeatureChecker");
        this.f149069a = pushToCardStatusChecker;
        this.f149070b = cryptoFeatureChecker;
        this.f149071c = donationsTransferFeatureChecker;
        this.d = paymentLinksStatusChecker;
        this.e = apmProductProvider;
        this.f = billsProductProvider;
        this.f149072g = featureToggleInteractor;
        this.f149073h = paymentsProductFeatureChecker;
        this.i = giroFeatureChecker;
        this.f149074j = postalCheckFeatureChecker;
    }

    public final d0 a() {
        kotlinx.coroutines.d dVar = p0.f264003c;
        Continuation continuation = null;
        ufm.b bVarO0 = w.o0(dVar, new s(this, continuation, 3));
        z zVarA = this.f149069a.a();
        z zVarF = ue0.e.F(this.f149070b.f18754a.d(), Boolean.FALSE);
        d0 d0VarA = this.f149071c.a();
        d0 d0VarFirstOrError = rd0.e.c(((cw9.d) this.d.f136657b).f109573b.A("PAYMENT_LINKS.p2p"), kotlin.coroutines.g.f186406a).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        d0 d0VarC = d0.C(w.o0(dVar, new s(this, continuation, 0)), w.o0(dVar, new s(this, continuation, 1)), w.o0(dVar, new s(this, continuation, 2)), new h0l.g(new gzb.d(2), 6));
        Intrinsics.checkNotNullExpressionValue(d0VarC, "zip(...)");
        ufm.c cVar = new ufm.c(new a31.l(this, 29), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        ty1.e eVar = (ty1.e) this.e;
        d0 d0VarF = eVar.f275461b.f(false);
        f0 f0VarA = eVar.a();
        ty1.b bVar = (ty1.b) eVar.f275460a;
        bVar.getClass();
        ufm.i iVar = new ufm.i(w.I0(d0VarF, f0VarA, bVar.c(yoj.c.APM_MULTIBANCO)), new ty1.c(new tx.f(eVar), 0), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        fp1.f fVar = this.f;
        d0 d0VarD = d0.D(fVar.f137043b.f(false), fVar.a(), new fjj.b(new fk4.r(28), 11));
        Intrinsics.checkNotNullExpressionValue(d0VarD, "zip(...)");
        d0 d0VarY = d0.y(bVarO0, zVarA, zVarF, d0VarA, d0VarFirstOrError, d0VarC, cVar, iVar, d0VarD, new h0l.g(new q(this), 5));
        Intrinsics.checkNotNullExpressionValue(d0VarY, "zip(...)");
        return d0VarY;
    }
}
