package sh3;

import com.revolut.core.model.account.AccountId;
import do2.o;
import efm.d0;
import efm.r;
import ei3.m;
import java.util.List;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import pi3.s;
import rd0.e;
import ufm.i;

/* JADX INFO: loaded from: classes13.dex */
public interface a {
    static i b(a aVar, String id10, AccountId accountId) {
        m mVar = (m) aVar;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        d0 d0VarFirstOrError = m70.a.g(e.c(m.l(mVar, accountId, null, 4), g.f186406a), null, new eed.a(15), 1).firstOrError();
        ed7.e eVar = new ed7.e(new e2j.i(id10, 10), 15);
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, eVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    static r c(a aVar, List types, AccountId accountId, Boolean bool, int i) {
        if ((i & 1) != 0) {
            types = s.a();
        }
        if ((i & 2) != 0) {
            accountId = AccountId.Personal.f51414a;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        m mVar = (m) aVar;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return nim.a.w(e.c(m.l(mVar, accountId, bool, 2), g.f186406a), new o(types, 12));
    }
}
