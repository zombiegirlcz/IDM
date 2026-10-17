package f8a;

import com.revolut.core.model.account.AccountId;
import kotlin.jvm.internal.Intrinsics;
import t38.e;

/* JADX INFO: loaded from: classes5.dex */
public interface a {
    static e a(a aVar) {
        s8a.e eVar = (s8a.e) aVar;
        eVar.getClass();
        AccountId.Personal accountId = AccountId.Personal.f51414a;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return eVar.f260947a.g(accountId);
    }
}
