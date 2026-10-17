package fik;

import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.PlanReferralsArticleKey;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f135469a;

    public b(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f135469a = uiKitResources;
    }

    public final ProductArticleParams a(PlanReferralsArticleKey articleKey, long j2) {
        Intrinsics.checkNotNullParameter(articleKey, "articleKey");
        ProductArticleParams.ArticleReference.Key key = new ProductArticleParams.ArticleReference.Key(articleKey);
        TimeClause.Format.INSTANCE.getClass();
        return new ProductArticleParams(key, a0.d.x("date", this.f135469a.b(new TimeClause(j2, TimeClause.Format.f57959a, null, null, 12)).toString()));
    }
}
