package phe;

import com.revolut.feature.tab.accounts.api.model.spaces.ProductContext;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pie.v;
import vge.c1;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f236293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f236294b;

    public g(c1 interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f236293a = interactor;
        this.f236294b = u.c(new ProductContext(ProductId.SAVINGS, ProductSpaceIdentifier.Personal.f89749c, v.SAVINGS));
    }

    @Override // phe.b
    public final Flow a(sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        return nim.a.v(z92.f.d(this.f236294b, this.f236293a, dataLoadingMode), new phc.e(12));
    }
}
