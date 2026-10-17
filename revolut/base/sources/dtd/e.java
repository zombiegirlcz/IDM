package dtd;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e {
    public static final ProductArticleDescriptor a(ProductArticleParams productArticleParams) {
        Intrinsics.checkNotNullParameter(productArticleParams, "<this>");
        k9 k9Var = k9.Analytics;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ProductArticleDescriptor(productArticleParams, SkipShownArticleBehaviour.AlwaysShow.f81285a, false, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, false, 48);
    }
}
