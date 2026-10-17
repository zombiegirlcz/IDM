package g44;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.jvm.internal.Intrinsics;
import mp.p;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f140334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditPluginsService f140335b;

    public b(CreditPluginsService creditPluginsService, p creditApplicationDtoMapper) {
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        this.f140334a = creditApplicationDtoMapper;
        this.f140335b = creditPluginsService;
    }
}
