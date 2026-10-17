package j63;

import b93.e;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import e93.d;
import h93.f0;
import koi.j;
import n63.b;

/* JADX INFO: loaded from: classes21.dex */
public interface a {
    boolean a(f0 f0Var);

    ParcelableDestination b(f0 f0Var, d dVar, b bVar, AccountId accountId);

    NaviCommand c(f0 f0Var, String str, AccountId accountId);

    j d(f0 f0Var);

    Clause e(f0 f0Var);

    boolean f(f0 f0Var);

    KompotDestination g(f0 f0Var, AccountId accountId);

    NaviCommand h(e eVar, AccountId accountId, String str);
}
