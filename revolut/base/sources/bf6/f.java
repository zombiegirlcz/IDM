package bf6;

import kotlin.jvm.internal.Intrinsics;
import se6.i;
import ze6.a;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f14902a;

    public f(c crossBorderInstitutionDataDtoMapper, n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(crossBorderInstitutionDataDtoMapper, "crossBorderInstitutionDataDtoMapper");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f14902a = countryInteractor;
    }

    public final i a(ze6.c dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        String id10 = dto.getId();
        String countryCode = dto.getCountryCode();
        String strB = ((o8b.c) this.f14902a).b(dto.getCountryCode());
        boolean hasBranches = dto.getHasBranches();
        boolean infoProvider = dto.getInfoProvider();
        boolean paymentInitiation = dto.getPaymentInitiation();
        se6.b bVarA = c.a(dto.getPaymentInfo());
        a.C1781a outage = dto.getOutage();
        return new i(id10, countryCode, strB, hasBranches, infoProvider, paymentInitiation, bVarA, outage != null ? new se6.a(outage.getTitle(), outage.getMessage(), outage.getSummary()) : null);
    }
}
