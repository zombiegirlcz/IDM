package n34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.jvm.internal.Intrinsics;
import mp.p;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f211863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditPluginsService f211864b;

    public b(CreditPluginsService api2, p creditApplicationDtoMapper) {
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(api2, "api");
        this.f211863a = creditApplicationDtoMapper;
        this.f211864b = api2;
    }
}
