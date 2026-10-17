package njf;

import al4.m;
import com.revolut.core.model.account.AccountId;
import efm.c0;
import efm.r;
import g48.r0;
import io3.l;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mif.e0;
import n38.q;
import ne0.k;
import om4.r1;
import org.jetbrains.annotations.NotNull;
import tfm.c4;
import tfm.f4;
import tfm.n4;
import wsg.n;
import zhm.f0;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements nhf.a {

    @NotNull
    private static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f216493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj8.a f216494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xoj.a f216495c;
    public final u71.a d;
    public final mt8.d e;
    public final fbj.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final toa.a f216496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c61.a f216497h;
    public final g6e.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ap5.b f216498j;
    public final wif.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r0 f216499l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ang.f f216500m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final qmc.h f216501n;
    public final ppg.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f216502p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final al4.e f216503q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final jla.h f216504r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cw9.d f216505s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wa7.m f216506t;
    public final cl3.a u;
    public final Lazy v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Lazy f216507w;

    public j(n walletInteractor, hj8.a juniorProfileInteractor, xoj.a featuresInteractor, u71.a splitBillRepository, mt8.d kycInteractor, fbj.a cryptoDepositsInteractor, toa.a notificationSettingsInteractor, c61.a groupsProvider, g6e.d subaccountInteractor, ap5.b cryptoWithdrawInteractor, wif.a userFeaturesChecker, r0 jointAccountsInteractor, ang.f userInteractor, qmc.h roboPortfolioInfoProvider, ppg.a customisedVaultInteractor, m creditCardInstalmentInteractor, al4.e creditCardDebitToInstalmentInteractor, jla.h productCatalogueInteractor, cw9.d paymentsProductFeatureChecker, wa7.m hiddenAccountsInteractor, cl3.a contactsInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(splitBillRepository, "splitBillRepository");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(cryptoDepositsInteractor, "cryptoDepositsInteractor");
        Intrinsics.checkNotNullParameter(notificationSettingsInteractor, "notificationSettingsInteractor");
        Intrinsics.checkNotNullParameter(groupsProvider, "groupsProvider");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(cryptoWithdrawInteractor, "cryptoWithdrawInteractor");
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(roboPortfolioInfoProvider, "roboPortfolioInfoProvider");
        Intrinsics.checkNotNullParameter(customisedVaultInteractor, "customisedVaultInteractor");
        Intrinsics.checkNotNullParameter(creditCardInstalmentInteractor, "creditCardInstalmentInteractor");
        Intrinsics.checkNotNullParameter(creditCardDebitToInstalmentInteractor, "creditCardDebitToInstalmentInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        this.f216493a = walletInteractor;
        this.f216494b = juniorProfileInteractor;
        this.f216495c = featuresInteractor;
        this.d = splitBillRepository;
        this.e = kycInteractor;
        this.f = cryptoDepositsInteractor;
        this.f216496g = notificationSettingsInteractor;
        this.f216497h = groupsProvider;
        this.i = subaccountInteractor;
        this.f216498j = cryptoWithdrawInteractor;
        this.k = userFeaturesChecker;
        this.f216499l = jointAccountsInteractor;
        this.f216500m = userInteractor;
        this.f216501n = roboPortfolioInfoProvider;
        this.o = customisedVaultInteractor;
        this.f216502p = creditCardInstalmentInteractor;
        this.f216503q = creditCardDebitToInstalmentInteractor;
        this.f216504r = productCatalogueInteractor;
        this.f216505s = paymentsProductFeatureChecker;
        this.f216506t = hiddenAccountsInteractor;
        this.u = contactsInteractor;
        final int i = 0;
        this.v = yhm.j.b(new Function0(this) { // from class: njf.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f216489b;

            {
                this.f216489b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        j jVar = this.f216489b;
                        ang.f fVar = jVar.f216500m;
                        r a7 = fVar.f(false).x();
                        Intrinsics.checkNotNullExpressionValue(a7, "toObservable(...)");
                        wif.a aVar = jVar.k;
                        r b4 = aVar.d(wog.a.POCKETS).switchMap(new c(new b(jVar, 10), 8));
                        Intrinsics.checkNotNullExpressionValue(b4, "switchMap(...)");
                        n nVar = jVar.f216493a;
                        r c2 = nVar.E(AccountId.Personal.f51414a).x();
                        Intrinsics.checkNotNullExpressionValue(c2, "toObservable(...)");
                        r rVarG = m70.a.g(((ypg.b) jVar.o).c(), null, new nij.d(5), 1);
                        f0 f0Var = f0.f322471a;
                        r d = ue0.e.E(rVarG, f0Var);
                        r e = jVar.e();
                        ae8.c cVarC = jVar.f216505s.c();
                        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
                        r f = rd0.e.c(cVarC, gVar).switchMap(new nd3.a(new b(jVar, 1), 23));
                        Intrinsics.checkNotNullExpressionValue(f, "switchMap(...)");
                        r g3 = aVar.d(wog.a.BILL_ACCOUNTS).switchMap(new nd3.a(new b(jVar, 0), 22));
                        Intrinsics.checkNotNullExpressionValue(g3, "switchMap(...)");
                        xoj.a aVar2 = jVar.f216495c;
                        yoj.c cVar = yoj.c.CRYPTO;
                        cpj.b bVar = (cpj.b) aVar2;
                        r h2 = bVar.l(cVar).switchMap(new nd3.a(new b(jVar, 5), 28)).map(new nd3.a(new nhg.f0(21), 29));
                        Intrinsics.checkNotNullExpressionValue(h2, "map(...)");
                        r i2 = jVar.e.a(false);
                        r j2 = bVar.l(cVar).switchMap(new c(new b(jVar, 15), 10));
                        Intrinsics.checkNotNullExpressionValue(j2, "switchMap(...)");
                        toa.a aVar3 = jVar.f216496g;
                        Intrinsics.checkNotNullParameter(aVar3, "<this>");
                        r rVarDistinctUntilChanged = nim.a.w(aVar3.b(), new tlf.n(19)).distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                        r k = ue0.e.E(m70.a.g(rVarDistinctUntilChanged, null, new nij.d(8), 1), Boolean.FALSE).distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(k, "distinctUntilChanged(...)");
                        r l2 = jVar.a();
                        r m3 = jVar.c();
                        r n3 = bVar.l(yoj.c.ROBO).switchMap(new c(new b(jVar, 6), 0));
                        Intrinsics.checkNotNullExpressionValue(n3, "switchMap(...)");
                        r o = ue0.e.E(m70.a.g(pd.b.r(osg.b.e(nVar, false, l.MERCHANT, null, io3.i.INTERNAL, null, null, null, 116), new nhg.f0(22)), null, null, 3), zhm.r0.g());
                        r p2 = rd0.e.c(rd0.e.e(mo3.a.g(nim.a.v(((r1) jVar.f216502p).c(), new d(3)), null, new nij.d(16), 1), h0.f322473a, new n28.b(3, 9, null)), gVar);
                        r rVarSwitchMap = fVar.f(false).x().switchMap(new nd3.a(new b(jVar, 4), 27));
                        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                        r q5 = ue0.e.E(rVarSwitchMap, f0Var);
                        r r2 = rd0.e.c(jVar.f216506t.k(), gVar);
                        r s2 = jVar.d();
                        Intrinsics.checkNotNullParameter(a7, "a");
                        Intrinsics.checkNotNullParameter(b4, "b");
                        Intrinsics.checkNotNullParameter(c2, "c");
                        Intrinsics.checkNotNullParameter(d, "d");
                        Intrinsics.checkNotNullParameter(e, "e");
                        Intrinsics.checkNotNullParameter(f, "f");
                        Intrinsics.checkNotNullParameter(g3, "g");
                        Intrinsics.checkNotNullParameter(h2, "h");
                        Intrinsics.checkNotNullParameter(i2, "i");
                        Intrinsics.checkNotNullParameter(j2, "j");
                        Intrinsics.checkNotNullParameter(k, "k");
                        Intrinsics.checkNotNullParameter(l2, "l");
                        Intrinsics.checkNotNullParameter(m3, "m");
                        Intrinsics.checkNotNullParameter(n3, "n");
                        Intrinsics.checkNotNullParameter(o, "o");
                        Intrinsics.checkNotNullParameter(p2, "p");
                        Intrinsics.checkNotNullParameter(q5, "q");
                        Intrinsics.checkNotNullParameter(r2, "r");
                        Intrinsics.checkNotNullParameter(s2, "s");
                        r rVarCombineLatest = r.combineLatest(v.k(a7, b4, c2, d, e, f, g3, h2, i2, j2, k, l2, m3, n3, o, p2, q5, r2, s2), new vf0.n(new vea.n(27), 3));
                        Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
                        agm.a aVarReplay = rVarCombineLatest.map(new nd3.a(new nhg.f0(18), 26)).distinctUntilChanged().replay(1);
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        aVarReplay.getClass();
                        c0 c0Var = hhm.f.f152430b;
                        mfm.f.e(1, "subscriberCount");
                        mfm.f.b(timeUnit, "unit is null");
                        mfm.f.b(c0Var, "scheduler is null");
                        return new n4(aVarReplay instanceof c4 ? new f4(((c4) aVarReplay).f270387g) : aVarReplay, 2000L, timeUnit, c0Var);
                    default:
                        return new k(new b(this.f216489b, 7), null);
                }
            }
        });
        final int i2 = 1;
        this.f216507w = yhm.j.b(new Function0(this) { // from class: njf.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f216489b;

            {
                this.f216489b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        j jVar = this.f216489b;
                        ang.f fVar = jVar.f216500m;
                        r a7 = fVar.f(false).x();
                        Intrinsics.checkNotNullExpressionValue(a7, "toObservable(...)");
                        wif.a aVar = jVar.k;
                        r b4 = aVar.d(wog.a.POCKETS).switchMap(new c(new b(jVar, 10), 8));
                        Intrinsics.checkNotNullExpressionValue(b4, "switchMap(...)");
                        n nVar = jVar.f216493a;
                        r c2 = nVar.E(AccountId.Personal.f51414a).x();
                        Intrinsics.checkNotNullExpressionValue(c2, "toObservable(...)");
                        r rVarG = m70.a.g(((ypg.b) jVar.o).c(), null, new nij.d(5), 1);
                        f0 f0Var = f0.f322471a;
                        r d = ue0.e.E(rVarG, f0Var);
                        r e = jVar.e();
                        ae8.c cVarC = jVar.f216505s.c();
                        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
                        r f = rd0.e.c(cVarC, gVar).switchMap(new nd3.a(new b(jVar, 1), 23));
                        Intrinsics.checkNotNullExpressionValue(f, "switchMap(...)");
                        r g3 = aVar.d(wog.a.BILL_ACCOUNTS).switchMap(new nd3.a(new b(jVar, 0), 22));
                        Intrinsics.checkNotNullExpressionValue(g3, "switchMap(...)");
                        xoj.a aVar2 = jVar.f216495c;
                        yoj.c cVar = yoj.c.CRYPTO;
                        cpj.b bVar = (cpj.b) aVar2;
                        r h2 = bVar.l(cVar).switchMap(new nd3.a(new b(jVar, 5), 28)).map(new nd3.a(new nhg.f0(21), 29));
                        Intrinsics.checkNotNullExpressionValue(h2, "map(...)");
                        r i22 = jVar.e.a(false);
                        r j2 = bVar.l(cVar).switchMap(new c(new b(jVar, 15), 10));
                        Intrinsics.checkNotNullExpressionValue(j2, "switchMap(...)");
                        toa.a aVar3 = jVar.f216496g;
                        Intrinsics.checkNotNullParameter(aVar3, "<this>");
                        r rVarDistinctUntilChanged = nim.a.w(aVar3.b(), new tlf.n(19)).distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                        r k = ue0.e.E(m70.a.g(rVarDistinctUntilChanged, null, new nij.d(8), 1), Boolean.FALSE).distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(k, "distinctUntilChanged(...)");
                        r l2 = jVar.a();
                        r m3 = jVar.c();
                        r n3 = bVar.l(yoj.c.ROBO).switchMap(new c(new b(jVar, 6), 0));
                        Intrinsics.checkNotNullExpressionValue(n3, "switchMap(...)");
                        r o = ue0.e.E(m70.a.g(pd.b.r(osg.b.e(nVar, false, l.MERCHANT, null, io3.i.INTERNAL, null, null, null, 116), new nhg.f0(22)), null, null, 3), zhm.r0.g());
                        r p2 = rd0.e.c(rd0.e.e(mo3.a.g(nim.a.v(((r1) jVar.f216502p).c(), new d(3)), null, new nij.d(16), 1), h0.f322473a, new n28.b(3, 9, null)), gVar);
                        r rVarSwitchMap = fVar.f(false).x().switchMap(new nd3.a(new b(jVar, 4), 27));
                        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                        r q5 = ue0.e.E(rVarSwitchMap, f0Var);
                        r r2 = rd0.e.c(jVar.f216506t.k(), gVar);
                        r s2 = jVar.d();
                        Intrinsics.checkNotNullParameter(a7, "a");
                        Intrinsics.checkNotNullParameter(b4, "b");
                        Intrinsics.checkNotNullParameter(c2, "c");
                        Intrinsics.checkNotNullParameter(d, "d");
                        Intrinsics.checkNotNullParameter(e, "e");
                        Intrinsics.checkNotNullParameter(f, "f");
                        Intrinsics.checkNotNullParameter(g3, "g");
                        Intrinsics.checkNotNullParameter(h2, "h");
                        Intrinsics.checkNotNullParameter(i22, "i");
                        Intrinsics.checkNotNullParameter(j2, "j");
                        Intrinsics.checkNotNullParameter(k, "k");
                        Intrinsics.checkNotNullParameter(l2, "l");
                        Intrinsics.checkNotNullParameter(m3, "m");
                        Intrinsics.checkNotNullParameter(n3, "n");
                        Intrinsics.checkNotNullParameter(o, "o");
                        Intrinsics.checkNotNullParameter(p2, "p");
                        Intrinsics.checkNotNullParameter(q5, "q");
                        Intrinsics.checkNotNullParameter(r2, "r");
                        Intrinsics.checkNotNullParameter(s2, "s");
                        r rVarCombineLatest = r.combineLatest(v.k(a7, b4, c2, d, e, f, g3, h2, i22, j2, k, l2, m3, n3, o, p2, q5, r2, s2), new vf0.n(new vea.n(27), 3));
                        Intrinsics.checkNotNullExpressionValue(rVarCombineLatest, "combineLatest(...)");
                        agm.a aVarReplay = rVarCombineLatest.map(new nd3.a(new nhg.f0(18), 26)).distinctUntilChanged().replay(1);
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        aVarReplay.getClass();
                        c0 c0Var = hhm.f.f152430b;
                        mfm.f.e(1, "subscriberCount");
                        mfm.f.b(timeUnit, "unit is null");
                        mfm.f.b(c0Var, "scheduler is null");
                        return new n4(aVarReplay instanceof c4 ? new f4(((c4) aVarReplay).f270387g) : aVarReplay, 2000L, timeUnit, c0Var);
                    default:
                        return new k(new b(this.f216489b, 7), null);
                }
            }
        });
    }

    public final r a() {
        q[] elements = {q.ACTIVE, q.OFFBOARDING, q.PENDING};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return pd.b.r(nim.a.w(e0.h(rd0.e.c(this.f216499l.e(kotlin.collections.d.y0(elements), w4l.h.f294642c), kotlin.coroutines.g.f186406a)), new nhg.f0(20)), new b(this, 3));
    }

    public final r b(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        if (accountId instanceof AccountId.Joint) {
            return ((k) this.f216507w.getValue()).a(accountId);
        }
        r rVarError = r.error(new IllegalArgumentException("Only joint account id could be used!"));
        Intrinsics.checkNotNullExpressionValue(rVarError, "error(...)");
        return rVarError;
    }

    public final r c() {
        r rVarSwitchMap = this.k.d(wog.a.JUNIOR).switchMap(new c(new b(this, 8), 1));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    public final r d() {
        r rVarE = ue0.e.E(cl3.a.a(this.u), zhm.r0.g());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Map mapG = zhm.r0.g();
        r rVarDefaultIfEmpty = rVarE.materialize().publish(new ly7.g(8, new h(mapG, 0))).dematerialize(new ly7.g(8, i.f216492a)).defaultIfEmpty(mapG);
        Intrinsics.checkNotNullExpressionValue(rVarDefaultIfEmpty, "defaultIfEmpty(...)");
        r rVarDistinctUntilChanged = rVarDefaultIfEmpty.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public final r e() {
        r rVarSwitchMap = rd0.e.c(this.f216505s.f109573b.A("BILLS_AND_TAXES.split_bill"), kotlin.coroutines.g.f186406a).switchMap(new nd3.a(new b(this, 2), 24));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    public final r f() {
        r rVar = (r) this.v.getValue();
        Intrinsics.checkNotNullExpressionValue(rVar, "<get-extraDataObservable>(...)");
        return rVar;
    }
}
