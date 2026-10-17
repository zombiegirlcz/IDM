package kx7;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g0 extends kotlin.jvm.internal.q implements Function1 {
    public static final g0 f = new g0();

    public g0() {
        super(1, hx7.e.class, "toDomain", "toDomain(Lcom/revolut/feature/insurance_pet/impl/network/model/EditQuotesDto;)Lcom/revolut/feature/insurance_pet/api/model/EditQuotes;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ix7.i p0 = (ix7.i) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        String quotesRequestId = p0.getQuotesRequestId();
        if (quotesRequestId == null) {
            quotesRequestId = "";
        }
        ArrayList arrayListZ = i26.l.z(p0.getQuotes());
        String newPriceStartDate = p0.getNewPriceStartDate();
        return new zw7.r(quotesRequestId, arrayListZ, newPriceStartDate != null ? LocalDate.parse(newPriceStartDate) : null);
    }
}
