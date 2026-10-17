package pbf;

import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;
import lbf.j;
import qbf.m;

/* JADX INFO: loaded from: classes8.dex */
public final class d {
    public static j a(m dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        String id10 = dto.getId();
        ZonedDateTime nextBillingDate = dto.getNextBillingDate();
        qbf.b billingCode = dto.getBillingCode();
        return new j(id10, nextBillingDate, billingCode != null ? hx7.b.C(billingCode) : null, dto.getEndDate(), dto.getBillingCycleId());
    }
}
