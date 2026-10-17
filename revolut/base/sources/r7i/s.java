package r7i;

import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature_move_money.api.model.AccountSource;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.retail.feature.balance.picker.api.models.JuniorInfo;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import r40.n0;
import r40.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zf8.k f252243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zf8.n f252244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te8.v f252245c;
    public final te8.r d;
    public final jpc.e e;
    public final c8i.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jla.h f252246g;

    public s(zf8.k juniorAccountInfoProvider, zf8.n juniorAccountStatesProvider, te8.v juniorPocketsProductInteractor, te8.r savingsProductInteractor, jpc.e juniorInfoProvider, c8i.a moveMoneyAccountPairEligibilityChecker, jla.h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(juniorAccountInfoProvider, "juniorAccountInfoProvider");
        Intrinsics.checkNotNullParameter(juniorAccountStatesProvider, "juniorAccountStatesProvider");
        Intrinsics.checkNotNullParameter(juniorPocketsProductInteractor, "juniorPocketsProductInteractor");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(juniorInfoProvider, "juniorInfoProvider");
        Intrinsics.checkNotNullParameter(moveMoneyAccountPairEligibilityChecker, "moveMoneyAccountPairEligibilityChecker");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f252243a = juniorAccountInfoProvider;
        this.f252244b = juniorAccountStatesProvider;
        this.f252245c = juniorPocketsProductInteractor;
        this.d = savingsProductInteractor;
        this.e = juniorInfoProvider;
        this.f = moveMoneyAccountPairEligibilityChecker;
        this.f252246g = productCatalogueInteractor;
    }

    public static boolean b(JuniorInfo juniorInfo, AccountWrapper accountWrapper) {
        if (accountWrapper == null) {
            return true;
        }
        AccountSource accountSource = accountWrapper.d;
        JuniorInfo juniorInfo2 = accountSource instanceof AccountSource.JuniorPocketSource ? ((AccountSource.JuniorPocketSource) accountSource).f97203a : accountSource instanceof AccountSource.JuniorSavingsSource ? ((AccountSource.JuniorSavingsSource) accountSource).f97206a : accountSource instanceof AccountSource.JuniorVaultSource ? ((AccountSource.JuniorVaultSource) accountSource).f97208a : null;
        if (juniorInfo2 == null) {
            return true;
        }
        return Intrinsics.f(juniorInfo, juniorInfo2);
    }

    public final d0 a() {
        d0 d0VarFirstOrError = rd0.e.c(bla.b.b(this.f252246g, ne8.a.f214420c.a()), kotlin.coroutines.g.f186406a).map(new r4j.b(new r(1), 21)).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final ufm.i c(JuniorInfo juniorInfo) {
        String str = juniorInfo.f99454a;
        String str2 = juniorInfo.f;
        zf8.k kVar = this.f252243a;
        w4l.j jVar = w4l.j.f294644c;
        d0 d0VarFirstOrError = m70.a.g(zi0.c.J(rd0.e.c(kVar.c(str2, jVar), kotlin.coroutines.g.f186406a)), null, new r6d.h(7), 1).firstOrError();
        r4j.b bVar = new r4j.b(new n0(str, 4), 18);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, bVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        String str3 = juniorInfo.f99454a;
        d0 d0VarFirstOrError2 = m70.a.g(zi0.c.J(this.f252244b.d(str2, jVar)), null, new r6d.h(6), 1).firstOrError();
        r4j.b bVar2 = new r4j.b(new n0(str3, 3), 17);
        d0VarFirstOrError2.getClass();
        ufm.i iVar2 = new ufm.i(d0VarFirstOrError2, bVar2, 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        ufm.i iVar3 = new ufm.i(te0.w.H0(iVar, iVar2), new r4j.b(new y0(29), 14), 1);
        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
        return iVar3;
    }

    public final ufm.i d(JuniorInfo juniorProfile, io3.d pocket, x5i.d dVar, AccountWrapper accountWrapper) {
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        d0 d0VarA = a();
        r4j.b bVar = new r4j.b(new kwg.e(pocket, this, juniorProfile, accountWrapper, dVar, 27), 15);
        d0VarA.getClass();
        ufm.i iVar = new ufm.i(d0VarA, bVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final ufm.i e(JuniorInfo juniorProfile, SavingsAccountDetails account, x5i.d dVar, AccountWrapper accountWrapper) {
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(account, "account");
        d0 d0VarA = a();
        r4j.b bVar = new r4j.b(new q(this, juniorProfile, accountWrapper, account, dVar, 0), 12);
        d0VarA.getClass();
        ufm.i iVar = new ufm.i(d0VarA, bVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final ufm.i f(JuniorInfo juniorProfile, pcd.s vault, x5i.d dVar, AccountWrapper accountWrapper) {
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        Intrinsics.checkNotNullParameter(vault, "vault");
        d0 d0VarA = a();
        r4j.b bVar = new r4j.b(new kwg.e(vault, this, juniorProfile, accountWrapper, dVar, 28), 20);
        d0VarA.getClass();
        ufm.i iVar = new ufm.i(d0VarA, bVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
