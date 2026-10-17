package emi;

import aii.p;
import aii.u;
import com.revolut.navigation.deeplink.api.SharedDeeplinkApi$Toggles$DeeplinkUnifiedEnabled;
import com.revolut.navigation.deeplink.api.SharedDeeplinkApi$Toggles$UnifiedDeeplinkConfigBypassEnabled;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements p, nte.a {
    @Override // nte.a
    public final List e() {
        return v.k(SharedDeeplinkApi$Toggles$DeeplinkUnifiedEnabled.f98457c, SharedDeeplinkApi$Toggles$UnifiedDeeplinkConfigBypassEnabled.f98459a);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
