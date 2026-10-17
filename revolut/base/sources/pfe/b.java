package pfe;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import sfe.a0;
import xfe.a;

/* JADX INFO: loaded from: classes8.dex */
public interface b {
    default Flow a(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return vkm.i.f290039a;
    }

    default Flow b(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return null;
    }

    default Object c(ProductAccountId productAccountId, Continuation continuation) {
        return null;
    }

    default Flow d(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return vkm.i.f290039a;
    }

    default Object f(ProductAccountId productAccountId, Continuation continuation) {
        return nie.d.f215687a;
    }

    default Object g(ProductAccountId productAccountId, Continuation continuation) {
        return a.C1695a.f305241a;
    }

    default Object h(ProductAccountId productAccountId, Continuation continuation) {
        return Unit.f186387a;
    }

    default Object i(ProductAccountId productAccountId, gim.c cVar) {
        return a0.f262402a;
    }

    default Flow j(ProductAccountId accountId, boolean z) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return d(accountId);
    }

    default Flow m(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return null;
    }

    default Object n(ProductAccountId productAccountId, gim.c cVar) {
        return null;
    }
}
