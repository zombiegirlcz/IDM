package bhe;

import com.revolut.feature.tab.accounts.api.model.spaces.ProductContext;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import phe.b;
import pie.v;
import vge.c1;
import z92.f;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f15291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f15292b;

    public a(c1 interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f15291a = interactor;
        this.f15292b = u.c(new ProductContext(ProductId.LINKED, ProductSpaceIdentifier.Linked.f89748c, v.ACCOUNTS));
    }

    @Override // phe.b
    public final Flow a(sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        return nim.a.v(f.d(this.f15292b, this.f15291a, dataLoadingMode), new bek.a(19));
    }
}
