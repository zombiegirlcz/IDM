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

/* JADX INFO: loaded from: classes8.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f236281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f236282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f236283c;

    public a(c1 interactor, l onHoldDecorator) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(onHoldDecorator, "onHoldDecorator");
        this.f236281a = interactor;
        this.f236282b = onHoldDecorator;
        ProductId productId = ProductId.CURRENCY;
        ProductSpaceIdentifier.Personal personal = ProductSpaceIdentifier.Personal.f89749c;
        this.f236283c = v.k(new ProductContext(productId, personal, pie.v.ACCOUNTS), new ProductContext(ProductId.SUBACCOUNT, personal, pie.v.POCKETS), new ProductContext(ProductId.ON_HOLD, personal, pie.v.FLAT_ROOT));
    }

    @Override // phe.b
    public final Flow a(sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        Flow flowD = z92.f.d(this.f236283c, this.f236281a, dataLoadingMode);
        z79.b[] elements = {z79.b.MAIN, z79.b.OTHER};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return nim.a.v(this.f236282b.a(flowD, kotlin.collections.d.y0(elements)), new phc.e(this));
    }
}
