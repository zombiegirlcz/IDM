package bxg;

import android.os.Parcelable;
import com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.PortfolioInsightsAssetIndicatorControllerContract$RetainedState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class y extends j {
    @Override // cli.i
    public final Parcelable a(Object obj2) {
        h currentState = (h) obj2;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        return new PortfolioInsightsAssetIndicatorControllerContract$RetainedState(currentState.f19689b);
    }

    @Override // cli.i
    public final Object b(Object obj2, Parcelable parcelable) {
        h initialState = (h) obj2;
        PortfolioInsightsAssetIndicatorControllerContract$RetainedState retainedState = (PortfolioInsightsAssetIndicatorControllerContract$RetainedState) parcelable;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return h.a(initialState, null, retainedState.f95024a, 1);
    }
}
