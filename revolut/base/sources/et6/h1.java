package et6;

import com.revolut.feature.freelancer.impl.network.services.FreelancerService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f129236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final au6.b2 f129237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gr6.a f129238c;
    public final h d;
    public final gr6.m e;
    public final gr6.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f129239g;

    public h1(wsg.n walletInteractor, au6.b2 freelancerRepository, gr6.a freelancerAccountDetailsInteractor, h freelancerAccountSelectionInteractor, gr6.m freelancerPocketsInteractor, gr6.h freelancerCashbackInteractor, r10.w exchangeRatesProvider, com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(freelancerRepository, "freelancerRepository");
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(freelancerAccountSelectionInteractor, "freelancerAccountSelectionInteractor");
        Intrinsics.checkNotNullParameter(freelancerPocketsInteractor, "freelancerPocketsInteractor");
        Intrinsics.checkNotNullParameter(freelancerCashbackInteractor, "freelancerCashbackInteractor");
        Intrinsics.checkNotNullParameter(exchangeRatesProvider, "exchangeRatesProvider");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f129236a = walletInteractor;
        this.f129237b = freelancerRepository;
        this.f129238c = freelancerAccountDetailsInteractor;
        this.d = freelancerAccountSelectionInteractor;
        this.e = freelancerPocketsInteractor;
        this.f = freelancerCashbackInteractor;
        this.f129239g = transactionsInteractor;
    }

    public final efm.r a() {
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.c(nim.a.v(((y0) this.f).e(loadingStrategy), new w(24)), kotlin.coroutines.g.f186406a);
    }

    public final efm.r b() {
        return rd0.e.c(((i2) this.e).b(w4l.h.f294642c), kotlin.coroutines.g.f186406a);
    }

    public final efm.r c() {
        return ((au6.k2) this.f129237b).i.f(Unit.f186387a, false);
    }

    public final Object d(gim.i iVar) throws Throwable {
        au6.k2 k2Var = (au6.k2) this.f129237b;
        k2Var.getClass();
        au6.i2 i2Var = new au6.i2(k2Var, null, 1);
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, i2Var, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    public final pfm.a e(lr6.m0 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        au6.k2 k2Var = (au6.k2) this.f129237b;
        k2Var.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        FreelancerService freelancerService = k2Var.f9553a;
        Map map = ft6.k.f137948a;
        Intrinsics.checkNotNullParameter(params, "<this>");
        pfm.a aVarE = te0.w.g0(freelancerService.transferMoney(new com.revolut.feature.freelancer.impl.network.models.s0(params.f199413c, params.f199411a, params.f199412b, params.d.f306286a))).e(((mjf.b0) this.f129239g).g(tof.i1.f272794a));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }
}
