package c8i;

import c5a.m0;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature_move_money.api.MoveMoneyFeatureApi$Toggles;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f22212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x5i.d f22213c;
    public final /* synthetic */ AccountWrapper d;

    public /* synthetic */ o(s sVar, x5i.d dVar, AccountWrapper accountWrapper, int i) {
        this.f22211a = i;
        this.f22212b = sVar;
        this.f22213c = dVar;
        this.d = accountWrapper;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f22211a) {
            case 0:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                s sVar = this.f22212b;
                sVar.getClass();
                efm.d0 list = efm.r.fromIterable(it8).flatMapMaybe(new c64.a(new o(sVar, this.f22213c, this.d, 2), 10)).toList();
                c64.a aVar = new c64.a(new c(2), 11);
                list.getClass();
                ufm.i iVar = new ufm.i(list, aVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                efm.r rVarX = iVar.x();
                Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                return rVarX;
            case 1:
                BalanceWrapper balance = (BalanceWrapper) obj2;
                Intrinsics.checkNotNullParameter(balance, "balance");
                s sVar2 = this.f22212b;
                n nVar = sVar2.f22223h;
                xi0.b f99406c = balance.getF99406c();
                AccountWrapper accountWrapper = this.d;
                boolean zB = nVar.b(f99406c, accountWrapper != null ? accountWrapper.getCurrency() : null);
                rfm.h hVar = rfm.h.f253943a;
                if (zB) {
                    Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
                    return hVar;
                }
                x5i.d dVar = this.f22213c;
                if (dVar != null && accountWrapper != null) {
                    if (((jte.d) sVar2.k).c(MoveMoneyFeatureApi$Toggles.MoveMoneyBalancePairEligibility.f97185c)) {
                        return ofm.q.L(p0.f264003c, new m0(2, sVar2, balance, dVar, accountWrapper, null));
                    }
                }
                r7i.a0 a0Var = sVar2.d;
                r7i.s sVar3 = sVar2.f;
                w5i.b bVar = sVar2.f22221c;
                if (balance instanceof BalanceWrapper.CreditCardBalanceWrapper) {
                    CreditCard creditCard = ((BalanceWrapper.CreditCardBalanceWrapper) balance).i;
                    n7i.s sVar4 = (n7i.s) bVar;
                    sVar4.getClass();
                    Intrinsics.checkNotNullParameter(creditCard, "creditCard");
                    return s.b(te0.w.o0(p0.f264003c, new mtj.i(6, sVar4, creditCard, accountWrapper, dVar, (Continuation) null)), balance);
                }
                if (balance instanceof BalanceWrapper.VaultBalanceWrapper) {
                    return s.b(a0Var.c(accountWrapper, ((BalanceWrapper.VaultBalanceWrapper) balance).f99452h, dVar), balance);
                }
                if (balance instanceof BalanceWrapper.ProVaultBalanceWrapper) {
                    return s.b(a0Var.b(accountWrapper, ((BalanceWrapper.ProVaultBalanceWrapper) balance).f99434h, dVar), balance);
                }
                if (balance instanceof BalanceWrapper.SavingsBalanceWrapper) {
                    return s.b(sVar2.e.s(((BalanceWrapper.SavingsBalanceWrapper) balance).f99439h, accountWrapper, dVar), balance);
                }
                if (balance instanceof BalanceWrapper.PocketBalanceWrapper) {
                    BalanceWrapper.PocketBalanceWrapper pocketBalanceWrapper = (BalanceWrapper.PocketBalanceWrapper) balance;
                    return s.b(((n7i.s) bVar).b(pocketBalanceWrapper.i, pocketBalanceWrapper.f99433l, dVar, accountWrapper), balance);
                }
                if (balance instanceof BalanceWrapper.RevPointsPocketBalanceWrapper) {
                    return s.b(((n7i.s) bVar).c(), balance);
                }
                if (balance instanceof BalanceWrapper.JuniorPocketBalanceWrapper) {
                    BalanceWrapper.JuniorPocketBalanceWrapper juniorPocketBalanceWrapper = (BalanceWrapper.JuniorPocketBalanceWrapper) balance;
                    return s.b(sVar3.d(juniorPocketBalanceWrapper.k, juniorPocketBalanceWrapper.f99420j, dVar, accountWrapper), balance);
                }
                if (balance instanceof BalanceWrapper.JuniorVaultBalanceWrapper) {
                    BalanceWrapper.JuniorVaultBalanceWrapper juniorVaultBalanceWrapper = (BalanceWrapper.JuniorVaultBalanceWrapper) balance;
                    return s.b(sVar3.f(juniorVaultBalanceWrapper.k, juniorVaultBalanceWrapper.f99426j, dVar, accountWrapper), balance);
                }
                if (balance instanceof BalanceWrapper.JuniorSavingsBalanceWrapper) {
                    BalanceWrapper.JuniorSavingsBalanceWrapper juniorSavingsBalanceWrapper = (BalanceWrapper.JuniorSavingsBalanceWrapper) balance;
                    return s.b(sVar3.e(juniorSavingsBalanceWrapper.i, juniorSavingsBalanceWrapper.f99423h, dVar, accountWrapper), balance);
                }
                if (balance instanceof BalanceWrapper.TeenPocketBalanceWrapper) {
                    return s.b(te0.w.o0(p0.f264003c, new p(sVar2, balance, dVar, null)), balance);
                }
                if (balance instanceof BalanceWrapper.TeenVaultBalanceWrapper) {
                    return s.b(te0.w.o0(p0.f264003c, new q(sVar2, balance, dVar, null)), balance);
                }
                if (balance instanceof BalanceWrapper.TradingAccountBalanceWrapper) {
                    return s.b(te0.w.o0(p0.f264003c, new r(sVar2, balance, dVar, accountWrapper, null)), balance);
                }
                if (balance instanceof BalanceWrapper.NonExistingCurrencyBalanceWrapper) {
                    Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
                    return hVar;
                }
                if (balance instanceof BalanceWrapper.RevPointsAccountBalanceWrapper) {
                    Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
                    return hVar;
                }
                if (balance instanceof BalanceWrapper.CollateralBalanceWrapper) {
                    rfm.u uVarG = efm.k.g(balance);
                    Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
                    return uVarG;
                }
                if (!(balance instanceof BalanceWrapper.DeFiBalanceWrapper)) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
                return hVar;
            default:
                k1j.b section = (k1j.b) obj2;
                Intrinsics.checkNotNullParameter(section, "section");
                efm.d0 list2 = efm.r.fromIterable(section.f180284c).flatMapMaybe(new c64.a(new o(this.f22212b, this.f22213c, this.d, 1), 6)).toList();
                c64.a aVar2 = new c64.a(new c69.v(section, 11), 7);
                list2.getClass();
                return new rfm.j(list2, aVar2, 2);
        }
    }
}
