package x24;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import j04.b;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import r10.f;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f302504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditPluginsService f302505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f302506c;

    public a(p creditApplicationDtoMapper, b mapper, CreditPluginsService api2, f networkUrlBuilder) {
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(networkUrlBuilder, "networkUrlBuilder");
        this.f302504a = creditApplicationDtoMapper;
        this.f302505b = api2;
        this.f302506c = networkUrlBuilder;
    }
}
