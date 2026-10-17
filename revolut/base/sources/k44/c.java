package k44;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import d24.e;
import kotlin.jvm.internal.Intrinsics;
import mp.p;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditPluginsService f180833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f180834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f180835c;
    public final d24.c d;
    public final b e;

    public c(CreditPluginsService creditPluginsService, p creditApplicationDtoMapper, e userSelectionConfigurationDtoMapper, d24.c submitUserSelectionRequestDtoMapper, b userSelectionErrorParser) {
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(userSelectionConfigurationDtoMapper, "userSelectionConfigurationDtoMapper");
        Intrinsics.checkNotNullParameter(submitUserSelectionRequestDtoMapper, "submitUserSelectionRequestDtoMapper");
        Intrinsics.checkNotNullParameter(userSelectionErrorParser, "userSelectionErrorParser");
        this.f180833a = creditPluginsService;
        this.f180834b = creditApplicationDtoMapper;
        this.f180835c = userSelectionConfigurationDtoMapper;
        this.d = submitUserSelectionRequestDtoMapper;
        this.e = userSelectionErrorParser;
    }
}
