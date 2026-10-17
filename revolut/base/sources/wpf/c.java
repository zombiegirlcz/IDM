package wpf;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.crypto.remittance.api.product_articles.CryptoRemittanceProductArticleKey;
import com.revolut.feature.crypto.remittance.impl.ui.error.CryptoEmtStatusViewModelFactoryImpl;
import com.revolut.feature.kyc.api.my_number.JpMyNumberKycStatusViewConfigurationFactory$Parcel;
import com.revolut.feature.kyc.api.navigation.KycFeatureConfig;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor;
import com.revolut.feature.product_article.api.models.ProductArticleDestinationInterceptor;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDestination;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.youTransactor.uCube.rpc.Constants;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import yji.n;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends n implements cpf.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final wj5.b f299233l;

    public c(wj5.b cryptoEmtStatusViewResultHandler) {
        Intrinsics.checkNotNullParameter(cryptoEmtStatusViewResultHandler, "cryptoEmtStatusViewResultHandler");
        this.f299233l = cryptoEmtStatusViewResultHandler;
    }

    public final void Z2(n1 result, Function1 onFinish) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        ((sk5.a) this.f299233l).getClass();
        Intrinsics.checkNotNullParameter(result, "result");
        ProductArticleDestination productArticleDestination = ((result.a().a() instanceof CryptoEmtStatusViewModelFactoryImpl.Parcel) && (result instanceof m1)) ? new ProductArticleDestination(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(CryptoRemittanceProductArticleKey.UNSUPPORTED_EMT)), SkipShownArticleBehaviour.AlwaysShow.f81285a, (ProductArticleCommandInterceptor) null, (ProductArticleDestinationInterceptor) null, (AnalyticsProduct) null, (AnalyticsContext) null, (TransitionAnimation) null, Constants.TAG_FC_SPEED_MODE) : null;
        if (productArticleDestination != null) {
            A2(productArticleDestination);
            onFinish.invoke(result);
            return;
        }
        Parcelable parcelableA = result.a().a();
        JpMyNumberKycStatusViewConfigurationFactory$Parcel jpMyNumberKycStatusViewConfigurationFactory$Parcel = parcelableA instanceof JpMyNumberKycStatusViewConfigurationFactory$Parcel ? (JpMyNumberKycStatusViewConfigurationFactory$Parcel) parcelableA : null;
        int i = jpMyNumberKycStatusViewConfigurationFactory$Parcel == null ? -1 : b.f299232a[jpMyNumberKycStatusViewConfigurationFactory$Parcel.ordinal()];
        if (i == 1) {
            A2(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(KycFeatureConfig.StartKycMyNumber.f77502a))));
        } else if (i == 2 || i == 3) {
            A2(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP)))));
        } else {
            onFinish.invoke(result);
        }
    }

    public final void b3(n1 result, Function1 onFinish) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        if (result instanceof l1) {
            onFinish.invoke(Boolean.TRUE);
            return;
        }
        if (result instanceof k1) {
            onFinish.invoke(Boolean.FALSE);
            return;
        }
        if (!(result instanceof j1) && !(result instanceof m1)) {
            throw new NoWhenBranchMatchedException();
        }
        IllegalStateException illegalStateException = new IllegalStateException(d.s("Dialog Result has unexpected type: ", result));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        onFinish.invoke(Boolean.FALSE);
    }
}
