package vo9;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import io3.d;
import kotlinx.coroutines.flow.Flow;
import yt9.g;

/* JADX INFO: loaded from: classes5.dex */
public interface a {
    static /* synthetic */ Flow a(a aVar, d dVar, AccountId accountId, int i) {
        if ((i & 2) != 0) {
            accountId = AccountId.Personal.f51414a;
        }
        return ((g) aVar).i(dVar, accountId, null);
    }

    static /* synthetic */ PaymentPocketInfo b(a aVar, d dVar, AccountId accountId, int i) {
        if ((i & 2) != 0) {
            accountId = AccountId.Personal.f51414a;
        }
        return ((g) aVar).h(dVar, accountId, null);
    }
}
