package x8h;

import ip0.v7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f303354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e8h.e f303355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tzg.m f303356c;
    public final ybl.k d;
    public final i e;

    public k(wsg.n walletInteractor, e8h.e displayCurrencyRepository, tzg.m wealthAccountsInteractor, ybl.k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(displayCurrencyRepository, "displayCurrencyRepository");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f303354a = walletInteractor;
        this.f303355b = displayCurrencyRepository;
        this.f303356c = wealthAccountsInteractor;
        this.d = tradingAccountsInteractor;
        this.e = new i();
    }

    public final jhi.b a() {
        return mo3.a.g(zi0.c.w(b()), null, new x48.a(13), 1);
    }

    public final wkm.l b() {
        return vkm.q.Q(v7.y("DisplayCurrencyInteractorImpl", "observeSelectedCurrencyData", vkm.q.q(nim.a.v(this.f303355b.f123681b.f(new tk0.d(e8h.e.d)), new e8e.y(6)))), new x18.e((Continuation) null, this, 4));
    }

    public final akg.n c() {
        return nim.a.v(zh9.u0.m(b(), boh.f.e(zh9.u0.k(zhm.v.k(nim.a.A(com.revolut.data.database.models.openbanking.d.x("AvailableDisplayCurrenciesInteractor", "observeTradingAccountsCurrencies", nim.a.v(ybl.k.k(this.d, null, null, null, 7), new x64.a(28))), new x64.a(29)), nim.a.v(((v0) this.f303356c).f(), new h(0)))), new d(this, 2))), new x64.a(27));
    }

    public final Object d(xi0.b bVar, gim.i iVar) throws Throwable {
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, new e8e.w(this.f303355b, bVar, null, 1), iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }
}
