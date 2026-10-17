package v3a;

import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import s2i.i;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements b3a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f285866a;

    public c(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f285866a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "enable-contacts-permission");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        return new q06.h(new BridgeDestination(new FeatureCommand(TransferBridgeFeatureConfig.FindFriends.f80026g)), null);
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new i(this, 11), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
