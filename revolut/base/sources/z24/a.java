package z24;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import dr3.g;
import kotlin.jvm.internal.Intrinsics;
import mp.p;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f318956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditPluginsService f318957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f318958c;

    public a(p creditApplicationDtoMapper, CreditPluginsService creditPluginsService, g promptMapper) {
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        Intrinsics.checkNotNullParameter(promptMapper, "promptMapper");
        this.f318956a = creditApplicationDtoMapper;
        this.f318957b = creditPluginsService;
        this.f318958c = promptMapper;
    }
}
