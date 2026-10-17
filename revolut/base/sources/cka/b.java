package cka;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.product_article.api.ProductArticleApi$Toggles;
import com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor;
import com.revolut.feature.product_article.api.models.ProductArticleDestinationInterceptor;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDestination;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.kompot.bridge.navigation.KompotFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.navigable.TransitionAnimation;
import grl.k9;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import qka.c;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public interface b {
    static KompotFeatureConfig a(b bVar, ProductArticleParams params, SkipShownArticleBehaviour skipShownArticleBehaviour, ProductArticleCommandInterceptor productArticleCommandInterceptor, AnalyticsProduct.Retail retail, AnalyticsContext analyticsContext, int i) {
        Integer num = null;
        ProductArticleCommandInterceptor productArticleCommandInterceptor2 = (i & 4) != 0 ? null : productArticleCommandInterceptor;
        if ((i & 8) != 0) {
            k9 k9Var = k9.Home;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            retail = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        }
        AnalyticsProduct.Retail analyticsProduct = retail;
        AnalyticsContext analyticsContext2 = (i & 16) != 0 ? null : analyticsContext;
        c cVar = (c) bVar;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(skipShownArticleBehaviour, "skipShownArticleBehaviour");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        ProductArticleDestination productArticleDestination = new ProductArticleDestination(params, skipShownArticleBehaviour, productArticleCommandInterceptor2, (ProductArticleDestinationInterceptor) null, analyticsProduct, analyticsContext2, (TransitionAnimation) null, 8);
        return ((d) cVar.f246976a).c(ProductArticleApi$Toggles.ModalProductArticles.f81261c) ? new KompotOverlayFeatureConfig(productArticleDestination, yhi.b.SOLID, num, 8) : u0.d(productArticleDestination);
    }
}
