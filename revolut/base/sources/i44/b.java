package i44;

import b24.c;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.jvm.internal.Intrinsics;
import mp.p;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f158281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f158282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditPluginsService f158283c;

    public b(c sepaDirectDebitConfigurationDtoMapper, p creditApplicationDtoMapper, CreditPluginsService creditPluginsService) {
        Intrinsics.checkNotNullParameter(sepaDirectDebitConfigurationDtoMapper, "sepaDirectDebitConfigurationDtoMapper");
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        this.f158281a = sepaDirectDebitConfigurationDtoMapper;
        this.f158282b = creditApplicationDtoMapper;
        this.f158283c = creditPluginsService;
    }
}
