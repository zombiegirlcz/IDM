package yge;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.feature.tab.accounts.api.model.AccountListItemModel;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import lge.m;
import vge.e2;
import vkm.j2;
import vkm.q;
import xge.j;
import zhm.f0;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f313645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e2 f313646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f313647c;
    public final Lazy d;
    public final j2 e;

    public e(CoroutineScope scope, e2 repository, j accountSpacesProvider) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(accountSpacesProvider, "accountSpacesProvider");
        this.f313645a = scope;
        this.f313646b = repository;
        this.f313647c = accountSpacesProvider;
        this.d = yhm.j.b(new y99.c(this, 8));
        this.e = q.c(new b(f0.f322471a, r0.g()));
    }

    public static final ProductAccount a(e eVar, ProductAccount productAccount, tge.a aVar, LinkedHashMap linkedHashMap) {
        eVar.getClass();
        ProductSpaceIdentifier productSpaceIdentifier = aVar.f271160a;
        Object objA = linkedHashMap.get(productSpaceIdentifier);
        if (objA == null) {
            objA = m.a(productSpaceIdentifier.f89741a);
        }
        Clause compositeClause = (Clause) objA;
        if (!(productAccount instanceof ProductAccount.ValueItem.Main)) {
            return productAccount;
        }
        ProductAccount.ValueItem.Main main = (ProductAccount.ValueItem.Main) productAccount;
        AccountListItemModel accountListItemModel = main.e;
        Clause clause = accountListItemModel.f89479c;
        if (clause != null) {
            compositeClause = new CompositeClause(v.k(compositeClause, clause), new DotDividerClause((Integer) null), null, null, 12);
        }
        return ProductAccount.ValueItem.Main.T(main, null, AccountListItemModel.a(accountListItemModel, compositeClause, 507), null, null, 507);
    }
}
