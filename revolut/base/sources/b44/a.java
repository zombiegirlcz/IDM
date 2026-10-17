package b44;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.jvm.internal.Intrinsics;
import mp.p;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f12163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditPluginsService f12164b;

    public a(CreditPluginsService api2, p creditApplicationDtoMapper) {
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(api2, "api");
        this.f12163a = creditApplicationDtoMapper;
        this.f12164b = api2;
    }
}
