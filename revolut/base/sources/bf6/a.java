package bf6;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f14899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14900b;

    public a(c crossBorderInstitutionDataDtoMapper, f externalInstitutionCountryDepartmentDtoMapper) {
        Intrinsics.checkNotNullParameter(crossBorderInstitutionDataDtoMapper, "crossBorderInstitutionDataDtoMapper");
        Intrinsics.checkNotNullParameter(externalInstitutionCountryDepartmentDtoMapper, "externalInstitutionCountryDepartmentDtoMapper");
        this.f14899a = externalInstitutionCountryDepartmentDtoMapper;
        this.f14900b = r0.k(new Pair("popular", se6.c.POPULAR), new Pair("recommended", se6.c.RECOMMENDED), new Pair("penny-ais", se6.c.PENNY_CONSENTS), new Pair("penny-pis", se6.c.PENNY_PAYMENT), new Pair("link-account", se6.c.LINK_ACCOUNT), new Pair("topup", se6.c.TOP_UP));
    }
}
