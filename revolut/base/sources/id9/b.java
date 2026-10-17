package id9;

import android.content.Context;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.onboarding.api.verify_account.VerifyAccountFeatureConfig;
import com.revolut.feature.onboarding.api.verify_account.flow.VerifyAccountPromptDestination;
import com.revolut.feature.onboarding.api.verify_account.flow.VerifyAccountPromptFlowInputData;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof VerifyAccountFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        VerifyAccountFeatureConfig config = (VerifyAccountFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        boolean z = config.f78232a;
        Integer num = config.f78234c;
        int i = z ? 335577088 : 0;
        Integer num2 = config.f78233b;
        ActivityAnimation.System system = (num2 == null && num == null) ? null : new ActivityAnimation.System(num2, num);
        k9 k9Var = k9.Onboarding;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        navigator.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) system, (ParcelableDestination) new VerifyAccountPromptDestination(new VerifyAccountPromptFlowInputData(com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var))), false, (Integer) null, i, 44)));
    }
}
