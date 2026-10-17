package qi9;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_screen.api.activity.CardsScreenFeatureConfig;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.pay_later.api.models.PayLaterFaqKey;
import com.revolut.feature.pay_later.impl.ui.comms.PayLaterArticleKey;
import com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor;
import com.revolut.feature.product_article.api.models.ProductArticleDestinationInterceptor;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDestination;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.youTransactor.uCube.rpc.Constants;
import d9.e1;
import h3l.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zh9.a1;
import zh9.z0;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xh9.a f246675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.c f246676b;

    public d(xh9.a payLaterInteractor, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f246675a = payLaterInteractor;
        this.f246676b = uiKitResources;
    }

    public static ProductArticleDestination e(ProductArticleParams productArticleParams) {
        return new ProductArticleDestination(productArticleParams, SkipShownArticleBehaviour.AlwaysShow.f81285a, new ProductArticleCommandInterceptor(new FinishCommand(null, null, null, 7), null, null, com.revolut.retail.operation_status.modal_screen.a.a(g.Companion, new StatusViewConfiguration.Error("id_status_view_error", new TextLocalisedClause(R$string.general_error_common, null, null, 14), null, null, null, null, null, 8188), null, null, null, null, 510), 6), (ProductArticleDestinationInterceptor) null, (AnalyticsProduct) null, (AnalyticsContext) null, (TransitionAnimation) null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public final FeatureCommand a(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return new FeatureCommand(new CardsScreenFeatureConfig(null, null, null, null, new CardScreenAction.Select(id10, 6, false, false), 15));
    }

    public final ProductArticleDestination b(z0 promotion, Pair defaultFeeRate) {
        Intrinsics.checkNotNullParameter(promotion, "promotion");
        Intrinsics.checkNotNullParameter(defaultFeeRate, "defaultFeeRate");
        ProductArticleParams.ArticleReference.Key key = new ProductArticleParams.ArticleReference.Key(PayLaterArticleKey.EntryPromotion);
        PercentageClause percentageClauseA0 = e1.a0(defaultFeeRate);
        f01.c cVar = this.f246676b;
        return e(new ProductArticleParams(key, r0.n(new Pair("feeRate", cVar.b(percentageClauseA0).toString()), new Pair("promoEndDate", cVar.b(pi9.a.a(promotion.f322370b)).toString()))));
    }

    public final ProductArticleDestination c(a1 promotion) {
        Intrinsics.checkNotNullParameter(promotion, "promotion");
        return e(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(PayLaterArticleKey.FeeLimitPromotion), r0.n(new Pair("renewalDate", this.f246676b.b(pi9.a.a(promotion.f322251b)).toString()))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof qi9.c
            if (r0 == 0) goto L13
            r0 = r7
            qi9.c r0 = (qi9.c) r0
            int r1 = r0.f246674w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f246674w = r1
            goto L18
        L13:
            qi9.c r0 = new qi9.c
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f246674w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L80
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            xh9.a r7 = r6.f246675a
            ti9.g r7 = (ti9.g) r7
            l93.f r7 = r7.d
            b93.d r2 = b93.d.RETAIL
            r4 = 9
            r5 = 0
            sfm.b r7 = l93.f.k(r7, r5, r2, r3, r4)
            tfh.a r2 = new tfh.a
            r4 = 21
            r2.<init>(r4)
            efm.r r7 = nim.a.w(r7, r2)
            qc8.a r2 = new qc8.a
            r4 = 23
            r2.<init>(r4)
            efm.r r7 = m70.a.g(r7, r5, r2, r3)
            efm.d0 r7 = r7.firstOrError()
            qg7.v r2 = new qg7.v
            r4 = 12
            r2.<init>(r4)
            qe0.g r4 = new qe0.g
            r5 = 20
            r4.<init>(r5, r2)
            r7.getClass()
            ufm.i r2 = new ufm.i
            r5 = 0
            r2.<init>(r7, r4, r5)
            java.lang.String r7 = "flatMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)
            r0.f246674w = r3
            java.lang.Object r7 = nim.a.b(r2, r0)
            if (r7 != r1) goto L80
            return r1
        L80:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qi9.d.d(gim.c):java.lang.Object");
    }

    public final FeatureCommand f(PayLaterFaqKey key) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        int i = b.f246673a[key.ordinal()];
        if (i == 1) {
            str = "topic.pay-later";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "question.when-and-where-can-i-use-pay-later";
        }
        return new FeatureCommand(new FaqFeatureConfig.Starter(str, 2));
    }
}
