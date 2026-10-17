package z5e;

import a6e.f;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import sfe.a0;
import xfe.a;
import yhe.k;

/* JADX INFO: loaded from: classes8.dex */
public interface c {
    default Flow a(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return null;
    }

    default Flow b(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return null;
    }

    default Object c(ProductAccountId productAccountId, k kVar) {
        return null;
    }

    default Object d(ProductAccountId productAccountId, Continuation continuation) {
        return Unit.f186387a;
    }

    default Object e(ProductAccountId productAccountId, Continuation continuation) {
        return a0.f262402a;
    }

    Flow f(ProductSpaceIdentifier productSpaceIdentifier, sfe.a aVar);

    default Object g(ProductAccountId productAccountId, f fVar) {
        return a.C1695a.f305241a;
    }

    Flow h(ProductAccountId productAccountId);

    default Object i(ProductAccountId productAccountId, Continuation continuation) {
        return Unit.f186387a;
    }

    Flow j(ProductAccountId productAccountId);
}
