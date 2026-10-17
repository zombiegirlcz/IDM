package k93;

import com.revolut.core.model.account.AccountId;
import com.revolut.retail.core.navigation.NaviCommand;
import e93.e;
import gim.c;
import gim.i;
import yji.n;

/* JADX INFO: loaded from: classes21.dex */
public abstract class b extends n {
    public static /* synthetic */ Object b3(b bVar, String str, e eVar, NaviCommand naviCommand, String str2, AccountId accountId, String str3, i iVar, int i) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        return bVar.Z2(str, eVar, naviCommand, str2, accountId, str3, iVar);
    }

    public abstract Object Z2(String str, e eVar, NaviCommand naviCommand, String str2, AccountId accountId, String str3, c cVar);
}
