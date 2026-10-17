package mxa;

import com.revolut.feature.referrals.shared.ui.api.navigation.ReferralsBizFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q06.k;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements jf0.d, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f210234a;

    public a(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f210234a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "support") && Intrinsics.f(cVar.e(2), "all-invites");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new q06.h(new BridgeDestination(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) ReferralsBizFeatureConfig.AllReferralsTroubleshooterNavigationDestination.f81830a, false, (Integer) null, 0, 61))), null);
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new h4d.d(this, 29), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
