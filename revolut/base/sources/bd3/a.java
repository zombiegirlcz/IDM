package bd3;

import efm.b;
import efm.r;
import fd3.d;
import gd3.c;
import gd3.g;
import gd3.h;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ppk.f;
import te0.w;
import w4l.k;
import wsg.n;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f14523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f14524b;

    public a(c cashbackRepository, n walletInteractor, f ratesInteractor, h cashbackStatusRepository) {
        Intrinsics.checkNotNullParameter(cashbackRepository, "cashbackRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(cashbackStatusRepository, "cashbackStatusRepository");
        this.f14523a = cashbackRepository;
        this.f14524b = cashbackStatusRepository;
    }

    public static r d(a aVar) {
        return ((g) aVar.f14523a).f143059j.f(Unit.f186387a, false);
    }

    public final pfm.r a(String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        g gVar = (g) this.f14523a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        return w.g0(gVar.f143055b.postChangeCashbackCurrency(new d(currencyCode)));
    }

    public final b b() {
        return ((g) this.f14523a).f143057g.g(Unit.f186387a, false);
    }

    public final r c(k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        g gVar = (g) this.f14523a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return gVar.f143057g.e(Unit.f186387a, loadingStrategy);
    }

    public final r e() {
        return ((g) this.f14523a).i.f(Unit.f186387a, true);
    }

    public final vkm.d f(k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        gd3.k kVar = (gd3.k) this.f14524b;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return kVar.d.b(Unit.f186387a, loadingStrategy);
    }

    public final r g(k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        g gVar = (g) this.f14523a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return gVar.k.e(Unit.f186387a, loadingStrategy);
    }
}
