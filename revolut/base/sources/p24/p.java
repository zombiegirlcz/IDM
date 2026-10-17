package p24;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mp.p f232055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r10.f f232056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditPluginsService f232057c;
    public final b80.c d;

    public p(mp.p creditApplicationDtoMapper, r10.f networkUrlBuilder, CreditPluginsService api2, b80.c networkStateRepository) {
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(networkUrlBuilder, "networkUrlBuilder");
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f232055a = creditApplicationDtoMapper;
        this.f232056b = networkUrlBuilder;
        this.f232057c = api2;
        this.d = networkStateRepository;
    }
}
