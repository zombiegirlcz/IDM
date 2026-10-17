package p34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.jvm.internal.Intrinsics;
import l14.b;
import mp.p;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditPluginsService f232598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f232599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f232600c;

    public a(CreditPluginsService creditPluginsService, p creditApplicationDtoMapper, b loanSelectionConfigurationDtoMapper) {
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(loanSelectionConfigurationDtoMapper, "loanSelectionConfigurationDtoMapper");
        this.f232598a = creditPluginsService;
        this.f232599b = creditApplicationDtoMapper;
        this.f232600c = loanSelectionConfigurationDtoMapper;
    }
}
