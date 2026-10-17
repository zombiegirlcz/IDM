package lne;

import com.revolut.feature.tax_residency.impl.exemption.services.TaxExemptionService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes8.dex */
public abstract class i implements e4m.e {
    public static TaxExemptionService a(ek.a converterFactory, ik0.b retrofitFactory) {
        h.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(TaxExemptionService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        TaxExemptionService taxExemptionService = (TaxExemptionService) objCreate;
        s.k(taxExemptionService);
        return taxExemptionService;
    }
}
