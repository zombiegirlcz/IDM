package eda;

import com.revolut.core.model.account.AccountId;
import io3.l;
import rea.m;
import ufm.i;

/* JADX INFO: loaded from: classes5.dex */
public interface f {
    static /* synthetic */ i a(f fVar, xi0.b bVar, l lVar, AccountId accountId, int i) {
        if ((i & 2) != 0) {
            lVar = l.CURRENT;
        }
        if ((i & 4) != 0) {
            accountId = AccountId.Personal.f51414a;
        }
        return ((m) fVar).g(accountId, lVar, bVar);
    }
}
