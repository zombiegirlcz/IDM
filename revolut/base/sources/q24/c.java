package q24;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.jvm.internal.Intrinsics;
import t90.g;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f241532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditPluginsService f241533b;

    public c(CreditPluginsService api2, g backendFlowMapper) {
        Intrinsics.checkNotNullParameter(backendFlowMapper, "backendFlowMapper");
        Intrinsics.checkNotNullParameter(api2, "api");
        this.f241532a = backendFlowMapper;
        this.f241533b = api2;
    }
}
