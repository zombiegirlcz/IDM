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
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f236284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f236285b;

    public c(c1 interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f236284a = interactor;
        this.f236285b = u.c(new ProductContext(ProductId.CREDIT, ProductSpaceIdentifier.Personal.f89749c, v.CREDIT));
    }

    @Override // phe.b
    public final Flow a(sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        return nim.a.v(z92.f.d(this.f236285b, this.f236284a, dataLoadingMode), new phc.e(10));
    }
}
