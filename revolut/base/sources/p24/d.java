package p24;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mp.p f232040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r10.f f232041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditPluginsService f232042c;

    public d(mp.p creditApplicationDtoMapper, r10.f networkUrlBuilder, CreditPluginsService onboardingApi) {
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(networkUrlBuilder, "networkUrlBuilder");
        Intrinsics.checkNotNullParameter(onboardingApi, "onboardingApi");
        this.f232040a = creditApplicationDtoMapper;
        this.f232041b = networkUrlBuilder;
        this.f232042c = onboardingApi;
    }
}
