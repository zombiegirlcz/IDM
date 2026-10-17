package k34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import e14.d;
import kotlin.jvm.internal.Intrinsics;
import mp.p;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f180615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditPluginsService f180616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f180617c;

    public a(d configMapper, CreditPluginsService creditPluginsService, p creditApplicationDtoMapper) {
        Intrinsics.checkNotNullParameter(configMapper, "configMapper");
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        this.f180615a = configMapper;
        this.f180616b = creditPluginsService;
        this.f180617c = creditApplicationDtoMapper;
    }
}
