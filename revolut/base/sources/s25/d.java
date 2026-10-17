package s25;

import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pfe.g;
import vkm.v1;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f259252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f259253b;

    public d(gte.a featureToggleInteractor, e mapper, b headerStateProvider) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(headerStateProvider, "headerStateProvider");
        this.f259252a = featureToggleInteractor;
        this.f259253b = mapper;
    }

    @Override // pfe.g
    public final Flow a() {
        return new v1(new s09.c(this, (Continuation) null, 3));
    }

    @Override // pfe.g
    public final Flow d(sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        return new go.g(new Data(u.c(this.f259253b.a(new ProductAccountId(ProductId.CREDIT_HUB.getId(), null))), null, false, 6, null), 2);
    }
}
