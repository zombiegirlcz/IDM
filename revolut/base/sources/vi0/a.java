package vi0;

import com.revolut.core.model.account.AccountId;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rd0.c;
import rd0.d;

/* JADX INFO: loaded from: classes19.dex */
public final class a {
    private a() {
    }

    public static b a(AccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        b bVar = com.revolut.core.model.account.a.f51415a;
        if (accountId instanceof AccountId.Personal) {
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.b(c.WARNING, "JOINT ACCOUNT", "STARTED PERSONAL ACCOUNT MODE", null, null, 16);
        } else {
            if (!(accountId instanceof AccountId.Joint)) {
                throw new NoWhenBranchMatchedException();
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
            d.b(c.WARNING, "JOINT ACCOUNT", "STARTED JOINT ACCOUNT MODE", null, null, 16);
        }
        return new b(accountId);
    }
}
