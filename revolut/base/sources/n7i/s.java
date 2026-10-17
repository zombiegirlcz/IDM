package n7i;

import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import et6.h1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes10.dex */
public final class s implements w5i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1 f213139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ldi.f f213140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c8i.a f213141c;
    public final r7i.s d;
    public final g8i.a e;
    public final r7i.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r7i.a0 f213142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ou5.b f213143h;
    public final r7i.p i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k18.c f213144j;
    public final r7i.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kbb.c f213145l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r7i.w f213146m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r7i.h f213147n;

    public s(h1 proInteractor, ldi.f revPointsPocketInteractor, c8i.a moveMoneyAccountPairEligibilityChecker, r7i.s juniorAccountsEligibilityChecker, g8i.a teenAccountsEligibilityChecker, r7i.g cryptoEligibilityChecker, r7i.a0 subaccountsEligibilityChecker, ou5.b savingsEligibilityChecker, r7i.p investAccountsEligibilityChecker, k18.c commodityEligibilityChecker, r7i.f creditCardEligibilityChecker, kbb.c moveMoneyPocketCountryProfilesEligibilityChecker, r7i.w spotMarginCollateralEligibilityChecker, r7i.h futuresCollateralEligibilityChecker) {
        Intrinsics.checkNotNullParameter(proInteractor, "proInteractor");
        Intrinsics.checkNotNullParameter(revPointsPocketInteractor, "revPointsPocketInteractor");
        Intrinsics.checkNotNullParameter(moveMoneyAccountPairEligibilityChecker, "moveMoneyAccountPairEligibilityChecker");
        Intrinsics.checkNotNullParameter(juniorAccountsEligibilityChecker, "juniorAccountsEligibilityChecker");
        Intrinsics.checkNotNullParameter(teenAccountsEligibilityChecker, "teenAccountsEligibilityChecker");
        Intrinsics.checkNotNullParameter(cryptoEligibilityChecker, "cryptoEligibilityChecker");
        Intrinsics.checkNotNullParameter(subaccountsEligibilityChecker, "subaccountsEligibilityChecker");
        Intrinsics.checkNotNullParameter(savingsEligibilityChecker, "savingsEligibilityChecker");
        Intrinsics.checkNotNullParameter(investAccountsEligibilityChecker, "investAccountsEligibilityChecker");
        Intrinsics.checkNotNullParameter(commodityEligibilityChecker, "commodityEligibilityChecker");
        Intrinsics.checkNotNullParameter(creditCardEligibilityChecker, "creditCardEligibilityChecker");
        Intrinsics.checkNotNullParameter(moveMoneyPocketCountryProfilesEligibilityChecker, "moveMoneyPocketCountryProfilesEligibilityChecker");
        Intrinsics.checkNotNullParameter(spotMarginCollateralEligibilityChecker, "spotMarginCollateralEligibilityChecker");
        Intrinsics.checkNotNullParameter(futuresCollateralEligibilityChecker, "futuresCollateralEligibilityChecker");
        this.f213139a = proInteractor;
        this.f213140b = revPointsPocketInteractor;
        this.f213141c = moveMoneyAccountPairEligibilityChecker;
        this.d = juniorAccountsEligibilityChecker;
        this.e = teenAccountsEligibilityChecker;
        this.f = cryptoEligibilityChecker;
        this.f213142g = subaccountsEligibilityChecker;
        this.f213143h = savingsEligibilityChecker;
        this.i = investAccountsEligibilityChecker;
        this.f213144j = commodityEligibilityChecker;
        this.k = creditCardEligibilityChecker;
        this.f213145l = moveMoneyPocketCountryProfilesEligibilityChecker;
        this.f213146m = spotMarginCollateralEligibilityChecker;
        this.f213147n = futuresCollateralEligibilityChecker;
    }

    public static boolean a(AccountWrapper accountWrapper) {
        xi0.b currency = accountWrapper != null ? accountWrapper.getCurrency() : null;
        xi0.b.Companion.getClass();
        return !Intrinsics.f(currency, xi0.b.D);
    }

    public final ufm.i b(io3.d pocket, k1j.a balanceType, x5i.d dVar, AccountWrapper accountWrapper) {
        efm.d0 iVar;
        efm.d0 d0Var;
        efm.d0 d0VarM;
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(balanceType, "balanceType");
        switch (r.f213137a[balanceType.ordinal()]) {
            case 1:
                iVar = new ufm.i(te0.w.o0(p0.f264003c, new n3j.w(this, pocket, (Continuation) null, 10)), new n4d.a0(new n45.b(pocket, this, accountWrapper), 18), 1);
                d0Var = iVar;
                n4d.a0 a0Var = new n4d.a0(new kwg.e(this, pocket, balanceType, accountWrapper, dVar, 6), 19);
                d0Var.getClass();
                ufm.i iVar2 = new ufm.i(d0Var, a0Var, 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return iVar2;
            case 2:
                iVar = new ufm.c(new q(pocket, this, accountWrapper), 2);
                d0Var = iVar;
                n4d.a0 a0Var2 = new n4d.a0(new kwg.e(this, pocket, balanceType, accountWrapper, dVar, 6), 19);
                d0Var.getClass();
                ufm.i iVar22 = new ufm.i(d0Var, a0Var2, 1);
                Intrinsics.checkNotNullExpressionValue(iVar22, "map(...)");
                return iVar22;
            case 3:
                iVar = new ufm.c(new a80.b(pocket, this, accountWrapper, dVar, 7), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "defer(...)");
                d0Var = iVar;
                n4d.a0 a0Var22 = new n4d.a0(new kwg.e(this, pocket, balanceType, accountWrapper, dVar, 6), 19);
                d0Var.getClass();
                ufm.i iVar222 = new ufm.i(d0Var, a0Var22, 1);
                Intrinsics.checkNotNullExpressionValue(iVar222, "map(...)");
                return iVar222;
            case 4:
                iVar = new ufm.c(new q(accountWrapper, this, pocket), 2);
                d0Var = iVar;
                n4d.a0 a0Var222 = new n4d.a0(new kwg.e(this, pocket, balanceType, accountWrapper, dVar, 6), 19);
                d0Var.getClass();
                ufm.i iVar2222 = new ufm.i(d0Var, a0Var222, 1);
                Intrinsics.checkNotNullExpressionValue(iVar2222, "map(...)");
                return iVar2222;
            case 5:
                d0VarM = efm.d0.m(Boolean.TRUE);
                Intrinsics.checkNotNullExpressionValue(d0VarM, "just(...)");
                d0Var = d0VarM;
                n4d.a0 a0Var2222 = new n4d.a0(new kwg.e(this, pocket, balanceType, accountWrapper, dVar, 6), 19);
                d0Var.getClass();
                ufm.i iVar22222 = new ufm.i(d0Var, a0Var2222, 1);
                Intrinsics.checkNotNullExpressionValue(iVar22222, "map(...)");
                return iVar22222;
            case 6:
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                xi0.a aVar = xi0.b.Companion;
                String str = pocket.f163147c;
                aVar.getClass();
                if (cp5.d.y(xi0.a.a(str)) && pocket.f == io3.k.ACTIVE) {
                    k18.c cVar = this.f213144j;
                    efm.r rVarE = m70.a.e(zi0.c.J(ue0.e.p(nim.a.w(((zj3.a) ((tj3.a) cVar.f180140b)).b(), new qz9.o(accountWrapper, 9, dVar, cVar)), zhm.h0.f322473a)), new ku1.f0(22), new r6d.h(2));
                    Boolean bool = Boolean.FALSE;
                    d0VarM = ue0.e.E(rVarE, bool).first(bool);
                    Intrinsics.checkNotNullExpressionValue(d0VarM, "first(...)");
                } else {
                    d0VarM = efm.d0.m(Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(d0VarM, "just(...)");
                }
                d0Var = d0VarM;
                n4d.a0 a0Var22222 = new n4d.a0(new kwg.e(this, pocket, balanceType, accountWrapper, dVar, 6), 19);
                d0Var.getClass();
                ufm.i iVar222222 = new ufm.i(d0Var, a0Var22222, 1);
                Intrinsics.checkNotNullExpressionValue(iVar222222, "map(...)");
                return iVar222222;
            default:
                throw new IllegalStateException("Not supported type of pocket " + balanceType);
        }
    }

    public final efm.d0 c() {
        efm.d0 d0VarFirst = rd0.e.c(this.f213140b.c(w4l.h.f294642c), kotlin.coroutines.g.f186406a).map(new n4d.a0(new n5k.c(16), 17)).first(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(d0VarFirst, "first(...)");
        return d0VarFirst;
    }

    public final pfm.z d(String savingsVaultId) {
        Intrinsics.checkNotNullParameter(savingsVaultId, "savingsVaultId");
        Intrinsics.checkNotNullParameter(savingsVaultId, "savingsVaultId");
        ou5.b bVar = this.f213143h;
        efm.d0 d0VarFirstOrError = m70.a.g(((rnb.i) ((djb.n) bVar.f229819a)).b(savingsVaultId, w4l.j.f294644c), null, new r6d.h(9), 1).firstOrError();
        r4j.b bVar2 = new r4j.b(new r38.m(bVar, 20), 22);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, bVar2, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return ue0.e.F(iVar, Boolean.FALSE);
    }

    public final efm.d0 e(Subaccount subaccount) {
        Intrinsics.checkNotNullParameter(subaccount, "subaccount");
        Intrinsics.checkNotNullParameter(subaccount, "subaccount");
        boolean z = subaccount instanceof Subaccount.Group;
        r7i.a0 a0Var = this.f213142g;
        Continuation continuation = null;
        if (z) {
            return a0Var.c(null, ((Subaccount.Group) subaccount).f88953a, null);
        }
        if (subaccount instanceof Subaccount.Personal) {
            return a0Var.c(null, ((Subaccount.Personal) subaccount).f88956a, null);
        }
        if (subaccount instanceof Subaccount.Pro) {
            return a0Var.b(null, ((Subaccount.Pro) subaccount).f88957a, null);
        }
        if (subaccount instanceof Subaccount.ProTax) {
            return a0Var.b(null, ((Subaccount.ProTax) subaccount).f88958a, null);
        }
        if (subaccount instanceof Subaccount.Joint) {
            return a0Var.c(null, ((Subaccount.Joint) subaccount).f88954a, null);
        }
        if (!(subaccount instanceof Subaccount.Junior)) {
            if (subaccount instanceof Subaccount.Teen) {
                return te0.w.o0(p0.f264003c, new r7i.z(a0Var, subaccount, null));
            }
            throw new NoWhenBranchMatchedException();
        }
        r7i.s sVar = a0Var.d;
        pcd.s vault = ((Subaccount.Junior) subaccount).f88955a;
        Intrinsics.checkNotNullParameter(vault, "vault");
        p0 p0Var = p0.f264001a;
        ufm.i iVar = new ufm.i(te0.w.o0(elm.f.f127540b, new qu4.s(sVar, vault, continuation, 28)), new r4j.b(new r4k.x(sVar, vault, 4), 16), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
