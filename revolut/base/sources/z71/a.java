package z71;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.network.services.wallet.AccountsService;
import efm.d0;
import efm.r;
import io3.l;
import ivb.i;
import j31.d;
import j31.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import te0.w;
import ue0.e;
import ufm.n;
import xi0.b;
import zhm.f0;
import zi0.c;

/* JADX INFO: loaded from: classes.dex */
public interface a {
    static z a(a aVar, b currency, AccountId accountId, int i) {
        l pocketType = l.CURRENT;
        if ((i & 4) != 0) {
            accountId = AccountId.Personal.f51414a;
        }
        g gVar = (g) aVar;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        d0 d0VarFirstOrError = m70.a.h(c.J(b(gVar, false, pocketType, accountId, 1)), new j31.b(currency), new j0g.b(13), null, 4).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return e.F(d0VarFirstOrError, f0.f322471a);
    }

    static r b(a aVar, boolean z, l pocketType, AccountId accountId, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            pocketType = l.CURRENT;
        }
        if ((i & 4) != 0) {
            accountId = AccountId.Personal.f51414a;
        }
        g gVar = (g) aVar;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return gVar.f.f(new d(accountId, pocketType), z);
    }

    static n c(a aVar, b currency, AccountId accountId, int i) {
        d0<ro3.e> d0VarCreatePocketInWallet;
        if ((i & 2) != 0) {
            accountId = AccountId.Personal.f51414a;
        }
        AccountsService accountsService = ((g) aVar).f170930a;
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        ro3.b bVar = new ro3.b(currency.f306286a, null);
        if (accountId instanceof AccountId.Personal) {
            d0VarCreatePocketInWallet = accountsService.createPocket(bVar);
        } else {
            if (!(accountId instanceof AccountId.Joint)) {
                throw new NoWhenBranchMatchedException();
            }
            d0VarCreatePocketInWallet = accountsService.createPocketInWallet(((AccountId.Joint) accountId).f51413b, bVar);
        }
        i iVar = new i(new j1.e(15), 24);
        d0VarCreatePocketInWallet.getClass();
        ufm.i iVar2 = new ufm.i(d0VarCreatePocketInWallet, iVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return w.i0(iVar2);
    }
}
