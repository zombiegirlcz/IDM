package qsg;

import atg.v;
import com.revolut.core.model.account.AccountId;
import io3.d;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public interface b {
    static d b(b bVar, String id10) {
        Object next;
        Intrinsics.checkNotNullParameter(id10, "id");
        AccountId.Personal accountId = AccountId.Personal.f51414a;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Iterator it8 = ((v) bVar).f(accountId).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((d) next).getId(), id10)) {
                break;
            }
        }
        return (d) next;
    }
}
