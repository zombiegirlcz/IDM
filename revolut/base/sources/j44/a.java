package j44;

import c24.i;
import c24.k;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import kotlin.jvm.internal.Intrinsics;
import mp.p;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditPluginsService f171290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f171291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f171292c;
    public final k d;

    public a(CreditPluginsService creditPluginsService, p creditApplicationDtoMapper, i solicitorSelectionConfigurationDtoMapper, k submitSolicitorSelectionRequestDtoMapper) {
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(solicitorSelectionConfigurationDtoMapper, "solicitorSelectionConfigurationDtoMapper");
        Intrinsics.checkNotNullParameter(submitSolicitorSelectionRequestDtoMapper, "submitSolicitorSelectionRequestDtoMapper");
        this.f171290a = creditPluginsService;
        this.f171291b = creditApplicationDtoMapper;
        this.f171292c = solicitorSelectionConfigurationDtoMapper;
        this.d = submitSolicitorSelectionRequestDtoMapper;
    }
}
