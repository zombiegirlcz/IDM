package opf;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import om4.l0;
import op0.o3;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f227602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wa7.m f227603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f227604c;

    public b(wsg.n walletInteractor, wa7.m hiddenAccountsInteractor, e pocketPolicyProvider, f pocketSelector) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(pocketPolicyProvider, "pocketPolicyProvider");
        Intrinsics.checkNotNullParameter(pocketSelector, "pocketSelector");
        this.f227602a = walletInteractor;
        this.f227603b = hiddenAccountsInteractor;
        this.f227604c = pocketPolicyProvider;
    }

    public final ufm.i a(CurrencyFilteringPolicy currencyFilteringPolicy, List currencyPriorityList, io3.l pocketType, AccountId accountId) {
        Intrinsics.checkNotNullParameter(currencyFilteringPolicy, "currencyFilteringPolicy");
        Intrinsics.checkNotNullParameter(currencyPriorityList, "currencyPriorityList");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        efm.d0 d0VarJ = osg.b.j(this.f227602a, pocketType, null, io3.i.INTERNAL, io3.j.PERSONAL, qsg.a.RECENT_FIRST, accountId, 2);
        efm.d0 d0VarFirst = rd0.e.c(this.f227603b.k(), kotlin.coroutines.g.f186406a).first(h0.f322473a);
        Intrinsics.checkNotNullExpressionValue(d0VarFirst, "first(...)");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(currencyFilteringPolicy, "currencyFilteringPolicy");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        e eVar = this.f227604c;
        ufm.i iVar = new ufm.i(eVar.f227615a.y(accountId), new o3(16, new l0(pocketType, 9, eVar, currencyFilteringPolicy)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        ufm.i iVar2 = new ufm.i(te0.w.I0(d0VarJ, d0VarFirst, iVar), new o3(15, new kwg.e(currencyPriorityList, this, accountId, pocketType, currencyFilteringPolicy, 18)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
        return iVar2;
    }

    public final ufm.i b(Set allowedCurrencies, List currencyPriorityList, io3.l pocketType, AccountId accountId) {
        Intrinsics.checkNotNullParameter(allowedCurrencies, "allowedCurrencies");
        Intrinsics.checkNotNullParameter(currencyPriorityList, "currencyPriorityList");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return a(new CurrencyFilteringPolicy.IncludeOnly(allowedCurrencies), currencyPriorityList, pocketType, accountId);
    }
}
