package u68;

import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public interface b {
    static /* synthetic */ Object a(q78.e eVar, String str, String str2, ProductAccountId productAccountId, gim.c cVar, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            productAccountId = null;
        }
        return eVar.e(str, str2, productAccountId, cVar);
    }

    static /* synthetic */ Object b(b bVar, String str, String str2, TabAccountsInitialPayload.Action action, Continuation continuation, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            action = null;
        }
        return ((q78.e) bVar).g(str, str2, action, (i & 8) == 0, continuation);
    }

    static /* synthetic */ Object c(b bVar, String str, String str2, TabAccountsInitialPayload.Action action, gim.c cVar, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            action = null;
        }
        return ((q78.e) bVar).f(str, str2, action, (i & 8) == 0, cVar);
    }
}
