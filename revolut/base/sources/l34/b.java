package l34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.jvm.internal.Intrinsics;
import mp.p;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditPluginsService f191849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f191850b;

    public b(CreditPluginsService creditPluginsService, p creditApplicationDtoMapper) {
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        this.f191849a = creditPluginsService;
        this.f191850b = creditApplicationDtoMapper;
    }
}
