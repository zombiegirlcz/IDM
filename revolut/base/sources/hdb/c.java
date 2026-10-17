package hdb;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor;
import com.revolut.feature.product_article.api.models.ProductArticleDestinationInterceptor;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDestination;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.tracking.v3.InboxProductArticleContext;
import efm.d0;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q06.h;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements ddb.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f151404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qka.c f151405b;

    public c(m navigator, qka.c productArticleNavigationProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(productArticleNavigationProvider, "productArticleNavigationProvider");
        this.f151404a = navigator;
        this.f151405b = productArticleNavigationProvider;
    }

    public static b b(jf0.c cVar) {
        HashMap map = cVar.d;
        String strE = cVar.e(2);
        AnalyticsContext analyticsContext = null;
        ProductArticleParams productArticleParams = strE.length() == 0 ? null : new ProductArticleParams(new ProductArticleParams.ArticleReference.Id(strE), map);
        if (productArticleParams == null) {
            return null;
        }
        String strE2 = cVar.e(2);
        String str = (String) map.get("message_id");
        if (strE2.length() != 0 && str != null && str.length() != 0) {
            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
            InboxProductArticleContext.a aVarNewBuilder = InboxProductArticleContext.newBuilder();
            aVarNewBuilder.c();
            ((InboxProductArticleContext) aVarNewBuilder.f49761b).setId(strE2);
            aVarNewBuilder.c();
            ((InboxProductArticleContext) aVarNewBuilder.f49761b).setOriginMessageId(str);
            w0 w0VarA = aVarNewBuilder.a();
            companion.getClass();
            analyticsContext = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
        }
        return new b(productArticleParams, analyticsContext);
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        if (!y.D(cVar, "deeplink", 1, "product-articles")) {
            return false;
        }
        String strE = cVar.e(2);
        return (strE.length() == 0 ? null : new ProductArticleParams(new ProductArticleParams.ArticleReference.Id(strE), cVar.d)) != null;
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        b bVarB = b(cVar);
        if (bVarB == null) {
            return null;
        }
        return new h(new ProductArticleDestination(bVarB.f151402a, SkipShownArticleBehaviour.AlwaysShow.f81285a, (ProductArticleCommandInterceptor) null, (ProductArticleDestinationInterceptor) null, (AnalyticsProduct) null, bVarB.f151403b, (TransitionAnimation) null, 220), new q06.b(new MainScreenTab("accounts"), null));
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new a6j.b(this, deeplink, z, 7), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
