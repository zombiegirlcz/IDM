package gsd;

import a5h.g;
import et6.l0;
import frd.k;
import hsd.f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import q97.p1;
import rf9.h;
import t38.e;
import vkm.q;
import vkm.v1;
import wsg.n;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146391a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f146392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f146393c;
    public final Object d;
    public final Object e;

    public c(jsd.a personalNetWorthProductLoader, f jointNetWorthProductsLoader, g proNetWorthProductsLoader, ksd.g pocketsNetWorthProductsLoader) {
        Intrinsics.checkNotNullParameter(personalNetWorthProductLoader, "personalNetWorthProductLoader");
        Intrinsics.checkNotNullParameter(jointNetWorthProductsLoader, "jointNetWorthProductsLoader");
        Intrinsics.checkNotNullParameter(proNetWorthProductsLoader, "proNetWorthProductsLoader");
        Intrinsics.checkNotNullParameter(pocketsNetWorthProductsLoader, "pocketsNetWorthProductsLoader");
        this.f146392b = personalNetWorthProductLoader;
        this.f146393c = jointNetWorthProductsLoader;
        this.d = proNetWorthProductsLoader;
        this.e = pocketsNetWorthProductsLoader;
    }

    @Override // frd.k
    public final Flow b() {
        switch (this.f146391a) {
            case 0:
                Continuation continuation = null;
                v1 v1Var = new v1(new hsd.c((f) this.f146393c, continuation, 0));
                g gVar = (g) this.d;
                return q.Q(new e(v1Var, 24, q.Q(((l0) ((gr6.e) gVar.f1406b)).m(), new mk0.f(continuation, gVar, 6)), new a(this, null)), new bwb.k(3, 6, continuation));
            case 1:
                return k.a(this, new go.g(Boolean.valueOf(((tsj.g) this.f146392b).d()), 2), new p1(this, 20));
            default:
                return xam.a.h(new h((Continuation) null, this, 29), ((ti9.h) this.f146393c).j());
        }
    }

    public c(tsj.g customAssetsInteractor, qsd.d customAssetsTotalWealthProductMapper, ppk.f ratesInteractor, n walletInteractor, j9l.a moneyCalculator) {
        Intrinsics.checkNotNullParameter(customAssetsInteractor, "customAssetsInteractor");
        Intrinsics.checkNotNullParameter(customAssetsTotalWealthProductMapper, "customAssetsTotalWealthProductMapper");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
        this.f146392b = customAssetsInteractor;
        this.f146393c = ratesInteractor;
        this.d = walletInteractor;
        this.e = moneyCalculator;
    }

    public c(xh9.a payLaterInteractor, ti9.h payLaterFeatureTogglesInteractor, ppk.f ratesInteractor, n walletInteractor, ysd.a payLaterNetWorthProductMapper) {
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(payLaterFeatureTogglesInteractor, "payLaterFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(payLaterNetWorthProductMapper, "payLaterNetWorthProductMapper");
        this.f146392b = payLaterInteractor;
        this.f146393c = payLaterFeatureTogglesInteractor;
        this.d = ratesInteractor;
        this.e = walletInteractor;
    }
}
