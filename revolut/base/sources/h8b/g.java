package h8b;

import com.revolut.feature.corporate_events.navigation.CorporateEventsFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.BrowserCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k39.b f149976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f80.a f149977b;

    public g(k39.b navigationCommandsDispatcher, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f149976a = navigationCommandsDispatcher;
        this.f149977b = uriHelper;
    }

    @Override // h8b.f
    public final efm.b Y(String str) {
        return a(new FeatureCommand(new CorporateEventsFeatureConfig.CorporateEventsConfig(str, 6)));
    }

    @Override // h8b.f
    public final efm.b Y1(String uri2) {
        Intrinsics.checkNotNullParameter(uri2, "uri");
        return a(new BrowserCommand(((f80.b) this.f149977b).f(uri2)));
    }

    public final efm.b a(NaviCommand command) {
        Intrinsics.checkNotNullParameter(command, "command");
        return this.f149976a.a(command);
    }

    @Override // h8b.f
    public final efm.b f2(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        return a(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new AssetDetailsDestination(ref2, null, false, null, null, null, 62), false, (Integer) null, 0, 61)));
    }
}
