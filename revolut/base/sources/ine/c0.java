package ine;

import com.revolut.feature.tax_residency.impl.services.TaxResidencyService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes8.dex */
public abstract class c0 implements e4m.e {
    public static TaxResidencyService a(Retrofit retrofit) {
        a0.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(TaxResidencyService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        TaxResidencyService taxResidencyService = (TaxResidencyService) objCreate;
        vc.s.k(taxResidencyService);
        return taxResidencyService;
    }
}
