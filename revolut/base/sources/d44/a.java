package d44;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.jvm.internal.Intrinsics;
import t90.g;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditPluginsService f111225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f111226b;

    public a(CreditPluginsService creditPluginsService, g backendFlowMapper) {
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        Intrinsics.checkNotNullParameter(backendFlowMapper, "backendFlowMapper");
        this.f111225a = creditPluginsService;
        this.f111226b = backendFlowMapper;
    }
}
