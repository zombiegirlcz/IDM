package vge;

import com.revolut.feature.tab.accounts.api.model.spaces.ProductContext;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: classes8.dex */
public final class u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f289033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yge.a f289034b;

    public u3(c1 externalProductDataSourcesInteractor, yge.a favoritesDataSource) {
        Intrinsics.checkNotNullParameter(externalProductDataSourcesInteractor, "externalProductDataSourcesInteractor");
        Intrinsics.checkNotNullParameter(favoritesDataSource, "favoritesDataSource");
        this.f289033a = externalProductDataSourcesInteractor;
        this.f289034b = favoritesDataSource;
    }

    public final Flow a(ProductContext productContext, sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(productContext, "productContext");
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        if (productContext.f89553a != ProductId.FAVORITE) {
            return ((g1) this.f289033a).a(productContext, dataLoadingMode);
        }
        throw new IllegalArgumentException("FAVORITE can't be external!");
    }

    public final Flow b(ProductContext productContext, sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(productContext, "productContext");
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        ProductId productId = productContext.f89553a;
        ProductId productId2 = ProductId.FAVORITE;
        yge.a aVar = this.f289034b;
        if (productId == productId2) {
            return vkm.q.q(new y5j.e(((yge.e) aVar).e, 14));
        }
        Flow productAccountsFlow = ((g1) this.f289033a).a(productContext, dataLoadingMode);
        yge.e eVar = (yge.e) aVar;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(productContext, "productContext");
        Intrinsics.checkNotNullParameter(productAccountsFlow, "productAccountsFlow");
        return ta6.a.h((SharedFlow) eVar.d.getValue(), productAccountsFlow, eVar.f313647c.a(), new yge.c(productContext, eVar, null));
    }

    public final void c(ProductId productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        if (productId != ProductId.FAVORITE) {
            g1 g1Var = (g1) this.f289033a;
            g1Var.getClass();
            Intrinsics.checkNotNullParameter(productId, "productId");
            ConcurrentHashMap concurrentHashMap = g1Var.e;
            Enumeration enumerationKeys = concurrentHashMap.keys();
            while (enumerationKeys.hasMoreElements()) {
                e1 e1Var = (e1) enumerationKeys.nextElement();
                if (e1Var.f288889a.f89553a == productId) {
                    concurrentHashMap.remove(e1Var);
                }
            }
        }
    }
}
