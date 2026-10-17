package t24;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.jvm.internal.Intrinsics;
import t90.g;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditPluginsService f267422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f267423b;

    public f(CreditPluginsService creditPluginsService, g backendFlowMapper) {
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        Intrinsics.checkNotNullParameter(backendFlowMapper, "backendFlowMapper");
        this.f267422a = creditPluginsService;
        this.f267423b = backendFlowMapper;
    }
}
