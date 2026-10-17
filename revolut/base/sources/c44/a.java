package c44;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.jvm.internal.Intrinsics;
import mp.p;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f21076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditPluginsService f21077b;

    public a(CreditPluginsService api2, p creditApplicationDtoMapper) {
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(api2, "api");
        this.f21076a = creditApplicationDtoMapper;
        this.f21077b = api2;
    }
}
