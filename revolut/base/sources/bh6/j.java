package bh6;

import android.net.Uri;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ImplicitActivityDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f80.a f15240a;

    public j(f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f15240a = uriHelper;
    }

    public final BridgeDestination a(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Uri uriG = ((f80.b) this.f15240a).g(url2);
        if (uriG != null) {
            return new BridgeDestination(new ActivityNavigateCommand(new ImplicitActivityDestination("android.intent.action.VIEW", null, null, null, uriG, 14), null, null, null, 0, null, null, null, null, false, 1022));
        }
        return null;
    }
}
