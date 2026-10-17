package u34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import nd.n;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditPluginsService f276777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f276778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f276779c;

    public b(CreditPluginsService creditPluginsService, n configurationDtoMapper, p creditApplicationDtoMapper) {
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        Intrinsics.checkNotNullParameter(configurationDtoMapper, "configurationDtoMapper");
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        this.f276777a = creditPluginsService;
        this.f276778b = configurationDtoMapper;
        this.f276779c = creditApplicationDtoMapper;
    }
}
