package rbh;

import ael.q0;
import com.revolut.retail.trading.core.domain.PocketInfo;
import com.revolut.retail.trading.core.domain.PocketOwnerInfo;
import djb.k;
import et6.i2;
import g48.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import om4.x2;
import r40.n0;
import tnb.g0;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.b f253092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f253093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ppg.b f253094c;
    public final djb.n d;
    public final r0 e;
    public final gr6.m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final al4.n f253095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gte.a f253096h;
    public final wzg.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ybl.l f253097j;
    public final cm4.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sbh.a f253098l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r10.q f253099m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ybl.k f253100n;
    public final g0 o;

    public r(wsg.b walletInteractor, wsg.n obsoleteWalletInteractor, ppg.b vaultsInteractor, djb.n savingsAccountsDetailsInteractor, r0 jointAccountsInteractor, gr6.m freelancerPocketsInteractor, al4.n creditCardInteractor, gte.a featureToggleInteractor, wzg.a cashHoldingsInteractor, ybl.l tradingConfigInteractor, cm4.a creditCardBaseMapper, sbh.a cashHoldingMapper, r10.q userRegisteredIdentitiesInteractor, ybl.k tradingAccountsInteractor, g0 tradingCurrencyCompatibilityInteractor, s pocketResolver) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(obsoleteWalletInteractor, "obsoleteWalletInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(freelancerPocketsInteractor, "freelancerPocketsInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cashHoldingsInteractor, "cashHoldingsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(creditCardBaseMapper, "creditCardBaseMapper");
        Intrinsics.checkNotNullParameter(cashHoldingMapper, "cashHoldingMapper");
        Intrinsics.checkNotNullParameter(userRegisteredIdentitiesInteractor, "userRegisteredIdentitiesInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingCurrencyCompatibilityInteractor, "tradingCurrencyCompatibilityInteractor");
        Intrinsics.checkNotNullParameter(pocketResolver, "pocketResolver");
        this.f253092a = walletInteractor;
        this.f253093b = obsoleteWalletInteractor;
        this.f253094c = vaultsInteractor;
        this.d = savingsAccountsDetailsInteractor;
        this.e = jointAccountsInteractor;
        this.f = freelancerPocketsInteractor;
        this.f253095g = creditCardInteractor;
        this.f253096h = featureToggleInteractor;
        this.i = cashHoldingsInteractor;
        this.f253097j = tradingConfigInteractor;
        this.k = creditCardBaseMapper;
        this.f253098l = cashHoldingMapper;
        this.f253099m = userRegisteredIdentitiesInteractor;
        this.f253100n = tradingAccountsInteractor;
        this.o = tradingCurrencyCompatibilityInteractor;
    }

    public static PocketInfo e(io3.d dVar, PocketOwnerInfo pocketOwnerInfo) {
        xi0.a aVar = xi0.b.Companion;
        String str = dVar.f163147c;
        String str2 = dVar.f163145a;
        aVar.getClass();
        return cp5.d.y(xi0.a.a(str)) ? new PocketInfo.CommodityPocket(str2, io3.h.e(dVar), null, pocketOwnerInfo) : cp5.d.z(xi0.a.a(dVar.f163147c)) ? new PocketInfo.CryptoPocket(str2, io3.h.e(dVar), null, pocketOwnerInfo) : new PocketInfo.CurrencyPocket(str2, io3.h.e(dVar), null, pocketOwnerInfo);
    }

    public final Flow a(j1j.d selectedBalance) {
        Intrinsics.checkNotNullParameter(selectedBalance, "selectedBalance");
        k1j.a aVar = selectedBalance.d;
        String str = selectedBalance.f170617a;
        int i = p.f253089a[aVar.ordinal()];
        wsg.b bVar = this.f253092a;
        w4l.h hVar = w4l.h.f294642c;
        w4l.j jVar = w4l.j.f294644c;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                return b(str);
            case 5:
                return boh.f.e(rd0.e.b(((ypg.p) this.f253094c).f(jVar, pcd.g.f234858b)), new o(str, this, 3));
            case 6:
                return boh.f.e(rd0.e.b(((rnb.i) this.d).f(k.b.f115282a, jVar)), new o(str, this, 4));
            case 7:
                return boh.f.e(this.e.h(hVar), new o(this, str));
            case 8:
                return boh.f.e(u0.m(nim.a.v(bVar.b(hVar), new n0(str, 7)), ((i2) this.f).c(hVar)), new o(str, this, 2));
            case 9:
                x2 x2Var = (x2) this.f253095g;
                return boh.f.e(u0.i(x2Var.l(hVar), x2Var.B(str, hVar), nim.a.v(bVar.b(hVar), new n0(str, 7))), new o(str, this, 1));
            case 10:
            case 11:
                return boh.f.e(u0.m(ybl.l.d(this.f253097j), ((c9h.k) this.i).i(str, cfl.f.f23741a, jVar)), new o(str, this, 5));
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                return new go.g(zi0.c.O(new IllegalStateException(p.a.p("Selected balance of type ", selectedBalance.d.name(), " not supported."))), 2);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Flow b(String pocketId) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        return boh.f.e(nim.a.v(this.f253092a.b(w4l.h.f294642c), new n0(pocketId, 7)), new n(this, 1));
    }

    public final Flow c(String portfolioId, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        return boh.f.e(((q0) this.f253100n).o(portfolioId, w4l.h.f294642c), new qz9.o(this, 12, portfolioId, currency));
    }

    public final Flow d(String str) {
        r10.q qVar = this.f253099m;
        return qVar.E() ? nim.a.v(r10.q.j0(qVar, do3.f.BANKING, null, 6), new n0(str, 8)) : zi0.c.i(new PocketOwnerInfo(null, false, true));
    }
}
