package osg;

import a31.m;
import atg.s;
import atg.v;
import com.revolut.core.model.account.AccountId;
import efm.d0;
import efm.r;
import io3.d;
import io3.i;
import io3.j;
import io3.l;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import rd0.e;
import te0.w;
import w4l.h;
import w4l.k;
import wp5.x;
import wsg.n;
import zhm.u;

/* JADX INFO: loaded from: classes13.dex */
public interface b {
    static /* synthetic */ r a(b bVar, String str, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        return ((n) bVar).c0(str, null, z);
    }

    static d b(n nVar, xi0.b currency, l type, i originType, j ownershipType, int i) {
        Object next;
        if ((i & 2) != 0) {
            type = l.CURRENT;
        }
        if ((i & 8) != 0) {
            originType = i.INTERNAL;
        }
        if ((i & 16) != 0) {
            ownershipType = j.PERSONAL;
        }
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(originType, "originType");
        Intrinsics.checkNotNullParameter(ownershipType, "ownershipType");
        v vVar = (v) nVar.f299736b;
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(originType, "originType");
        Intrinsics.checkNotNullParameter(ownershipType, "ownershipType");
        AccountId.Personal accountId = AccountId.Personal.f51414a;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Iterator it8 = vVar.f(accountId).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            d dVar = (d) next;
            if (Intrinsics.f(dVar.getCurrency(), currency.f306286a) && dVar.u() == type && dVar.q() == ownershipType && dVar.o() == originType) {
                break;
            }
        }
        return (d) next;
    }

    static /* synthetic */ r c(b bVar, k kVar, Set set, l lVar, i iVar, AccountId accountId, int i) {
        if ((i & 4) != 0) {
            lVar = null;
        }
        if ((i & 8) != 0) {
            iVar = lVar == null ? null : i.INTERNAL;
        }
        if ((i & 16) != 0) {
            accountId = AccountId.Personal.f51414a;
        }
        return ((n) bVar).S(kVar, set, lVar, iVar, accountId);
    }

    static r d(b bVar) {
        n nVar = (n) bVar;
        nVar.getClass();
        AccountId.Personal accountId = AccountId.Personal.f51414a;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return nVar.J(accountId, h.f294642c);
    }

    static /* synthetic */ r e(b bVar, boolean z, l lVar, io3.k kVar, i iVar, j jVar, qsg.a aVar, AccountId accountId, int i) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        if ((i & 4) != 0) {
            kVar = null;
        }
        if ((i & 8) != 0) {
            iVar = lVar == null ? null : i.INTERNAL;
        }
        if ((i & 16) != 0) {
            jVar = j.PERSONAL;
        }
        if ((i & 32) != 0) {
            aVar = qsg.a.DEFAULT;
        }
        if ((i & 64) != 0) {
            accountId = AccountId.Personal.f51414a;
        }
        return ((n) bVar).N(z, lVar, kVar, iVar, jVar, aVar, accountId);
    }

    static vkm.d f(n nVar, String ownerId, k loadingStrategy) {
        nVar.getClass();
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        r map = nVar.d0(null, loadingStrategy).map(new x(new wsg.j(ownerId, 0), 28));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return e.b(map);
    }

    static /* synthetic */ r g(b bVar, k kVar, l lVar, io3.k kVar2, i iVar, j jVar, qsg.a aVar, AccountId accountId, int i) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        if ((i & 4) != 0) {
            kVar2 = null;
        }
        if ((i & 8) != 0) {
            iVar = lVar == null ? null : i.INTERNAL;
        }
        if ((i & 16) != 0) {
            jVar = j.PERSONAL;
        }
        if ((i & 32) != 0) {
            aVar = qsg.a.DEFAULT;
        }
        if ((i & 64) != 0) {
            accountId = AccountId.Personal.f51414a;
        }
        return ((n) bVar).M(kVar, lVar, kVar2, iVar, jVar, aVar, accountId);
    }

    static List h(n nVar, l lVar, i iVar, int i) {
        if ((i & 1) != 0) {
            lVar = null;
        }
        if ((i & 4) != 0) {
            iVar = lVar == null ? null : i.INTERNAL;
        }
        j jVar = j.PERSONAL;
        qsg.a order = qsg.a.DEFAULT;
        Intrinsics.checkNotNullParameter(order, "order");
        v vVar = (v) nVar.f299736b;
        AccountId.Personal personal = AccountId.Personal.f51414a;
        return nVar.p0(y.J(y.F(y.n(vVar.f(personal), new m(lVar, 22, jVar, iVar)), new s(vVar, 0))), order, personal);
    }

    static d0 j(b bVar, l lVar, io3.k kVar, i iVar, j jVar, qsg.a order, AccountId accountId, int i) {
        if ((i & 1) != 0) {
            lVar = null;
        }
        if ((i & 2) != 0) {
            kVar = null;
        }
        if ((i & 4) != 0) {
            iVar = lVar == null ? null : i.INTERNAL;
        }
        if ((i & 8) != 0) {
            jVar = j.PERSONAL;
        }
        if ((i & 16) != 0) {
            order = qsg.a.DEFAULT;
        }
        if ((i & 32) != 0) {
            accountId = AccountId.Personal.f51414a;
        }
        AccountId accountId2 = accountId;
        n nVar = (n) bVar;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(accountId2, "accountId");
        qsg.a aVar = order;
        j jVar2 = jVar;
        d0 d0VarFirstOrError = m70.a.g(nVar.M(h.f294642c, lVar, kVar, iVar, jVar2, aVar, accountId2), null, new wm9.k(28), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    static /* synthetic */ r k(n nVar, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        return nVar.U(AccountId.Personal.f51414a, z);
    }

    static r m(n nVar, List pockets, xi0.b baseCurrency) {
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        return w.f0(m70.a.g(nVar.O(pockets, false, baseCurrency), null, new wsg.e(4), 1));
    }

    static r n(b bVar, List pocketTypes, int i) {
        if ((i & 2) != 0) {
            pocketTypes = u.c(l.CURRENT);
        }
        n nVar = (n) bVar;
        Intrinsics.checkNotNullParameter(pocketTypes, "pocketTypes");
        return nVar.T(new v77.a(pocketTypes, nVar), dz5.b.CRYPTO_POCKETS, false);
    }

    static r o(b bVar, xi0.b currency, l lVar, i iVar, AccountId accountId, k kVar, int i) {
        if ((i & 2) != 0) {
            lVar = l.CURRENT;
        }
        l type = lVar;
        if ((i & 8) != 0) {
            iVar = i.INTERNAL;
        }
        i originType = iVar;
        j ownershipType = j.PERSONAL;
        if ((i & 32) != 0) {
            accountId = AccountId.Personal.f51414a;
        }
        AccountId accountId2 = accountId;
        if ((i & 64) != 0) {
            kVar = h.f294642c;
        }
        k loadingStrategy = kVar;
        n nVar = (n) bVar;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(originType, "originType");
        Intrinsics.checkNotNullParameter(ownershipType, "ownershipType");
        Intrinsics.checkNotNullParameter(accountId2, "accountId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.w(g(nVar, loadingStrategy, type, null, originType, ownershipType, null, accountId2, 32), new vgc.b(9, currency));
    }

    static /* synthetic */ d0 p(n nVar, AccountId accountId, int i) {
        if ((i & 2) != 0) {
            accountId = AccountId.Personal.f51414a;
        }
        return nVar.F(accountId, false);
    }

    static r q(b bVar, boolean z) {
        return ((n) bVar).d0(null, n.q0(z));
    }

    static d0 r(b bVar, xi0.b currency, l lVar, i iVar, AccountId accountId, int i) {
        if ((i & 2) != 0) {
            lVar = l.CURRENT;
        }
        l type = lVar;
        if ((i & 8) != 0) {
            iVar = i.INTERNAL;
        }
        i originType = iVar;
        j ownershipType = j.PERSONAL;
        if ((i & 32) != 0) {
            accountId = AccountId.Personal.f51414a;
        }
        AccountId accountId2 = accountId;
        n nVar = (n) bVar;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(originType, "originType");
        Intrinsics.checkNotNullParameter(ownershipType, "ownershipType");
        Intrinsics.checkNotNullParameter(accountId2, "accountId");
        d0 d0VarFirstOrError = m70.a.g(nim.a.w(nVar.M(h.f294642c, type, null, originType, ownershipType, qsg.a.DEFAULT, accountId2), new vgc.b(8, currency)), null, new wm9.k(27), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    static /* synthetic */ r s(n nVar, String str, AccountId accountId, int i) {
        if ((i & 2) != 0) {
            accountId = AccountId.Personal.f51414a;
        }
        return nVar.L(str, accountId, (i & 4) != 0 ? h.f294642c : w4l.i.f294643c);
    }
}
