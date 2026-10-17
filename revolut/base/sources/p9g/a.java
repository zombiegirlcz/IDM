package p9g;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.data.model.Data;
import com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.rev_points.models.RevPointsEarningRate;
import com.revolut.feature.travel.hotels.api.navigation.TravelHotelsKompotFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.i;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f234311b;

    public /* synthetic */ a(g gVar, int i) {
        this.f234310a = i;
        this.f234311b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f234310a) {
            case 0:
                i productArticleParams = (i) obj2;
                Intrinsics.checkNotNullParameter(productArticleParams, "productArticleParams");
                FeatureCommand featureCommand = new FeatureCommand(TravelHotelsKompotFeatureConfig.Home.f93634g);
                ProductArticleParams productArticleParams2 = (ProductArticleParams) productArticleParams.g();
                if (productArticleParams2 != null) {
                    return new FeatureCommand(cka.b.a(this.f234311b.f234316b, productArticleParams2, SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, new ProductArticleCommandInterceptor(featureCommand, null, null, featureCommand, 6), null, null, SyslogConstants.LOG_CLOCK));
                }
                return featureCommand;
            default:
                Data rateData = (Data) obj2;
                Intrinsics.checkNotNullParameter(rateData, "rateData");
                RevPointsEarningRate revPointsEarningRate = (RevPointsEarningRate) rateData.getContent();
                return revPointsEarningRate != null ? new e(this.f234311b.d.b(new MoneyClause(revPointsEarningRate.f83977c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)).toString()) : d.f234313a;
        }
    }
}
