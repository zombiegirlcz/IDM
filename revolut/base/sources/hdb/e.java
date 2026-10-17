package hdb;

import aii.p;
import aii.u;
import android.os.Parcelable;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.product_article.api.ProductArticleApi$Toggles;
import com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor;
import com.revolut.feature.product_article.api.models.ProductArticleDestinationInterceptor;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDestination;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.tracking.v3.InboxProductArticleContext;
import grl.k9;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lg0.g;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements xii.b, p {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f151406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f151407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f151408c;

    public e(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f151406a = featureToggleInteractor;
        this.f151407b = y0.b(this);
        this.f151408c = y0.b("product-articles/{articleId}");
    }

    @Override // xii.b
    public final Set a() {
        return this.f151408c;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        ProductArticleParams productArticleParams;
        LinkedHashMap linkedHashMap = deeplink.f195040b;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        AnalyticsContext analyticsContext = null;
        if (this.f151406a.a(ProductArticleApi$Toggles.ProductArticlesDeeplinkHandlingMigration.f81263c)) {
            return null;
        }
        LinkedHashMap linkedHashMap2 = deeplink.f195041c;
        String str = (String) linkedHashMap.get("articleId");
        if (str == null || str.length() == 0) {
            productArticleParams = null;
        } else {
            ProductArticleParams.ArticleReference.Id id10 = new ProductArticleParams.ArticleReference.Id(str);
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                String str2 = (String) d0.c0((Set) entry.getValue());
                if (str2 != null) {
                    linkedHashMap3.put(entry.getKey(), str2);
                }
            }
            productArticleParams = new ProductArticleParams(id10, linkedHashMap3);
        }
        if (productArticleParams == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        k9 k9Var = k9.Home;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        AnalyticsProduct.Retail retailH = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        String str3 = (String) linkedHashMap.get("articleId");
        String strA = g.a("message_id", linkedHashMap2);
        if (str3 != null && str3.length() != 0 && strA != null && strA.length() != 0) {
            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
            InboxProductArticleContext.a aVarNewBuilder = InboxProductArticleContext.newBuilder();
            aVarNewBuilder.c();
            ((InboxProductArticleContext) aVarNewBuilder.f49761b).setId(str3);
            aVarNewBuilder.c();
            ((InboxProductArticleContext) aVarNewBuilder.f49761b).setOriginMessageId(strA);
            w0 w0VarA = aVarNewBuilder.a();
            companion.getClass();
            analyticsContext = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
        }
        return new ProductArticleDestination(productArticleParams, SkipShownArticleBehaviour.AlwaysShow.f81285a, (ProductArticleCommandInterceptor) null, (ProductArticleDestinationInterceptor) null, retailH, analyticsContext, (TransitionAnimation) null, 8);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f151407b;
    }
}
