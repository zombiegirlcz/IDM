package nje;

import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import dsh.s;
import efm.r;
import gld.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nfj.j2;
import skm.a2;
import vkm.v1;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends jki.g implements e {
    public a2 A;
    public a2 B;
    public a2 C;
    public a2 D;
    public final f E;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ut5.e f216467p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v9j.a f216468q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w9j.e f216469r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mkd.d f216470s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final bi5.a f216471t;
    public final ash.e u;
    public final jr5.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final xh5.a f216472w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final qje.c f216473x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final qje.d f216474y;
    public a2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(jki.p mapper, ut5.e splitAccountsWidgetExtension, v9j.a cryptoDisclaimerExtension, w9j.e cryptoDisclaimerInteractor, mkd.d slotManagerFeedControllerModelExtension, bi5.a cryptoOnboardingBannerControllerModelExtension, ash.e widgetsControllerModelExtension, jr5.a cryptoZeroFeesInteractor, xh5.a cryptoFeatureEnabledInteractor, qje.c cryptoIntroChecklistAvailabilityProvider, qje.d cryptoProductIntrosFinishedRelay) {
        super(mapper);
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(splitAccountsWidgetExtension, "splitAccountsWidgetExtension");
        Intrinsics.checkNotNullParameter(cryptoDisclaimerExtension, "cryptoDisclaimerExtension");
        Intrinsics.checkNotNullParameter(cryptoDisclaimerInteractor, "cryptoDisclaimerInteractor");
        Intrinsics.checkNotNullParameter(slotManagerFeedControllerModelExtension, "slotManagerFeedControllerModelExtension");
        Intrinsics.checkNotNullParameter(cryptoOnboardingBannerControllerModelExtension, "cryptoOnboardingBannerControllerModelExtension");
        Intrinsics.checkNotNullParameter(widgetsControllerModelExtension, "widgetsControllerModelExtension");
        Intrinsics.checkNotNullParameter(cryptoZeroFeesInteractor, "cryptoZeroFeesInteractor");
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        Intrinsics.checkNotNullParameter(cryptoIntroChecklistAvailabilityProvider, "cryptoIntroChecklistAvailabilityProvider");
        Intrinsics.checkNotNullParameter(cryptoProductIntrosFinishedRelay, "cryptoProductIntrosFinishedRelay");
        this.f216467p = splitAccountsWidgetExtension;
        this.f216468q = cryptoDisclaimerExtension;
        this.f216469r = cryptoDisclaimerInteractor;
        this.f216470s = slotManagerFeedControllerModelExtension;
        this.f216471t = cryptoOnboardingBannerControllerModelExtension;
        this.u = widgetsControllerModelExtension;
        this.v = cryptoZeroFeesInteractor;
        this.f216472w = cryptoFeatureEnabledInteractor;
        this.f216473x = cryptoIntroChecklistAvailabilityProvider;
        this.f216474y = cryptoProductIntrosFinishedRelay;
        this.E = new f(0);
    }

    @Override // yji.l
    public final void T1(long j2) {
        a2 a2Var = this.D;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.D = yji.l.b1(this, ((lr5.c) this.v).a(), null, new m(this, null), 3);
        CryptoWidgetContext.INSTANCE.getClass();
        yji.l.b1(this, this.u.c3(CryptoWidgetContext.Companion.a(), s.ADD_NEW_WIDGET), null, new l(5, continuation, this), 3);
        mkd.a aVar = new mkd.a(new SlotContext(akd.s.CRYPTO_HOME));
        f0 f0Var = (f0) this.f216470s;
        f0Var.c3(aVar);
        a2 a2Var2 = this.A;
        if (a2Var2 != null) {
            a2Var2.f(null);
        }
        this.A = yji.l.b1(this, f0Var.f144638l.h(), null, new l(3, continuation, this), 3);
        a2 a2Var3 = this.B;
        if (a2Var3 != null) {
            a2Var3.f(null);
        }
        this.B = yji.l.b1(this, this.f216471t.b3(), null, new l(2, continuation, this), 3);
        y2();
        w9j.e eVar = this.f216469r;
        eVar.getClass();
        yji.l.b1(this, new v1(new w3k.i(eVar, continuation, 14)), null, new l(1, continuation, this), 3);
        a2 a2Var4 = this.C;
        if (a2Var4 != null) {
            a2Var4.f(null);
        }
        r rVarX = ((ji5.e) this.f216472w).c().x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        this.C = yji.l.b1(this, rd0.e.b(rVarX), null, new l(0, continuation, this), 3);
        qje.c cVar = this.f216473x;
        yji.l.b1(this, vkm.q.Q(new pkg.e(cVar.f246831b, cVar, 25), new h(0, continuation, this)), null, new k(this, null), 3);
        cVar.f246831b.k(Unit.f186387a);
        yji.l.b1(this, this.f216474y.f246833b, null, new j2(this, continuation, 9), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.E;
    }

    public final void y2() {
        a2 a2Var = this.z;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.z = yji.l.b1(this, this.f216467p.Z2(), null, new l(4, continuation, this), 3);
    }
}
