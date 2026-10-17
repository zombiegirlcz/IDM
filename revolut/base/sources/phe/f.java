package phe;

import com.revolut.feature.tab.accounts.api.model.spaces.ProductContext;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import java.util.List;
import jhe.l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vge.c1;
import zhm.v;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f236290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f236291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f236292c;

    public f(c1 interactor, l onHoldDecorator) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(onHoldDecorator, "onHoldDecorator");
        this.f236290a = interactor;
        this.f236291b = onHoldDecorator;
        ProductId productId = ProductId.PRO;
        ProductSpaceIdentifier.Pro pro = ProductSpaceIdentifier.Pro.f89750c;
        this.f236292c = v.k(new ProductContext(productId, pro, pie.v.ACCOUNTS), new ProductContext(ProductId.SUBACCOUNT, pro, pie.v.POCKETS), new ProductContext(ProductId.ON_HOLD, pro, pie.v.FLAT_ROOT));
    }

    @Override // phe.b
    public final Flow a(sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        return nim.a.v(this.f236291b.a(z92.f.d(this.f236292c, this.f236290a, dataLoadingMode), y0.b(z79.b.PRO)), new phc.e(11));
    }
}
