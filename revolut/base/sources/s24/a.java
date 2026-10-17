package s24;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.jvm.internal.Intrinsics;
import mp.p;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f259249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditPluginsService f259250b;

    public a(CreditPluginsService creditPluginsService, p creditApplicationDtoMapper) {
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        this.f259249a = creditApplicationDtoMapper;
        this.f259250b = creditPluginsService;
    }
}
