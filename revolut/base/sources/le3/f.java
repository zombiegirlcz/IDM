package le3;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.api.AnalyticsAccount;
import h6e.f;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import om4.x2;
import vkm.q0;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements ge3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f194459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g6e.d f194460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final al4.n f194461c;
    public final wa7.m d;
    public final ConcurrentHashMap e;

    public f(wsg.n walletInteractor, g6e.d subaccountInteractor, al4.n creditCardInteractor, wa7.m hiddenAccountsInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f194459a = walletInteractor;
        this.f194460b = subaccountInteractor;
        this.f194461c = creditCardInteractor;
        this.d = hiddenAccountsInteractor;
        this.e = new ConcurrentHashMap();
    }

    public final t38.e a(akg.n nVar, String str) {
        return new t38.e(nVar, 24, this.d.k(), new d(str, null));
    }

    public final Flow b(Set accounts) {
        Flow gVar;
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        if (accounts.isEmpty()) {
            return new go.g(new Data(null, new IllegalArgumentException("accounts set should not be empty"), false, 5, null), 2);
        }
        Set<AnalyticsAccount> set = accounts;
        ArrayList arrayList = new ArrayList(zhm.w.t(set, 10));
        for (AnalyticsAccount analyticsAccount : set) {
            boolean z = analyticsAccount instanceof AnalyticsAccount.Personal.All;
            Continuation continuation = null;
            AccountId.Personal personal = AccountId.Personal.f51414a;
            if (z) {
                gVar = nim.a.v(u0.i(nim.a.v(f(io3.l.CURRENT, io3.i.INTERNAL, personal), new b(6)), nim.a.v(d(), new b(2)), nim.a.v(c(), new b(6))), new b(1));
            } else {
                boolean z3 = analyticsAccount instanceof AnalyticsAccount.Personal.Subaccount;
                g6e.d dVar = this.f194460b;
                if (z3) {
                    gVar = a(nim.a.v(((s6e.z) dVar).u(((AnalyticsAccount.Personal.Subaccount) analyticsAccount).f99195a), new b(7)), null);
                } else if (analyticsAccount instanceof AnalyticsAccount.Personal.CurrencyPocket) {
                    gVar = g(((AnalyticsAccount.Personal.CurrencyPocket) analyticsAccount).f99194a, io3.l.CURRENT, io3.i.INTERNAL, personal);
                } else {
                    int i = 3;
                    if (analyticsAccount instanceof AnalyticsAccount.Joint.All) {
                        AccountId.Joint accountId = ((AnalyticsAccount.Joint.All) analyticsAccount).f99179a;
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        gVar = nim.a.v(u0.m(nim.a.v(f(io3.l.CURRENT, io3.i.INTERNAL, accountId), new b(6)), nim.a.v(new t38.e(h(f.d.f149639a), 24, this.d.k(), new gsd.d(i, 4, continuation)), new b(2))), new b(8));
                    } else if (analyticsAccount instanceof AnalyticsAccount.Joint.Subaccount) {
                        gVar = a(nim.a.v(((s6e.z) dVar).u(((AnalyticsAccount.Joint.Subaccount) analyticsAccount).f99183b), new b(7)), null);
                    } else if (analyticsAccount instanceof AnalyticsAccount.Joint.CurrencyPocket) {
                        AnalyticsAccount.Joint.CurrencyPocket currencyPocket = (AnalyticsAccount.Joint.CurrencyPocket) analyticsAccount;
                        gVar = g(currencyPocket.f99181b, io3.l.CURRENT, io3.i.INTERNAL, currencyPocket.f99180a);
                    } else if (analyticsAccount instanceof AnalyticsAccount.Pro.All) {
                        gVar = nim.a.v(f(io3.l.MERCHANT, io3.i.INTERNAL, personal), new b(6));
                    } else if (analyticsAccount instanceof AnalyticsAccount.Pro.CurrencyPocket) {
                        gVar = g(((AnalyticsAccount.Pro.CurrencyPocket) analyticsAccount).f99197a, io3.l.MERCHANT, io3.i.INTERNAL, personal);
                    } else if (analyticsAccount instanceof AnalyticsAccount.Linked) {
                        gVar = g(((AnalyticsAccount.Linked) analyticsAccount).f99189a, null, io3.i.EXTERNAL, personal);
                    } else if (analyticsAccount instanceof AnalyticsAccount.Personal.CreditCard) {
                        gVar = g(((AnalyticsAccount.Personal.CreditCard) analyticsAccount).f99193a, io3.l.CREDIT, io3.i.INTERNAL, personal);
                    } else {
                        boolean z4 = analyticsAccount instanceof AnalyticsAccount.Junior.All;
                        w4l.h hVar = w4l.h.f294642c;
                        wsg.n nVar = this.f194459a;
                        if (z4) {
                            String str = ((AnalyticsAccount.Junior.All) analyticsAccount).f99184a;
                            gVar = a(nim.a.v(rd0.e.b(nVar.e0(str, hVar)), new b(9)), str);
                        } else if (analyticsAccount instanceof AnalyticsAccount.Junior.CurrencyPocket) {
                            AnalyticsAccount.Junior.CurrencyPocket currencyPocket2 = (AnalyticsAccount.Junior.CurrencyPocket) analyticsAccount;
                            String str2 = currencyPocket2.f99186a;
                            gVar = a(nim.a.v(rd0.e.b(nVar.e0(str2, hVar)), new l3d.a(currencyPocket2.f99188c, 10)), str2);
                        } else {
                            if (!(analyticsAccount instanceof AnalyticsAccount.Savings)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            gVar = new go.g(zi0.c.P(f0.f322471a, false, null, 3), 2);
                        }
                    }
                }
            }
            arrayList.add(nim.a.v(vkm.q.q(new vkm.y(new lb0.b0(this, analyticsAccount, continuation, 4), new q0(gVar, new im9.h(this, analyticsAccount, continuation, 29), 1))), new c(analyticsAccount, 0)));
        }
        return vkm.q.q(nim.a.v(u0.k(arrayList), new b(5)));
    }

    public final akg.n c() {
        return nim.a.v(u0.m(f(io3.l.CREDIT, io3.i.INTERNAL, AccountId.Personal.f51414a), ((x2) this.f194461c).l(w4l.h.f294642c)), new b(3));
    }

    public final jhi.k d() {
        cxe.u uVarH = h(f.e.f149640a);
        cxe.u uVarH2 = h(f.c.f149638a);
        cxe.u uVarH3 = h(f.b.f149637a);
        return nim.a.u(new ie6.q(2, 22, null), u0.m(u0.i(uVarH, uVarH2, uVarH3), new ahe.l(this.d.k(), 10)));
    }

    public final Flow e(Set accounts) {
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        return accounts.isEmpty() ? new go.g(new Data(null, new IllegalArgumentException("accounts set should not be empty"), false, 5, null), 2) : vkm.q.q(nim.a.v(b(accounts), new b(0)));
    }

    public final t38.e f(io3.l lVar, io3.i iVar, AccountId accountId) {
        io3.k[] elements = {io3.k.ACTIVE, io3.k.DELISTED, io3.k.INACTIVE};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        return new t38.e(nim.a.v(rd0.e.b(this.f194459a.S(w4l.h.f294642c, setY0, lVar, iVar, accountId)), new b(10)), 24, this.d.k(), new gsd.d(3, 3, null));
    }

    public final akg.n g(String str, io3.l lVar, io3.i iVar, AccountId accountId) {
        return nim.a.v(f(lVar, iVar, accountId), new l3d.a(str, 9));
    }

    public final cxe.u h(h6e.f fVar) {
        return nim.a.A(((s6e.z) this.f194460b).w(fVar, w4l.h.f294642c), new b(4));
    }
}
