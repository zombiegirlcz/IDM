package bf6;

import kotlin.jvm.internal.Intrinsics;
import se6.i;

/* JADX INFO: loaded from: classes3.dex */
public final class g {
    public g(d crossBorderInstitutionDataEntityMapper) {
        Intrinsics.checkNotNullParameter(crossBorderInstitutionDataEntityMapper, "crossBorderInstitutionDataEntityMapper");
    }

    public final i a(af6.d entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return new i(entity.getId(), entity.getCountryCode(), entity.getName(), entity.getHasBranches(), entity.getInfoProvider(), entity.getPaymentInitiation(), d.a(entity.getPaymentInfo()), null);
    }

    public final af6.d b(i domain) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        return new af6.d(domain.f262136a, domain.f262137b, domain.f262138c, domain.d, domain.e, domain.f, d.b(domain.f262139g));
    }
}
