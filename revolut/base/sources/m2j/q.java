package m2j;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.balance.picker.api.interactor.BalancesInteractor$InputData;
import et6.h1;
import et6.i2;
import g48.r0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.v9;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class q {

    @NotNull
    public static final o Companion = new o();
    public static final Set u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ppg.b f202067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f202068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.n f202069c;
    public final al4.n d;
    public final r0 e;
    public final h1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t70.b f202070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ldi.f f202071h;
    public final qd0.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f01.c f202072j;
    public final djb.n k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final toh.d f202073l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f0 f202074m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final djb.u f202075n;
    public final z o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j0 f202076p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n2j.d f202077q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n2j.j f202078r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n2j.e f202079s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n2j.c f202080t;

    static {
        k1j.a[] elements = {k1j.a.VAULTS, k1j.a.PRO_VAULTS, k1j.a.JOINT_VAULTS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        u = kotlin.collections.d.y0(elements);
    }

    public q(ppg.b vaultsInteractor, ang.f userInteractor, wsg.n walletInteractor, al4.n creditCardInteractor, r0 jointAccountsInteractor, h1 freelancerInteractor, t70.b currencyLocalization, ldi.f revPointsPocketInteractor, qd0.b languageProvider, f01.c uiKitResources, djb.n savingAccountsInteractor, toh.d savingsAvailabilityInteractor, f0 savingsBalancesInteractor, djb.u tradingOnboardingStatusProvider, z juniorBalancesInteractor, j0 teenBalancesInteractor, n2j.d personalBalancesPocketsDataProvider, n2j.j tradingBalancesDataProvider, he2.b collateralBalancesDataProvider, n2j.e revPointsBalancesDataProvider, n2j.c deFiBalancesDataProvider) {
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(currencyLocalization, "currencyLocalization");
        Intrinsics.checkNotNullParameter(revPointsPocketInteractor, "revPointsPocketInteractor");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(savingAccountsInteractor, "savingAccountsInteractor");
        Intrinsics.checkNotNullParameter(savingsAvailabilityInteractor, "savingsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(savingsBalancesInteractor, "savingsBalancesInteractor");
        Intrinsics.checkNotNullParameter(tradingOnboardingStatusProvider, "tradingOnboardingStatusProvider");
        Intrinsics.checkNotNullParameter(juniorBalancesInteractor, "juniorBalancesInteractor");
        Intrinsics.checkNotNullParameter(teenBalancesInteractor, "teenBalancesInteractor");
        Intrinsics.checkNotNullParameter(personalBalancesPocketsDataProvider, "personalBalancesPocketsDataProvider");
        Intrinsics.checkNotNullParameter(tradingBalancesDataProvider, "tradingBalancesDataProvider");
        Intrinsics.checkNotNullParameter(collateralBalancesDataProvider, "collateralBalancesDataProvider");
        Intrinsics.checkNotNullParameter(revPointsBalancesDataProvider, "revPointsBalancesDataProvider");
        Intrinsics.checkNotNullParameter(deFiBalancesDataProvider, "deFiBalancesDataProvider");
        this.f202067a = vaultsInteractor;
        this.f202068b = userInteractor;
        this.f202069c = walletInteractor;
        this.d = creditCardInteractor;
        this.e = jointAccountsInteractor;
        this.f = freelancerInteractor;
        this.f202070g = currencyLocalization;
        this.f202071h = revPointsPocketInteractor;
        this.i = languageProvider;
        this.f202072j = uiKitResources;
        this.k = savingAccountsInteractor;
        this.f202073l = savingsAvailabilityInteractor;
        this.f202074m = savingsBalancesInteractor;
        this.f202075n = tradingOnboardingStatusProvider;
        this.o = juniorBalancesInteractor;
        this.f202076p = teenBalancesInteractor;
        this.f202077q = personalBalancesPocketsDataProvider;
        this.f202078r = tradingBalancesDataProvider;
        this.f202079s = revPointsBalancesDataProvider;
        this.f202080t = deFiBalancesDataProvider;
    }

    public static TextLocalisedClause a(int i) {
        return new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
    }

    public static List b(List list, BalancesInteractor$InputData balancesInteractor$InputData, Function1 function1) {
        Set set = balancesInteractor$InputData.d;
        Set set2 = balancesInteractor$InputData.e;
        if (set.isEmpty() && set2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            String str = (String) function1.invoke(obj2);
            boolean z = set.isEmpty() || set.contains(str);
            boolean zContains = set2.contains(str);
            if (z && !zContains) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List c(List list, BalancesInteractor$InputData balancesInteractor$InputData) {
        return b(list, balancesInteractor$InputData, new m2g.c(11));
    }

    public static boolean i(i1j.a aVar, k1j.a aVar2) {
        k1j.c cVar;
        int i = p.f202066b[aVar2.ordinal()];
        if (i == 1) {
            cVar = k1j.c.SUBACCOUNTS;
        } else if (i == 2) {
            cVar = k1j.c.JOINT_SUBACCOUNTS;
        } else if (i == 3) {
            cVar = k1j.c.PRO_VAULTS;
        } else if (i == 4) {
            cVar = k1j.c.YOUTH_VAULTS;
        } else {
            if (i != 5) {
                throw new IllegalArgumentException("Unsupported Vault type for default filtering " + aVar2);
            }
            cVar = k1j.c.TEEN_VAULTS;
        }
        if (aVar != null) {
            return aVar.b(cVar);
        }
        return true;
    }

    public final efm.d0 d(BalancesInteractor$InputData balancesInteractor$InputData, k1j.a aVar, i1j.a aVar2) {
        return balancesInteractor$InputData.f99395c.contains(aVar) ? (u.contains(aVar) && i(aVar2, aVar)) ? new ufm.i(new ufm.i(this.f202068b.f(false), new m1i.j0(new k(this, 1), 15), 1), new m1i.j0(new m2g.c(12), 16), 1) : efm.d0.m(Boolean.TRUE) : efm.d0.m(Boolean.FALSE);
    }

    public final efm.r e(BalancesInteractor$InputData inputData) {
        efm.r rVarC;
        efm.r rVarC2;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        int i = p.f202065a[inputData.f99393a.ordinal()];
        w4l.h loadingStrategy = w4l.h.f294642c;
        if (i == 1) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            BalancesInteractor$InputData.RegisteredIdentity registeredIdentity = inputData.f99396g;
            boolean z = registeredIdentity instanceof BalancesInteractor$InputData.RegisteredIdentity.Selected;
            n2j.d dVar = this.f202077q;
            if (z) {
                rVarC2 = osg.b.g(dVar.f211562a, loadingStrategy, null, null, null, null, qsg.a.RECENT_FIRST, null, 94);
            } else {
                if (!(registeredIdentity instanceof BalancesInteractor$InputData.RegisteredIdentity.Custom)) {
                    throw new NoWhenBranchMatchedException();
                }
                rVarC2 = rd0.e.c(nim.a.v(dVar.f211563b.c(((BalancesInteractor$InputData.RegisteredIdentity.Custom) registeredIdentity).f99400a, loadingStrategy), new n1j.t(17)), p0.f264003c);
            }
            rVarC = nim.a.w(rVarC2, new m(inputData));
        } else {
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            rVarC = rd0.e.c(((i2) this.f.e).c(loadingStrategy), kotlin.coroutines.g.f186406a);
        }
        return nim.a.w(rVarC, new l(this, inputData, 5));
    }

    public final efm.r f(BalancesInteractor$InputData inputData, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        boolean zContains = inputData.f99395c.contains(k1j.a.SAVINGS);
        f0 f0Var = this.f202074m;
        return rd0.e.c(boh.f.e(zContains ? toh.d.g(f0Var.f202031b, null, 3) : new go.g(zi0.c.P(Boolean.FALSE, false, null, 3), 2), new li8.n(f0Var, 16, inputData, loadingStrategy)), kotlin.coroutines.g.f186406a);
    }

    public final efm.r g(BalancesInteractor$InputData inputData, AccountId accountId) {
        cfl.i hVar;
        cfl.n nVar;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Set set = inputData.f99395c;
        if (!set.contains(k1j.a.TRADING_ACCOUNTS) && !set.contains(k1j.a.JOINT_TRADING_ACCOUNTS)) {
            return zi0.c.j(a.f202010a);
        }
        n2j.j jVar = this.f202078r;
        akg.n nVarV = nim.a.v(jVar.f211578c.j(w4l.h.f294642c), new n1j.t(18));
        ybl.k kVar = jVar.f211576a;
        BalancesInteractor$InputData.RegisteredIdentity registeredIdentity = inputData.f99396g;
        if (Intrinsics.f(registeredIdentity, BalancesInteractor$InputData.RegisteredIdentity.Selected.f99401a)) {
            hVar = cfl.g.f23742a;
        } else {
            if (!(registeredIdentity instanceof BalancesInteractor$InputData.RegisteredIdentity.Custom)) {
                throw new NoWhenBranchMatchedException();
            }
            hVar = new cfl.h(((BalancesInteractor$InputData.RegisteredIdentity.Custom) registeredIdentity).f99400a);
        }
        if (accountId instanceof AccountId.Personal) {
            nVar = cfl.m.f23746a;
        } else {
            if (!(accountId instanceof AccountId.Joint)) {
                throw new NoWhenBranchMatchedException();
            }
            nVar = cfl.l.f23745a;
        }
        return rd0.e.c(nim.a.v(boh.f.e(nim.a.v(u0.m(nVarV, ybl.k.k(kVar, null, hVar, nVar, 1)), new n09.j0(jVar, inputData, 17)), new moe.c(jVar, 24, inputData, accountId)), new v9(1, jVar.d, n2j.l.class, "toBalanceGroupResult", "toBalanceGroupResult(Ljava/util/List;)Lcom/revolut/retail/feature/balance/picker/impl/new_picker/interactor/BalanceGroupResult;", 0, 8)), kotlin.coroutines.g.f186406a);
    }

    public final efm.r h(BalancesInteractor$InputData inputData, w4l.k loadingStrategy, i1j.a aVar) {
        efm.r rVarO;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        sfm.b bVar = new sfm.b(d(inputData, k1j.a.VAULTS, aVar), new m1i.j0(new ja3.d(this, inputData, loadingStrategy, aVar, 20), 12), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        efm.r rVarO2 = zi0.c.o(bVar);
        if (inputData.f99395c.contains(k1j.a.REV_POINTS_POCKETS)) {
            rVarO = zi0.c.o(nim.a.w(rd0.e.c(this.f202071h.c(loadingStrategy), kotlin.coroutines.g.f186406a), new l(this, inputData, 1)));
        } else {
            rVarO = efm.r.just(new Data(zhm.f0.f322471a, null, false, 6, null));
            Intrinsics.checkNotNullExpressionValue(rVarO, "just(...)");
        }
        return nim.a.w(kli.a.h(rVarO2, rVarO), new k(this, 0));
    }
}
