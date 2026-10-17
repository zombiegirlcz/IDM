package vy5;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;
import tof.ua;
import tof.va;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 implements uy5.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f293198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppk.f f293199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final psi.a f293200c;
    public final qpa.b d;
    public final hd5.a e;
    public final e95.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mce.a f293201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jid.z f293202h;
    public final wa7.m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ne0.k f293203j;
    public final ne0.k k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ne0.k f293204l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vx9.w f293205m;

    public p0(wsg.n walletInteractor, ppk.f ratesInteractor, psi.a comparator, qpa.b pushMessagesInteractor, hd5.a cryptoCardTransactionsFilterProvider, e95.a overdraftHomeAccountInteractor, mce.a recurringPaymentFilterProvider, jid.z delistedPocketsInteractor, wa7.m hiddenAccountsInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(pushMessagesInteractor, "pushMessagesInteractor");
        Intrinsics.checkNotNullParameter(cryptoCardTransactionsFilterProvider, "cryptoCardTransactionsFilterProvider");
        Intrinsics.checkNotNullParameter(overdraftHomeAccountInteractor, "overdraftHomeAccountInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentFilterProvider, "recurringPaymentFilterProvider");
        Intrinsics.checkNotNullParameter(delistedPocketsInteractor, "delistedPocketsInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f293198a = walletInteractor;
        this.f293199b = ratesInteractor;
        this.f293200c = comparator;
        this.d = pushMessagesInteractor;
        this.e = cryptoCardTransactionsFilterProvider;
        this.f = overdraftHomeAccountInteractor;
        this.f293201g = recurringPaymentFilterProvider;
        this.f293202h = delistedPocketsInteractor;
        this.i = hiddenAccountsInteractor;
        this.f293203j = new ne0.k(new l0(this, 4), null);
        this.k = new ne0.k(new l0(this, 5), null);
        this.f293204l = new ne0.k(new l0(this, 6), null);
        this.f293205m = new vx9.w(this, 19);
    }

    public final efm.r a(io3.l type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return this.k.a(new Pair(w4l.h.f294642c, type));
    }

    public final efm.r b() {
        return this.f293203j.a(w4l.h.f294642c);
    }

    public final efm.r c(io3.l type, String allPocketsId, Set accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(allPocketsId, "allPocketsId");
        Intrinsics.checkNotNullParameter(type, "type");
        Set set = accountId;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it8 = set.iterator();
            while (it8.hasNext()) {
                if (Intrinsics.f(((ProductAccountId) it8.next()).f89729a, allPocketsId)) {
                    return pd.b.t(nim.a.w(a(type), new vw4.j(18)), new l0(this, 2));
                }
            }
        }
        ArrayList arrayList = new ArrayList(zhm.w.t(set, 10));
        Iterator it9 = set.iterator();
        while (it9.hasNext()) {
            arrayList.add(((ProductAccountId) it9.next()).f89729a);
        }
        Set setI1 = zhm.d0.i1(arrayList);
        ufm.i iVar = new ufm.i(e(accountId.size() == 1 ? new ua((String) zhm.d0.a0(setI1)) : new va(setI1), setI1), new vx9.w(new vw4.j(20), 18), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return new sfm.b(iVar, new vx9.w(new vw4.j(19), 15), 2);
    }

    public final pfm.a d() {
        pfm.a aVarE = this.f293198a.k0(AccountId.Personal.f51414a).e(ue0.e.v(pd.b.n(skm.p0.f264003c, new vmf.k(this, null, 13))));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    public final pfm.z e(i7 i7Var, Set fiatPocketIds) {
        efm.d0 d0VarF;
        md5.a aVar = (md5.a) this.e;
        Intrinsics.checkNotNullParameter(fiatPocketIds, "fiatPocketIds");
        boolean zIsEmpty = fiatPocketIds.isEmpty();
        od0.i iVar = od0.i.f224256b;
        if (zIsEmpty) {
            od0.i.Companion.getClass();
            d0VarF = efm.d0.m(iVar);
            Intrinsics.checkNotNullExpressionValue(d0VarF, "just(...)");
        } else {
            efm.d0 d0VarFirstOrError = aVar.f204481b.a().firstOrError();
            ma1.v vVar = new ma1.v(20, new ma2.s(aVar, fiatPocketIds, 8));
            d0VarFirstOrError.getClass();
            ufm.i iVar2 = new ufm.i(d0VarFirstOrError, vVar, 0);
            Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
            od0.i.Companion.getClass();
            d0VarF = ue0.e.F(iVar2, iVar);
        }
        ufm.i iVar3 = new ufm.i(d0VarF, new vx9.w(new dv5.g(i7Var, 2), 17), 1);
        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
        return ue0.e.F(iVar3, i7Var);
    }
}
