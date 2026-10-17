package m34;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import g14.d;
import g14.f;
import kotlin.jvm.internal.Intrinsics;
import mp.p;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f202282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g14.b f202283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f202284c;
    public final f d;
    public final r10.d e;
    public final CreditPluginsService f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m31.c f202285g;

    public c(p creditApplicationDtoMapper, g14.b homeInsuranceConfigDtoMapper, d homeInsurancePartnerConfigDtoMapper, f homeInsurancePartnerErrorPopupContentDtoMapper, r10.d homeInsuranceUploadConfigDtoMapper, CreditPluginsService creditPluginsService, m31.c multipartHelper) {
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(homeInsuranceConfigDtoMapper, "homeInsuranceConfigDtoMapper");
        Intrinsics.checkNotNullParameter(homeInsurancePartnerConfigDtoMapper, "homeInsurancePartnerConfigDtoMapper");
        Intrinsics.checkNotNullParameter(homeInsurancePartnerErrorPopupContentDtoMapper, "homeInsurancePartnerErrorPopupContentDtoMapper");
        Intrinsics.checkNotNullParameter(homeInsuranceUploadConfigDtoMapper, "homeInsuranceUploadConfigDtoMapper");
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        Intrinsics.checkNotNullParameter(multipartHelper, "multipartHelper");
        this.f202282a = creditApplicationDtoMapper;
        this.f202283b = homeInsuranceConfigDtoMapper;
        this.f202284c = homeInsurancePartnerConfigDtoMapper;
        this.d = homeInsurancePartnerErrorPopupContentDtoMapper;
        this.e = homeInsuranceUploadConfigDtoMapper;
        this.f = creditPluginsService;
        this.f202285g = multipartHelper;
    }
}
