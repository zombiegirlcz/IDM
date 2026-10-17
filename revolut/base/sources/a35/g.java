package a35;

import com.google.common.collect.ImmutableMap;
import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements pfe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f1061a;

    public g(ImmutableMap accountDataSourceMap) {
        Intrinsics.checkNotNullParameter(accountDataSourceMap, "accountDataSourceMap");
        this.f1061a = accountDataSourceMap;
    }

    @Override // pfe.b
    public final Flow a(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return o(accountId).a(accountId);
    }

    @Override // pfe.b
    public final Flow d(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return o(accountId).d(accountId);
    }

    @Override // pfe.b
    public final Object f(ProductAccountId productAccountId, Continuation continuation) {
        return o(productAccountId).f(productAccountId, continuation);
    }

    @Override // pfe.b
    public final Object i(ProductAccountId productAccountId, gim.c cVar) {
        return o(productAccountId).i(productAccountId, cVar);
    }

    @Override // pfe.b
    public final Flow m(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return o(accountId).m(accountId);
    }

    @Override // pfe.b
    public final Object n(ProductAccountId productAccountId, gim.c cVar) {
        return o(productAccountId).n(productAccountId, cVar);
    }

    public final a o(ProductAccountId productAccountId) {
        ProductAccountId.Payload payload = productAccountId.f89730b;
        CreditAccountType creditAccountType = payload instanceof CreditAccountType ? (CreditAccountType) payload : null;
        if (creditAccountType == null) {
            throw new IllegalArgumentException("ProductAccountId.Payload should be CreditAccountType, but " + productAccountId.f89730b);
        }
        a aVar = (a) this.f1061a.get(creditAccountType.getClass());
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("There is no CreditAccountDataSource associated with CreditAccountType = " + creditAccountType + ", check DI bindings");
    }
}
